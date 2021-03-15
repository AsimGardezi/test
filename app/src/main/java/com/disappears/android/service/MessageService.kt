package com.disappears.android.service

import android.app.Service
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.IBinder
import android.provider.Settings
import android.text.TextUtils
import android.widget.Toast
import com.crashlytics.android.Crashlytics
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.data.ChatDataSource
import com.disappears.android.data.FriendDataSource
import com.disappears.android.data.impl.ChatRealmDataSource
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Message
import com.disappears.android.model.request.NewCallRequest
import com.disappears.android.model.request.TokenUpdateRequest
import com.disappears.android.model.response.*
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.*
import com.google.firebase.iid.FirebaseInstanceId
import com.google.gson.Gson
import io.reactivex.ObservableSource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import retrofit2.Response
import timber.log.Timber
import java.io.File
import java.io.IOException
import kotlin.collections.ArrayList

class MessageService : Service(), SocketIOConnection.Callback {
    val socketIoConnection: SocketIOConnection by inject()
    val chatDataSource: ChatDataSource by inject()
    val loginUtil: SharedPrefUtil by inject()
    val friendData: FriendDataSource by inject()
    val notificationUtil: NotificationUtil by inject()
    val api: VanishApi by inject()
    val encryption: EncryptionService by inject()
    val gson: Gson by inject()
    val fileUtil: FileUtil by inject()
    val messagesObserver: MessagesObserver by inject()
    private var currentDisposable: CompositeDisposable = CompositeDisposable()

    fun disposable(block: () -> Disposable) {
        currentDisposable.add(block())
    }

    private val end_call_broadcast_receiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val channelId = intent.getStringExtra("channelId")
            val callMembers = intent.getStringArrayListExtra("names")
            val video = intent.getBooleanExtra("isVideoEnabled", false)
            if (!channelId.isNullOrEmpty())
                socketIoConnection.sendCallTerminateMessage(channelId, video, callMembers)
        }
    }

    private val friendResponseMapper: Function<Response<FriendResponse>, ObservableSource<Response<ConversationResponse>>>
        get() = Function { friendResponseResponse ->
            if (friendResponseResponse.isSuccessful) {
                val body = friendResponseResponse.body()
                for (f in body!!.friends!!) {
                    var response: Response<Profile>? = null
                    try {
                        response = api.userProfile(f.name!!).blockingGet()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                    if (response != null && response.isSuccessful) {
                        f.profile = response.body()
                    }
                    if (f.profile != null) {
                        f.profile.friendName = f.name
                    }
                }
                loginUtil.controlId = body.userControlId!!
                for (f in body.friends!!) {
                    if (f.isFriend && friendData.getKeyData(f.name!!) == null) {
                        val data = loadPublicKeysForFriend(f)
                        if (data != null) {
                            data.friendName = f.name
                            f.keys = data
                        }
                    }
                }
                friendData.saveFriends(body.friends!!)
                messagesObserver.isFriendsLoaded.postValue(false)
                return@Function api.getData(body.userControlId!!)
            }
            null
        }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (loginUtil.currentLoggedUser != null) {
            d("On start command")
            registerReceiver(end_call_broadcast_receiver, IntentFilter("END_CALL_EVENT"));
            val username = loginUtil.currentLoggedUser
            encryption.createKeyStore(username!!)
            val identity = encryption.getIndentity(username)
            val password = identity.password
            if (password == null) {
                Crashlytics.logException(Exception("User password is null - failure getting user data"))
            }
            val isCall = intent?.getBooleanExtra(EXTRA_IS_CALL, false) ?: false
            val fromPush = intent?.getBooleanExtra(EXTRA_PUSH_NOTIFICATION, false) ?: false
            val from = intent?.getStringExtra(EXTRA_FROM)
            val hasVideo = intent?.getBooleanExtra(EXTRA_VIDEO, false) ?: false
            val channel = intent?.getStringExtra(EXTRA_CHANNEL)
            val deviceId = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
            val user = encryption.buildUserObjectForLogin(deviceId, username, password!!)
            if (user == null) {
                Toast.makeText(this, "built user == null", Toast.LENGTH_LONG).show()
            }
            val token = FirebaseInstanceId.getInstance().token

            disposable {
                api.login(user!!)
                        .subscribeOn(Schedulers.io())
                        .doOnSuccess {
                            if (!TextUtils.isEmpty(token)) {
                                api.updatePushNotificationToken(TokenUpdateRequest(token))
                            } else {
                                Timber.d("gcm token: " + token!!)
                            }
                        }
                        .flatMap { voidResponse ->
                            loginUtil.currentLoggedUser = username
                            voidResponse.headers().values(Constants.Api.COOKIE_HEADER).iterator().forEach {
                                if (it.startsWith("connect.sid")) {
                                    encryption.updateIdentity(username, it)
                                }
                            }
                            api.userProfile(username)
                        }.subscribe({
                            if (it.isSuccessful) {
                                loginUtil.currentUserProfile = it.body()
                            }
                            if (isCall) {
                                val callRequest = NewCallRequest(channel, hasVideo, arrayListOf(from
                                        ?: ""), from)
                                triggerVoipNotification(callRequest)
                            } else {
                                loadData(fromPush, from)
                            }
                            socketIoConnection.connect()
                            socketIoConnection.setCallback(this@MessageService)
                        }, {
                            Crashlytics.logException(it)
                            Timber.e(it)
                        })
            }
        }
        if (intent != null && ACTION_PROCESS_MESSAGE == intent.action) {
            handleImageMessage(chatDataSource.getMessage(intent.getStringExtra(EXTRA_MESSAGE)), false)
        }
        return Service.START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(end_call_broadcast_receiver)
        socketIoConnection.disconnect()
        messagesObserver.messagingServiceStopped.postValue(true)
        if (!currentDisposable.isDisposed) {
            currentDisposable.dispose()
        }
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun on(event: String, vararg args: Any) {
        when (event) {
            SocketIOConnection.EVENT_CONTROL -> handleControlEvent(args[0])
            SocketIOConnection.EVENT_MESSAGE -> handleIncomingMessage(args[0])
            SocketIOConnection.EVENT_MESSAGE_ERROR -> handleErrorMessage(args[0])
            "callincoming" -> handleIncomingCall(args[0])
        }
    }

    private fun loadData(fromPush: Boolean = false, fromFriend: String? = null) {
        if (!NetworkHelperUtil.isOnline(this)) {
            return
        }
        if (!currentDisposable.isDisposed) {
            currentDisposable.dispose()
            currentDisposable = CompositeDisposable()
        }
        val observable = api.friends()
                .flatMap(friendResponseMapper, true)
                .subscribeOn(Schedulers.newThread())

        disposable {
            observable.subscribe({ response ->
                if (response.isSuccessful) {
                    val resp = response.body()
                    val ds = FriendRealmDataSource()
                    resp?.conversationIds?.let {
                        for (entry in it.entries) {
                            val friendName = parseFriendName(entry)
                            ds.setAvailableMessageId(friendName, entry.value)
                            loadMessagesForFriend(friendName, entry.value, fromPush, fromFriend)
                        }
                    }
                    resp?.controlIds?.let {
                        for (entry in it.entries) {
                            val friendName = parseFriendName(entry)
                            ds.setAvailableMessageControlId(friendName, entry.value)
                        }
                    }
                    messagesObserver.isFriendsLoaded.postValue(true)
                } else {
                    messagesObserver.isFriendsLoaded.postValue(false)
                }
            }, {
                Crashlytics.logException(it)
                Timber.e(it)
            })
        }
        d("Current disposables count in loadData ${currentDisposable.size()}")
    }

    private fun parseFriendName(entry: MutableMap.MutableEntry<String, String>): String {
        val users = entry.key.split(":".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
        return if (loginUtil.currentLoggedUser == users[0]) users[1] else users[0]
    }

    private fun loadPublicKeysForFriend(friend: Friend): PublicKeyData? {
        try {
            val response = api.getPublicKeys(friend.name!!).execute()
            if (response.isSuccessful) {
                return response.body()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null
    }

    private fun loadMessagesForFriend(friendName: String,
                                      messageId: String,
                                      fromPush: Boolean = false,
                                      fromFriend: String? = null) {
        var id = java.lang.Long.parseLong(messageId)
        try {
            val idsOfMediaMessages = ArrayList<String>()
            val mesagesToSave = arrayListOf<Message>()
            val response = api
                    .getMessages(friendName, (++id).toString())
                    .execute()
            if (response.isSuccessful) {
                val keyData = friendData.getKeyData(friendName)
                encryption.loadKeyStore(loginUtil.currentLoggedUser!!)
                val messages = response.body()
                for (m in messages!!) {
                    if (m.plainText()) {
                        val decrypted: String
                        if (isSelfMessage(m)) {
                            m.read = true
                            decrypted = encryption.decryptMessage(m.data!!,
                                    m.from!!,
                                    m.toVersion!!,
                                    m.to!!,
                                    keyData!!,
                                    m.iv!!)
                        } else {
                            decrypted = encryption.decryptMessage(m.data!!,
                                    m.to!!,
                                    m.toVersion!!,
                                    m.from!!,
                                    keyData!!,
                                    m.iv!!)
                        }
                        m.data = decrypted
                        mesagesToSave.add(m)
                    } else {
                        mesagesToSave.add(m)
                        m.id?.let { idsOfMediaMessages.add(it) }
                    }
                }
                chatDataSource.saveMessages(mesagesToSave)
                processMediaMessages(idsOfMediaMessages, fromPush)
                d("Saving messages, about to trigger notification from $friendName from push")
                if (fromPush && friendName == fromFriend && !friendData.isMuted(friendName)) {
                    d("Triggering notification for $friendName from push")
                    val unread = chatDataSource.getUnreadCount(friendName)
                    triggerNotification(friendName, unread)
                }
                messagesObserver.chatsRefreshEvent.postValue(Unit)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun processMediaMessages(idsOfMediaMessages: List<String>, fromPush: Boolean = false) {
        idsOfMediaMessages.forEach { id ->
            handleImageMessage(chatDataSource.getMessage(id),
                    notify = fromPush,
                    deleteIfFailed = true)
        }
    }

    private fun handleControlEvent(arg: Any) {
        val msg = arg as String
        val m = gson.fromJson(msg, ControlEvent::class.java)
        when (m.type) {
            ControlEvent.Type.MESSAGE -> handleControlMessageType(m)
            ControlEvent.Type.USER -> handleControlUserType(m)
        }
    }

    private fun updateSelfControlId(m: ControlEvent) {
        val currentControlId = loginUtil.controlId
        if (!TextUtils.isEmpty(currentControlId)) {
            if (m.controlId > Integer.valueOf(currentControlId)) {
                loginUtil.controlId = m.controlId.toString()
            }
        }
    }

    private fun handleControlUserType(m: ControlEvent) {
        updateSelfControlId(m)
        if (m.action == null) return
        when (m.action) {
            ControlEvent.Action.ADDED -> loadData()
            ControlEvent.Action.DELETE -> {
                val data = m.data ?: return
                friendData.deleteFriend(data)
                chatDataSource.deleteMessages(data)
                messagesObserver.friendDisappearedEvent.postValue(data)
            }
            ControlEvent.Action.FRIEND_IMAGE -> {
            }
            ControlEvent.Action.INVITE -> {
                loadData()
            }
            ControlEvent.Action.INVITED -> loadData()
            ControlEvent.Action.GROUP_CHAT_STARTED -> {
            }
            ControlEvent.Action.IGNORE -> {
                val data = m.data ?: return
                friendData.deleteFriend(data)
                messagesObserver.friendWasDeleted.postValue(data)
            }
            ControlEvent.Action.REVOKE -> {
            }
        }
    }

    private fun handleControlMessageType(m: ControlEvent) {
        val controlFromMe = m.from == loginUtil.currentLoggedUser
        val usersInvolved = m.data!!.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val friendName = if (usersInvolved[0] == loginUtil.currentLoggedUser) usersInvolved[1] else usersInvolved[0]
        when (m.action) {
            ControlEvent.Action.DELETE -> {
                val messageId = m.moredata?.let { Integer.valueOf(it) }
                var deletedMessage = messageId?.let { chatDataSource.deleteMessage(m.from!!, it) }
                if (deletedMessage != null) {
                    messagesObserver.messagesDeletedEvent.postValue(deletedMessage)
                } else {
                    deletedMessage = messageId?.let { chatDataSource.deleteMessage(loginUtil.currentLoggedUser!!, it) }
                    if (deletedMessage != null) {
                        messagesObserver.messagesDeletedEvent.postValue(deletedMessage)
                    } else {
                        Timber.e("CANNOT FIND MESSAGE WITH ID " + messageId + " FROM " + m.from)
                    }
                }
            }
            ControlEvent.Action.DELETE_ALL -> {
                val lastId = m.moredata?.let { Integer.valueOf(it) }
                if (lastId != null) {
                    chatDataSource.deleteUserMessagesUpToIdFor(friendName, lastId)
                }
                messagesObserver.messagesDeletedAllEvent.postValue(friendName)
            }
        }
    }

    private fun handleIncomingCall(arg: Any) {
        val json = arg as JSONObject
        val callRequest = gson.fromJson(json.toString(), NewCallRequest::class.java)
        if (callRequest.displayName == "End") {
            notificationUtil.clearNotification(callRequest.channelName.hashCode())
            sendBroadcast(Intent("END_CALL_EVENT"));
        } else {
            triggerVoipNotification(callRequest)
        }
    }

    private fun handleIncomingMessage(arg: Any) {
        val msg = arg as String
        val m = gson.fromJson(msg, Message::class.java)
        if (m.mimeType == Message.Mimetype.TEXT_PLAIN.type) {
            handlePlainTextMessage(m)
            messagesObserver.messageArrivedEvent.postValue(m)
        } else if (m.mimeType == Message.Mimetype.IMAGE.type) {
            m.id = m.iv
            m.read = isSelfMessage(m)
            handleImageMessage(m, true)
        }
    }

    private fun handlePlainTextMessage(m: Message) {
        encryption.loadKeyStore(loginUtil.currentLoggedUser!!)
        val decrypted: String
        val data: PublicKeyData?
        val selfMessage = isSelfMessage(m)
        if (selfMessage) {
            data = friendData.getKeyData(m.to!!)
            decrypted = encryption.decryptMessage(m.data!!, m.from!!, m.toVersion!!, m.to!!, data!!, m.iv!!)
            m.read = true
        } else {
            data = friendData.getKeyData(m.from!!)
            decrypted = encryption.decryptMessage(m.data!!, m.to!!, m.toVersion!!, m.from!!, data!!, m.iv!!)
        }
        m.id = m.iv
        m.data = decrypted
        chatDataSource.deletePlaceholderMessages(m.iv!!)
        chatDataSource.saveMessage(m)

        if (!selfMessage && !friendData.isMuted(m.from!!)) {
            d("Triggering notification for ${m.from!!} from socketIO")
            val unread = chatDataSource.getUnreadCount(m.from!!)
            triggerNotification(m.from, unread)
        }
    }

    private fun handleImageMessage(m: Message?, notify: Boolean = false, deleteIfFailed: Boolean = false) {
        m?.let {
            val selfMessage = isSelfMessage(m)
            val u = Uri.parse(m.data)
            val dst = fileUtil.createFileInAppData(u.lastPathSegment!!)
            if (dst.exists()) {
                return
            }
            api.downloadFile(m.data!!)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(Schedulers.newThread())
                    .subscribe({ responseBody ->
                        if (responseBody.isSuccessful) {
                            val encryptedFile = responseBody.body()!!.byteStream()
                            val u = Uri.parse(m.data)
                            var dst: File? = u.lastPathSegment?.let { it1 -> fileUtil.createFileInAppData(it1) }
                            encryption.loadKeyStore(loginUtil.currentLoggedUser!!)
                            val data: PublicKeyData?
                            Timber.d("Downloading")
                            if (!selfMessage) {
                                data = friendData.getKeyData(m.from!!)
                                dst = encryption.decryptStream(encryptedFile,
                                        dst!!,
                                        m.to!!,
                                        m.toVersion!!,
                                        m.from!!,
                                        data!!,
                                        m.iv!!)
                            } else {
                                data = friendData.getKeyData(m.to!!)
                                dst = encryption.decryptStream(encryptedFile,
                                        dst!!,
                                        m.from!!,
                                        m.toVersion!!,
                                        m.to!!,
                                        data!!,
                                        m.iv!!)
                            }
                            val cds = ChatRealmDataSource()
                            cds.getPlaceholderMessage(m.iv!!)?.let {
                                cds.deletePlaceholderMessages(m.iv!!)
                                messagesObserver.tempMessageDeleted.postValue(it)
                                it.data?.let {
                                    val file = File(it.replace(Constants.Api.DATA_PREFIX, ""))
                                    if (file.exists()) {
                                        file.delete()
                                    }
                                }
                            }
                            if (!selfMessage) {
                                if (notify && !FriendRealmDataSource().isMuted(m.from!!)) {
                                    triggerNotification(m.from, 1)
                                }
                            }
                            cds.saveMessage(m)
                            messagesObserver.messageArrivedEvent.postValue(m)
                        }
                    }) {
                        if (deleteIfFailed) {
                            val cds = ChatRealmDataSource()
                            m.id?.let { msgId -> cds.deleteMessage(msgId) }
                        }
                        it.printStackTrace()
                    }
        }

    }

    private fun isSelfMessage(m: Message): Boolean {
        return loginUtil.currentLoggedUser == m.from
    }

    private fun triggerNotification(friendName: String?, unread: Long) {
        e("Triggering notification for $friendName, unread count is $unread")
        if (unread == 0L) return
        notificationUtil.buildNotification(friendName!!, unread)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe { notification ->
                    notificationUtil.clearNotification(friendName.hashCode())
                    notificationUtil.notify(notification!!, friendName.hashCode())
                }
    }

    private fun triggerVoipNotification(callRequest: NewCallRequest) {
        d("Triggering voip notificaion for ${callRequest.displayName}")
        notificationUtil.buildVoipNotification(callRequest.channelName, callRequest.callMembers, callRequest.callType, callRequest.displayName)
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe { incomingCallNotification ->
                    notificationUtil.notifyVoip(incomingCallNotification!!, callRequest.channelName.hashCode())
                }
    }

    private fun handleErrorMessage(arg: Any) {
        try {
            val msg = arg as JSONObject
            val status = msg.getInt("status")
            if (status == 403) {
                Toast.makeText(this, "Forbidden", Toast.LENGTH_LONG).show()
            }
            Crashlytics.log(msg.toString())
            Crashlytics.logException(Exception("Socket IO exception"))
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        Timber.e("Error message: $arg")
    }

    override fun onConnected() {
        val messages = chatDataSource.getMessagesToResend(loginUtil.currentLoggedUser!!)
        for (m in messages) {
            socketIoConnection.resend(m)
        }
    }

    companion object {
        const val ACTION_PROCESS_MESSAGE = "process_message"
        const val EXTRA_MESSAGE = "message"
        const val EXTRA_FROM = "from"
        const val EXTRA_CHANNEL = "uuid"
        const val EXTRA_VIDEO = "has_video"
        const val EXTRA_IS_CALL = "is_call"
        const val EXTRA_PUSH_NOTIFICATION = "is_from_push"
    }
}

package com.disappears.android.flow.chats.messages

import android.net.Uri
import android.text.TextUtils
import androidx.lifecycle.Observer
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.chat.ChatManager
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.data.ChatDataSource
import com.disappears.android.data.FriendDataSource
import com.disappears.android.data.impl.ChatRealmDataSource
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Message
import com.disappears.android.model.ModelMapper
import com.disappears.android.model.adapter.MessageAuthor
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.*
import com.stfalcon.chatkit.commons.models.IMessage
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import timber.log.Timber
import java.io.File
import java.util.*
import kotlin.properties.Delegates

class MessageListPresenter constructor(
        private val chatData: ChatDataSource,
        private val friendData: FriendDataSource,
        private val prefUtil: SharedPrefUtil,
        private val socketIO: SocketIOConnection,
        private val api: VanishApi,
        private val lastSeenFormatter: LastSeenFormatter,
        private val imageUtil: ImageUtil,
        private val fileUtil: FileUtil,
        private val notificationUtil: NotificationUtil,
        private val chatManager: ChatManager,
        private val encryption: EncryptionService,
        private val messagesObserver: MessagesObserver
) : SimplePresenter<MessageListContract.View>(), MessageListContract.Presenter {
    override fun isPlaceholderMessage(id: String?): Boolean {
        return id?.let {
            val numericId = chatData.getMessage(it)?.numericId
            numericId == 0 || numericId == -1
        } ?: false
    }

    private val initialModel = MessageListModel()

    var model by Delegates.observable(initialModel) { _, _, newValue ->
        view?.render(newValue)
    }

    private var recentImage: File? = null
    private var messages: List<Message>? = null
    override var friendName: String = ""

    private val messagesArrivesEventObserver = Observer<Message> { message ->
        message ?: return@Observer
        val filteredMessages = listOf(message).filter { it.from == friendName || it.to == friendName }
        map(friendName, filteredMessages).singleOrNull().let {
            markMessagesAsRead()
            if ((model.initialMessages == null
                            || model.initialMessages?.any { it.id == message.id } == false)
                    && model.newMessage?.id != message.id) {
                model = initialModel.copy(newMessage = it)

            }
        }

        if (message.from == friendName || message.to == friendName) {
            loadMessages()
        }
    }

    private val tempMessageDeletedObserver = Observer<Message> { message ->
        message ?: return@Observer
        listOf(message).firstOrNull { it.from == friendName || it.to == friendName }?.let {
            model = initialModel.copy(deletedMessageId = it.id)
        }
    }

    private val messageWasDeletedEvent = Observer<Message> { message ->
        message?.id?.let {
            if (message.from == friendName) {
                model = initialModel.copy(deletedMessageId = it)
                view?.showFriendDisappearedMessagesInfo()
            }
        }
    }

    private val messageServiceWasStopped = Observer<Boolean> {
        it?.let {
            view?.startMessageService()
        }
    }

    private val allMessagesWereDeletedEvent = Observer<String> { name ->
        if (name == friendName) {
            loadMessages()
        }
    }

    private val chatRefreshObserver = Observer<Unit> {
        loadMessages()
    }

    override fun onResume() {
        messagesObserver.messagesDeletedAllEvent.observeForever(allMessagesWereDeletedEvent)
        messagesObserver.messageArrivedEvent.observeForever(messagesArrivesEventObserver)
        messagesObserver.messagesDeletedEvent.observeForever(messageWasDeletedEvent)
        messagesObserver.tempMessageDeleted.observeForever(tempMessageDeletedObserver)
        messagesObserver.messagingServiceStopped.observeForever(messageServiceWasStopped)
        messagesObserver.chatsRefreshEvent.observeForever(chatRefreshObserver)
    }

    override fun onPause() {
        messagesObserver.messagesDeletedAllEvent.removeObserver(allMessagesWereDeletedEvent)
        messagesObserver.messageArrivedEvent.removeObserver(messagesArrivesEventObserver)
        messagesObserver.messagesDeletedEvent.removeObserver(messageWasDeletedEvent)
        messagesObserver.tempMessageDeleted.removeObserver(tempMessageDeletedObserver)
        messagesObserver.messagingServiceStopped.removeObserver(messageServiceWasStopped)
        messagesObserver.chatsRefreshEvent.removeObserver(chatRefreshObserver)
    }

    override fun loadMessages() {
        notificationUtil.clearNotification(friendName.hashCode())
        markMessagesAsRead()
        messages = chatData.getMessages(friendName)

        messages?.let {
            model = initialModel.copy(initialMessages = map(friendName, it))
        }
    }

    private fun map(friendName: String?, messages: List<Message>): List<IMessage> {
        val f = friendData.getFriendByName(friendName!!)
        val me = MessageAuthor()
        me.name = prefUtil.currentLoggedUser
        val friend = MessageAuthor()
        if (f != null) {
            friend.name = f.name
        }
        return messages.map { ModelMapper.map(friendName, me, friend, it) }
    }

    override val loggedUsername: String?
        get() = prefUtil.currentLoggedUser

    override fun isCurrentFriendMuted(): Boolean {
        return friendData.isMuted(friendName)
    }

    override fun sendMessage(data: String) {
        disposable {
            socketIO.buildMessage(data, friendName)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ message -> socketIO.sendMessage(message) }) { throwable ->
                        view?.errorBuildingMessage()
                        throwable.printStackTrace()
                    }
        }
    }

    override fun deleteMessage(message: IMessage) {
        val m = chatData.getMessage(message.id ?: return) ?: return
        val friendName = if (m.from == prefUtil.currentLoggedUser) m.to else m.from
        friendName?.let {
            api.deleteMessage(it, m.numericId.toString())
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ responseBodyResponse ->
                        if (responseBodyResponse.isSuccessful) {
                            chatData.getMessage(message.id)?.let {
                                if (it.imageType()) {
                                    deleteMediaFiles(listOf(it))
                                }
                            }
                            chatData.deleteMessage(message.id)
                            model = initialModel.copy(deletedMessageId = message.id)
                        } else {
                            view?.errorDeletingMessage()
                        }
                    }, {
                        view?.errorDeletingMessage()
                    })
        }
    }

    override fun loadFriend(friendName: String) {
        this.friendName = friendName
        val f = friendData.getFriendByName(friendName)
        val hasProfile = f?.profile != null
        val displayName = if (hasProfile && f?.profile?.name.isNullOrEmpty().not()) f?.profile?.name else f?.name
        var lastSeen = if (hasProfile) f?.profile?.lastSeen else ""
        val profilePicture = if (hasProfile) f?.profile?.imageUrl else ""
        if (!TextUtils.isEmpty(lastSeen) && !lastSeen.equals("online", ignoreCase = true)) {
            val lastSeenTimestamp = lastSeen?.toLongOrNull() ?: 0
            lastSeen = lastSeenFormatter.lastSeen(lastSeenTimestamp)
        }
        view?.displayFriendData(displayName, profilePicture, lastSeen)
    }

    override fun deleteAllMessages() {
        chatData.getLatestMessage(friendName)?.let {
            api.deleteAllMessages(friendName, it.numericId.toString())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ responseBodyResponse ->
                        if (responseBodyResponse.isSuccessful) {
                            deleteMediaFiles(chatData.getMediaMessages(friendName))
                            chatData.deleteMessages(friendName)
                        } else {
                            view?.errorDeletingMessage()
                        }
                    }, { throwable ->
                        throwable.printStackTrace()
                        view?.errorDeletingMessage()
                    })
        }
    }

    private fun deleteMediaFiles(mediaMessages: List<Message>) {
        try {
            mediaMessages.forEach {
                it.data?.let {
                    val file = if (it.startsWith(Constants.Api.DATA_PREFIX)) {
                        File(it.replace(Constants.Api.DATA_PREFIX, ""))
                    } else {
                        val u = Uri.parse(it)
                        val fileName = u.lastPathSegment
                        fileUtil.createFileInAppData(fileName!!)
                    }
                    if (file.exists()) {
                        file.delete()
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun disappearUser() {
        disposable {
            api.deleteFriend(friendName)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ responseBodyResponse ->
                        if (responseBodyResponse.isSuccessful) {
                            friendData.deleteFriend(friendName)
                            chatData.deleteMessages(friendName)
                            view?.deletedAllMessages()
                        } else {
                            view?.errorDeletingMessage()
                        }
                    }, { throwable ->
                        throwable.printStackTrace()
                        view?.errorDeletingMessage()
                    })
        }
    }

    override fun createPictureFile() {
        recentImage = imageUtil.createPictureFile()
        recentImage?.let { view?.takePhoto(it) }
    }

    override fun sendFile(uri: Uri?) {
        if (uri == null) {
            view?.showErrorPickImage()
            return
        }

        val imagePath = fileUtil.getPath(uri)
        Timber.d(imagePath)

        if (imagePath == null) {
            view?.showErrorPickImage()
            return
        }

        val f = friendData.getKeyData(friendName)
        encryption.loadKeyStore(prefUtil.currentLoggedUser ?: return)
        val i = encryption.getIndentity(prefUtil.currentLoggedUser ?: return)

        chatManager.buildEncryptedImage(friendName, File(imagePath))
                .firstOrError()
                .subscribeOn(Schedulers.io())
                .doOnSuccess { values ->
                    val msg = values.first
                    msg.resend = 1
                    msg.numericId = -1
                    msg.id = UUID.randomUUID().toString()
                    msg.data = Constants.Api.DATA_PREFIX + imagePath
                    chatData.saveMessage(msg)
                    messagesObserver.messageArrivedEvent.postValue(msg)
                }.flatMap { values ->
                    if (values.first.iv == null) throw Exception("iv == null")
                    val fileToUpload = RequestBody.create(MediaType.parse("image/*"), values.second)
                    val body = MultipartBody.Part.createFormData("image", values.first.iv, fileToUpload)
                    api.uploadPhoto(
                            i.version ?: throw Exception("i.version"),
                            friendName,
                            f?.version ?: throw Exception("f.version"),
                            body
                    ).doOnSuccess {
                        values.second.delete()
                        Timber.d(it.message())
                    }.doOnError { it.printStackTrace() }
                }
                .toCompletable()
                .subscribe()
    }

    override fun initCall(useVideo: Boolean) {
        val channelId = UUID.randomUUID().toString().toUpperCase()
        socketIO.sendCallInitMessage(channelId, useVideo, arrayListOf(friendName))
        view?.goToCall(channelId, friendName, useVideo)
    }

    override fun leaveChannel() {}

    override fun toggleMuteState(muted: Boolean) {
        friendData.toggleMutedSetting(friendName, muted)
    }

    override fun markMessagesAsRead() {
        ChatRealmDataSource().markAllAsRead(friendName)
        loggedUsername?.let { ChatRealmDataSource().markAllAsRead(it) }
    }

    override fun sendTakenFile() {
        sendFile(Uri.fromFile(recentImage))
    }
}

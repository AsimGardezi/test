package com.disappears.android.chat

import android.content.Context
import android.util.Log
import com.crashlytics.android.Crashlytics
import com.disappears.android.R
import com.disappears.android.data.impl.ChatRealmDataSource
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Identity
import com.disappears.android.model.Message
import com.disappears.android.model.request.NewCallRequest
import com.disappears.android.util.DLog
import com.disappears.android.util.RxUtil
import com.disappears.android.util.SharedPrefUtil
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.socket.IOAcknowledge
import io.socket.IOCallback
import io.socket.SocketIO
import io.socket.SocketIOException
import org.json.JSONObject
import java.net.HttpCookie
import java.util.*
import java.util.concurrent.Callable

class SocketIOConnection constructor(
        private val gson: Gson,
        private val encryption: EncryptionService,
        private val loginUtil: SharedPrefUtil,
        context: Context
) {
    private var socket: SocketIO? = null
    private var authCookie: HttpCookie? = null
    private var reconnectDisposable: Disposable? = null

    @Volatile
    var isConnectingOrConnected: Boolean = false
    private var callback: Callback? = null
    private val apiBase: String

    interface Callback {
        fun on(event: String, vararg args: Any)
        fun onConnected()
    }

    init {
        apiBase = context.getString(R.string.api_base)
    }

    private fun loadAuthCookie() {
        loginUtil.currentLoggedUser?.let {
            if (encryption.loadKeyStore(it)) {
                val i = encryption.getIndentity(it)
                val cookieString = i.cookie
                val cookies = HttpCookie.parse(cookieString)
                authCookie = cookies[0]
            }
        }
    }

    fun setCallback(callback: Callback) {
        this.callback = callback
    }

    fun connect() {
        try {
            if (socket == null || isConnectingOrConnected.not() && socket?.isConnected?.not() == true) {
                loadAuthCookie()
                isConnectingOrConnected = true
                val headers = HashMap<String, String>()
                headers.put("cookie", authCookie?.name + "=" + authCookie?.value)
                socket = SocketIO(apiBase, headers)
                socket?.connect(SocketCallbackHandler())
                Log.d(SocketIOConnection::class.java.simpleName, "connected")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun disconnect() {
        cancelReconnecting()
        if (socket?.isConnected == true) {
            socket?.disconnect()
        }
    }

    fun buildMessage(data: String, friendName: String): Observable<Message> {
        return Observable.fromCallable(Callable<Message> {
            val friendDataSource = FriendRealmDataSource()
            DLog.d(TAG,
                    String.format(Locale.getDefault(),
                            "Sending message: %s to %s with mime type %s",
                            data,
                            friendName,
                            Message.Mimetype.TEXT_PLAIN))

            loginUtil.currentLoggedUser?.let { currentLoggedUser ->
                encryption.loadKeyStore(currentLoggedUser)
                val userIdentity = encryption.getIndentity(currentLoggedUser)
                val messageToSend = buildMessage(friendName, currentLoggedUser, Message.Mimetype.TEXT_PLAIN, userIdentity)

                messageToSend.data = data

                val friendKeys = friendDataSource.getKeyData(friendName)
                val encrypted = encryption.encryptMessage(
                        data,
                        currentLoggedUser,
                        userIdentity.version ?: throw Exception("userIdentity.version == null"),
                        friendName,
                        friendKeys ?: throw Exception("friendKeys == null"),
                        messageToSend.iv ?: throw Exception("messageToSend.iv == null"))

                if (encrypted.isNotEmpty()) {
                    val chatData = ChatRealmDataSource()
                    messageToSend.resend = 1
                    messageToSend.id = UUID.randomUUID().toString()
                    messageToSend.toVersion = friendKeys.version
                    messageToSend.numericId = -1
                    chatData.saveMessage(messageToSend)
                    messageToSend.data = encrypted
                    return@Callable messageToSend
                }
            }
            throw Exception("build message")
        })
    }

    fun sendMessage(messageToSend: Message) {
        if (socket?.isConnected == true) {
            socket?.send(gson.toJson(messageToSend))
        }
    }

    fun sendCallInitMessage(channelId: String, useVideo: Boolean, friendNames: ArrayList<String>) {
        if (socket?.isConnected == true) {
            val request = NewCallRequest(channelId.toUpperCase(), useVideo, friendNames, loginUtil.currentLoggedUser)
            val message = gson.toJson(request)
            socket?.send(message)
        }
    }

    fun sendCallTerminateMessage(channelId: String, useVideo: Boolean, friendNames: ArrayList<String>) {
        if (socket?.isConnected == true) {
            val request = NewCallRequest(channelId.toUpperCase(), useVideo, friendNames, "End")
            val message = gson.toJson(request)
            socket?.send(message)
        }
    }

    private fun buildMessage(friendName: String, currentLoggedUser: String?, type: Message.Mimetype, userIdentity: Identity): Message {
        val messageToSend = Message()
        messageToSend.to = friendName
        messageToSend.from = currentLoggedUser
        messageToSend.fromVersion = userIdentity.version
        messageToSend.dateTime = System.currentTimeMillis()
        messageToSend.iv = encryption.generateIv()
        messageToSend.mimeType = type.type
        return messageToSend
    }

    private fun reconect() {
        if (reconnectDisposable == null || reconnectDisposable!!.isDisposed) {
            var observable = Observable.fromCallable {
                connect()
                throw Exception()
            }
            observable = RxUtil.applyRetryScheme(observable, MAX_RECONNECT_ATTEMPT, 5)
            reconnectDisposable = observable
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        DLog.d(TAG, "Retrying to connect to socket IO")
                    }, { throwable ->
                        throwable.printStackTrace()
                    })
        }
    }

    fun resend(message: Message) {
        //TODO resend image message
        if (message.plainText()) {
            val friendDataSource = FriendRealmDataSource()
            DLog.d(TAG,
                    String.format(Locale.getDefault(),
                            "Resending message: %s to %s with mime type %s",
                            message.data,
                            message.to,
                            message.mimeType))
            loginUtil.currentLoggedUser?.let { currentLoggedUser ->
                encryption.loadKeyStore(currentLoggedUser)
                val userIdentity = encryption.getIndentity(currentLoggedUser)
                val friendKeys = friendDataSource.getKeyData(message.to
                        ?: throw Exception("message.to == null"))
                val encrypted = encryption.encryptMessage(
                        message.data ?: throw Exception("message.data == null"),
                        currentLoggedUser,
                        userIdentity.version ?: throw Exception("userIdentity.version == null"),
                        message.to ?: throw Exception("message.to == null"),
                        friendKeys ?: throw Exception("friendKeys == null"),
                        message.iv ?: throw Exception("message.iv == null"))

                if (encrypted.isNotEmpty()) {
                    message.data = encrypted
                    sendMessage(message)
                }
            }
        }
    }

    private fun cancelReconnecting() {
        if (reconnectDisposable?.isDisposed == false) {
            reconnectDisposable?.dispose()
        }
    }

    private inner class SocketCallbackHandler : IOCallback {
        override fun onMessage(json: JSONObject, ack: IOAcknowledge) {
            Log.d(TAG, "Message: " + json.toString())
        }

        override fun onMessage(data: String, ack: IOAcknowledge) {
            Log.d(TAG, "Message: " + data)
        }

        @Synchronized
        override fun onError(e: SocketIOException) {
            isConnectingOrConnected = false
            e.printStackTrace()
            Crashlytics.logException(e)
            Log.d(TAG, "Error: " + e.message + " Http status: " + e.httpStatus)
            reconect()
        }

        override fun onDisconnect() {
            isConnectingOrConnected = false
            Log.d(TAG, "Disconnected from: " + apiBase)
        }

        override fun onConnect() {
            cancelReconnecting()
            Log.d(TAG, "Sucessfully connected to: " + apiBase)
            callback?.onConnected()
        }

        override fun on(event: String, ack: IOAcknowledge?, vararg args: Any) {
            Log.d(TAG, "Event: " + event + args[0].toString())
            callback?.on(event, *args)
        }
    }

    companion object {
        const val EVENT_CONTROL = "control"
        const val EVENT_MESSAGE = "message"
        const val EVENT_MESSAGE_ERROR = "messageError"
        private const val EVENT_TYPE_USER = "user"
        private const val EVENT_TYPE_MESSAGE = "message"
        private const val MAX_RECONNECT_ATTEMPT = 30
        private val TAG = SocketIOConnection::class.java.name
    }
}



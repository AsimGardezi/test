package com.disappears.android.service

import android.util.Log
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.flow.call.IncomingCallActivity
import com.disappears.android.util.startService
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import org.koin.android.ext.android.inject

class DisappearsFirebaseMessagingService : FirebaseMessagingService() {
    private val socketIoConnection: SocketIOConnection by inject()

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        remoteMessage?.data?.keys?.forEach { Log.d("tag", "$it") }
        if (socketIoConnection.isConnectingOrConnected) return
        remoteMessage?.data?.get(PUSH_TYPE).let {
            when (it) {
                NEW_MESSAGE -> handleNewMessage(remoteMessage?.data?.get(EXTRA_FROM)!!)
                NEW_CALL -> handleIncomingCall(remoteMessage?.data)
                else -> handleGenericMessage()
            }
        }
    }

    private fun handleIncomingCall(data: Map<String, String>?) {
        val member = data?.get("handle")!!
        val channel = data.get("uuid")!!
        val hasVideo = data.get("hasVideo")!!.toBoolean()
        MessageService::class.startService(this,
                MessageService.EXTRA_PUSH_NOTIFICATION to true,
                MessageService.EXTRA_FROM to member,
                MessageService.EXTRA_CHANNEL to channel,
                MessageService.EXTRA_VIDEO to hasVideo,
                MessageService.EXTRA_IS_CALL to true)
        IncomingCallActivity.startFromService(this, null, channel, arrayListOf(member), hasVideo)
    }

    private fun handleGenericMessage() {}

    private fun handleNewMessage(from: String) {
        MessageService::class.startService(this,
                MessageService.EXTRA_PUSH_NOTIFICATION to true,
                MessageService.EXTRA_FROM to from)
    }

    companion object {
        const val NEW_MESSAGE = "newMessage"
        const val NEW_CALL = "call"
        const val EXTRA_FROM = "messageFrom"
        const val PUSH_TYPE = "type"
    }
}

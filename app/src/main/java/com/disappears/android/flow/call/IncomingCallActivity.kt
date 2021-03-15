package com.disappears.android.flow.call

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.MediaPlayer
import android.os.Bundle
import android.os.PowerManager
import android.text.TextUtils
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ServiceCompat.stopForeground
import com.disappears.android.R
import com.disappears.android.agora.openvcall.ui.ChatActivity
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.util.NotificationUtil
import com.disappears.android.util.PermissionUtil
import kotlinx.android.synthetic.main.activity_incoming_call.*
import org.koin.android.ext.android.inject

class IncomingCallActivity : AppCompatActivity() {
    lateinit private var callMembers: ArrayList<String>
    lateinit private var channelId: String
    private val displayName by lazy { intent.getStringExtra(EXTRA_DISPLAY_NAME) }
    private var video = false
    private var wakeLock: PowerManager.WakeLock? = null
    private var player: MediaPlayer? = null
    private val socketIO: SocketIOConnection by inject()
    val notificationUtil: NotificationUtil by inject()

    private val end_call_broadcast_receiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED)
        setContentView(R.layout.activity_incoming_call)
        channelId = (intent.getStringExtra(EXTRA_CHANNEL_NAME) ?: "").toUpperCase()
        video = intent.getBooleanExtra(EXTRA_USE_VIDEO, false)
        callMembers = intent.getStringArrayListExtra(EXTRA_CALL_MEMBERS)
        createWakeLock()
        setupUI()
        registerReceiver(end_call_broadcast_receiver, IntentFilter("END_CALL_EVENT"));
        notificationUtil.clearNotification(channelId.hashCode())

        if (intent.getStringExtra(CALL_ACTION) == "RECEIVE_CALL") {
            if (PermissionUtil.requestPermissions(this@IncomingCallActivity,
                            CALL_PERMISSIONS,
                            *ChatActivity.CALL_PERMISSIONS)) {
                startActivity(ChatActivity.newIntent(
                        this,
                        channelId,
                        callMembers,
                        video,
                        true))
                finish()
            }
        }
        if (intent.getStringExtra(CALL_ACTION) == "CANCEL_CALL") {
            socketIO.sendCallTerminateMessage(channelId, video, callMembers)
        }
    }

    private fun onInviteEndByUser(username: String?) {
        finish()
    }

    private fun createWakeLock() {
        val pm = getSystemService(Context.POWER_SERVICE) as PowerManager
        wakeLock = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK.or(PowerManager.ACQUIRE_CAUSES_WAKEUP), "")
    }

    private fun setupUI() {
        callMembers.add(displayName)
        username.text = TextUtils.join(", ", callMembers)
        startCall.setOnClickListener {

            if (PermissionUtil.requestPermissions(this@IncomingCallActivity,
                            CALL_PERMISSIONS,
                            *ChatActivity.CALL_PERMISSIONS)) {
                startActivity(ChatActivity.newIntent(
                        this,
                        channelId,
                        callMembers,
                        video,
                        true))
                finish()
            }
        }
        endCall.setOnClickListener {
            socketIO.sendCallTerminateMessage(channelId, video, callMembers)
            finish()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == CALL_PERMISSIONS && PermissionUtil.allGranted(grantResults)) {
            startActivity(ChatActivity.newIntent(
                    this,
                    channelId,
                    callMembers,
                    video,
                    true))

            finish()
        } else {
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    private fun initRingtonePLayer() {}

    override fun onResume() {
        super.onResume()
        wakeLock?.acquire()
    }

    override fun onPause() {
        super.onPause()
        wakeLock?.release()
    }

    override fun onDestroy() {
        unregisterReceiver(end_call_broadcast_receiver)
        super.onDestroy()
    }

    companion object {
        private const val CALL_PERMISSIONS = 101
        private val EXTRA_CHANNEL_NAME = "channelName"
        private val EXTRA_DISPLAY_NAME = "displayName"
        private val EXTRA_CALL_MEMBERS = "channelMembers"
        private val EXTRA_USE_VIDEO = "useVideo"
        private val CALL_ACTION = "callAction"

        fun start(c: Context, displayName: String, channel: String, members: ArrayList<String>, video: Boolean) {
            val i = buildIntent(c, displayName, channel, members, video)
            c.startActivity(i)
        }

        @JvmStatic
        fun startFromService(context: Context,
                             displayName: String?,
                             channel: String?,
                             members: ArrayList<String>?,
                             video: Boolean?) {
            val intent = buildIntent(
                    context,
                    displayName ?: return,
                    channel ?: return,
                    members ?: return,
                    video ?: return)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }

        private fun buildIntent(c: Context,
                                displayName: String,
                                channel: String,
                                members: ArrayList<String>,
                                video: Boolean): Intent {
            val i = Intent(c, IncomingCallActivity::class.java)
            i.putExtra(EXTRA_CHANNEL_NAME, channel)
            i.putExtra(EXTRA_CALL_MEMBERS, members)
            i.putExtra(EXTRA_USE_VIDEO, video)
            i.putExtra(EXTRA_DISPLAY_NAME, displayName)
            return i
        }
    }
}
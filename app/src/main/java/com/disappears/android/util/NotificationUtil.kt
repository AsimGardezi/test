package com.disappears.android.util

import android.annotation.SuppressLint
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.media.AudioAttributes
import android.media.RingtoneManager
import android.os.Build
import android.text.TextUtils
import androidx.core.app.NotificationCompat
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.disappears.android.ActivityLifecycleCallback
import com.disappears.android.R
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.flow.call.IncomingCallActivity
import com.disappears.android.flow.chats.MessagesList
import com.disappears.android.flow.chats.messages.MessageListActivity
import io.reactivex.Single
import java.io.IOException
import java.util.ArrayList

class NotificationUtil constructor(private val context: Context) {
    companion object {
        private const val CHANNEL_ID = "MSG_VANISH"
        private const val VOIP_CHANNEL_ID = "VOIP_VANISH"
    }

    init {
        setUpChannelId()
        setUpVoipChannelId()
    }

    @SuppressLint("NewApi")
    private fun setUpChannelId() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.app_name)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance)
            channel.description = "Notifications for messages"
            // Register the channel with the system
            val notificationManager: NotificationManager =
                    context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    @SuppressLint("NewApi")
    private fun setUpVoipChannelId() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.app_name)
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(VOIP_CHANNEL_ID, name, importance)
            channel.description = "Notifications for calls"
            channel.setSound(RingtoneManager.getValidRingtoneUri(context), Notification.AUDIO_ATTRIBUTES_DEFAULT)
            // Register the channel with the system
            val notificationManager: NotificationManager =
                    context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun buildVoipNotification(channelName: String?, callMembers: ArrayList<String>?, callType: Boolean?, displayName: String?): Single<Notification?> {
        return Single.fromPublisher {
            val EXTRA_CHANNEL_NAME = "channelName"
            val EXTRA_DISPLAY_NAME = "displayName"
            val EXTRA_CALL_MEMBERS = "channelMembers"
            val EXTRA_USE_VIDEO = "useVideo"
            val CALL_ACTION = "callAction"

            val receiveCallAction = Intent(context, IncomingCallActivity::class.java)
            receiveCallAction.putExtra(EXTRA_CHANNEL_NAME, channelName)
            receiveCallAction.putExtra(EXTRA_CALL_MEMBERS, callMembers)
            receiveCallAction.putExtra(EXTRA_USE_VIDEO, callType)
            receiveCallAction.putExtra(EXTRA_DISPLAY_NAME, displayName)
            receiveCallAction.putExtra(CALL_ACTION, "RECEIVE_CALL")
            receiveCallAction.setAction("RECEIVE_CALL");

            val cancelCallAction = Intent(context, IncomingCallActivity::class.java)
            cancelCallAction.putExtra(EXTRA_CHANNEL_NAME, channelName)
            cancelCallAction.putExtra(EXTRA_CALL_MEMBERS, callMembers)
            cancelCallAction.putExtra(EXTRA_USE_VIDEO, callType)
            cancelCallAction.putExtra(EXTRA_DISPLAY_NAME, displayName)
            cancelCallAction.putExtra(CALL_ACTION, "CANCEL_CALL")
            cancelCallAction.setAction("CANCEL_CALL");

            val fullScreenIntent = Intent(context, IncomingCallActivity::class.java)
            fullScreenIntent.putExtra(EXTRA_CHANNEL_NAME, channelName)
            fullScreenIntent.putExtra(EXTRA_CALL_MEMBERS, callMembers)
            fullScreenIntent.putExtra(EXTRA_USE_VIDEO, callType)
            fullScreenIntent.putExtra(EXTRA_DISPLAY_NAME, displayName)
            fullScreenIntent.putExtra(CALL_ACTION, "OPEN_CALL")
            val fullScreenPendingIntent = PendingIntent.getActivity(context, 0,
                    fullScreenIntent, PendingIntent.FLAG_CANCEL_CURRENT)
            val receiveCallPendingIntent = PendingIntent.getActivity(context, 1200,
                    receiveCallAction, PendingIntent.FLAG_CANCEL_CURRENT)
            val cancelCallPendingIntent = PendingIntent.getActivity(context, 1201,
                    cancelCallAction, PendingIntent.FLAG_CANCEL_CURRENT)

            val notificationBuilder =
                    NotificationCompat.Builder(context, VOIP_CHANNEL_ID)
                            .setSmallIcon(R.drawable.vanishlogo)
                            .setContentText(displayName)
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .setCategory(NotificationCompat.CATEGORY_CALL)
                            .addAction(R.drawable.call_onboarding, "Receive Call", receiveCallPendingIntent)
                            .addAction(R.drawable.btn_endcall, "Cancel call", cancelCallPendingIntent)
                            .setAutoCancel(true)
                            .setSound(RingtoneManager.getValidRingtoneUri(context))

                            // Use a full-screen intent only for the highest-priority alerts where you
                            // have an associated activity that you would like to launch after the user
                            // interacts with the notification. Also, if your app targets Android 10
                            // or higher, you need to request the USE_FULL_SCREEN_INTENT permission in
                            // order for the platform to invoke this notification.
                            .setFullScreenIntent(fullScreenPendingIntent, true)

            if (callType == true) {
                notificationBuilder.setContentTitle(context.getString(R.string.incoming_video_call))
            } else {
                notificationBuilder.setContentTitle(context.getString(R.string.incoming_audio_call))
            }

            it.onNext(notificationBuilder.build())
            it.onComplete()
        }
    }

    fun buildNotification(friendName: String, unread: Long): Single<Notification?> {
        return Single.fromPublisher {
            val fds = FriendRealmDataSource()
            var friend = fds.getFriendByName(friendName)
            if (friend == null) {
                val builder = NotificationCompat.Builder(context, CHANNEL_ID)
                val targetIntent = MessageListActivity[context, friendName]
                val stackBuilder = TaskStackBuilder.create(context)
                stackBuilder.addParentStack(MessageListActivity::class.java)
                stackBuilder.addNextIntent(targetIntent)
                val pi = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_CANCEL_CURRENT)
                val text = context.resources.getQuantityString(R.plurals.numberOfMessages, unread.toInt(), unread.toInt())

                builder.setSmallIcon(R.drawable.vanishlogo)
                        .setContentTitle(friendName)
                        .setContentText(text)
                        .addAction(R.drawable.icon_default_avatar, "Open", pi)
                        .setContentIntent(pi)
                        .setAutoCancel(true)
                        .setDefaults(Notification.DEFAULT_ALL)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    builder.priority = NotificationManager.IMPORTANCE_HIGH
                } else {
                    builder.priority = NotificationCompat.PRIORITY_HIGH
                }

                it.onNext(builder.build())
                it.onComplete()

                return@fromPublisher
            }

            val hasProfile = friend.profile != null
            val title = if (hasProfile && !TextUtils.isEmpty(friend.profile.name)) friend.profile.name else friend.name
            val profilePicture = if (hasProfile) friend.profile.imageUrl else ""
            if (profilePicture?.isNotEmpty() == true) {
                try {
                    context.loadImage(profilePicture, object : SimpleTarget<Bitmap>() {
                        override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                            val builder = NotificationCompat.Builder(context, CHANNEL_ID)
                            builder.setLargeIcon(resource)

                            val targetIntent = MessageListActivity[context, friend]
                            val stackBuilder = TaskStackBuilder.create(context)
                            stackBuilder.addParentStack(MessageListActivity::class.java)
                            stackBuilder.addNextIntent(targetIntent)
                            val pi = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_CANCEL_CURRENT)
                            val text = context.resources.getQuantityString(R.plurals.numberOfMessages, unread.toInt(), unread.toInt())

                            builder.setSmallIcon(R.drawable.vanishlogo)
                                    .setContentTitle(title)
                                    .setContentText(text)
                                    .addAction(R.drawable.icon_default_avatar, "Open", pi)
                                    .setContentIntent(pi)
                                    .setAutoCancel(true)
                                    .setDefaults(Notification.DEFAULT_ALL)
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                                builder.priority = NotificationManager.IMPORTANCE_HIGH
                            } else {
                                builder.priority = NotificationCompat.PRIORITY_HIGH
                            }

                            it.onNext(builder.build())
                            it.onComplete()
                        }
                    })
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }
        }
    }

    fun notify(n: Notification, id: Int) {
        if (ActivityLifecycleCallback.currentActivityRef?.get() is MessagesList?) {
            if ((ActivityLifecycleCallback.currentActivityRef?.get() as? MessagesList)?.friendName?.hashCode() != id) {
                showNotification(n, id)
            }
        } else {
            showNotification(n, id)
        }
    }

    fun notifyVoip(n: Notification, id: Int) {
        showNotification(n, id)
    }

    private fun showNotification(notification: Notification, id: Int) {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(id, notification)
    }

    fun clearNotification(id: Int) {
        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.cancel(id)
    }
}

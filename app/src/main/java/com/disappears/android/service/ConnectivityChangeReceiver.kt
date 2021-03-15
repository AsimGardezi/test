package com.disappears.android.service

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.disappears.android.util.NetworkHelperUtil
import com.disappears.android.util.d

class ConnectivityChangeReceiver : BroadcastReceiver() {
    @SuppressLint("NewApi")
    override fun onReceive(context: Context, intent: Intent) {
        if (NetworkHelperUtil.isOnline(context)) {
            d("Connectivity change")
            context.startService(Intent(context, MessageService::class.java))
        }
    }
}

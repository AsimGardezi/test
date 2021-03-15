package com.disappears.android.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkHelperUtil {
    fun isOnline(context: Context?): Boolean {
        if (context == null) {
            return false
        }
        val connMgr = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connMgr.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

}

object ResponseCode {
    const val NOT_FOUND = 404
}

fun Int.isNotFoundCode() = this == ResponseCode.NOT_FOUND
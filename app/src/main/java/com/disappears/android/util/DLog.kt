package com.disappears.android.util

import android.util.Log

import com.disappears.android.BuildConfig

object DLog {
    private const val DEBUG = BuildConfig.logging

    fun d(TAG: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            Log.d(TAG, "DBG - " + message, throwable)
        }
    }

    fun d(TAG: String, message: String) {
        if (DEBUG) {
            Log.d(TAG, "DBG - " + message)
        }
    }

    fun i(TAG: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            Log.i(TAG, "DBG - " + message, throwable)
        }
    }

    fun i(TAG: String, message: String) {
        if (DEBUG) {
            Log.i(TAG, "DBG - " + message)
        }
    }

    fun e(TAG: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            Log.e(TAG, "DBG - " + message, throwable)
        }
    }

    fun e(TAG: String, message: String) {
        if (DEBUG) {
            Log.e(TAG, "DBG - " + message)
        }
    }

    fun w(TAG: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            Log.w(TAG, "DBG - " + message, throwable)
        }
    }

    fun w(TAG: String, message: String) {
        if (DEBUG) {
            Log.w(TAG, "DBG - " + message)
        }
    }

    fun v(TAG: String, message: String, throwable: Throwable) {
        if (DEBUG) {
            Log.v(TAG, "DBG - " + message, throwable)
        }
    }

    fun v(TAG: String, message: String) {
        if (DEBUG) {
            Log.v(TAG, "DBG - " + message)
        }
    }

    fun s(TAG: String, message: String) {
        if (DEBUG) {
            Log.d(TAG, "DBG - " + message)
        }
    }

    fun g(TAG: String, message: String) {
        if (DEBUG) {
            Log.d(TAG, message)
        }
    }
}

package com.disappears.android.api

class Constants {
    enum class InviteAction {
        ACCEPT, BLOCK, IGNORE
    }

    object Api {
        val UPLOAD_PICTURE_NAME = "profile.jpg"
        var API_VERSION = "50"
        var PLATFORM = "Android"
        var INITIAL_IDENTITY_VERSION = "1"
        const val COOKIE_HEADER = "Set-Cookie"
        val DATA_PREFIX = "dataKey_"
    }
}

package com.disappears.android.model

class Identity(
        var username: String? = null,
        var salt: String? = null,
        var dhPriv: String? = null,
        var dhPub: String? = null,
        var dsaPriv: String? = null,
        var dsaPub: String? = null,
        var password: String? = null,
        var cookie: String? = null,
        var version: String? = null)

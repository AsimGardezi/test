package com.disappears.android.model

class User @JvmOverloads constructor(var username: String,
                                     var password: String,
                                     var authSig: String? = null,
                                     var dhPub: String? = null,
                                     var dsaPub: String? = null,
                                     var version: String? = null,
                                     var platform: String? = null,
                                     var gcmId: String? = null)

package com.disappears.android.model.response

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class PublicKeyData(@PrimaryKey
                         var friendName: String? = null,
                         var version: String? = null,
                         var dhPub: String? = null,
                         var dhPubSig: String? = null,
                         var dsaPub: String? = null,
                         var dsaPubSig: String? = null) : RealmObject()

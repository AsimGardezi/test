package com.disappears.android.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class FriendSettings(@PrimaryKey
                          var name: String? = null,
                          var muted: Boolean = false) : RealmObject()

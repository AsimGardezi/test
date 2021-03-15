package com.disappears.android.data

import io.realm.Realm

interface RealmDataChange {
    fun run(realm: Realm)
}

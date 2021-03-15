package com.disappears.android.data

import io.realm.Realm

interface RealmOpearation<T> {
    fun run(realm: Realm): T
}

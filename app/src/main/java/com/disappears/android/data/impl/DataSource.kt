package com.disappears.android.data.impl

import io.realm.Realm
import io.realm.RealmConfiguration

open class DataSource {
    protected fun <T> executeQuery(operation: (Realm) -> (T)): T {
        val r = Realm.getDefaultInstance()
        val result = operation(r)
        r.close()
        return result
    }

    protected fun executeDataChange(operation: (Realm) -> (Unit)) {
        val r = Realm.getDefaultInstance()
        r.executeTransaction { realm -> operation(realm) }
        r.close()
    }
}


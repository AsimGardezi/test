package com.disappears.android.data.impl

import com.disappears.android.model.FriendSettings
import com.disappears.android.model.Message
import com.disappears.android.model.response.Friend
import io.realm.DynamicRealm
import io.realm.FieldAttribute
import io.realm.RealmMigration

class DisappearsRealmMigration : RealmMigration {
    override fun migrate(realm: DynamicRealm?, oldVersion: Long, newVersion: Long) {
        val schema = realm!!.schema
        if (oldVersion == 0L) {
            schema.create(FriendSettings::class.java.simpleName).addField("name",
                    String::class.javaObjectType,
                    FieldAttribute.PRIMARY_KEY)
                    .addField("muted", Boolean::class.javaObjectType)
            realm.where(Friend::class.java.simpleName).findAll().forEach { obj ->
                val setting = realm.createObject(FriendSettings::class.java.simpleName, obj.getString("name"))
                setting.set("muted", false)
            }
            oldVersion.inc()
        }

        if (oldVersion == 1L) {
            val objectSchema = schema.get(Message::class.java.simpleName)
            objectSchema?.let {
                if (!it.hasField("read")) {
                    it.addField("read", Boolean::class.java).transform { obj ->
                        obj.set("read", true)
                    }
                    oldVersion.inc()
                }
            }
        }
    }
}
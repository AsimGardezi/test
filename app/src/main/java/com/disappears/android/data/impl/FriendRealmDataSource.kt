package com.disappears.android.data.impl

import com.disappears.android.data.FriendDataSource
import com.disappears.android.model.FriendSettings
import com.disappears.android.model.FriendSettingsFields
import com.disappears.android.model.response.*
import io.realm.Realm
import io.realm.RealmChangeListener
import io.realm.RealmModel
import io.realm.RealmResults

class FriendRealmDataSource : DataSource(), FriendDataSource {
    override fun saveFriends(friends: List<Friend>) {
        executeDataChange { realm ->
            friends.forEach { friend ->
                realm.copyToRealmOrUpdate(friend)
                if (getFriendSetting(realm, friend.name ?: return@forEach) == null) {
                    val settings = realm.createObject(FriendSettings::class.java, friend.name)
                    settings.muted = false
                }
            }
        }
    }

    override fun deleteFriend(name: String) {
        executeDataChange { realm ->
            val friend = realm
                    .where(Friend::class.java)
                    .equalTo(FriendFields.NAME, name)
                    .findFirst()

            friend?.let {
                it.deleteFromRealm()
                getFriendSetting(realm, name)?.let {
                    it.deleteFromRealm()
                }
            }
        }
    }

    override fun getFriendByName(name: String): Friend? {
        return executeQuery { realm ->
            val f = realm.where(Friend::class.java)
                    .equalTo(FriendFields.NAME, name)
                    .findFirst()
            if (f != null) {
                realm.copyFromRealm(f)
            } else {
                null
            }
        }
    }

    private fun getFriendByName(r: Realm, name: String): Friend? {
        return r.where(Friend::class.java)
                .equalTo(FriendFields.NAME, name)
                .findFirst()
    }

    private fun getFriendSetting(r: Realm, name: String): FriendSettings? {
        return r.where(FriendSettings::class.java)
                .equalTo(FriendSettingsFields.NAME, name)
                .findFirst()
    }

    override fun saveFriend(f: Friend) {
        executeDataChange { realm -> realm.copyToRealmOrUpdate(f) }
    }

    override fun setAvailableMessageControlId(friendName: String, controlId: String) {
        executeQuery { realm ->
            val f = getFriendByName(realm, friendName)
            realm.beginTransaction()
            f?.availableMessageControlId = Integer.valueOf(controlId)
            realm.commitTransaction()
            f
        }
    }

    override fun setAvailableMessageId(friendName: String, availableMessageId: String): Friend {
        return executeQuery { realm ->
            val f = getFriendByName(realm, friendName)
            realm.beginTransaction()
            f?.availableMessageId = Integer.valueOf(availableMessageId)
            realm.commitTransaction()
            f!!
        }
    }

    override fun isMuted(friendName: String): Boolean {
        return executeQuery { realm ->
            val friendSetting = getFriendSetting(realm, friendName)
            friendSetting?.muted ?: false
        }
    }

    override fun loadFriends(): List<Friend> {
        return executeQuery { realm ->
            val result = realm.where(Friend::class.java).findAll()
            realm.copyFromRealm(result)
        }
    }

    override fun getPendingFriends(searchQuery: String?): List<Friend> {
        return executeQuery { realm ->
            var pending = realm.where(Friend::class.java)
                    .equalTo(FriendFields.FLAGS, Friend.Flag.INVITED.value)
                    .findAll()

            if (searchQuery.isNullOrEmpty().not()) {
                pending = pending.where().like(FriendFields.NAME, "*$searchQuery*").findAll()
            }

            realm.copyFromRealm(pending)
        }
    }

    override fun <T : RealmModel> registerChangeListener(clazz: Class<T>,
                                                         changeListener: RealmChangeListener<RealmResults<T>>) {
        Realm.getDefaultInstance()
                .where(clazz)
                .findAll()
                .addChangeListener(changeListener)
    }

    override fun <T : RealmModel> unregisterChangeListener(clazz: Class<T>,
                                                           changeListener: RealmChangeListener<RealmResults<T>>) {
        Realm.getDefaultInstance()
                .where(clazz)
                .findAll()
                .removeChangeListener(changeListener)
    }

    override fun getAllWithoutPending(searchQuery: String?): List<Friend> {
        return executeQuery { realm ->

            var result = realm.where(Friend::class.java)
                    .notEqualTo(FriendFields.FLAGS, Friend.Flag.INVITED.value)
                    .findAll()

            if (searchQuery.isNullOrEmpty().not()) {
                result = result.where()
                        .like(FriendFields.NAME, "*$searchQuery*")
                        .findAll()
            }

            realm.copyFromRealm(result)
        }
    }

    override fun deleteData() {
        executeDataChange { realm ->
            realm.delete(Friend::class.java)
            realm.delete(Profile::class.java)
        }
    }

    override fun getKeyData(name: String): PublicKeyData? {
        return executeQuery { realm ->
            val friendData = realm.where(PublicKeyData::class.java)
                    .equalTo(PublicKeyDataFields.FRIEND_NAME, name)
                    .findFirst()
            if (friendData != null) {
                realm.copyFromRealm(friendData)
            } else {
                null
            }
        }
    }

    override fun toggleMutedSetting(friendName: String, muted: Boolean) {
        executeDataChange { realm ->
            getFriendSetting(realm, friendName)?.let {
                it.muted = muted
                realm.copyToRealmOrUpdate(it)
            }

        }
    }
}

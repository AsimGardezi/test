package com.disappears.android.data

import com.disappears.android.model.response.Friend
import com.disappears.android.model.response.PublicKeyData
import io.realm.RealmChangeListener
import io.realm.RealmModel
import io.realm.RealmResults

interface FriendDataSource {
    fun saveFriends(friends: List<Friend>)

    fun deleteFriend(name: String)

    fun getFriendByName(name: String): Friend?

    fun saveFriend(f: Friend)

    fun setAvailableMessageControlId(friendName: String, controlId: String)

    fun setAvailableMessageId(friendName: String, availableMessageId: String): Friend

    fun loadFriends(): List<Friend>

    fun getPendingFriends(searchQuery: String?): List<Friend>

    fun getAllWithoutPending(searchQuery: String?): List<Friend>

    fun deleteData()

    fun getKeyData(name: String): PublicKeyData?

    fun isMuted(friendName: String): Boolean

    fun toggleMutedSetting(friendName: String, muted: Boolean)

    fun <T : RealmModel> registerChangeListener(clazz: Class<T>, changeListener: RealmChangeListener<RealmResults<T>>)

    fun <T : RealmModel> unregisterChangeListener(clazz: Class<T>, changeListener: RealmChangeListener<RealmResults<T>>)
}

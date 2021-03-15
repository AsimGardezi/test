package com.disappears.android.data.impl

import com.disappears.android.data.ChatDataSource
import com.disappears.android.model.Message
import io.realm.Realm
import io.realm.Sort

class ChatRealmDataSource : DataSource(), ChatDataSource {
    override fun saveMessages(messages: List<Message>) {
        executeDataChange { realm ->
            messages.forEach { message ->
                if (!updateExisting(realm, message)) {
                    realm.copyToRealmOrUpdate(message)
                }
            }
        }
    }

    private fun updateExisting(realm: Realm, message: Message): Boolean {
        //TODO fix, numeric id is not unique
        val existing = realm.where(Message::class.java).equalTo("id", message.id).findFirst()
        if (existing != null) {
            existing.updateFrom(message)
            realm.copyToRealmOrUpdate(existing)
            return true
        }
        return false
    }

    override fun getMessagesToResend(username: String): List<Message> {
        return executeQuery { realm ->
            val result = realm.where(Message::class.java).equalTo("from",
                    username).equalTo("resend", 1 as Int).findAll()
            realm.copyFromRealm(result)
        }
    }

    override fun markAllAsRead(friendName: String) {
        executeDataChange { realm ->
            realm.where(Message::class.java).equalTo("from", friendName).findAll().forEach { msg ->
                msg.read = true
            }
        }
    }

    override fun getUnreadCount(friendName: String): Long {
        return executeQuery { realm ->
            realm.where(Message::class.java).equalTo("from",
                    friendName).equalTo("read", false).count()
        }
    }

    override fun getMessages(friendName: String): List<Message> {
        return executeQuery { realm ->
            val result = realm.where(Message::class.java).equalTo("from",
                    friendName).or().equalTo("to",
                    friendName).findAll().sort("dateTime", Sort.ASCENDING)
            realm.copyFromRealm(result)
        }
    }

    override fun getMediaMessages(friendName: String): List<Message> {
        return executeQuery { realm ->
            val result = realm.where(Message::class.java).beginGroup().equalTo("from",
                    friendName).or().equalTo("to",
                    friendName).endGroup().and().contains("mimeType", "image").findAll()
            realm.copyFromRealm(result)
        }
    }

    override fun getMessage(id: String): Message? {
        return executeQuery { realm ->
            val message = realm.where(Message::class.java).equalTo("id", id).findFirst()
            message?.let { realm.copyFromRealm(it) }
        }
    }

    override fun getLatestMessage(username: String): Message? {
        return executeQuery { realm ->
            val result = realm.where(Message::class.java).equalTo("from",
                    username).or().equalTo("to",
                    username).findAll().sort("dateTime", Sort.DESCENDING)
            if (result.size > 0) {
                realm.copyFromRealm(result.first())
            } else null
        }
    }

    override fun addMessage(messageToSend: Message) {
        executeDataChange { realm -> realm.copyToRealmOrUpdate(messageToSend) }
    }

    override fun deleteData() {
        executeDataChange { realm -> realm.delete(Message::class.java) }
    }

    override fun saveMessage(msg: Message) {
        executeDataChange { realm ->
            if (!updateExisting(realm, msg)) {
                realm.copyToRealmOrUpdate(msg)
            }
        }
    }

    override fun deleteMessage(friendName: String, numericId: Int): Message? {
        var message: Message? = null
        executeDataChange { realm ->
            realm.where(Message::class.java).equalTo("numericId",
                    numericId).equalTo("from",
                    friendName).findAll().let {
                val messageRealm = it.firstOrNull()
                if (messageRealm != null) {
                    message = realm.copyFromRealm(messageRealm)
                    it.deleteAllFromRealm()
                }
            }
        }
        return message
    }

    override fun deletePlaceholderMessages(iv: String) {
        executeDataChange { realm ->
            realm.where(Message::class.java).beginGroup().equalTo("numericId", 0 as Int).or()
                    .equalTo("numericId", -1 as Int).endGroup().equalTo("iv",
                            iv).findAll().deleteAllFromRealm()
        }
    }

    override fun getPlaceholderMessage(iv: String) = executeQuery { realm ->
        val result = realm.where(Message::class.java).beginGroup().equalTo("numericId", 0 as Int).or()
                .equalTo("numericId", -1 as Int).endGroup().equalTo("iv", iv)
        result.findFirst()?.let {
            realm.copyFromRealm(it)
        }
    }

    override fun deleteMessages(friendName: String) {
        executeDataChange { realm ->
            realm.where(Message::class.java)
                    .equalTo("from", friendName)
                    .or()
                    .equalTo("to", friendName)
                    .findAll()
                    .deleteAllFromRealm()
        }
    }

    override fun deleteMessage(id: String) {
        executeDataChange { realm ->
            realm.where(Message::class.java).equalTo("id",
                    id).findAll().deleteAllFromRealm()
        }
    }

    override fun deleteMessagesUpToId(lastId: Int, usersInvolved: Array<String>) {
        executeDataChange { realm ->
            realm.where(Message::class.java).lessThanOrEqualTo("numericId", lastId).beginGroup()
                    .equalTo("from", usersInvolved[0]).equalTo("to", usersInvolved[1]).or()
                    .equalTo("from", usersInvolved[1]).equalTo("to", usersInvolved[0]).endGroup()
                    .findAll().deleteAllFromRealm()
        }
    }

    override fun deleteUserMessagesUpToIdFor(from: String, lastId: Int) {
        executeDataChange { realm ->
            realm.where(Message::class.java)
                    .lessThanOrEqualTo("numericId", lastId)
                    .equalTo("from", from)
                    .findAll()
                    .deleteAllFromRealm()
        }
    }
}

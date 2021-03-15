package com.disappears.android.data

import com.disappears.android.model.Message

interface ChatDataSource {
    fun saveMessages(messages: List<Message>)

    fun getMessagesToResend(username: String): List<Message>

    fun getMessage(id: String): Message?

    fun getLatestMessage(username: String): Message?

    fun addMessage(messageToSend: Message)

    fun deleteData()

    fun saveMessage(msg: Message)

    fun deletePlaceholderMessages(data: String)

    fun deleteMessages(friendName: String)

    fun deleteMessage(id: String)

    fun deleteMessagesUpToId(lastId: Int, usersInvolved: Array<String>)

    fun deleteUserMessagesUpToIdFor(from: String, lastId: Int)

    fun getMessages(friendName: String): List<Message>

    fun markAllAsRead(friendName: String)

    fun getUnreadCount(friendName: String): Long

    fun deleteMessage(friendName: String, numericId: Int): Message?

    fun getPlaceholderMessage(iv: String): Message?

    fun getMediaMessages(friendName: String): List<Message>
}

package com.disappears.android.model

import com.disappears.android.model.adapter.AdapterMessage
import com.disappears.android.model.adapter.MessageAuthor
import com.disappears.android.model.response.Friend

object ModelMapper {
    fun map(friendName: String, currentUser: MessageAuthor, friend: MessageAuthor, messageToMap: Message): AdapterMessage {
        val tmp = AdapterMessage()
        tmp.friend = if (messageToMap.from == friendName) friend else currentUser
        tmp.id = messageToMap.id
        tmp.text = messageToMap.data
        tmp.timestamp = messageToMap.dateTime!!
        return tmp
    }

    fun map(friend: Friend): MessageAuthor {
        val author = MessageAuthor()
        author.name = friend.name
        author.avatar = if (friend.profile != null) friend.profile.imageUrl else null
        return author
    }
}

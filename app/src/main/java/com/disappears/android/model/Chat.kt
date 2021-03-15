package com.disappears.android.model

import com.disappears.android.model.response.Friend

class Chat(val messageId: String?,
           val friend: Friend?,
           val name: String?,
           val lastMessage: String?,
           val unreadCount: Int,
           val lastMessageTimeStamp: String,
           val imageUrl: String?)



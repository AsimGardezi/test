package com.disappears.android.flow.chats.messages

import com.stfalcon.chatkit.commons.models.IMessage

/**
 * Created by ihor_kucherenko on 1/12/18.
 * https://github.com/KucherenkoIhor
 */
data class MessageListModel(val initialMessages: List<IMessage>? = null,
                            val newMessage: IMessage? = null,
                            val error: Throwable? = null,
                            val deletedMessageId: String? = null)
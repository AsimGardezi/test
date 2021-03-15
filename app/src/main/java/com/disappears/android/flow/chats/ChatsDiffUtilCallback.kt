package com.disappears.android.flow.chats

import androidx.recyclerview.widget.DiffUtil
import com.disappears.android.model.Chat

/**
 * Created by ihor_kucherenko on 1/11/18.
 * https://github.com/KucherenkoIhor
 */
class ChatsDiffUtilCallback(private val oldDataSource: List<Chat>,
                            private val newDataSource: List<Chat>)
    : DiffUtil.Callback() {
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldDataSource[oldItemPosition]
        val newItem = newDataSource[newItemPosition]
        return oldItem.name == newItem.name
    }

    override fun getOldListSize() = oldDataSource.size
    override fun getNewListSize() = newDataSource.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldDataSource[oldItemPosition]
        val newItem = newDataSource[newItemPosition]
        return oldItem == newItem
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        val oldItem = oldDataSource[oldItemPosition]
        val newItem = newDataSource[newItemPosition]
        return HashSet<String>().apply {

            if (oldItem.lastMessageTimeStamp != newItem.lastMessageTimeStamp) {
                add(Chat::lastMessageTimeStamp.name)
            }
            if (oldItem.name != newItem.name) {
                add(Chat::name.name)
            }
            if (oldItem.unreadCount != newItem.unreadCount) {
                add(Chat::unreadCount.name)
            }
            if (oldItem.friend != newItem.friend) {
                add(Chat::friend.name)
            }
            if (oldItem.imageUrl != newItem.imageUrl) {
                add(Chat::imageUrl.name)
            }
            if (oldItem.lastMessage != newItem.lastMessage) {
                add(Chat::lastMessage.name)
            }
        }
    }
}
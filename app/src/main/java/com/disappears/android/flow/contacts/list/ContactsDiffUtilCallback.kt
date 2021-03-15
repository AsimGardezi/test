package com.disappears.android.flow.contacts.list

import androidx.recyclerview.widget.DiffUtil
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.response.Friend

/**
 * Created by ihor_kucherenko on 12/26/17.
 * https://github.com/KucherenkoIhor
 */
class ContactsDiffUtilCallback(
        private val oldContacts: List<ContactFeedItem>,
        private val newContacts: List<ContactFeedItem>) : DiffUtil.Callback() {
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldContacts[oldItemPosition]
        val newItem = newContacts[newItemPosition]

        return if (oldItem::class.java == newItem::class.java) {
            oldItem.name?.intern() === newItem.name?.intern()
        } else {
            false
        }
    }

    override fun getOldListSize() = oldContacts.size
    override fun getNewListSize() = newContacts.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldContacts[oldItemPosition]
        val newItem = newContacts[newItemPosition]

        return if (oldItem is Friend && newItem is Friend) {
            (oldItem.name?.intern() === newItem.name?.intern()
                    && oldItem.photo?.intern() === newItem.photo?.intern()
                    && oldItem.flags == newItem.flags)
        } else {
            (oldItem.name?.intern() == newItem.name?.intern()
                    && oldItem.photo?.intern() == newItem.photo?.intern())
        }
    }
}
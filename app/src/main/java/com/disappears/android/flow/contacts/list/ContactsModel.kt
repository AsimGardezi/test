package com.disappears.android.flow.contacts.list

import com.disappears.android.model.ContactFeedItem

/**
 * Created by ihor_kucherenko on 12/18/17.
 * https://github.com/KucherenkoIhor
 */
data class ContactsModel(
        val isProgressDisplayed: Boolean = false,
        val error: Exception? = null,
        val contacts: List<ContactFeedItem> = emptyList())
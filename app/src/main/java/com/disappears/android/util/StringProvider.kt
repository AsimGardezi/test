package com.disappears.android.util

import android.content.Context
import com.disappears.android.R

class StringProvider(private val c: Context) {
    fun getCannotLoadCurrentUser(): String {
        return c.getString(R.string.cannot_load_current_profile)
    }

    fun getAddressBookContacts(): String {
        return c.getString(R.string.address_book_contacts)
    }

    fun getPendingContacts(): String {
        return c.getString(R.string.pending_contacts)
    }

    fun getVanishContacts(): String {
        return c.getString(R.string.vanish_contacts)
    }
}
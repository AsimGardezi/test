package com.disappears.android.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

import com.disappears.android.R
import com.disappears.android.flow.chats.ChatsFragment
import com.disappears.android.flow.contacts.list.ContactsFragment
import com.disappears.android.flow.settings.SettingsFragment

class GenericViewPagerAdapter(manager: FragmentManager, private val resources: Resources) : FragmentStatePagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            TAB_CONTACTS -> ContactsFragment.newInstance()
            TAB_CHATS -> ChatsFragment.newInstance()
            TAB_SETTINGS -> SettingsFragment.newInstance()
            else -> throw IllegalStateException()
        }
    }

    override fun getCount() = TABS_COUNT

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            TAB_CONTACTS -> resources.getString(R.string.title_contacts)
            TAB_CHATS -> resources.getString(R.string.title_chats)
            TAB_SETTINGS -> resources.getString(R.string.title_settings)
            else -> throw IllegalStateException()
        }
    }

    companion object {
        const val TABS_COUNT = 3
        const val TAB_CONTACTS = 0
        const val TAB_CHATS = 1
        const val TAB_SETTINGS = 2
    }
}

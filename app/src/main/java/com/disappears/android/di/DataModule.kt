package com.disappears.android.di

import android.preference.PreferenceManager
import com.disappears.android.chat.ChatManager
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.data.ChatDataSource
import com.disappears.android.data.FriendDataSource
import com.disappears.android.data.impl.ChatRealmDataSource
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.*
import org.koin.dsl.module.applicationContext

object DataModule {
    fun getModule() = applicationContext {
        bean { FriendRealmDataSource() } bind FriendDataSource::class
        bean { StringProvider(get()) }
        bean { ChatManager(get(), get(), get(), get()) }
        bean { ChatRealmDataSource() } bind ChatDataSource::class
        bean { NotificationUtil(get()) }
        bean { SocketIOConnection(get(), get(), get(), get()) }
        bean { LastSeenFormatter(get()) }
        bean { ContactUtil(get()) }
        bean { FileUtil(get()) }
        bean { ImageUtil(get(), get()) }
        bean { MessagesObserver() }
        bean { SharedPrefUtil(get(), get()) }
        bean { PreferenceManager.getDefaultSharedPreferences(get()) }
    }
}

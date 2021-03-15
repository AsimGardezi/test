package com.disappears.android.di

import com.disappears.android.flow.contacts.list.ContactsViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.applicationContext

object ViewModelModule {
    fun getModule() = applicationContext {
        viewModel { ContactsViewModel(get(), get(), get(), get(), get()) }
    }
}
package com.disappears.android.di

import com.disappears.android.encryption.EncryptionService
import com.disappears.android.encryption.EncryptionServiceDefault
import org.koin.dsl.module.applicationContext

object EncryptionModule {
    fun getModule() = applicationContext {
        bean { EncryptionServiceDefault(get()) } bind EncryptionService::class
    }
}

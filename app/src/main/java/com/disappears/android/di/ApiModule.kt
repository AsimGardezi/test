package com.disappears.android.di

import android.content.Context
import android.provider.Settings
import com.disappears.android.R
import com.disappears.android.api.Constants
import com.disappears.android.api.MessageTypeAdapter
import com.disappears.android.api.VanishApi
import com.disappears.android.api.enableTls12OnPreLollipop
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Message
import com.disappears.android.util.SharedPrefUtil
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Authenticator
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.applicationContext
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiModule : KoinComponent {
    fun getModule() = applicationContext {
        bean {
            GsonBuilder().registerTypeAdapter(Message::class.java, MessageTypeAdapter()).create()
        }
        bean {
            getUnsafeOkHttpClient(get(), get())
        }
        bean {
            getBackendClient(get(), get(), get())
        }
        bean {
            getAuthenticator(get(), get(), get())
        }
    }

    private fun getBackendClient(c: Context, gson: Gson, client: OkHttpClient): VanishApi {
        return Retrofit.Builder()
                .baseUrl(c.getString(R.string.api_base))
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(VanishApi::class.java)
    }

    private fun getUnsafeOkHttpClient(c: Context, authenticator: Authenticator): OkHttpClient {
        try {
            val builder = OkHttpClient.Builder()
            builder.certificatePinner(
                    CertificatePinner.Builder()
                            .add(c.getString(R.string.api_base), c.getString(R.string.serverSha))
                            .build()).readTimeout(20, TimeUnit.SECONDS)
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(logging)
            builder.authenticator(authenticator)
            builder.cookieJar(PersistentCookieJar(SetCookieCache(), SharedPrefsCookiePersistor(c)))
            builder.retryOnConnectionFailure(true)
            builder.enableTls12OnPreLollipop()

            return builder.build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }

    private fun getAuthenticator(c: Context, util: SharedPrefUtil, encryption: EncryptionService): Authenticator {
        return Authenticator { route, response ->
            if (responseCount(response) >= 3) {
                return@Authenticator null
            }
            util.currentLoggedUser?.let {
                val api: VanishApi by inject()
                encryption.createKeyStore(it)
                val identity = encryption.getIndentity(it)
                val password = identity.password
                val deviceId = Settings.Secure.getString(c.applicationContext.contentResolver, Settings.Secure.ANDROID_ID)
                val user = encryption.buildUserObjectForLogin(deviceId, it, password!!)
                user?.let { u ->
                    val r = api.login(u).blockingGet()
                    if (r.isSuccessful) {
                        val header = r.headers().get(Constants.Api.COOKIE_HEADER)
                        header?.let {
                            encryption.updateIdentity(u.username, it)
                        }
                        response.request().newBuilder().build()
                    } else {
                        null
                    }
                }
            }
        }
    }

    private fun responseCount(response: Response?): Int {
        var result = 1
        var resp: Response? = response?.priorResponse()
        while (resp != null) {
            resp = response?.priorResponse()
            result++
        }
        return result
    }
}

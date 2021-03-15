package com.disappears.android

import android.os.Handler
import android.os.Looper
import androidx.multidex.MultiDexApplication
import com.bugfender.sdk.Bugfender
import com.crashlytics.android.Crashlytics
import com.disappears.android.agora.openvcall.UserSettingsHolder
import com.disappears.android.agora.openvcall.WorkerThreadHolder
import com.disappears.android.agora.openvcall.model.WorkerThread
import com.disappears.android.data.impl.DisappearsRealmMigration
import com.disappears.android.di.*
import com.disappears.android.util.BugfenderTree
import io.fabric.sdk.android.Fabric
import io.reactivex.plugins.RxJavaPlugins
import io.realm.Realm
import io.realm.RealmConfiguration
import org.koin.android.ext.android.startKoin
import timber.log.Timber

open class DisappearsApp : MultiDexApplication(), WorkerThreadHolder, UserSettingsHolder {
    private var mWorkerThread: WorkerThread? = null

    @Synchronized
    override fun initWorkerThread() {
        if (mWorkerThread == null) {
            mWorkerThread = WorkerThread(applicationContext)
            mWorkerThread?.start()

            mWorkerThread?.waitForReady()
        }
    }

    @Synchronized
    override fun getWorkerThread(): WorkerThread {
        return mWorkerThread ?: WorkerThread(applicationContext).apply {
            mWorkerThread = this
            mWorkerThread?.start()
            mWorkerThread?.waitForReady()
        }
    }

    @Synchronized
    override fun deInitWorkerThread() {
        mWorkerThread?.exit()
        try {
            mWorkerThread?.join()
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        mWorkerThread = null
    }

    override fun onCreate() {
        super.onCreate()
        startKoin(this,
                listOf(ActivityModule.getModule(),
                        ApiModule.getModule(),
                        DataModule.getModule(),
                        EncryptionModule.getModule(),
                        ViewModelModule.getModule()))
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        Fabric.with(this, Crashlytics())
        RxJavaPlugins.setErrorHandler {
            Handler(Looper.getMainLooper()).post {
                Timber.e(it)
                Crashlytics.logException(it)
            }
        }
        Realm.init(this)
        val realmConfig = RealmConfiguration.Builder().schemaVersion(1).migration(DisappearsRealmMigration()).build()!!
        Realm.setDefaultConfiguration(realmConfig)
        registerActivityLifecycleCallbacks(ActivityLifecycleCallback)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}

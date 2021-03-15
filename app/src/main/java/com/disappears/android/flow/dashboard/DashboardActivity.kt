package com.disappears.android.flow.dashboard

import android.Manifest
import android.app.Activity
import android.content.*
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.disappears.android.R
import com.disappears.android.adapter.GenericViewPagerAdapter
import com.disappears.android.base.BaseActivity
import com.disappears.android.base.ThumbId
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.di.ActivityModule
import com.disappears.android.flow.chats.create.CreateChatActivity
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.service.MessageService
import com.disappears.android.util.d
import com.disappears.android.util.pageSelectedObservable
import com.disappears.android.util.startService
import com.google.android.material.snackbar.Snackbar
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_dashboard.*
import org.koin.android.ext.android.inject

class DashboardActivity : BaseActivity<DashboardContract.Presenter>(DashboardContract.Presenter::class),
        DashboardContract.View,
        LifecycleObserver {
    var thumbId: ThumbId? = null
    lateinit var sharedPreferences: SharedPreferences
    override val layoutResourceId = R.layout.activity_dashboard

    private val sectionsPagerAdapter by lazy { GenericViewPagerAdapter(supportFragmentManager, resources) }

    private val compositeDisposable = CompositeDisposable()
    private val messagesObserver: MessagesObserver by inject()

    private val rxPermissions: RxPermissions by inject { mapOf(ActivityModule.PARAM_ACTIVITY to this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProcessLifecycleOwner.get().lifecycle.addObserver(this);
        initTabs()
        setSupportActionBar(toolbar)
        lifecycle.addObserver(messagesObserver)
        fab.visibility = View.VISIBLE
        fab?.setOnClickListener { createTalk() }
        presenter.init()
    }

    private fun initTabs() {
        viewPager?.adapter = sectionsPagerAdapter
        viewPager.offscreenPageLimit = GenericViewPagerAdapter.TABS_COUNT - 1
        tabs.setupWithViewPager(viewPager)
        viewPager?.pageSelectedObservable?.subscribe { position ->
            fab?.visibility = if (position == GenericViewPagerAdapter.TAB_CHATS) View.VISIBLE else View.GONE
            if (supportActionBar != null) {
                supportActionBar?.title = getString(R.string.app_name)
            }
        }?.let { compositeDisposable.add(it) }

        if (backStackFromProfile) {
            viewPager?.currentItem = GenericViewPagerAdapter.TAB_SETTINGS
            backStackFromProfile = false
        } else {
            viewPager?.currentItem = GenericViewPagerAdapter.TAB_CHATS
        }
    }

    private fun createTalk() {
        CreateChatActivity.start(this)
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onStart() {
        super.onStart()
        alreadyLogin = false
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
        sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        if (sharedPreferences.getBoolean("allowTouchId", false) && !alreadyLogin) {
            thumbId = ThumbId(this@DashboardActivity)
            thumbId?.ThumbVerification("DashboardActivity")
        }
    }

    override fun onDestroy() {
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.dispose()
        }
        super.onDestroy()
        presenter.onDestroy()
        stopService(Intent(this, MessageService::class.java))
    }

    override fun runMessageService() {
        d("RunMessageService")
        rxPermissions.let {
            d("Permission not null")
            it.request(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA).subscribe({ result ->
                d("Requested permissions")
                if (result) {
                    d("Permissions granted")
                    MessageService::class.startService(this)
                }
            }, {
                d("error")
                it.printStackTrace()
            })
        }
    }

    companion object {
        var alreadyLogin: Boolean = false
        var backStackFromProfile = false

        fun start(c: Context, isAuthenticated: Boolean = false) {
            alreadyLogin = isAuthenticated
            val i = Intent(c, DashboardActivity::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            c.startActivity(i)
        }
    }
}


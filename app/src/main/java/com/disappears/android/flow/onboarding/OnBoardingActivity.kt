package com.disappears.android.flow.onboarding

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.disappears.android.R
import com.disappears.android.api.VanishApi
import com.disappears.android.base.ThumbId
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.flow.signin.LoginActivity
import com.disappears.android.util.SharedPrefUtil
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_onboarding.*
import org.koin.android.ext.android.inject

class OnBoardingActivity : AppCompatActivity(), LifecycleObserver {
    private val from_dashboard by lazy {
        intent.getBooleanExtra(OnBoardingActivity.FROM_DASHBOARD, false)
    }

    var thumbId: ThumbId? = null
    lateinit var sharedPreferences: SharedPreferences
    private var sectionsPagerAdapter: SectionsPagerAdapter? = null
    val loginUtil: SharedPrefUtil by inject()
    val encryption: EncryptionService by inject()
    val api: VanishApi by inject()
    private val deviceId: String
        @SuppressLint("HardwareIds")
        get() = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        checkExtras()
        val username = loginUtil.currentLoggedUser

        if (username != null && !from_dashboard) {
            DashboardActivity.start(this)
        }

        setContentView(R.layout.activity_onboarding)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        sectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter
        indicator.setViewPager(viewPager)
    }

    private fun checkExtras() {
        if (intent.getBooleanExtra(EXTRA_LOGGED_OUT, false)) {
            Snackbar.make(findViewById(android.R.id.content), R.string.auto_logout, Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_onboarding, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_login) {
            LoginActivity.start(this, false)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return OnBoardingFragment.newInstance(resources.getStringArray(R.array.onboardingTitles)[position],
                    resources.getStringArray(R.array.onboardingSubtitles)[position])
        }

        override fun getCount(): Int {
            return 4
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return null
        }
    }

    override fun onStart() {
        super.onStart()
        sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        thumbId = ThumbId(this@OnBoardingActivity)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
        val username = loginUtil.currentLoggedUser
        if (username != null) {
            sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
            var thumbId = ThumbId(this)
            try {
                if (sharedPreferences.getBoolean("allowTouchId", true) && !from_dashboard) {
                    thumbId.ThumbVerification("OnBoardingActivity")
                }
            } catch (e: Exception) {
            }
        }
        try {
            if (sharedPreferences.getBoolean("allowTouchId", true) && from_dashboard) {
                thumbId!!.ThumbVerification("OnBoardingActivity")
            }
        } catch (e: Exception) {
        }
    }

    companion object {
        const val EXTRA_LOGGED_OUT = "logged_out"
        const val FROM_DASHBOARD = "from_dashboard"

        fun start(c: Context, fromDashboard: Boolean = false) {
            val i = Intent(c, OnBoardingActivity::class.java)
            if (fromDashboard) {
                i.putExtra(OnBoardingActivity.FROM_DASHBOARD, true)
            }
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            c.startActivity(i)
        }
    }
}

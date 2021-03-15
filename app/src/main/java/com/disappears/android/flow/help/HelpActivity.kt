package com.disappears.android.flow.help

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
import com.disappears.android.util.SharedPrefUtil
import kotlinx.android.synthetic.main.activity_onboarding.*
import org.koin.android.ext.android.inject

class HelpActivity : AppCompatActivity(), LifecycleObserver {
    private val from_dashboard by lazy {
        intent.getBooleanExtra(HelpActivity.FROM_DASHBOARD, false)
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
        val thumbid = ThumbId(this@HelpActivity)
        setContentView(R.layout.activity_help)
        setSupportActionBar(toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        sectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter
        indicator.setViewPager(viewPager)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_help, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                DashboardActivity.alreadyLogin = true
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    inner class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return HelpFragment.newInstance(resources.getStringArray(R.array.helpTitles)[position],
                    resources.getStringArray(R.array.helpSubtitles)[position])
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
        thumbId = ThumbId(this@HelpActivity)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
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
            val i = Intent(c, HelpActivity::class.java)
            if (fromDashboard) {
                i.putExtra(HelpActivity.FROM_DASHBOARD, true)
            }
            c.startActivity(i)
        }
    }
}

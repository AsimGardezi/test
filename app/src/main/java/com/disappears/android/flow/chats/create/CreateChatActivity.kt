package com.disappears.android.flow.chats.create

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.disappears.android.R
import com.disappears.android.base.ThumbId
import com.disappears.android.flow.contacts.pick.PickContactFragment
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.util.addFragment
import kotlinx.android.synthetic.main.activity_create_chat.*

class CreateChatActivity : AppCompatActivity(), LifecycleObserver {
    var thumbId: ThumbId? = null
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);

        setContentView(R.layout.activity_create_chat)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        addFragment(PickContactFragment.newInstance())
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                if (supportFragmentManager.backStackEntryCount > 0) {
                    supportFragmentManager.popBackStack()
                } else {
                    DashboardActivity.alreadyLogin = true
                    finish()
                }
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        thumbId = ThumbId(this@CreateChatActivity)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
        try {
            if (sharedPreferences.getBoolean("allowTouchId", true)) {
                thumbId!!.ThumbVerification("DashboardActivity")
            }
        } catch (e: Exception) {
        }
    }

    companion object {
        fun start(c: Context) {
            val i = Intent(c, CreateChatActivity::class.java)
            c.startActivity(i)
        }
    }
}

package com.disappears.android.flow.profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.flow.fingerprint.ThumbVerification
import com.disappears.android.util.addFragment
import kotlinx.android.synthetic.main.activity_setup_profile.*

class SetUpProfileActivity : AppCompatActivity() {
    private val firstTime by lazy {
        intent.getBooleanExtra(EXTRA_FIRST_TIME_ACCESS, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup_profile)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)

        if (firstTime) {
            supportActionBar?.setDisplayShowTitleEnabled(false)
            skip.visibility = View.VISIBLE
            SetUpProfileFragment.firstTime = true
        } else {
            SetUpProfileFragment.firstTime = false
        }
        addFragment(SetUpProfileFragment.newInstance())

        skip.setOnClickListener {
            ThumbVerification.start(this, true)
            finish()
        }
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

    companion object {
        const val EXTRA_FIRST_TIME_ACCESS = "first_time"

        fun start(context: Context, firstTimeAccess: Boolean = false) {
            val intent = Intent(context, SetUpProfileActivity::class.java)
            if (firstTimeAccess) {
                intent.putExtra(EXTRA_FIRST_TIME_ACCESS, true)
            }
            context.startActivity(intent)
        }
    }
}

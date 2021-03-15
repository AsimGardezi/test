package com.disappears.android.flow.fingerprint

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.base.ThumbId
import com.disappears.android.flow.identity_backup.IdentityBackup
import com.disappears.android.flow.profile.SetUpProfileActivity
import kotlinx.android.synthetic.main.activity_thumb_verification.*

class ThumbVerification : AppCompatActivity() {
    private val firstTime by lazy {
        intent.getBooleanExtra(ThumbVerification.EXTRA_FIRST_TIME_ACCESS, false)
    }

    lateinit var txtSkip: TextView
    lateinit var btnFingerPrint: Button
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thumb_verification)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val thumbid = ThumbId(this@ThumbVerification)
        sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
        txtSkip = findViewById(R.id.skip)
        txtSkip.setOnClickListener {
            editor.putBoolean("allowTouchId", false)
            editor.commit()
            if (firstTime) {
                callIdentityVerificationScreen()
            } else {
                finish()
            }
        }

        btnFingerPrint = findViewById(R.id.selectFingerPrintButton)
        btnFingerPrint.setOnClickListener { view: View? ->
            editor.putBoolean("allowTouchId", true)
            editor.commit()
            thumbid.ThumbVerification("")
            txtSkip.setText("NEXT")
            btnFingerPrint.isEnabled = false
            btnFingerPrint.setTextColor(resources.getColor(R.color.lightGreen))
            btnFingerPrint.text = resources.getText(R.string.enabled_touchid)
            btnFingerPrint.setBackgroundResource(R.drawable.button_white)
        }
    }

    private fun callIdentityVerificationScreen() {
        IdentityBackup.start(this, true)
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                SetUpProfileActivity.start(this, false)
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_FIRST_TIME_ACCESS = "first_time"

        fun start(context: Context, firstTimeAccess: Boolean = false) {
            val intent = Intent(context, ThumbVerification::class.java)
            if (firstTimeAccess) {
                intent.putExtra(EXTRA_FIRST_TIME_ACCESS, true)
            }
            context.startActivity(intent)
        }
    }
}


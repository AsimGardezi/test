package com.disappears.android.flow.identity_backup

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.api.VanishApi
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.util.SharedPrefUtil
import kotlinx.android.synthetic.main.activity_identity_backup.*
import org.koin.android.ext.android.inject
import java.io.File

class IdentityBackup : AppCompatActivity() {
    private val firstTime by lazy {
        intent.getBooleanExtra(IdentityBackup.EXTRA_FIRST_TIME_ACCESS, false)
    }

    val loginUtil: SharedPrefUtil by inject()
    val encryption: EncryptionService by inject()
    val api: VanishApi by inject()
    lateinit var enableBtn: Button
    lateinit var skipBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val builder: StrictMode.VmPolicy.Builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
        builder.detectFileUriExposure()
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_identity_backup)
        enableBtn = findViewById(R.id.enableIdentityBackup)
        skipBtn = findViewById(R.id.skip)
        skipBtn.setOnClickListener {
            if (firstTime) {
                moveToDashboard()
            } else {
                finish()
            }
        }
        if (firstTime) {
            skipBtn.visibility = View.VISIBLE
        } else {
            skipBtn.visibility = View.GONE
        }

        enableBtn.setOnClickListener {
            try {
                loginUtil.currentLoggedUser?.let {
                    val backup = encryption.exportIdentity(it)
                    //store to external directory
                    val path: String = getExternalCacheDir().toString()
                    val file = File(path, "$it-data.vanish")
                    file.writeText(backup)
                    val fileUri: Uri = Uri.fromFile(file)

                    startActivity(Intent(Intent.ACTION_SEND).apply {
                        setType("message/rfc822")
                        putExtra(Intent.EXTRA_SUBJECT, "Vanish Messenger Account Data")
                        putExtra(Intent.EXTRA_TEXT, "Please store this key safely.")
                        putExtra(Intent.EXTRA_STREAM, fileUri)
                        enableBtn.setBackgroundResource(R.drawable.button_white)
                        enableBtn.setTextColor(resources.getColor(R.color.lightGreen))
                        enableBtn.text = resources.getText(R.string.identity_backup_done)
                        enableBtn.isEnabled = false
                        skipBtn.setText("NEXT")
                    })
                } ?: run {
                    Toast.makeText(this, "Unable to export backup keys", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Unable to export backup keys - $e", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (firstTime) {
            moveToDashboard()
        } else {
            finish()
        }
    }

    private fun moveToDashboard() {
        val i = Intent(this, DashboardActivity::class.java)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(i)
        finish()
    }

    override fun onBackPressed() {
        DashboardActivity.alreadyLogin = true
        finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                if (!firstTime) {
                    DashboardActivity.alreadyLogin = true
                }
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        const val EXTRA_FIRST_TIME_ACCESS = "first_time"

        fun start(context: Context, firstTimeAccess: Boolean = false) {
            val intent = Intent(context, IdentityBackup::class.java)
            if (firstTimeAccess) {
                intent.putExtra(EXTRA_FIRST_TIME_ACCESS, true)
            }
            context.startActivity(intent)
        }
    }
}







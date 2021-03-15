package com.disappears.android.flow.signin

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Identity
import com.disappears.android.util.addFragment
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity() {
    lateinit var txtRestore: TextView
    val encryption: EncryptionService by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        txtRestore = findViewById(R.id.txtRestore)
        txtRestore.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.restore_title)
            builder.setMessage(R.string.restore_description)
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        addFragment(LoginFragment.newInstance())

        if (intent.getBooleanExtra(EXTRA_FROM_SIGN_UP, false)) {
            Snackbar.make(findViewById(android.R.id.content), R.string.signup_success, Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()
        try {
            val uri = intent?.getData()
            if (uri != null) {
                var iStream = contentResolver.openInputStream(uri)
                iStream?.readBytes()?.toString(Charsets.UTF_8).let {
                    //TODO() - Handle Encryption
                    val identity = Gson().fromJson(it, Identity::class.java)
                    encryption.createKeyStore(identity.username!!)
                    encryption.storeIdentity(identity)
                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, "The file is not a valid Vanish Identity backup", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        private val EXTRA_FROM_SIGN_UP = "from_sign_up"

        fun start(c: Context, fromSignUp: Boolean) {
            val i = Intent(c, LoginActivity::class.java)
            i.putExtra(EXTRA_FROM_SIGN_UP, fromSignUp)
            c.startActivity(i)
        }
    }
}

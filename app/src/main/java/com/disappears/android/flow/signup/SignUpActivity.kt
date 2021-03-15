package com.disappears.android.flow.signup

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.flow.signup.password.SignUpPasswordFragment
import com.disappears.android.flow.signup.password.SignUpPasswordFragment.Companion.TAG
import com.disappears.android.flow.signup.username.SignUpUsernameFragment
import com.disappears.android.util.addFragment
import com.disappears.android.util.replaceFragment
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity(), NavigationCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        if (savedInstanceState == null) {
            addFragment(SignUpUsernameFragment.newInstance())
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun navigateToSignUpPassword(username: String) {
        replaceFragment(SignUpPasswordFragment.newInstance(username), backStackTag = TAG)
    }

    companion object {
        fun start(context: Context): Intent = Intent(context, SignUpActivity::class.java).also { context.startActivity(it) }
    }
}

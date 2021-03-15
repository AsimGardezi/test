package com.disappears.android.flow.contacts.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import com.disappears.android.R
import com.disappears.android.model.Contact
import kotlinx.android.synthetic.main.activity_contact_details.*

class ContactDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val fragment = ContactDetailsFragment.newInstance(intent.getLongExtra(CONTACT_ID, 0))
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContent, fragment)
                .commit()
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

    companion object {
        private val CONTACT_ID = "contact_id"

        fun start(c: Context, contact: Contact) {
            val i = Intent(c, ContactDetailsActivity::class.java)
            i.putExtra(CONTACT_ID, contact.id)
            c.startActivity(i)
        }
    }
}

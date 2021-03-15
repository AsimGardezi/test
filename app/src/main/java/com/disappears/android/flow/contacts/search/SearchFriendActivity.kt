package com.disappears.android.flow.contacts.search

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ProcessLifecycleOwner
import com.disappears.android.R
import com.disappears.android.adapter.SearchFriendAdapter
import com.disappears.android.base.BaseActivity
import com.disappears.android.base.ThumbId
import com.disappears.android.dialog.BasicProgressDialog
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.model.response.Friend
import com.disappears.android.model.response.Profile
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_search_friend.*

class SearchFriendActivity : BaseActivity<SearchFriendsContract.Presenter>(SearchFriendsContract.Presenter::class),
        SearchFriendsContract.View, LifecycleObserver {
    override val layoutResourceId = R.layout.activity_search_friend
    var thumbId: ThumbId? = null
    lateinit var sharedPreferences: SharedPreferences
    private val adapter = SearchFriendAdapter()
    private var searchMenu: MenuItem? = null
    private var searchView: SearchView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        presenter.addObservers()
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        contacts?.adapter = adapter
        adapter.onAddClickListener = {
            if (Friend.Flag.INVITED.value == it.flags) {
                presenter.cancelInvite(it)
            } else {
                presenter.addFriend(it)
            }
        }
    }

    override fun friendDeleted(profile: Profile) {
        val index = adapter.dataSource.indexOf(profile)
        profile.flags = Friend.Flag.DELETED.value
        adapter.notifyItemChanged(index)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_seach_friend, menu)
        setupSearchBar(menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setupSearchBar(menu: Menu) {
        val manager = getSystemService(Context.SEARCH_SERVICE) as? SearchManager
        searchMenu = menu.findItem(R.id.search)
        searchView = searchMenu?.actionView as? SearchView
        val componentName = componentName
        val searchableInfo = manager?.getSearchableInfo(componentName)
        searchView?.setSearchableInfo(searchableInfo)
        searchView?.queryHint = getString(R.string.search_friend_hint)
        searchView?.isSubmitButtonEnabled = true
        searchMenu?.expandActionView()
        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                presenter.submitQuery(query)
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
    }

    override fun onBackPressed() {
        DashboardActivity.alreadyLogin = true
        finish()
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

    override fun displayProgress() {
        status?.visibility = View.GONE
        val f = BasicProgressDialog()
        supportFragmentManager.beginTransaction().add(f, "dialog").commitAllowingStateLoss()
    }

    override fun hideProgress() {
        supportFragmentManager.findFragmentByTag("dialog")?.let {
            supportFragmentManager.beginTransaction()
                    .remove(it).commitAllowingStateLoss()
        }
    }


    override fun displayError() {
        displayError(R.string.generic_network_error)
    }

    override fun displayError(s: String) {
        Snackbar.make(findViewById(android.R.id.content), s, Snackbar.LENGTH_SHORT).show()
    }

    override fun displayError(error: Int) {
        displayError(getString(error))
    }

    override fun navigateToDashboard() {}

    override fun renderSearchResult(friends: List<Profile>) {
        status?.visibility = View.GONE
        adapter.dataSource = friends
    }

    override fun showEmptyState() {
        status?.visibility = View.VISIBLE
    }

    override fun friendAdded(profile: Profile) {
        val index = adapter.dataSource.indexOf(profile)
        profile.flags = Friend.Flag.INVITED.value
        adapter.notifyItemChanged(index)
        Snackbar.make(
                findViewById(android.R.id.content),
                getString(R.string.friend_invited, profile.username),
                Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        sharedPreferences = this.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        thumbId = ThumbId(this@SearchFriendActivity)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onAppForegrounded() {
        try {
            if (sharedPreferences.getBoolean("allowTouchId", true)) {
                thumbId!!.ThumbVerification("SearchFriendActivity")
            }
        } catch (e: Exception) {
        }
    }

    companion object {
        fun start(context: Context) {
            Intent(context, SearchFriendActivity::class.java).let {
                context.startActivity(it)
            }
        }
    }
}

package com.disappears.android.flow.contacts.list

import android.Manifest
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.annotation.MainThread
import androidx.appcompat.widget.SearchView
import com.disappears.android.R
import com.disappears.android.adapter.ContactsAdapter
import com.disappears.android.base.BaseFragment
import com.disappears.android.flow.contacts.search.SearchFriendActivity
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.response.Friend
import com.disappears.android.util.SharedPrefUtil
import com.disappears.android.util.isProgressBarEnabled
import com.disappears.android.util.observe
import com.google.android.material.snackbar.Snackbar
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.fragment_contacts.*
import org.koin.android.architecture.ext.viewModel
import org.koin.android.ext.android.inject

class ContactsFragment : BaseFragment(), MenuItem.OnActionExpandListener {
    override val layoutResourceId = R.layout.fragment_contacts
    protected val prefUtil: SharedPrefUtil by inject()
    private var adapter: ContactsAdapter? = null
    private var searchMenu: MenuItem? = null
    private var searchView: SearchView? = null
    private lateinit var rxPermission: RxPermissions
    private var hasContactsPermission = false
    val model by viewModel<ContactsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ContactsAdapter(view.context,
                prefUtil,
                ArrayList(),
                false,
                object : ContactsAdapter.ContactsAdapterListener {
                    override fun acceptFriend(f: Friend) {
                        model.acceptFriend(f)
                    }

                    override fun rejectFriend(f: Friend) {
                        model.rejectFriend(f)
                    }

                    override fun cancelInvite(friend: Friend) {
                        model.cancelInvite(friend)
                    }
                })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rxPermission = RxPermissions(activity!!)
        contacts.adapter = adapter
        contacts.setHasFixedSize(true)
        contacts.setItemViewCacheSize(30)
        observe(model.contacts) {
            it?.let { handleContacts(it) }
        }
        observe(model.progressDisplayed) {
            it?.let { it1 -> handleProgress(it1) }
        }
        observe(model.error) {
            it?.let { it1 -> handleError(it1) }
        }

        disposable {
            rxPermission.request(Manifest.permission.READ_CONTACTS).subscribe({
                if (it) {
                    hasContactsPermission = true
                }
            }, {})
        }
    }

    override fun onResume() {
        super.onResume()
        activity?.invalidateOptionsMenu()

        if (hasContactsPermission) {
            model.loadContactsAndFriends(null)
            model.addObservers()
            adapter?.notifyDataSetChanged()
        } else {
            model.loadFriends(null)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_contacts, menu)
        setupSearchBar(menu)
    }

    private fun setupSearchBar(menu: Menu) {
        searchMenu = menu.findItem(R.id.search)
        searchMenu?.setOnActionExpandListener(this)
        searchView = searchMenu?.actionView as? SearchView
        searchView?.queryHint = getString(R.string.search_friend_hint)
        searchView?.isSubmitButtonEnabled = false
        searchMenu?.expandActionView()
        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                model.search(newText)
                return false
            }
        })

        if (!model.query.isNullOrEmpty()) {
            searchView?.isIconified = false
            searchView?.setQuery(model.query, false)
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_add_a_friend -> activity?.let { SearchFriendActivity.start(it) }
        }
        return super.onOptionsItemSelected(item)
    }

    @MainThread
    private fun handleContacts(contacts: List<ContactFeedItem>) {
        vEmptyState.visibility = if (contacts.isEmpty()) View.VISIBLE else View.GONE
        adapter?.update(contacts)
    }

    @MainThread
    private fun handleError(error: Exception) {
        val exception = error ?: return
        val nonNullView = view ?: return
        Snackbar.make(nonNullView, exception.localizedMessage, Snackbar.LENGTH_LONG).show()
    }

    @MainThread
    private fun handleProgress(isProgressDisplayed: Boolean) {
        isProgressBarEnabled(isProgressDisplayed)
    }

    override fun onMenuItemActionExpand(item: MenuItem): Boolean {
        return false
    }

    override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
        return true
    }

    companion object {
        fun newInstance() = ContactsFragment()
    }
}

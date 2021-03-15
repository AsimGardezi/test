package com.disappears.android.flow.contacts.search

import androidx.annotation.StringRes
import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView
import com.disappears.android.model.response.Profile

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
class SearchFriendsContract {
    interface Presenter : BasePresenter {
        fun addFriend(f: Profile)
        fun loadFriends(name: String)
        fun submitQuery(query: String)
        fun cancelInvite(profile: Profile)
        fun addObservers()
    }

    interface View : BaseView {
        fun displayProgress()
        fun hideProgress()
        fun displayError()
        fun navigateToDashboard()
        fun renderSearchResult(friends: List<Profile>)
        fun showEmptyState()
        fun friendAdded(profile: Profile)
        fun displayError(error: String)
        fun displayError(@StringRes error: Int)
        fun friendDeleted(profile: Profile)
    }
}
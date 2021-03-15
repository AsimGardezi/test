package com.disappears.android.flow.contacts.search

import android.text.TextUtils
import androidx.lifecycle.Observer
import com.disappears.android.R
import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.data.FriendDataSource
import com.disappears.android.model.response.Friend
import com.disappears.android.model.response.FriendResponse
import com.disappears.android.model.response.Profile
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.SharedPrefUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import retrofit2.Response

class SearchFriendPresenter constructor(
        private val api: VanishApi,
        private val friendData: FriendDataSource,
        private val loginUtil: SharedPrefUtil,
        private val messagesObserver: MessagesObserver
) : SimplePresenter<SearchFriendsContract.View>(), SearchFriendsContract.Presenter {
    private var lastSearchResult: Profile? = null

    private val isFriendsLoadedObserver = Observer<Boolean> {
        val friends = friendData.getAllWithoutPending(null)
        if (friends.map { it.name }.any { it == lastSearchResult?.username }) {
            view?.renderSearchResult(ArrayList())
            view?.showEmptyState()
        }
    }

    override fun addObservers() {
        messagesObserver.isFriendsLoaded.observeForever(isFriendsLoadedObserver)
    }

    override fun detachView() {
        messagesObserver.isFriendsLoaded.removeObserver(isFriendsLoadedObserver)
        super.detachView()
    }

    override fun submitQuery(query: String) {
        if (query == loginUtil.currentLoggedUser) {
            view?.displayError(R.string.search_for_myself)
            return
        }

        val cached = friendData.loadFriends()
        view?.displayProgress()
        disposable {
            api.userProfile(query)
                    .subscribeOn(io())
                    .observeOn(main())
                    .subscribe { response, throwable ->
                        response?.let {
                            lastSearchResult = null
                            view?.hideProgress()
                            if (response.isSuccessful) {
                                val friend = response.body()
                                friend?.username = query

                                if (TextUtils.isEmpty(friend?.name)) {
                                    friend?.name = query
                                }

                                friend?.let {
                                    if (contain(it, cached)) {
                                        view?.renderSearchResult(ArrayList())
                                        view?.showEmptyState()
                                    } else {
                                        lastSearchResult = friend
                                        view?.renderSearchResult(listOf(friend))
                                    }
                                }
                            } else {
                                view?.showEmptyState()
                            }
                        }
                        throwable?.let {
                            view?.hideProgress()
                            view?.displayError()
                            view?.showEmptyState()
                            it.printStackTrace()
                        }
                    }
        }
    }

    private fun contain(friend: Profile, cached: List<Friend>): Boolean {
        return cached.any { friend.name == it.name }
    }

    override fun addFriend(friend: Profile) {
        if (loginUtil.currentLoggedUser == friend.username) {
            view?.displayError(R.string.error_cannot_invite_yourself)
            return
        }

        view?.displayProgress()
        val name = friend.username ?: return

        disposable {
            api.inviteFriend(name)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeWith(object : DisposableObserver<Response<ResponseBody>>() {
                        override fun onNext(@NonNull response: Response<ResponseBody>) {
                            if (response.isSuccessful) {
                                view?.friendAdded(friend)
                                view?.hideProgress()
                            } else {
                                view?.hideProgress()
                                view?.displayError()
                            }
                        }

                        override fun onError(@NonNull e: Throwable) {
                            view?.hideProgress()
                            view?.displayError()
                            e.printStackTrace()
                        }

                        override fun onComplete() {
                            api.friends().compose(ioToMain())
                                    .subscribeWith(object : DisposableObserver<Response<FriendResponse>>() {
                                        override fun onNext(@NonNull response: Response<FriendResponse>) {
                                            if (response.isSuccessful) {
                                                response.body()?.friends?.let {
                                                    friendData.saveFriends(it)
                                                }
                                            }
                                        }

                                        override fun onError(@NonNull e: Throwable) {}

                                        override fun onComplete() {}
                                    })
                        }
                    })
        }
    }

    override fun cancelInvite(profile: Profile) {
        val friendName = profile.name
        if (friendName == null) {
            view?.displayError()
            return
        }

        disposable {
            api.deleteFriend(friendName)
                    .firstElement()
                    .doOnSubscribe { view?.displayProgress() }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doAfterTerminate { view?.hideProgress() }
                    .doOnSuccess { friendData.deleteFriend(friendName) }
                    .subscribe { view?.friendDeleted(profile) }
        }
    }

    override fun loadFriends(name: String) {
        val cached = friendData.loadFriends()
        if (cached.isNotEmpty()) {
        }

        disposable {
            api.friends().compose(ioToMain())
                    .subscribeWith(object : DisposableObserver<Response<FriendResponse>>() {
                        override fun onNext(@NonNull response: Response<FriendResponse>) {
                            view?.hideProgress()
                            if (response.isSuccessful) {
                                response.body()?.userControlId?.let { loginUtil.controlId = it }
                                response.body()?.friends?.let { friendData.saveFriends(it) }
                                submitQuery(name)
                            } else {
                                view?.displayError()
                            }
                        }

                        override fun onError(@NonNull e: Throwable) {
                            view?.hideProgress()
                            e.printStackTrace()
                        }

                        override fun onComplete() {}
                    })
        }
    }
}

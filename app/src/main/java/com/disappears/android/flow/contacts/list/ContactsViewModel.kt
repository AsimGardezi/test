package com.disappears.android.flow.contacts.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.base.BaseViewModel
import com.disappears.android.data.FriendDataSource
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.Message
import com.disappears.android.model.response.Friend
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.ContactUtil
import com.disappears.android.util.StringProvider
import com.disappears.android.util.isNotFoundCode
import com.disappears.android.util.rx.AddressBookSingle
import com.disappears.android.util.rx.FriendsSingle
import io.reactivex.functions.BiFunction

class ContactsViewModel constructor(
        private val api: VanishApi,
        private val contactDataSorce: ContactUtil,
        private val friendData: FriendDataSource,
        private val stringProvider: StringProvider,
        private val messagesObserver: MessagesObserver
) : BaseViewModel() {
    var query: String? = null
    val progressDisplayed = MutableLiveData<Boolean>()
    val contacts = MutableLiveData<List<ContactFeedItem>>()
    val error = MutableLiveData<Exception>()

    private val isMessagesLoadedObserver = Observer<Boolean> {
        loadContactsAndFriends(null)
    }

    private val isFriendsLoadedObserver = Observer<Boolean> {
        if (it == true) {
            loadContactsAndFriends(null)
        }
    }

    private val messageArrivedEventObserver = Observer<Message> {
        loadContactsAndFriends(null)
    }

    private val friendDisappearedEventObserver = Observer<String> {
        loadContactsAndFriends(null)
    }

    private val friendWasDeletedObserver = Observer<String> {
        loadContactsAndFriends(null)
    }

    fun addObservers() {
        messagesObserver.isMessagesLoaded.observeForever(isMessagesLoadedObserver)
        messagesObserver.isFriendsLoaded.observeForever(isFriendsLoadedObserver)
        messagesObserver.messageArrivedEvent.observeForever(messageArrivedEventObserver)
        messagesObserver.friendDisappearedEvent.observeForever(friendDisappearedEventObserver)
        messagesObserver.friendWasDeleted.observeForever(friendWasDeletedObserver)
    }

    override fun onCleared() {
        messagesObserver.isMessagesLoaded.removeObserver(isMessagesLoadedObserver)
        messagesObserver.isFriendsLoaded.removeObserver(isFriendsLoadedObserver)
        messagesObserver.messageArrivedEvent.removeObserver(messageArrivedEventObserver)
        messagesObserver.friendDisappearedEvent.removeObserver(friendDisappearedEventObserver)
        messagesObserver.friendWasDeleted.removeObserver(friendWasDeletedObserver)
        super.onCleared()
    }

    fun loadContactsAndFriends(query: String?) {
        val addressBookSingle = AddressBookSingle(query
                ?: this.query, contactDataSorce, stringProvider.getAddressBookContacts())
        val friendsSingle = FriendsSingle(query
                ?: this.query, stringProvider.getPendingContacts(), stringProvider.getVanishContacts())

        disposable {
            friendsSingle.zipWith(addressBookSingle,
                    BiFunction<List<ContactFeedItem>,
                            List<ContactFeedItem>,
                            List<ContactFeedItem>> { friends, addressBook ->
                        friends.toMutableList().apply { addAll(addressBook) }
                    }).subscribeOn(io()).doOnSuccess {
                contacts.postValue(it)
            }.subscribe()
        }
    }

    fun loadFriends(query: String?) {
        val friendsSingle = FriendsSingle(query
                ?: this.query, stringProvider.getPendingContacts(), stringProvider.getVanishContacts())

        disposable {
            friendsSingle
                    .subscribeOn(io())
                    .doOnSuccess {
                        contacts.postValue(it)
                    }
                    .subscribe()
        }
    }

    fun search(newText: String) {
        query = newText
        loadContactsAndFriends(newText)
    }

    fun acceptFriend(f: Friend) {
        handleFriendAction(f, Constants.InviteAction.ACCEPT)
    }

    private fun handleFriendAction(friend: Friend, accept: Constants.InviteAction) {
        if (accept == Constants.InviteAction.ACCEPT) {
            friend.flags = Friend.Flag.NEW_FRIEND.value
        }
        val friendName = friend.name
        if (friendName == null) {
            error.value = Exception("friendName = null")
            return
        }

        disposable {
            api.respondToInvite(friendName, accept.name.toLowerCase())
                    .doOnSubscribe { progressDisplayed.postValue(true) }
                    .subscribeOn(io())
                    .doAfterTerminate { progressDisplayed.postValue(false) }
                    .subscribe { response ->
                        when {
                            response.isSuccessful -> {
                                if (accept == Constants.InviteAction.ACCEPT) {
                                    friendData.saveFriend(friend)
                                } else {
                                    friendData.deleteFriend(friendName)

                                }
                                loadContactsAndFriends(null)
                            }
                            response.code().isNotFoundCode() -> {
                                friendData.deleteFriend(friendName)
                                loadContactsAndFriends(null)
                                error.postValue(Exception("${response.code()}"))
                            }
                            else -> {
                                error.postValue(Exception(response.errorBody()?.string()))
                            }
                        }
                    }
        }
    }

    fun rejectFriend(f: Friend) {
        handleFriendAction(f, Constants.InviteAction.IGNORE)
    }

    fun cancelInvite(friend: Friend) {
        val friendName = friend.name
        if (friendName == null) {
            error.value = Exception("friendName == null")
            return
        }

        disposable {
            api.deleteFriend(friendName)
                    .doOnSubscribe { progressDisplayed.postValue(true) }
                    .subscribeOn(io())
                    .doAfterTerminate { progressDisplayed.postValue(false) }
                    .subscribe {
                        friendData.deleteFriend(friendName)
                        loadContactsAndFriends(null)
                    }
        }
    }
}

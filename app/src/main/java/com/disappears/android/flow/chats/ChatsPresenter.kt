package com.disappears.android.flow.chats

import androidx.lifecycle.Observer
import com.disappears.android.base.SimplePresenter
import com.disappears.android.data.ChatDataSource
import com.disappears.android.data.FriendDataSource
import com.disappears.android.model.Chat
import com.disappears.android.model.Message
import com.disappears.android.model.response.Friend
import com.disappears.android.mvvm.MessagesObserver
import com.disappears.android.util.LastSeenFormatter
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class ChatsPresenter constructor(
        private val friendData: FriendDataSource,
        private val chatData: ChatDataSource,
        private val messageObserver: MessagesObserver,
        private val lastSeenFormatter: LastSeenFormatter
) : SimplePresenter<ChatsContract.View>(), ChatsContract.Presenter {
    private val messagesDeletedEventObserver = Observer<Message> {
        loadChats()
    }

    private val messageArrivedEventObserver = Observer<Message> {
        loadChats()
    }

    private val messageDeletedAllEventObserver = Observer<String> {
        loadChats()
    }

    private val chatsRefreshObserver = Observer<Unit> {
        loadChats()
    }

    override fun onResume() {
        loadChats()
        messageObserver.messageArrivedEvent.observeForever(messageArrivedEventObserver)
        messageObserver.messagesDeletedEvent.observeForever(messagesDeletedEventObserver)
        messageObserver.messagesDeletedAllEvent.observeForever(messageDeletedAllEventObserver)
        messageObserver.chatsRefreshEvent.observeForever(chatsRefreshObserver)
    }

    private fun loadChats() {
        disposable {
            Single.fromCallable(this::getChatList)
                    .subscribeOn(Schedulers.computation())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnError { Timber.e(it) }
                    .subscribe({ view?.render(it) }, { view?.render(emptyList()) })
        }
    }

    private fun getChatList() = friendData
            .loadFriends()
            .filter { it.name != null }
            .map(this::mapFriendToTriple)
            .sortedByDescending { it.second?.dateTime }
            .filter { it.second != null }
            .map(this::mapTripleToChat)

    private fun mapFriendToTriple(friend: Friend): Triple<Friend, Message?, Long> {
        val lastMessage = chatData.getLatestMessage(friend.name ?: "")
        val unreadCount = chatData.getUnreadCount(friend.name ?: "")
        return Triple(friend, lastMessage, unreadCount)
    }

    private fun mapTripleToChat(triple: Triple<Friend, Message?, Long>): Chat {
        val hasProfile = triple.first.profile != null

        val name = if (hasProfile && triple.first.profile?.name.isNullOrEmpty().not()) {
            triple.first.profile?.name
        } else {
            triple.first.name
        }

        val lastMessage = if (triple.second?.plainText() == true) triple.second?.data else "Picture"
        val lastMessageTimeStamp = lastSeenFormatter.lastSeen(triple.second?.dateTime ?: 0)
        val imageUrl = triple.first.profile?.imageUrl

        return Chat(triple.second?.id,
                triple.first,
                name,
                lastMessage,
                triple.third.toInt(),
                lastMessageTimeStamp,
                imageUrl)
    }

    override fun onDestroy() {
        messageObserver.messageArrivedEvent.removeObserver(messageArrivedEventObserver)
        messageObserver.messagesDeletedEvent.removeObserver(messagesDeletedEventObserver)
        messageObserver.messagesDeletedAllEvent.removeObserver(messageDeletedAllEventObserver)
        messageObserver.chatsRefreshEvent.removeObserver(chatsRefreshObserver)
    }
}

package com.disappears.android.flow.contacts.pick

import com.disappears.android.base.SimplePresenter
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.model.ContactFeedItem
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*
import kotlin.collections.ArrayList

class PickContactPresenter constructor(
        private val socketIO: SocketIOConnection
) : SimplePresenter<PickContactContract.View>(), PickContactContract.Presenter {
    private var userNamesOfmembersOfCall: MutableList<String>? = null

    override fun leaveChannel() {}

    override fun cancelInvite() {}

    override fun loadContacts() {
        disposable {
            Observable.fromCallable {
                val ds = FriendRealmDataSource()
                val disappearsContacts = ds.getAllWithoutPending(null)
                disappearsContacts
            }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ contacts ->
                        val items = ArrayList<ContactFeedItem>(contacts)
                        view?.renderResult(items)
                    }, {})
        }
    }

    override fun startAudioCall(contacts: MutableList<ContactFeedItem>) {
        val uuid = UUID.randomUUID()
        val channelId = uuid.toString().toUpperCase()
        val names = ArrayList(contacts.map { c -> c.name ?: "null" })
        socketIO.sendCallInitMessage(channelId, false, names)
        view?.goToCallScreen(channelId, names, false)
        userNamesOfmembersOfCall = ArrayList(names)
    }

    override fun startVideoCall(contacts: MutableList<ContactFeedItem>) {
        val uuid = UUID.randomUUID()
        val channelId = uuid.toString().toUpperCase()
        val names = ArrayList(contacts.map { c -> c.name ?: "null" })
        socketIO.sendCallInitMessage(channelId, true, names)
        view?.goToCallScreen(channelId, names, true)
        userNamesOfmembersOfCall = ArrayList(names)
    }
}
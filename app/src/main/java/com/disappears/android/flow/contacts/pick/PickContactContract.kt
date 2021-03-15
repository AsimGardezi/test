package com.disappears.android.flow.contacts.pick

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView
import com.disappears.android.model.ContactFeedItem

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
class PickContactContract {
    interface Presenter : BasePresenter {
        fun loadContacts()
        fun startAudioCall(contacts: MutableList<ContactFeedItem>)
        fun startVideoCall(contacts: MutableList<ContactFeedItem>)
        fun leaveChannel()
        fun cancelInvite()
    }

    interface View : BaseView {
        fun renderResult(items: ArrayList<ContactFeedItem>)
        fun goToCallScreen(channelId: String, callMembers: ArrayList<String>, video: Boolean)
        fun onInviteRefusedByUser(username: String?)
    }
}
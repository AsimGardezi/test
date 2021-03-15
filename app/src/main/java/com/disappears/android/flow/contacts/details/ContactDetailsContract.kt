package com.disappears.android.flow.contacts.details

import com.disappears.android.model.Contact
import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class ContactDetailsContract {
    interface Presenter : BasePresenter {
        fun loadContactDetails(contactId: Long)
    }

    interface View : BaseView {
        fun onDetailsLoaded(contact: Contact)
    }
}
package com.disappears.android.flow.contacts.details

import android.os.Bundle
import android.view.View
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.model.Contact
import com.disappears.android.util.loadImage
import kotlinx.android.synthetic.main.fragment_contact_details.*

class ContactDetailsFragment : BasePresenterFragment<ContactDetailsContract.Presenter>(ContactDetailsContract.Presenter::class), ContactDetailsContract.View {
    private var contactId: Long = 0
    override val layoutResourceId = R.layout.fragment_contact_details

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
        contactId = arguments?.getLong(ARG_CONTACT_ID) ?: 0
        presenter?.loadContactDetails(contactId)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        contactId = arguments?.getLong(ARG_CONTACT_ID) ?: 0
        presenter?.loadContactDetails(contactId)
    }

    override fun onDetailsLoaded(contact: Contact) {
        if (contact.photoPath.isNullOrEmpty().not()) {
            profilePicture.loadImage(contact.photoPath)
        }
    }

    companion object {
        private val ARG_CONTACT_ID = "contact_id"

        fun newInstance(contactId: Long): ContactDetailsFragment {
            val f = ContactDetailsFragment()
            val args = Bundle()
            args.putLong(ARG_CONTACT_ID, contactId)
            f.arguments = args
            return f
        }
    }
}

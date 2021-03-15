package com.disappears.android.util.rx

import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.HeaderItem
import com.disappears.android.util.ContactUtil
import io.reactivex.Single
import io.reactivex.SingleObserver
import java.util.*

/**
 * Created by ihor_kucherenko on 12/18/17.
 * https://github.com/KucherenkoIhor
 */
class AddressBookSingle(
        private val query: String?,
        private val contactDataSource: ContactUtil,
        private val title: String) : Single<List<ContactFeedItem>>() {
    override fun subscribeActual(observer: SingleObserver<in List<ContactFeedItem>>) {
        val result = ArrayList<ContactFeedItem>()
        try {
            val contacts = if (query.isNullOrEmpty().not()) {
                contactDataSource.getContactsByName(query!!)
            } else {
                contactDataSource.allContactsDetailedList
            }

            if (contacts.isNotEmpty()) {
                result.add(HeaderItem(title))
                result.addAll(contacts)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        observer.onSuccess(result)
    }
}
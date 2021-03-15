package com.disappears.android.util.rx

import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.model.HeaderItem
import io.reactivex.Single
import io.reactivex.SingleObserver
import timber.log.Timber
import java.util.*

/**
 * Created by ihor_kucherenko on 12/18/17.
 * https://github.com/KucherenkoIhor
 */
class FriendsSingle(
        private val query: String?,
        private val pendingContactsTitle: String,
        private val vanishContactsTitle: String
) : Single<List<ContactFeedItem>>() {
    override fun subscribeActual(observer: SingleObserver<in List<ContactFeedItem>>) {
        val ds = FriendRealmDataSource()
        val result = ArrayList<ContactFeedItem>()
        val pending = ds.getPendingFriends(query)
                .filter { it.isDeleted.not() || it.flags != 0 || it.flags != null }
        val rest = ds.getAllWithoutPending(query)
                .filter { it.isDeleted.not() || it.flags != 0 || it.flags != null }

        if (pending.isNotEmpty()) {
            result.add(HeaderItem(pendingContactsTitle))
            result.addAll(pending)
        }
        if (rest.isNotEmpty()) {
            result.add(HeaderItem(vanishContactsTitle))
            result.addAll(rest)
        }

        result.forEach {
            Timber.d("subscribeActual - " + it.name)
        }

        observer.onSuccess(result)
    }
}
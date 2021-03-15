package com.disappears.android.flow.contacts.details

import com.disappears.android.base.SimplePresenter
import com.disappears.android.util.ContactUtil
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class ContactDetailsPresenter constructor(
        val contactData: ContactUtil
) : SimplePresenter<ContactDetailsContract.View>(), ContactDetailsContract.Presenter {
    private var disposable: Disposable? = null

    override fun loadContactDetails(contactId: Long) {
        disposable = Observable.fromCallable { contactData.getContact(contactData.buildContactUri(contactId)) }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe { contact -> contact?.let { view?.onDetailsLoaded(it) } }
    }

    override fun detachView() {
        if (disposable?.isDisposed?.not() == true) {
            disposable?.dispose()
        }
        super.detachView()
    }
}
package com.disappears.android.flow.contacts.details;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/disappears/android/flow/contacts/details/ContactDetailsPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/contacts/details/ContactDetailsContract$View;", "Lcom/disappears/android/flow/contacts/details/ContactDetailsContract$Presenter;", "contactData", "Lcom/disappears/android/util/ContactUtil;", "(Lcom/disappears/android/util/ContactUtil;)V", "getContactData", "()Lcom/disappears/android/util/ContactUtil;", "disposable", "Lio/reactivex/disposables/Disposable;", "detachView", "", "loadContactDetails", "contactId", "", "app_debug"})
public final class ContactDetailsPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.contacts.details.ContactDetailsContract.View> implements com.disappears.android.flow.contacts.details.ContactDetailsContract.Presenter {
    private io.reactivex.disposables.Disposable disposable;
    @org.jetbrains.annotations.NotNull()
    private final com.disappears.android.util.ContactUtil contactData = null;
    
    @java.lang.Override()
    public void loadContactDetails(long contactId) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.ContactUtil getContactData() {
        return null;
    }
    
    public ContactDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ContactUtil contactData) {
        super();
    }
}
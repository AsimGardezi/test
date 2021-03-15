package com.disappears.android.flow.contacts.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/disappears/android/flow/contacts/details/ContactDetailsFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/contacts/details/ContactDetailsContract$Presenter;", "Lcom/disappears/android/flow/contacts/details/ContactDetailsContract$View;", "()V", "contactId", "", "layoutResourceId", "", "getLayoutResourceId", "()I", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onDetailsLoaded", "contact", "Lcom/disappears/android/model/Contact;", "onViewCreated", "view", "Landroid/view/View;", "Companion", "app_debug"})
public final class ContactDetailsFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.contacts.details.ContactDetailsContract.Presenter> implements com.disappears.android.flow.contacts.details.ContactDetailsContract.View {
    private long contactId = 0L;
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_contact_details;
    private static final java.lang.String ARG_CONTACT_ID = "contact_id";
    public static final com.disappears.android.flow.contacts.details.ContactDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDetailsLoaded(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Contact contact) {
    }
    
    public ContactDetailsFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/disappears/android/flow/contacts/details/ContactDetailsFragment$Companion;", "", "()V", "ARG_CONTACT_ID", "", "newInstance", "Lcom/disappears/android/flow/contacts/details/ContactDetailsFragment;", "contactId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.contacts.details.ContactDetailsFragment newInstance(long contactId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
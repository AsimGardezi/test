package com.disappears.android.flow.contacts.pick;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/contacts/pick/PickContactContract$View;", "Lcom/disappears/android/flow/contacts/pick/PickContactContract$Presenter;", "socketIO", "Lcom/disappears/android/chat/SocketIOConnection;", "(Lcom/disappears/android/chat/SocketIOConnection;)V", "userNamesOfmembersOfCall", "", "", "cancelInvite", "", "leaveChannel", "loadContacts", "startAudioCall", "contacts", "Lcom/disappears/android/model/ContactFeedItem;", "startVideoCall", "app_debug"})
public final class PickContactPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.contacts.pick.PickContactContract.View> implements com.disappears.android.flow.contacts.pick.PickContactContract.Presenter {
    private java.util.List<java.lang.String> userNamesOfmembersOfCall;
    private final com.disappears.android.chat.SocketIOConnection socketIO = null;
    
    @java.lang.Override()
    public void leaveChannel() {
    }
    
    @java.lang.Override()
    public void cancelInvite() {
    }
    
    @java.lang.Override()
    public void loadContacts() {
    }
    
    @java.lang.Override()
    public void startAudioCall(@org.jetbrains.annotations.NotNull()
    java.util.List<com.disappears.android.model.ContactFeedItem> contacts) {
    }
    
    @java.lang.Override()
    public void startVideoCall(@org.jetbrains.annotations.NotNull()
    java.util.List<com.disappears.android.model.ContactFeedItem> contacts) {
    }
    
    public PickContactPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.chat.SocketIOConnection socketIO) {
        super();
    }
}
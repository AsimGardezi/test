package com.disappears.android.flow.contacts.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020(J\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020*J\u0018\u0010.\u001a\u00020(2\u0006\u0010-\u001a\u00020*2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010\u0019J\u0010\u00102\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010\u0019J\b\u00103\u001a\u00020(H\u0014J\u000e\u00104\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/disappears/android/flow/contacts/list/ContactsViewModel;", "Lcom/disappears/android/base/BaseViewModel;", "api", "Lcom/disappears/android/api/VanishApi;", "contactDataSorce", "Lcom/disappears/android/util/ContactUtil;", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "stringProvider", "Lcom/disappears/android/util/StringProvider;", "messagesObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "(Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/util/ContactUtil;Lcom/disappears/android/data/FriendDataSource;Lcom/disappears/android/util/StringProvider;Lcom/disappears/android/mvvm/MessagesObserver;)V", "contacts", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/disappears/android/model/ContactFeedItem;", "getContacts", "()Landroidx/lifecycle/MutableLiveData;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "friendDisappearedEventObserver", "Landroidx/lifecycle/Observer;", "", "friendWasDeletedObserver", "isFriendsLoadedObserver", "", "isMessagesLoadedObserver", "messageArrivedEventObserver", "Lcom/disappears/android/model/Message;", "progressDisplayed", "getProgressDisplayed", "query", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "acceptFriend", "", "f", "Lcom/disappears/android/model/response/Friend;", "addObservers", "cancelInvite", "friend", "handleFriendAction", "accept", "Lcom/disappears/android/api/Constants$InviteAction;", "loadContactsAndFriends", "loadFriends", "onCleared", "rejectFriend", "search", "newText", "app_debug"})
public final class ContactsViewModel extends com.disappears.android.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String query;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressDisplayed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.disappears.android.model.ContactFeedItem>> contacts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> error = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> isMessagesLoadedObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> isFriendsLoadedObserver = null;
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> messageArrivedEventObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> friendDisappearedEventObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> friendWasDeletedObserver = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.util.ContactUtil contactDataSorce = null;
    private final com.disappears.android.data.FriendDataSource friendData = null;
    private final com.disappears.android.util.StringProvider stringProvider = null;
    private final com.disappears.android.mvvm.MessagesObserver messagesObserver = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressDisplayed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.disappears.android.model.ContactFeedItem>> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> getError() {
        return null;
    }
    
    public final void addObservers() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void loadContactsAndFriends(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void loadFriends(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void search(@org.jetbrains.annotations.NotNull()
    java.lang.String newText) {
    }
    
    public final void acceptFriend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Friend f) {
    }
    
    private final void handleFriendAction(com.disappears.android.model.response.Friend friend, com.disappears.android.api.Constants.InviteAction accept) {
    }
    
    public final void rejectFriend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Friend f) {
    }
    
    public final void cancelInvite(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Friend friend) {
    }
    
    public ContactsViewModel(@org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ContactUtil contactDataSorce, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.FriendDataSource friendData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.StringProvider stringProvider, @org.jetbrains.annotations.NotNull()
    com.disappears.android.mvvm.MessagesObserver messagesObserver) {
        super();
    }
}
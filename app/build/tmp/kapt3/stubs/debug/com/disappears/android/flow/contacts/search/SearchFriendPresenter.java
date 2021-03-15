package com.disappears.android.flow.contacts.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$View;", "Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$Presenter;", "api", "Lcom/disappears/android/api/VanishApi;", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "messagesObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "(Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/data/FriendDataSource;Lcom/disappears/android/util/SharedPrefUtil;Lcom/disappears/android/mvvm/MessagesObserver;)V", "isFriendsLoadedObserver", "Landroidx/lifecycle/Observer;", "", "lastSearchResult", "Lcom/disappears/android/model/response/Profile;", "addFriend", "", "friend", "addObservers", "cancelInvite", "profile", "contain", "cached", "", "Lcom/disappears/android/model/response/Friend;", "detachView", "loadFriends", "name", "", "submitQuery", "query", "app_debug"})
public final class SearchFriendPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.contacts.search.SearchFriendsContract.View> implements com.disappears.android.flow.contacts.search.SearchFriendsContract.Presenter {
    private com.disappears.android.model.response.Profile lastSearchResult;
    private final androidx.lifecycle.Observer<java.lang.Boolean> isFriendsLoadedObserver = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.data.FriendDataSource friendData = null;
    private final com.disappears.android.util.SharedPrefUtil loginUtil = null;
    private final com.disappears.android.mvvm.MessagesObserver messagesObserver = null;
    
    @java.lang.Override()
    public void addObservers() {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void submitQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final boolean contain(com.disappears.android.model.response.Profile friend, java.util.List<? extends com.disappears.android.model.response.Friend> cached) {
        return false;
    }
    
    @java.lang.Override()
    public void addFriend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Profile friend) {
    }
    
    @java.lang.Override()
    public void cancelInvite(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Profile profile) {
    }
    
    @java.lang.Override()
    public void loadFriends(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public SearchFriendPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.FriendDataSource friendData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil loginUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.mvvm.MessagesObserver messagesObserver) {
        super();
    }
}
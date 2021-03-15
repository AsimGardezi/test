package com.disappears.android.flow.contacts.search;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendsContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class SearchFriendsContract {
    
    public SearchFriendsContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&\u00a8\u0006\u000e"}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "addFriend", "", "f", "Lcom/disappears/android/model/response/Profile;", "addObservers", "cancelInvite", "profile", "loadFriends", "name", "", "submitQuery", "query", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        public abstract void addFriend(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Profile f);
        
        public abstract void loadFriends(@org.jetbrains.annotations.NotNull()
        java.lang.String name);
        
        public abstract void submitQuery(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        public abstract void cancelInvite(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Profile profile);
        
        public abstract void addObservers();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.contacts.search.SearchFriendsContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.contacts.search.SearchFriendsContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.contacts.search.SearchFriendsContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$View;", "Lcom/disappears/android/base/BaseView;", "displayError", "", "error", "", "", "displayProgress", "friendAdded", "profile", "Lcom/disappears/android/model/response/Profile;", "friendDeleted", "hideProgress", "navigateToDashboard", "renderSearchResult", "friends", "", "showEmptyState", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void displayProgress();
        
        public abstract void hideProgress();
        
        public abstract void displayError();
        
        public abstract void navigateToDashboard();
        
        public abstract void renderSearchResult(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.disappears.android.model.response.Profile> friends);
        
        public abstract void showEmptyState();
        
        public abstract void friendAdded(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Profile profile);
        
        public abstract void displayError(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
        
        public abstract void displayError(@androidx.annotation.StringRes()
        int error);
        
        public abstract void friendDeleted(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Profile profile);
    }
}
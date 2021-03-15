package com.disappears.android.flow.contacts.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u001dH\u0007J\b\u0010)\u001a\u00020\u001dH\u0016J\u0012\u0010*\u001a\u00020\u001d2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\u001dH\u0014J\u0016\u00104\u001a\u00020\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u00020$06H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0002J\b\u00108\u001a\u00020\u001dH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006:"}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendActivity;", "Lcom/disappears/android/base/BaseActivity;", "Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$Presenter;", "Lcom/disappears/android/flow/contacts/search/SearchFriendsContract$View;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "adapter", "Lcom/disappears/android/adapter/SearchFriendAdapter;", "layoutResourceId", "", "getLayoutResourceId", "()I", "searchMenu", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thumbId", "Lcom/disappears/android/base/ThumbId;", "getThumbId", "()Lcom/disappears/android/base/ThumbId;", "setThumbId", "(Lcom/disappears/android/base/ThumbId;)V", "displayError", "", "error", "s", "", "displayProgress", "friendAdded", "profile", "Lcom/disappears/android/model/response/Profile;", "friendDeleted", "hideProgress", "navigateToDashboard", "onAppForegrounded", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "onStart", "renderSearchResult", "friends", "", "setupSearchBar", "showEmptyState", "Companion", "app_debug"})
public final class SearchFriendActivity extends com.disappears.android.base.BaseActivity<com.disappears.android.flow.contacts.search.SearchFriendsContract.Presenter> implements com.disappears.android.flow.contacts.search.SearchFriendsContract.View, androidx.lifecycle.LifecycleObserver {
    private final int layoutResourceId = com.disappears.android.R.layout.activity_search_friend;
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.base.ThumbId thumbId;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    private final com.disappears.android.adapter.SearchFriendAdapter adapter = null;
    private android.view.MenuItem searchMenu;
    private androidx.appcompat.widget.SearchView searchView;
    public static final com.disappears.android.flow.contacts.search.SearchFriendActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.base.ThumbId getThumbId() {
        return null;
    }
    
    public final void setThumbId(@org.jetbrains.annotations.Nullable()
    com.disappears.android.base.ThumbId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void friendDeleted(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Profile profile) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void setupSearchBar(android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void displayProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void displayError() {
    }
    
    @java.lang.Override()
    public void displayError(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void displayError(int error) {
    }
    
    @java.lang.Override()
    public void navigateToDashboard() {
    }
    
    @java.lang.Override()
    public void renderSearchResult(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.response.Profile> friends) {
    }
    
    @java.lang.Override()
    public void showEmptyState() {
    }
    
    @java.lang.Override()
    public void friendAdded(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Profile profile) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onAppForegrounded() {
    }
    
    public SearchFriendActivity() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/disappears/android/flow/contacts/search/SearchFriendActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}
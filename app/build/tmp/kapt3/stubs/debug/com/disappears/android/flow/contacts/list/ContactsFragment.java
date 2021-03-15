package com.disappears.android.flow.contacts.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0003J\u0014\u0010\"\u001a\u00020\u001e2\n\u0010#\u001a\u00060$j\u0002`%H\u0003J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u0007H\u0003J\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001aH\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001aH\u0016J\u0010\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001aH\u0016J\b\u00104\u001a\u00020\u001eH\u0016J\u001a\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u0002072\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u00108\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/disappears/android/flow/contacts/list/ContactsFragment;", "Lcom/disappears/android/base/BaseFragment;", "Landroid/view/MenuItem$OnActionExpandListener;", "()V", "adapter", "Lcom/disappears/android/adapter/ContactsAdapter;", "hasContactsPermission", "", "layoutResourceId", "", "getLayoutResourceId", "()I", "model", "Lcom/disappears/android/flow/contacts/list/ContactsViewModel;", "getModel", "()Lcom/disappears/android/flow/contacts/list/ContactsViewModel;", "model$delegate", "Lkotlin/Lazy;", "prefUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "getPrefUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "prefUtil$delegate", "rxPermission", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "searchMenu", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "handleContacts", "", "contacts", "", "Lcom/disappears/android/model/ContactFeedItem;", "handleError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleProgress", "isProgressDisplayed", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onMenuItemActionCollapse", "item", "onMenuItemActionExpand", "onOptionsItemSelected", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setupSearchBar", "Companion", "app_debug"})
public final class ContactsFragment extends com.disappears.android.base.BaseFragment implements android.view.MenuItem.OnActionExpandListener {
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_contacts;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy prefUtil$delegate = null;
    private com.disappears.android.adapter.ContactsAdapter adapter;
    private android.view.MenuItem searchMenu;
    private androidx.appcompat.widget.SearchView searchView;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermission;
    private boolean hasContactsPermission = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy model$delegate = null;
    public static final com.disappears.android.flow.contacts.list.ContactsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.disappears.android.util.SharedPrefUtil getPrefUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.contacts.list.ContactsViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void setupSearchBar(android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @androidx.annotation.MainThread()
    private final void handleContacts(java.util.List<? extends com.disappears.android.model.ContactFeedItem> contacts) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleError(java.lang.Exception error) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProgress(boolean isProgressDisplayed) {
    }
    
    @java.lang.Override()
    public boolean onMenuItemActionExpand(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onMenuItemActionCollapse(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public ContactsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/contacts/list/ContactsFragment$Companion;", "", "()V", "newInstance", "Lcom/disappears/android/flow/contacts/list/ContactsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.contacts.list.ContactsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
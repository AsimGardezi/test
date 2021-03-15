package com.disappears.android.flow.contacts.pick;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0004J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001e0 j\b\u0012\u0004\u0012\u00020\u001e`!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0002J\u0012\u0010\'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\"\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010.\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0016J-\u00106\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\n2\u000e\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e082\u0006\u00109\u001a\u00020:H\u0016\u00a2\u0006\u0002\u0010;J \u0010<\u001a\u00020\u001c2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020>0 j\b\u0012\u0004\u0012\u00020>`!H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\u00020\u000e8DX\u0084\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006@"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/contacts/pick/PickContactContract$Presenter;", "Lcom/disappears/android/flow/contacts/pick/PickContactContract$View;", "()V", "adapter", "Lcom/disappears/android/adapter/ContactsAdapter;", "chatIntent", "Landroid/content/Intent;", "layoutResourceId", "", "getLayoutResourceId", "()I", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "loginUtil$annotations", "getLoginUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "loginUtil$delegate", "Lkotlin/Lazy;", "menu", "Landroid/view/Menu;", "socketIO", "Lcom/disappears/android/chat/SocketIOConnection;", "getSocketIO", "()Lcom/disappears/android/chat/SocketIOConnection;", "socketIO$delegate", "goToCallScreen", "", "channelId", "", "callMembers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "video", "", "handleCallClick", "view", "Landroid/view/View;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onInviteRefusedByUser", "username", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "renderResult", "items", "Lcom/disappears/android/model/ContactFeedItem;", "Companion", "app_debug"})
public final class PickContactFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.contacts.pick.PickContactContract.Presenter> implements com.disappears.android.flow.contacts.pick.PickContactContract.View {
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_pick_contact;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginUtil$delegate = null;
    private final kotlin.Lazy socketIO$delegate = null;
    private com.disappears.android.adapter.ContactsAdapter adapter;
    private android.view.Menu menu;
    private android.content.Intent chatIntent;
    private static final int CALL_PERMISSIONS = 101;
    private static final int READ_CONTACTS_REQUEST = 10;
    public static final com.disappears.android.flow.contacts.pick.PickContactFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @kotlin.Suppress(names = {"ProtectedInFinal"})
    @java.lang.Deprecated()
    protected static void loginUtil$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.disappears.android.util.SharedPrefUtil getLoginUtil() {
        return null;
    }
    
    private final com.disappears.android.chat.SocketIOConnection getSocketIO() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleCallClick(android.view.View view) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onInviteRefusedByUser(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void renderResult(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.disappears.android.model.ContactFeedItem> items) {
    }
    
    @java.lang.Override()
    public void goToCallScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> callMembers, boolean video) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public PickContactFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactFragment$Companion;", "", "()V", "CALL_PERMISSIONS", "", "READ_CONTACTS_REQUEST", "newInstance", "Lcom/disappears/android/flow/contacts/pick/PickContactFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.contacts.pick.PickContactFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
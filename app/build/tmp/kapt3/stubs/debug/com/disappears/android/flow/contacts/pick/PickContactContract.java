package com.disappears.android.flow.contacts.pick;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class PickContactContract {
    
    public PickContactContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "cancelInvite", "", "leaveChannel", "loadContacts", "startAudioCall", "contacts", "", "Lcom/disappears/android/model/ContactFeedItem;", "startVideoCall", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        public abstract void loadContacts();
        
        public abstract void startAudioCall(@org.jetbrains.annotations.NotNull()
        java.util.List<com.disappears.android.model.ContactFeedItem> contacts);
        
        public abstract void startVideoCall(@org.jetbrains.annotations.NotNull()
        java.util.List<com.disappears.android.model.ContactFeedItem> contacts);
        
        public abstract void leaveChannel();
        
        public abstract void cancelInvite();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.contacts.pick.PickContactContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.contacts.pick.PickContactContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.contacts.pick.PickContactContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H&J \u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00020\u000f`\bH&\u00a8\u0006\u0010"}, d2 = {"Lcom/disappears/android/flow/contacts/pick/PickContactContract$View;", "Lcom/disappears/android/base/BaseView;", "goToCallScreen", "", "channelId", "", "callMembers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "video", "", "onInviteRefusedByUser", "username", "renderResult", "items", "Lcom/disappears/android/model/ContactFeedItem;", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void renderResult(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.disappears.android.model.ContactFeedItem> items);
        
        public abstract void goToCallScreen(@org.jetbrains.annotations.NotNull()
        java.lang.String channelId, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> callMembers, boolean video);
        
        public abstract void onInviteRefusedByUser(@org.jetbrains.annotations.Nullable()
        java.lang.String username);
    }
}
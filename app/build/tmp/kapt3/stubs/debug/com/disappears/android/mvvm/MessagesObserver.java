package com.disappears.android.mvvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/disappears/android/mvvm/MessagesObserver;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "chatsRefreshEvent", "Landroidx/lifecycle/MutableLiveData;", "", "friendDisappearedEvent", "", "friendWasDeleted", "isFriendsLoaded", "", "isMessagesLoaded", "messageArrivedEvent", "Lcom/disappears/android/util/livedata/NullableLiveData;", "Lcom/disappears/android/model/Message;", "messagesDeletedAllEvent", "messagesDeletedEvent", "messagingServiceStopped", "tempMessageDeleted", "onCreate", "onDestroy", "app_debug"})
public final class MessagesObserver implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMessagesLoaded = null;
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFriendsLoaded = null;
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> chatsRefreshEvent = null;
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.livedata.NullableLiveData<com.disappears.android.model.Message> messageArrivedEvent = null;
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> friendDisappearedEvent = null;
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.livedata.NullableLiveData<com.disappears.android.model.Message> messagesDeletedEvent = null;
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.livedata.NullableLiveData<com.disappears.android.model.Message> tempMessageDeleted = null;
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.livedata.NullableLiveData<java.lang.String> messagesDeletedAllEvent = null;
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> friendWasDeleted = null;
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.livedata.NullableLiveData<java.lang.Boolean> messagingServiceStopped = null;
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }
    
    public MessagesObserver() {
        super();
    }
}
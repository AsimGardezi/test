package com.disappears.android.flow.chats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J$\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J$\u0010\u001e\u001a\u00020\u00172\u001a\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002J\b\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/disappears/android/flow/chats/ChatsPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/chats/ChatsContract$View;", "Lcom/disappears/android/flow/chats/ChatsContract$Presenter;", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "chatData", "Lcom/disappears/android/data/ChatDataSource;", "messageObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "lastSeenFormatter", "Lcom/disappears/android/util/LastSeenFormatter;", "(Lcom/disappears/android/data/FriendDataSource;Lcom/disappears/android/data/ChatDataSource;Lcom/disappears/android/mvvm/MessagesObserver;Lcom/disappears/android/util/LastSeenFormatter;)V", "chatsRefreshObserver", "Landroidx/lifecycle/Observer;", "", "messageArrivedEventObserver", "Lcom/disappears/android/model/Message;", "messageDeletedAllEventObserver", "", "messagesDeletedEventObserver", "getChatList", "", "Lcom/disappears/android/model/Chat;", "loadChats", "mapFriendToTriple", "Lkotlin/Triple;", "Lcom/disappears/android/model/response/Friend;", "", "friend", "mapTripleToChat", "triple", "onDestroy", "onResume", "app_debug"})
public final class ChatsPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.chats.ChatsContract.View> implements com.disappears.android.flow.chats.ChatsContract.Presenter {
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> messagesDeletedEventObserver = null;
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> messageArrivedEventObserver = null;
    private final androidx.lifecycle.Observer<java.lang.String> messageDeletedAllEventObserver = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> chatsRefreshObserver = null;
    private final com.disappears.android.data.FriendDataSource friendData = null;
    private final com.disappears.android.data.ChatDataSource chatData = null;
    private final com.disappears.android.mvvm.MessagesObserver messageObserver = null;
    private final com.disappears.android.util.LastSeenFormatter lastSeenFormatter = null;
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void loadChats() {
    }
    
    private final java.util.List<com.disappears.android.model.Chat> getChatList() {
        return null;
    }
    
    private final kotlin.Triple<com.disappears.android.model.response.Friend, com.disappears.android.model.Message, java.lang.Long> mapFriendToTriple(com.disappears.android.model.response.Friend friend) {
        return null;
    }
    
    private final com.disappears.android.model.Chat mapTripleToChat(kotlin.Triple<? extends com.disappears.android.model.response.Friend, ? extends com.disappears.android.model.Message, java.lang.Long> triple) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public ChatsPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.data.FriendDataSource friendData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.ChatDataSource chatData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.mvvm.MessagesObserver messageObserver, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.LastSeenFormatter lastSeenFormatter) {
        super();
    }
}
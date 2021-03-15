package com.disappears.android.flow.chats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"#B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0002H\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsAdapter;", "Lcom/disappears/android/adapter/BaseAdapter;", "Lcom/disappears/android/model/Chat;", "Lcom/disappears/android/flow/chats/ChatsAdapter$ViewHolder;", "()V", "value", "", "dataSource", "getDataSource", "()Ljava/util/List;", "setDataSource", "(Ljava/util/List;)V", "onChatClickListener", "Lkotlin/Function1;", "", "getOnChatClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnChatClickListener", "(Lkotlin/jvm/functions/Function1;)V", "updateCallback", "Lcom/disappears/android/flow/chats/ChatsAdapter$UpdateCallback;", "getItemViewId", "", "instantiateViewHolder", "view", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "payloads", "", "", "onItemClick", "data", "UpdateCallback", "ViewHolder", "app_debug"})
public final class ChatsAdapter extends com.disappears.android.adapter.BaseAdapter<com.disappears.android.model.Chat, com.disappears.android.flow.chats.ChatsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.disappears.android.model.Chat, kotlin.Unit> onChatClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.disappears.android.model.Chat> dataSource;
    private final com.disappears.android.flow.chats.ChatsAdapter.UpdateCallback updateCallback = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.disappears.android.model.Chat, kotlin.Unit> getOnChatClickListener() {
        return null;
    }
    
    public final void setOnChatClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.disappears.android.model.Chat, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.Chat> getDataSource() {
        return null;
    }
    
    @java.lang.Override()
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    java.util.List<com.disappears.android.model.Chat> value) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Chat data) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.chats.ChatsAdapter.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.chats.ChatsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.disappears.android.flow.chats.ChatsAdapter.ViewHolder instantiateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
        return null;
    }
    
    public ChatsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsAdapter$UpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "(Lcom/disappears/android/flow/chats/ChatsAdapter;)V", "insertedPositionSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "onChanged", "", "position", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "app_debug"})
    public final class UpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
        private final io.reactivex.subjects.PublishSubject<java.lang.Integer> insertedPositionSubject = null;
        
        @java.lang.Override()
        public void onInserted(int position, int count) {
        }
        
        @java.lang.Override()
        public void onRemoved(int position, int count) {
        }
        
        @java.lang.Override()
        public void onMoved(int fromPosition, int toPosition) {
        }
        
        @java.lang.Override()
        public void onChanged(int position, int count, @org.jetbrains.annotations.Nullable()
        java.lang.Object payload) {
        }
        
        public UpdateCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "value", "Lcom/disappears/android/model/Chat;", "chat", "getChat", "()Lcom/disappears/android/model/Chat;", "setChat", "(Lcom/disappears/android/model/Chat;)V", "getContainerView", "()Landroid/view/View;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.Nullable()
        private com.disappears.android.model.Chat chat;
        @org.jetbrains.annotations.Nullable()
        private final android.view.View containerView = null;
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.Nullable()
        public final com.disappears.android.model.Chat getChat() {
            return null;
        }
        
        public final void setChat(@org.jetbrains.annotations.Nullable()
        com.disappears.android.model.Chat value) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View containerView) {
            super(null);
        }
    }
}
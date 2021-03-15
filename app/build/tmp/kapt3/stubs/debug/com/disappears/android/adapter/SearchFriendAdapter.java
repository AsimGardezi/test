package com.disappears.android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/disappears/android/adapter/SearchFriendAdapter;", "Lcom/disappears/android/adapter/BaseAdapter;", "Lcom/disappears/android/model/response/Profile;", "Lcom/disappears/android/adapter/SearchFriendAdapter$ViewHolder;", "()V", "onAddClickListener", "Lkotlin/Function1;", "", "getOnAddClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnAddClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onAddItemClickListener", "Landroid/view/View$OnClickListener;", "getItemViewId", "", "instantiateViewHolder", "view", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "ViewHolder", "app_debug"})
public final class SearchFriendAdapter extends com.disappears.android.adapter.BaseAdapter<com.disappears.android.model.response.Profile, com.disappears.android.adapter.SearchFriendAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.disappears.android.model.response.Profile, kotlin.Unit> onAddClickListener;
    private final android.view.View.OnClickListener onAddItemClickListener = null;
    
    @java.lang.Override()
    public int getItemViewId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.disappears.android.adapter.SearchFriendAdapter.ViewHolder instantiateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.disappears.android.model.response.Profile, kotlin.Unit> getOnAddClickListener() {
        return null;
    }
    
    public final void setOnAddClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.disappears.android.model.response.Profile, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.disappears.android.adapter.SearchFriendAdapter.ViewHolder holder, int position) {
    }
    
    public SearchFriendAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/disappears/android/adapter/SearchFriendAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "value", "Lcom/disappears/android/model/response/Profile;", "profile", "getProfile", "()Lcom/disappears/android/model/response/Profile;", "setProfile", "(Lcom/disappears/android/model/response/Profile;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.Nullable()
        private com.disappears.android.model.response.Profile profile;
        @org.jetbrains.annotations.Nullable()
        private final android.view.View containerView = null;
        private java.util.HashMap _$_findViewCache;
        
        @org.jetbrains.annotations.Nullable()
        public final com.disappears.android.model.response.Profile getProfile() {
            return null;
        }
        
        public final void setProfile(@org.jetbrains.annotations.Nullable()
        com.disappears.android.model.response.Profile value) {
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
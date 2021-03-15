package com.disappears.android.adapter;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/29/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H&J\u0017\u0010\u001b\u001a\u00028\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001d\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0015\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010,R0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006-"}, d2 = {"Lcom/disappears/android/adapter/BaseAdapter;", "D", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "value", "", "dataSource", "getDataSource", "()Ljava/util/List;", "setDataSource", "(Ljava/util/List;)V", "onItemClickListener", "Landroid/view/View$OnClickListener;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "getItemViewId", "instantiateViewHolder", "view", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onAttachedToRecyclerView", "", "onBindViewHolder", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onDetachedFromRecyclerView", "onItemClick", "data", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseAdapter<D extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends D> dataSource;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private final android.view.View.OnClickListener onItemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<D> getDataSource() {
        return null;
    }
    
    public void setDataSource(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends D> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    private final void setRecyclerView(androidx.recyclerview.widget.RecyclerView value) {
    }
    
    public void onItemClick(D data) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public abstract int getItemViewId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract VH instantiateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.View view);
    
    public final D getItem(int position) {
        return null;
    }
    
    public BaseAdapter() {
        super();
    }
}
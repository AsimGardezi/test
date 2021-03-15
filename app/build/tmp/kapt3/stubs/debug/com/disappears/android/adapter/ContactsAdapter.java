package com.disappears.android.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005./012B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0016J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0011J\u0016\u0010,\u001a\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "prefUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "data", "", "Lcom/disappears/android/model/ContactFeedItem;", "canSelect", "", "contactsAdapterListener", "Lcom/disappears/android/adapter/ContactsAdapter$ContactsAdapterListener;", "(Landroid/content/Context;Lcom/disappears/android/util/SharedPrefUtil;Ljava/util/List;ZLcom/disappears/android/adapter/ContactsAdapter$ContactsAdapterListener;)V", "onSelectionToggle", "Lkotlin/Function1;", "", "", "getOnSelectionToggle", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionToggle", "(Lkotlin/jvm/functions/Function1;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "selectedItems", "Landroid/util/SparseBooleanArray;", "selectionOn", "updateCallback", "Lcom/disappears/android/adapter/ContactsAdapter$ContactListUpdateCallback;", "getItemCount", "getItemViewType", "position", "getSelectedItems", "onAttachedToRecyclerView", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDetachedFromRecyclerView", "toggleSelection", "pos", "update", "contacts", "Companion", "ContactListUpdateCallback", "ContactViewHolder", "ContactsAdapterListener", "HeaderViewHolder", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final android.util.SparseBooleanArray selectedItems = null;
    private boolean selectionOn = false;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSelectionToggle;
    private final com.disappears.android.adapter.ContactsAdapter.ContactListUpdateCallback updateCallback = null;
    private final android.content.Context context = null;
    private final com.disappears.android.util.SharedPrefUtil prefUtil = null;
    private java.util.List<? extends com.disappears.android.model.ContactFeedItem> data;
    private final boolean canSelect = false;
    private final com.disappears.android.adapter.ContactsAdapter.ContactsAdapterListener contactsAdapterListener = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_FRIEND = 1;
    private static final int VIEW_TYPE_CONTACT = 2;
    public static final com.disappears.android.adapter.ContactsAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnSelectionToggle() {
        return null;
    }
    
    public final void setOnSelectionToggle(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override()
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.ContactFeedItem> contacts) {
    }
    
    public final void toggleSelection(int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.disappears.android.model.ContactFeedItem> getSelectedItems() {
        return null;
    }
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil prefUtil, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.ContactFeedItem> data, boolean canSelect, @org.jetbrains.annotations.Nullable()
    com.disappears.android.adapter.ContactsAdapter.ContactsAdapterListener contactsAdapterListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter$ContactsAdapterListener;", "", "acceptFriend", "", "f", "Lcom/disappears/android/model/response/Friend;", "cancelInvite", "friend", "rejectFriend", "app_debug"})
    public static abstract interface ContactsAdapterListener {
        
        public abstract void acceptFriend(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Friend f);
        
        public abstract void rejectFriend(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Friend f);
        
        public abstract void cancelInvite(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.response.Friend friend);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter$ContactListUpdateCallback;", "Landroidx/recyclerview/widget/ListUpdateCallback;", "(Lcom/disappears/android/adapter/ContactsAdapter;)V", "insertedPositionSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "onChanged", "", "position", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "app_debug"})
    public final class ContactListUpdateCallback implements androidx.recyclerview.widget.ListUpdateCallback {
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
        
        public ContactListUpdateCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0010\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001fH\u0002J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020$J$\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020002J\u0016\u00103\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\u00a8\u00065"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/disappears/android/adapter/ContactsAdapter;Landroid/view/View;)V", "accept", "Landroid/widget/TextView;", "getAccept", "()Landroid/widget/TextView;", "setAccept", "(Landroid/widget/TextView;)V", "content", "getContent", "()Landroid/view/View;", "setContent", "(Landroid/view/View;)V", "imageView", "Lcom/makeramen/roundedimageview/RoundedImageView;", "getImageView", "()Lcom/makeramen/roundedimageview/RoundedImageView;", "setImageView", "(Lcom/makeramen/roundedimageview/RoundedImageView;)V", "model", "Lcom/disappears/android/model/ContactFeedItem;", "name", "getName", "setName", "pending", "getPending", "setPending", "pos", "", "reject", "getReject", "setReject", "acceptFriend", "", "cancelInvite", "handleSelection", "position", "itemClick", "itemLongClick", "", "rejectFriend", "sendSms", "context", "Landroid/content/Context;", "text", "", "numbers", "", "update", "c", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.view.View content;
        @org.jetbrains.annotations.NotNull()
        private com.makeramen.roundedimageview.RoundedImageView imageView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView name;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView reject;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView pending;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView accept;
        private com.disappears.android.model.ContactFeedItem model;
        private int pos = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getContent() {
            return null;
        }
        
        public final void setContent(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.makeramen.roundedimageview.RoundedImageView getImageView() {
            return null;
        }
        
        public final void setImageView(@org.jetbrains.annotations.NotNull()
        com.makeramen.roundedimageview.RoundedImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getReject() {
            return null;
        }
        
        public final void setReject(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPending() {
            return null;
        }
        
        public final void setPending(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAccept() {
            return null;
        }
        
        public final void setAccept(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public final void update(int position, @org.jetbrains.annotations.NotNull()
        com.disappears.android.model.ContactFeedItem c) {
        }
        
        private final void handleSelection(int position) {
        }
        
        public final void itemClick() {
        }
        
        public final void sendSms(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> numbers) {
        }
        
        public final boolean itemLongClick() {
            return false;
        }
        
        public final void acceptFriend() {
        }
        
        public final void rejectFriend() {
        }
        
        public final void cancelInvite() {
        }
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/disappears/android/adapter/ContactsAdapter;Landroid/view/View;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "update", "", "c", "Lcom/disappears/android/model/ContactFeedItem;", "app_debug"})
    public final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView title;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        com.disappears.android.model.ContactFeedItem c) {
        }
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/adapter/ContactsAdapter$Companion;", "", "()V", "VIEW_TYPE_CONTACT", "", "getVIEW_TYPE_CONTACT", "()I", "VIEW_TYPE_FRIEND", "getVIEW_TYPE_FRIEND", "VIEW_TYPE_HEADER", "getVIEW_TYPE_HEADER", "app_debug"})
    public static final class Companion {
        
        public final int getVIEW_TYPE_HEADER() {
            return 0;
        }
        
        public final int getVIEW_TYPE_FRIEND() {
            return 0;
        }
        
        public final int getVIEW_TYPE_CONTACT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}
package com.disappears.android.data.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J4\u0010\u0019\u001a\u00020\u0005\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u000bH\u0016J\u0016\u0010#\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0016J\u0018\u0010\'\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0016J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0016H\u0016J4\u0010+\u001a\u00020\u0005\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0 0\u001fH\u0016\u00a8\u0006,"}, d2 = {"Lcom/disappears/android/data/impl/FriendRealmDataSource;", "Lcom/disappears/android/data/impl/DataSource;", "Lcom/disappears/android/data/FriendDataSource;", "()V", "deleteData", "", "deleteFriend", "name", "", "getAllWithoutPending", "", "Lcom/disappears/android/model/response/Friend;", "searchQuery", "getFriendByName", "r", "Lio/realm/Realm;", "getFriendSetting", "Lcom/disappears/android/model/FriendSettings;", "getKeyData", "Lcom/disappears/android/model/response/PublicKeyData;", "getPendingFriends", "isMuted", "", "friendName", "loadFriends", "registerChangeListener", "T", "Lio/realm/RealmModel;", "clazz", "Ljava/lang/Class;", "changeListener", "Lio/realm/RealmChangeListener;", "Lio/realm/RealmResults;", "saveFriend", "f", "saveFriends", "friends", "setAvailableMessageControlId", "controlId", "setAvailableMessageId", "availableMessageId", "toggleMutedSetting", "muted", "unregisterChangeListener", "app_debug"})
public final class FriendRealmDataSource extends com.disappears.android.data.impl.DataSource implements com.disappears.android.data.FriendDataSource {
    
    @java.lang.Override()
    public void saveFriends(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.response.Friend> friends) {
    }
    
    @java.lang.Override()
    public void deleteFriend(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.response.Friend getFriendByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    private final com.disappears.android.model.response.Friend getFriendByName(io.realm.Realm r, java.lang.String name) {
        return null;
    }
    
    private final com.disappears.android.model.FriendSettings getFriendSetting(io.realm.Realm r, java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public void saveFriend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Friend f) {
    }
    
    @java.lang.Override()
    public void setAvailableMessageControlId(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    java.lang.String controlId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.disappears.android.model.response.Friend setAvailableMessageId(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    java.lang.String availableMessageId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isMuted(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.response.Friend> loadFriends() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.response.Friend> getPendingFriends(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
        return null;
    }
    
    @java.lang.Override()
    public <T extends io.realm.RealmModel>void registerChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    io.realm.RealmChangeListener<io.realm.RealmResults<T>> changeListener) {
    }
    
    @java.lang.Override()
    public <T extends io.realm.RealmModel>void unregisterChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    io.realm.RealmChangeListener<io.realm.RealmResults<T>> changeListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.response.Friend> getAllWithoutPending(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteData() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.response.PublicKeyData getKeyData(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public void toggleMutedSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, boolean muted) {
    }
    
    public FriendRealmDataSource() {
        super();
    }
}
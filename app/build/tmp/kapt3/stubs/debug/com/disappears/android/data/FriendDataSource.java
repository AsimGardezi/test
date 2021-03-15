package com.disappears.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J4\u0010\u0013\u001a\u00020\u0003\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00172\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001a0\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\tH&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H&J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0010H&J4\u0010%\u001a\u00020\u0003\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00172\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001a0\u0019H&\u00a8\u0006&"}, d2 = {"Lcom/disappears/android/data/FriendDataSource;", "", "deleteData", "", "deleteFriend", "name", "", "getAllWithoutPending", "", "Lcom/disappears/android/model/response/Friend;", "searchQuery", "getFriendByName", "getKeyData", "Lcom/disappears/android/model/response/PublicKeyData;", "getPendingFriends", "isMuted", "", "friendName", "loadFriends", "registerChangeListener", "T", "Lio/realm/RealmModel;", "clazz", "Ljava/lang/Class;", "changeListener", "Lio/realm/RealmChangeListener;", "Lio/realm/RealmResults;", "saveFriend", "f", "saveFriends", "friends", "setAvailableMessageControlId", "controlId", "setAvailableMessageId", "availableMessageId", "toggleMutedSetting", "muted", "unregisterChangeListener", "app_debug"})
public abstract interface FriendDataSource {
    
    public abstract void saveFriends(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.response.Friend> friends);
    
    public abstract void deleteFriend(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.response.Friend getFriendByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void saveFriend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.Friend f);
    
    public abstract void setAvailableMessageControlId(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    java.lang.String controlId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.disappears.android.model.response.Friend setAvailableMessageId(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    java.lang.String availableMessageId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.response.Friend> loadFriends();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.response.Friend> getPendingFriends(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.response.Friend> getAllWithoutPending(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery);
    
    public abstract void deleteData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.response.PublicKeyData getKeyData(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract boolean isMuted(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
    
    public abstract void toggleMutedSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, boolean muted);
    
    public abstract <T extends io.realm.RealmModel>void registerChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    io.realm.RealmChangeListener<io.realm.RealmResults<T>> changeListener);
    
    public abstract <T extends io.realm.RealmModel>void unregisterChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    io.realm.RealmChangeListener<io.realm.RealmResults<T>> changeListener);
}
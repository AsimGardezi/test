package com.disappears.android.data.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J#\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0016\u0010&\u001a\u00020\u00052\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0002\u00a8\u0006-"}, d2 = {"Lcom/disappears/android/data/impl/ChatRealmDataSource;", "Lcom/disappears/android/data/impl/DataSource;", "Lcom/disappears/android/data/ChatDataSource;", "()V", "addMessage", "", "messageToSend", "Lcom/disappears/android/model/Message;", "deleteData", "deleteMessage", "id", "", "friendName", "numericId", "", "deleteMessages", "deleteMessagesUpToId", "lastId", "usersInvolved", "", "(I[Ljava/lang/String;)V", "deletePlaceholderMessages", "iv", "deleteUserMessagesUpToIdFor", "from", "getLatestMessage", "username", "getMediaMessages", "", "getMessage", "getMessages", "getMessagesToResend", "getPlaceholderMessage", "getUnreadCount", "", "markAllAsRead", "saveMessage", "msg", "saveMessages", "messages", "updateExisting", "", "realm", "Lio/realm/Realm;", "message", "app_debug"})
public final class ChatRealmDataSource extends com.disappears.android.data.impl.DataSource implements com.disappears.android.data.ChatDataSource {
    
    @java.lang.Override()
    public void saveMessages(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.Message> messages) {
    }
    
    private final boolean updateExisting(io.realm.Realm realm, com.disappears.android.model.Message message) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.Message> getMessagesToResend(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override()
    public void markAllAsRead(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
    }
    
    @java.lang.Override()
    public long getUnreadCount(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.Message> getMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.disappears.android.model.Message> getMediaMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.Message getMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.Message getLatestMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @java.lang.Override()
    public void addMessage(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message messageToSend) {
    }
    
    @java.lang.Override()
    public void deleteData() {
    }
    
    @java.lang.Override()
    public void saveMessage(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.Message deleteMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, int numericId) {
        return null;
    }
    
    @java.lang.Override()
    public void deletePlaceholderMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String iv) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.disappears.android.model.Message getPlaceholderMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String iv) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
    }
    
    @java.lang.Override()
    public void deleteMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @java.lang.Override()
    public void deleteMessagesUpToId(int lastId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] usersInvolved) {
    }
    
    @java.lang.Override()
    public void deleteUserMessagesUpToIdFor(@org.jetbrains.annotations.NotNull()
    java.lang.String from, int lastId) {
    }
    
    public ChatRealmDataSource() {
        super();
    }
}
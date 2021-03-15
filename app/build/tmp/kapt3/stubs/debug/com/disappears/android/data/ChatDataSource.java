package com.disappears.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&J#\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H&\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\fH&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\tH&J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\n\u001a\u00020\tH&J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0018\u001a\u00020\tH&J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\tH&J\u0010\u0010 \u001a\u00020!2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0005H&J\u0016\u0010%\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH&\u00a8\u0006\'"}, d2 = {"Lcom/disappears/android/data/ChatDataSource;", "", "addMessage", "", "messageToSend", "Lcom/disappears/android/model/Message;", "deleteData", "deleteMessage", "id", "", "friendName", "numericId", "", "deleteMessages", "deleteMessagesUpToId", "lastId", "usersInvolved", "", "(I[Ljava/lang/String;)V", "deletePlaceholderMessages", "data", "deleteUserMessagesUpToIdFor", "from", "getLatestMessage", "username", "getMediaMessages", "", "getMessage", "getMessages", "getMessagesToResend", "getPlaceholderMessage", "iv", "getUnreadCount", "", "markAllAsRead", "saveMessage", "msg", "saveMessages", "messages", "app_debug"})
public abstract interface ChatDataSource {
    
    public abstract void saveMessages(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.disappears.android.model.Message> messages);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.Message> getMessagesToResend(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.Message getMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.Message getLatestMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void addMessage(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message messageToSend);
    
    public abstract void deleteData();
    
    public abstract void saveMessage(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message msg);
    
    public abstract void deletePlaceholderMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
    
    public abstract void deleteMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
    
    public abstract void deleteMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void deleteMessagesUpToId(int lastId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] usersInvolved);
    
    public abstract void deleteUserMessagesUpToIdFor(@org.jetbrains.annotations.NotNull()
    java.lang.String from, int lastId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.Message> getMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
    
    public abstract void markAllAsRead(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
    
    public abstract long getUnreadCount(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.Message deleteMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, int numericId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.Message getPlaceholderMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String iv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.disappears.android.model.Message> getMediaMessages(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName);
}
package com.disappears.android.flow.chats.messages;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 1/12/18.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J?\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/disappears/android/flow/chats/messages/MessageListModel;", "", "initialMessages", "", "Lcom/stfalcon/chatkit/commons/models/IMessage;", "newMessage", "error", "", "deletedMessageId", "", "(Ljava/util/List;Lcom/stfalcon/chatkit/commons/models/IMessage;Ljava/lang/Throwable;Ljava/lang/String;)V", "getDeletedMessageId", "()Ljava/lang/String;", "getError", "()Ljava/lang/Throwable;", "getInitialMessages", "()Ljava/util/List;", "getNewMessage", "()Lcom/stfalcon/chatkit/commons/models/IMessage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MessageListModel {
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.stfalcon.chatkit.commons.models.IMessage> initialMessages = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stfalcon.chatkit.commons.models.IMessage newMessage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String deletedMessageId = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stfalcon.chatkit.commons.models.IMessage> getInitialMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stfalcon.chatkit.commons.models.IMessage getNewMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeletedMessageId() {
        return null;
    }
    
    public MessageListModel(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.stfalcon.chatkit.commons.models.IMessage> initialMessages, @org.jetbrains.annotations.Nullable()
    com.stfalcon.chatkit.commons.models.IMessage newMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedMessageId) {
        super();
    }
    
    public MessageListModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stfalcon.chatkit.commons.models.IMessage> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stfalcon.chatkit.commons.models.IMessage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 1/12/18.
     * https://github.com/KucherenkoIhor
     */
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.chats.messages.MessageListModel copy(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.stfalcon.chatkit.commons.models.IMessage> initialMessages, @org.jetbrains.annotations.Nullable()
    com.stfalcon.chatkit.commons.models.IMessage newMessage, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedMessageId) {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 1/12/18.
     * https://github.com/KucherenkoIhor
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 1/12/18.
     * https://github.com/KucherenkoIhor
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by ihor_kucherenko on 1/12/18.
     * https://github.com/KucherenkoIhor
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
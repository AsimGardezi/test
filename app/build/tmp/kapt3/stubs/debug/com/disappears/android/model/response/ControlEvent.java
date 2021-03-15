package com.disappears.android.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006#"}, d2 = {"Lcom/disappears/android/model/response/ControlEvent;", "", "()V", "action", "Lcom/disappears/android/model/response/ControlEvent$Action;", "getAction", "()Lcom/disappears/android/model/response/ControlEvent$Action;", "setAction", "(Lcom/disappears/android/model/response/ControlEvent$Action;)V", "controlId", "", "getControlId", "()I", "setControlId", "(I)V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "from", "getFrom", "setFrom", "moredata", "getMoredata", "setMoredata", "type", "Lcom/disappears/android/model/response/ControlEvent$Type;", "getType", "()Lcom/disappears/android/model/response/ControlEvent$Type;", "setType", "(Lcom/disappears/android/model/response/ControlEvent$Type;)V", "Action", "Type", "app_debug"})
public final class ControlEvent {
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.model.response.ControlEvent.Type type;
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.model.response.ControlEvent.Action action;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String from;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String moredata;
    @com.google.gson.annotations.SerializedName(value = "id")
    private int controlId = 0;
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.response.ControlEvent.Type getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    com.disappears.android.model.response.ControlEvent.Type p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.response.ControlEvent.Action getAction() {
        return null;
    }
    
    public final void setAction(@org.jetbrains.annotations.Nullable()
    com.disappears.android.model.response.ControlEvent.Action p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMoredata() {
        return null;
    }
    
    public final void setMoredata(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getControlId() {
        return 0;
    }
    
    public final void setControlId(int p0) {
    }
    
    public ControlEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/model/response/ControlEvent$Type;", "", "(Ljava/lang/String;I)V", "USER", "MESSAGE", "app_debug"})
    public static enum Type {
        @com.google.gson.annotations.SerializedName(value = "user")
        /*public static final*/ USER /* = new USER() */,
        @com.google.gson.annotations.SerializedName(value = "message")
        /*public static final*/ MESSAGE /* = new MESSAGE() */;
        
        Type() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/disappears/android/model/response/ControlEvent$Action;", "", "(Ljava/lang/String;I)V", "REVOKE", "GROUP_CHAT_STARTED", "INVITED", "ADDED", "INVITE", "IGNORE", "DELETE", "FRIEND_IMAGE", "DELETE_ALL", "SHAREABLE", "NOT_SHAREABLE", "app_debug"})
    public static enum Action {
        @com.google.gson.annotations.SerializedName(value = "revoke")
        /*public static final*/ REVOKE /* = new REVOKE() */,
        @com.google.gson.annotations.SerializedName(value = "groupchatstarted")
        /*public static final*/ GROUP_CHAT_STARTED /* = new GROUP_CHAT_STARTED() */,
        @com.google.gson.annotations.SerializedName(value = "invited")
        /*public static final*/ INVITED /* = new INVITED() */,
        @com.google.gson.annotations.SerializedName(value = "added")
        /*public static final*/ ADDED /* = new ADDED() */,
        @com.google.gson.annotations.SerializedName(value = "invite")
        /*public static final*/ INVITE /* = new INVITE() */,
        @com.google.gson.annotations.SerializedName(value = "ignore")
        /*public static final*/ IGNORE /* = new IGNORE() */,
        @com.google.gson.annotations.SerializedName(value = "delete")
        /*public static final*/ DELETE /* = new DELETE() */,
        @com.google.gson.annotations.SerializedName(value = "friendImage")
        /*public static final*/ FRIEND_IMAGE /* = new FRIEND_IMAGE() */,
        @com.google.gson.annotations.SerializedName(value = "deleteAll")
        /*public static final*/ DELETE_ALL /* = new DELETE_ALL() */,
        @com.google.gson.annotations.SerializedName(value = "shareable")
        /*public static final*/ SHAREABLE /* = new SHAREABLE() */,
        @com.google.gson.annotations.SerializedName(value = "notshareable")
        /*public static final*/ NOT_SHAREABLE /* = new NOT_SHAREABLE() */;
        
        Action() {
        }
    }
}
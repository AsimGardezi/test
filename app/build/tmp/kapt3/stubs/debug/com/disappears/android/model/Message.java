package com.disappears.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u00108\u001a\u00020(J\u0006\u00109\u001a\u00020(J\b\u0010:\u001a\u00020\u0005H\u0016J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR \u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\"\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0007\"\u0004\b4\u0010\tR\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\t\u00a8\u0006?"}, d2 = {"Lcom/disappears/android/model/Message;", "Lio/realm/RealmObject;", "Ljava/io/Serializable;", "()V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "dateTime", "", "getDateTime", "()Ljava/lang/Long;", "setDateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "from", "getFrom", "setFrom", "fromVersion", "getFromVersion", "setFromVersion", "id", "getId", "setId", "iv", "getIv", "setIv", "mimeType", "getMimeType", "setMimeType", "numericId", "", "getNumericId", "()Ljava/lang/Integer;", "setNumericId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "read", "", "getRead", "()Z", "setRead", "(Z)V", "resend", "getResend", "()I", "setResend", "(I)V", "to", "getTo", "setTo", "toVersion", "getToVersion", "setToVersion", "imageType", "plainText", "toString", "updateFrom", "", "m", "Mimetype", "app_debug"})
public class Message extends io.realm.RealmObject implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer numericId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String data;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "datetime")
    private java.lang.Long dateTime;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String from;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String fromVersion;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String iv;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mimeType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String to;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String toVersion;
    private boolean read = false;
    private int resend = 0;
    
    public final boolean plainText() {
        return false;
    }
    
    public final boolean imageType() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNumericId() {
        return null;
    }
    
    public final void setNumericId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDateTime() {
        return null;
    }
    
    public final void setDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFromVersion() {
        return null;
    }
    
    public final void setFromVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIv() {
        return null;
    }
    
    public final void setIv(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMimeType() {
        return null;
    }
    
    public final void setMimeType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    public final void setTo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToVersion() {
        return null;
    }
    
    public final void setToVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getRead() {
        return false;
    }
    
    public final void setRead(boolean p0) {
    }
    
    public final int getResend() {
        return 0;
    }
    
    public final void setResend(int p0) {
    }
    
    public final void updateFrom(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message m) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Message() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/disappears/android/model/Message$Mimetype;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TEXT_PLAIN", "IMAGE", "app_debug"})
    public static enum Mimetype {
        /*public static final*/ TEXT_PLAIN /* = new TEXT_PLAIN(null) */,
        /*public static final*/ IMAGE /* = new IMAGE(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        Mimetype(java.lang.String type) {
        }
    }
}
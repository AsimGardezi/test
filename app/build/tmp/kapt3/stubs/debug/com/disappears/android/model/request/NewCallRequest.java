package com.disappears.android.model.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"Lcom/disappears/android/model/request/NewCallRequest;", "", "channelName", "", "callType", "", "callMembers", "Ljava/util/ArrayList;", "displayName", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/lang/String;)V", "getCallMembers", "()Ljava/util/ArrayList;", "setCallMembers", "(Ljava/util/ArrayList;)V", "getCallType", "()Ljava/lang/Boolean;", "setCallType", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getChannelName", "()Ljava/lang/String;", "setChannelName", "(Ljava/lang/String;)V", "getDisplayName", "setDisplayName", "app_debug"})
public final class NewCallRequest {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "channelname")
    private java.lang.String channelName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "calltype")
    private java.lang.Boolean callType;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "callmembers")
    private java.util.ArrayList<java.lang.String> callMembers;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "displayName")
    private java.lang.String displayName;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChannelName() {
        return null;
    }
    
    public final void setChannelName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCallType() {
        return null;
    }
    
    public final void setCallType(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getCallMembers() {
        return null;
    }
    
    public final void setCallMembers(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public NewCallRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String channelName, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean callType, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> callMembers, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName) {
        super();
    }
    
    public NewCallRequest() {
        super();
    }
}
package com.disappears.android.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 62\u00020\u0001:\u0003567B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fJ*\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\u0006\u0010\'\u001a\u00020%J\b\u0010(\u001a\u00020%H\u0002J\b\u0010)\u001a\u00020%H\u0002J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u001cJ$\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00J$\u00101\u001a\u00020%2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\f00J\u000e\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020\u001cJ\u000e\u00104\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/disappears/android/chat/SocketIOConnection;", "", "gson", "Lcom/google/gson/Gson;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "context", "Landroid/content/Context;", "(Lcom/google/gson/Gson;Lcom/disappears/android/encryption/EncryptionService;Lcom/disappears/android/util/SharedPrefUtil;Landroid/content/Context;)V", "apiBase", "", "authCookie", "Ljava/net/HttpCookie;", "callback", "Lcom/disappears/android/chat/SocketIOConnection$Callback;", "isConnectingOrConnected", "", "()Z", "setConnectingOrConnected", "(Z)V", "reconnectDisposable", "Lio/reactivex/disposables/Disposable;", "socket", "Lio/socket/SocketIO;", "buildMessage", "Lio/reactivex/Observable;", "Lcom/disappears/android/model/Message;", "data", "friendName", "currentLoggedUser", "type", "Lcom/disappears/android/model/Message$Mimetype;", "userIdentity", "Lcom/disappears/android/model/Identity;", "cancelReconnecting", "", "connect", "disconnect", "loadAuthCookie", "reconect", "resend", "message", "sendCallInitMessage", "channelId", "useVideo", "friendNames", "Ljava/util/ArrayList;", "sendCallTerminateMessage", "sendMessage", "messageToSend", "setCallback", "Callback", "Companion", "SocketCallbackHandler", "app_debug"})
public final class SocketIOConnection {
    private io.socket.SocketIO socket;
    private java.net.HttpCookie authCookie;
    private io.reactivex.disposables.Disposable reconnectDisposable;
    private volatile boolean isConnectingOrConnected = false;
    private com.disappears.android.chat.SocketIOConnection.Callback callback;
    private final java.lang.String apiBase = null;
    private final com.google.gson.Gson gson = null;
    private final com.disappears.android.encryption.EncryptionService encryption = null;
    private final com.disappears.android.util.SharedPrefUtil loginUtil = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_CONTROL = "control";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_MESSAGE_ERROR = "messageError";
    private static final java.lang.String EVENT_TYPE_USER = "user";
    private static final java.lang.String EVENT_TYPE_MESSAGE = "message";
    private static final int MAX_RECONNECT_ATTEMPT = 30;
    private static final java.lang.String TAG = null;
    public static final com.disappears.android.chat.SocketIOConnection.Companion Companion = null;
    
    public final boolean isConnectingOrConnected() {
        return false;
    }
    
    public final void setConnectingOrConnected(boolean p0) {
    }
    
    private final void loadAuthCookie() {
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.disappears.android.chat.SocketIOConnection.Callback callback) {
    }
    
    public final void connect() {
    }
    
    public final void disconnect() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.disappears.android.model.Message> buildMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message messageToSend) {
    }
    
    public final void sendCallInitMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, boolean useVideo, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> friendNames) {
    }
    
    public final void sendCallTerminateMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, boolean useVideo, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> friendNames) {
    }
    
    private final com.disappears.android.model.Message buildMessage(java.lang.String friendName, java.lang.String currentLoggedUser, com.disappears.android.model.Message.Mimetype type, com.disappears.android.model.Identity userIdentity) {
        return null;
    }
    
    private final void reconect() {
    }
    
    public final void resend(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Message message) {
    }
    
    private final void cancelReconnecting() {
    }
    
    public SocketIOConnection(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.disappears.android.encryption.EncryptionService encryption, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil loginUtil, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001H&\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/disappears/android/chat/SocketIOConnection$Callback;", "", "on", "", "event", "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onConnected", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void on(@org.jetbrains.annotations.NotNull()
        java.lang.String event, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args);
        
        public abstract void onConnected();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0016"}, d2 = {"Lcom/disappears/android/chat/SocketIOConnection$SocketCallbackHandler;", "Lio/socket/IOCallback;", "(Lcom/disappears/android/chat/SocketIOConnection;)V", "on", "", "event", "", "ack", "Lio/socket/IOAcknowledge;", "args", "", "", "(Ljava/lang/String;Lio/socket/IOAcknowledge;[Ljava/lang/Object;)V", "onConnect", "onDisconnect", "onError", "e", "Lio/socket/SocketIOException;", "onMessage", "data", "json", "Lorg/json/JSONObject;", "app_debug"})
    final class SocketCallbackHandler implements io.socket.IOCallback {
        
        @java.lang.Override()
        public void onMessage(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject json, @org.jetbrains.annotations.NotNull()
        io.socket.IOAcknowledge ack) {
        }
        
        @java.lang.Override()
        public void onMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String data, @org.jetbrains.annotations.NotNull()
        io.socket.IOAcknowledge ack) {
        }
        
        @java.lang.Override()
        public synchronized void onError(@org.jetbrains.annotations.NotNull()
        io.socket.SocketIOException e) {
        }
        
        @java.lang.Override()
        public void onDisconnect() {
        }
        
        @java.lang.Override()
        public void onConnect() {
        }
        
        @java.lang.Override()
        public void on(@org.jetbrains.annotations.NotNull()
        java.lang.String event, @org.jetbrains.annotations.Nullable()
        io.socket.IOAcknowledge ack, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
        
        public SocketCallbackHandler() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/disappears/android/chat/SocketIOConnection$Companion;", "", "()V", "EVENT_CONTROL", "", "EVENT_MESSAGE", "EVENT_MESSAGE_ERROR", "EVENT_TYPE_MESSAGE", "EVENT_TYPE_USER", "MAX_RECONNECT_ATTEMPT", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.disappears.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lcom/disappears/android/service/DisappearsFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "socketIoConnection", "Lcom/disappears/android/chat/SocketIOConnection;", "getSocketIoConnection", "()Lcom/disappears/android/chat/SocketIOConnection;", "socketIoConnection$delegate", "Lkotlin/Lazy;", "handleGenericMessage", "", "handleIncomingCall", "data", "", "", "handleNewMessage", "from", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "Companion", "app_debug"})
public final class DisappearsFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final kotlin.Lazy socketIoConnection$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEW_MESSAGE = "newMessage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEW_CALL = "call";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FROM = "messageFrom";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUSH_TYPE = "type";
    public static final com.disappears.android.service.DisappearsFirebaseMessagingService.Companion Companion = null;
    
    private final com.disappears.android.chat.SocketIOConnection getSocketIoConnection() {
        return null;
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleIncomingCall(java.util.Map<java.lang.String, java.lang.String> data) {
    }
    
    private final void handleGenericMessage() {
    }
    
    private final void handleNewMessage(java.lang.String from) {
    }
    
    public DisappearsFirebaseMessagingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/disappears/android/service/DisappearsFirebaseMessagingService$Companion;", "", "()V", "EXTRA_FROM", "", "NEW_CALL", "NEW_MESSAGE", "PUSH_TYPE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
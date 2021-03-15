package com.disappears.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\'\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0002\u0080\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FJ\u0010\u0010H\u001a\u00020D2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020D2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010O\u001a\u00020D2\u0006\u0010I\u001a\u00020JH\u0002J&\u0010P\u001a\u00020D2\b\u0010L\u001a\u0004\u0018\u00010Q2\b\b\u0002\u0010R\u001a\u00020S2\b\b\u0002\u0010T\u001a\u00020SH\u0002J\u0010\u0010U\u001a\u00020D2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010V\u001a\u00020D2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010W\u001a\u00020D2\u0006\u0010L\u001a\u00020QH\u0002J\u0010\u0010X\u001a\u00020S2\u0006\u0010L\u001a\u00020QH\u0002J\u001e\u0010Y\u001a\u00020D2\b\b\u0002\u0010Z\u001a\u00020S2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\H\u0002J.\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020\\2\u0006\u0010_\u001a\u00020\\2\b\b\u0002\u0010Z\u001a\u00020S2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\u0012\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020cH\u0002J)\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020\\2\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020J0g\"\u00020JH\u0016\u00a2\u0006\u0002\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010j2\u0006\u0010k\u001a\u00020lH\u0016J\b\u0010m\u001a\u00020DH\u0016J\b\u0010n\u001a\u00020DH\u0016J\"\u0010o\u001a\u00020p2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010q\u001a\u00020p2\u0006\u0010r\u001a\u00020pH\u0016J\u001c\u0010s\u001a\u00020\\2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\0uH\u0002J \u0010v\u001a\u00020D2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020\\0x2\b\b\u0002\u0010Z\u001a\u00020SH\u0002J\u001a\u0010y\u001a\u00020D2\b\u0010^\u001a\u0004\u0018\u00010\\2\u0006\u0010z\u001a\u00020{H\u0002J\u0010\u0010|\u001a\u00020D2\u0006\u0010}\u001a\u00020~H\u0002J\u0010\u0010\u007f\u001a\u00020D2\u0006\u0010L\u001a\u00020MH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u001f\u0010 R2\u0010\"\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0$0&0#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\b@\u0010A\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/disappears/android/service/MessageService;", "Landroid/app/Service;", "Lcom/disappears/android/chat/SocketIOConnection$Callback;", "()V", "api", "Lcom/disappears/android/api/VanishApi;", "getApi", "()Lcom/disappears/android/api/VanishApi;", "api$delegate", "Lkotlin/Lazy;", "chatDataSource", "Lcom/disappears/android/data/ChatDataSource;", "getChatDataSource", "()Lcom/disappears/android/data/ChatDataSource;", "chatDataSource$delegate", "currentDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "getEncryption", "()Lcom/disappears/android/encryption/EncryptionService;", "encryption$delegate", "end_call_broadcast_receiver", "Landroid/content/BroadcastReceiver;", "fileUtil", "Lcom/disappears/android/util/FileUtil;", "getFileUtil", "()Lcom/disappears/android/util/FileUtil;", "fileUtil$delegate", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "getFriendData", "()Lcom/disappears/android/data/FriendDataSource;", "friendData$delegate", "friendResponseMapper", "Lio/reactivex/functions/Function;", "Lretrofit2/Response;", "Lcom/disappears/android/model/response/FriendResponse;", "Lio/reactivex/ObservableSource;", "Lcom/disappears/android/model/response/ConversationResponse;", "getFriendResponseMapper", "()Lio/reactivex/functions/Function;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "getLoginUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "loginUtil$delegate", "messagesObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "getMessagesObserver", "()Lcom/disappears/android/mvvm/MessagesObserver;", "messagesObserver$delegate", "notificationUtil", "Lcom/disappears/android/util/NotificationUtil;", "getNotificationUtil", "()Lcom/disappears/android/util/NotificationUtil;", "notificationUtil$delegate", "socketIoConnection", "Lcom/disappears/android/chat/SocketIOConnection;", "getSocketIoConnection", "()Lcom/disappears/android/chat/SocketIOConnection;", "socketIoConnection$delegate", "disposable", "", "block", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "handleControlEvent", "arg", "", "handleControlMessageType", "m", "Lcom/disappears/android/model/response/ControlEvent;", "handleControlUserType", "handleErrorMessage", "handleImageMessage", "Lcom/disappears/android/model/Message;", "notify", "", "deleteIfFailed", "handleIncomingCall", "handleIncomingMessage", "handlePlainTextMessage", "isSelfMessage", "loadData", "fromPush", "fromFriend", "", "loadMessagesForFriend", "friendName", "messageId", "loadPublicKeysForFriend", "Lcom/disappears/android/model/response/PublicKeyData;", "friend", "Lcom/disappears/android/model/response/Friend;", "on", "event", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onConnected", "onDestroy", "onStartCommand", "", "flags", "startId", "parseFriendName", "entry", "", "processMediaMessages", "idsOfMediaMessages", "", "triggerNotification", "unread", "", "triggerVoipNotification", "callRequest", "Lcom/disappears/android/model/request/NewCallRequest;", "updateSelfControlId", "Companion", "app_debug"})
public final class MessageService extends android.app.Service implements com.disappears.android.chat.SocketIOConnection.Callback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy socketIoConnection$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy chatDataSource$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginUtil$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy friendData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy notificationUtil$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy encryption$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy gson$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fileUtil$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy messagesObserver$delegate = null;
    private io.reactivex.disposables.CompositeDisposable currentDisposable;
    private final android.content.BroadcastReceiver end_call_broadcast_receiver = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_PROCESS_MESSAGE = "process_message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FROM = "from";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CHANNEL = "uuid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_VIDEO = "has_video";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_IS_CALL = "is_call";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PUSH_NOTIFICATION = "is_from_push";
    public static final com.disappears.android.service.MessageService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.chat.SocketIOConnection getSocketIoConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.data.ChatDataSource getChatDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.SharedPrefUtil getLoginUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.data.FriendDataSource getFriendData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.NotificationUtil getNotificationUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.api.VanishApi getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.encryption.EncryptionService getEncryption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.FileUtil getFileUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.mvvm.MessagesObserver getMessagesObserver() {
        return null;
    }
    
    public final void disposable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends io.reactivex.disposables.Disposable> block) {
    }
    
    private final io.reactivex.functions.Function<retrofit2.Response<com.disappears.android.model.response.FriendResponse>, io.reactivex.ObservableSource<retrofit2.Response<com.disappears.android.model.response.ConversationResponse>>> getFriendResponseMapper() {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void on(@org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.Object... args) {
    }
    
    private final void loadData(boolean fromPush, java.lang.String fromFriend) {
    }
    
    private final java.lang.String parseFriendName(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return null;
    }
    
    private final com.disappears.android.model.response.PublicKeyData loadPublicKeysForFriend(com.disappears.android.model.response.Friend friend) {
        return null;
    }
    
    private final void loadMessagesForFriend(java.lang.String friendName, java.lang.String messageId, boolean fromPush, java.lang.String fromFriend) {
    }
    
    private final void processMediaMessages(java.util.List<java.lang.String> idsOfMediaMessages, boolean fromPush) {
    }
    
    private final void handleControlEvent(java.lang.Object arg) {
    }
    
    private final void updateSelfControlId(com.disappears.android.model.response.ControlEvent m) {
    }
    
    private final void handleControlUserType(com.disappears.android.model.response.ControlEvent m) {
    }
    
    private final void handleControlMessageType(com.disappears.android.model.response.ControlEvent m) {
    }
    
    private final void handleIncomingCall(java.lang.Object arg) {
    }
    
    private final void handleIncomingMessage(java.lang.Object arg) {
    }
    
    private final void handlePlainTextMessage(com.disappears.android.model.Message m) {
    }
    
    private final void handleImageMessage(com.disappears.android.model.Message m, boolean notify, boolean deleteIfFailed) {
    }
    
    private final boolean isSelfMessage(com.disappears.android.model.Message m) {
        return false;
    }
    
    private final void triggerNotification(java.lang.String friendName, long unread) {
    }
    
    private final void triggerVoipNotification(com.disappears.android.model.request.NewCallRequest callRequest) {
    }
    
    private final void handleErrorMessage(java.lang.Object arg) {
    }
    
    @java.lang.Override()
    public void onConnected() {
    }
    
    public MessageService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/service/MessageService$Companion;", "", "()V", "ACTION_PROCESS_MESSAGE", "", "EXTRA_CHANNEL", "EXTRA_FROM", "EXTRA_IS_CALL", "EXTRA_MESSAGE", "EXTRA_PUSH_NOTIFICATION", "EXTRA_VIDEO", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
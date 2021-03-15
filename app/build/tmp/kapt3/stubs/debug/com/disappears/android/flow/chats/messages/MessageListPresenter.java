package com.disappears.android.flow.chats.messages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Be\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0002\u0010\u001cJ\b\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u00020!H\u0016J\u0016\u0010?\u001a\u00020!2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020.00H\u0002J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020CH\u0016J\b\u0010D\u001a\u00020!H\u0016J\u0010\u0010E\u001a\u00020!2\u0006\u0010F\u001a\u00020,H\u0016J\b\u0010G\u001a\u00020,H\u0016J\u0012\u0010H\u001a\u00020,2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010J\u001a\u00020!H\u0016J\u0010\u0010K\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010L\u001a\u00020!H\u0016J&\u0010M\u001a\b\u0012\u0004\u0012\u00020C002\b\u0010\"\u001a\u0004\u0018\u00010\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.00H\u0002J\b\u0010N\u001a\u00020!H\u0016J\b\u0010O\u001a\u00020!H\u0016J\b\u0010P\u001a\u00020!H\u0016J\u0012\u0010Q\u001a\u00020!2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020!2\u0006\u0010U\u001a\u00020\u001fH\u0016J\b\u0010V\u001a\u00020!H\u0016J\u0010\u0010W\u001a\u00020!2\u0006\u0010X\u001a\u00020,H\u0016R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u001fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010$R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00103\u001a\u00020(2\u0006\u00102\u001a\u00020(8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020.0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lcom/disappears/android/flow/chats/messages/MessageListPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/chats/messages/MessageListContract$View;", "Lcom/disappears/android/flow/chats/messages/MessageListContract$Presenter;", "chatData", "Lcom/disappears/android/data/ChatDataSource;", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "prefUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "socketIO", "Lcom/disappears/android/chat/SocketIOConnection;", "api", "Lcom/disappears/android/api/VanishApi;", "lastSeenFormatter", "Lcom/disappears/android/util/LastSeenFormatter;", "imageUtil", "Lcom/disappears/android/util/ImageUtil;", "fileUtil", "Lcom/disappears/android/util/FileUtil;", "notificationUtil", "Lcom/disappears/android/util/NotificationUtil;", "chatManager", "Lcom/disappears/android/chat/ChatManager;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "messagesObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "(Lcom/disappears/android/data/ChatDataSource;Lcom/disappears/android/data/FriendDataSource;Lcom/disappears/android/util/SharedPrefUtil;Lcom/disappears/android/chat/SocketIOConnection;Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/util/LastSeenFormatter;Lcom/disappears/android/util/ImageUtil;Lcom/disappears/android/util/FileUtil;Lcom/disappears/android/util/NotificationUtil;Lcom/disappears/android/chat/ChatManager;Lcom/disappears/android/encryption/EncryptionService;Lcom/disappears/android/mvvm/MessagesObserver;)V", "allMessagesWereDeletedEvent", "Landroidx/lifecycle/Observer;", "", "chatRefreshObserver", "", "friendName", "getFriendName", "()Ljava/lang/String;", "setFriendName", "(Ljava/lang/String;)V", "initialModel", "Lcom/disappears/android/flow/chats/messages/MessageListModel;", "loggedUsername", "getLoggedUsername", "messageServiceWasStopped", "", "messageWasDeletedEvent", "Lcom/disappears/android/model/Message;", "messages", "", "messagesArrivesEventObserver", "<set-?>", "model", "getModel", "()Lcom/disappears/android/flow/chats/messages/MessageListModel;", "setModel", "(Lcom/disappears/android/flow/chats/messages/MessageListModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "recentImage", "Ljava/io/File;", "tempMessageDeletedObserver", "createPictureFile", "deleteAllMessages", "deleteMediaFiles", "mediaMessages", "deleteMessage", "message", "Lcom/stfalcon/chatkit/commons/models/IMessage;", "disappearUser", "initCall", "useVideo", "isCurrentFriendMuted", "isPlaceholderMessage", "id", "leaveChannel", "loadFriend", "loadMessages", "map", "markMessagesAsRead", "onPause", "onResume", "sendFile", "uri", "Landroid/net/Uri;", "sendMessage", "data", "sendTakenFile", "toggleMuteState", "muted", "app_debug"})
public final class MessageListPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.chats.messages.MessageListContract.View> implements com.disappears.android.flow.chats.messages.MessageListContract.Presenter {
    private final com.disappears.android.flow.chats.messages.MessageListModel initialModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty model$delegate = null;
    private java.io.File recentImage;
    private java.util.List<? extends com.disappears.android.model.Message> messages;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String friendName = "";
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> messagesArrivesEventObserver = null;
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> tempMessageDeletedObserver = null;
    private final androidx.lifecycle.Observer<com.disappears.android.model.Message> messageWasDeletedEvent = null;
    private final androidx.lifecycle.Observer<java.lang.Boolean> messageServiceWasStopped = null;
    private final androidx.lifecycle.Observer<java.lang.String> allMessagesWereDeletedEvent = null;
    private final androidx.lifecycle.Observer<kotlin.Unit> chatRefreshObserver = null;
    private final com.disappears.android.data.ChatDataSource chatData = null;
    private final com.disappears.android.data.FriendDataSource friendData = null;
    private final com.disappears.android.util.SharedPrefUtil prefUtil = null;
    private final com.disappears.android.chat.SocketIOConnection socketIO = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.util.LastSeenFormatter lastSeenFormatter = null;
    private final com.disappears.android.util.ImageUtil imageUtil = null;
    private final com.disappears.android.util.FileUtil fileUtil = null;
    private final com.disappears.android.util.NotificationUtil notificationUtil = null;
    private final com.disappears.android.chat.ChatManager chatManager = null;
    private final com.disappears.android.encryption.EncryptionService encryption = null;
    private final com.disappears.android.mvvm.MessagesObserver messagesObserver = null;
    
    @java.lang.Override()
    public boolean isPlaceholderMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.chats.messages.MessageListModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.chats.messages.MessageListModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFriendName() {
        return null;
    }
    
    @java.lang.Override()
    public void setFriendName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void loadMessages() {
    }
    
    private final java.util.List<com.stfalcon.chatkit.commons.models.IMessage> map(java.lang.String friendName, java.util.List<? extends com.disappears.android.model.Message> messages) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getLoggedUsername() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCurrentFriendMuted() {
        return false;
    }
    
    @java.lang.Override()
    public void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @java.lang.Override()
    public void deleteMessage(@org.jetbrains.annotations.NotNull()
    com.stfalcon.chatkit.commons.models.IMessage message) {
    }
    
    @java.lang.Override()
    public void loadFriend(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName) {
    }
    
    @java.lang.Override()
    public void deleteAllMessages() {
    }
    
    private final void deleteMediaFiles(java.util.List<? extends com.disappears.android.model.Message> mediaMessages) {
    }
    
    @java.lang.Override()
    public void disappearUser() {
    }
    
    @java.lang.Override()
    public void createPictureFile() {
    }
    
    @java.lang.Override()
    public void sendFile(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void initCall(boolean useVideo) {
    }
    
    @java.lang.Override()
    public void leaveChannel() {
    }
    
    @java.lang.Override()
    public void toggleMuteState(boolean muted) {
    }
    
    @java.lang.Override()
    public void markMessagesAsRead() {
    }
    
    @java.lang.Override()
    public void sendTakenFile() {
    }
    
    public MessageListPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.data.ChatDataSource chatData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.FriendDataSource friendData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil prefUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.chat.SocketIOConnection socketIO, @org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.LastSeenFormatter lastSeenFormatter, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ImageUtil imageUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.FileUtil fileUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.NotificationUtil notificationUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.chat.ChatManager chatManager, @org.jetbrains.annotations.NotNull()
    com.disappears.android.encryption.EncryptionService encryption, @org.jetbrains.annotations.NotNull()
    com.disappears.android.mvvm.MessagesObserver messagesObserver) {
        super();
    }
}
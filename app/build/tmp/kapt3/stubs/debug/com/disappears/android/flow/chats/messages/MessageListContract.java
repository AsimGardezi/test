package com.disappears.android.flow.chats.messages;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/chats/messages/MessageListContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class MessageListContract {
    
    public MessageListContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0017\u001a\u00020\u000bH&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u000bH&J\b\u0010\u001a\u001a\u00020\u000bH&J\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u000bH&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0013H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006#"}, d2 = {"Lcom/disappears/android/flow/chats/messages/MessageListContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "friendName", "", "getFriendName", "()Ljava/lang/String;", "setFriendName", "(Ljava/lang/String;)V", "loggedUsername", "getLoggedUsername", "createPictureFile", "", "deleteAllMessages", "deleteMessage", "message", "Lcom/stfalcon/chatkit/commons/models/IMessage;", "disappearUser", "initCall", "useVideo", "", "isCurrentFriendMuted", "isPlaceholderMessage", "id", "leaveChannel", "loadFriend", "loadMessages", "markMessagesAsRead", "sendFile", "uri", "Landroid/net/Uri;", "sendMessage", "data", "sendTakenFile", "toggleMuteState", "muted", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getFriendName();
        
        public abstract void setFriendName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getLoggedUsername();
        
        public abstract void loadMessages();
        
        public abstract void sendMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String data);
        
        public abstract boolean isCurrentFriendMuted();
        
        public abstract void deleteMessage(@org.jetbrains.annotations.NotNull()
        com.stfalcon.chatkit.commons.models.IMessage message);
        
        public abstract void loadFriend(@org.jetbrains.annotations.NotNull()
        java.lang.String friendName);
        
        public abstract void deleteAllMessages();
        
        public abstract void disappearUser();
        
        public abstract void createPictureFile();
        
        public abstract void sendFile(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri);
        
        public abstract void initCall(boolean useVideo);
        
        public abstract void toggleMuteState(boolean muted);
        
        public abstract void markMessagesAsRead();
        
        public abstract void sendTakenFile();
        
        public abstract void leaveChannel();
        
        public abstract boolean isPlaceholderMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String id);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.chats.messages.MessageListContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.chats.messages.MessageListContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.chats.messages.MessageListContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&\u00a8\u0006\u001b"}, d2 = {"Lcom/disappears/android/flow/chats/messages/MessageListContract$View;", "Lcom/disappears/android/base/BaseView;", "deletedAllMessages", "", "displayFriendData", "displayName", "", "picture", "lastSeen", "errorBuildingMessage", "errorDeletingMessage", "goToCall", "channelId", "friendName", "isVideoEnabled", "", "onInviteRefusedByPeer", "username", "render", "model", "Lcom/disappears/android/flow/chats/messages/MessageListModel;", "showErrorPickImage", "showFriendDisappearedMessagesInfo", "startMessageService", "takePhoto", "file", "Ljava/io/File;", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.disappears.android.flow.chats.messages.MessageListModel model);
        
        public abstract void errorBuildingMessage();
        
        public abstract void errorDeletingMessage();
        
        public abstract void displayFriendData(@org.jetbrains.annotations.Nullable()
        java.lang.String displayName, @org.jetbrains.annotations.Nullable()
        java.lang.String picture, @org.jetbrains.annotations.Nullable()
        java.lang.String lastSeen);
        
        public abstract void deletedAllMessages();
        
        public abstract void showFriendDisappearedMessagesInfo();
        
        public abstract void takePhoto(@org.jetbrains.annotations.NotNull()
        java.io.File file);
        
        public abstract void goToCall(@org.jetbrains.annotations.NotNull()
        java.lang.String channelId, @org.jetbrains.annotations.NotNull()
        java.lang.String friendName, boolean isVideoEnabled);
        
        public abstract void onInviteRefusedByPeer(@org.jetbrains.annotations.Nullable()
        java.lang.String username);
        
        public abstract void showErrorPickImage();
        
        public abstract void startMessageService();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
}
package com.disappears.android.flow.call;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010\'\u001a\u00020\"H\u0014J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010*\u001a\u00020\"H\u0014J-\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050/2\u0006\u00100\u001a\u000201H\u0016\u00a2\u0006\u0002\u00102J\b\u00103\u001a\u00020\"H\u0014J\b\u00104\u001a\u00020\"H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0018\u00010\u001fR\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/disappears/android/flow/call/IncomingCallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "callMembers", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "channelId", "displayName", "kotlin.jvm.PlatformType", "getDisplayName", "()Ljava/lang/String;", "displayName$delegate", "Lkotlin/Lazy;", "end_call_broadcast_receiver", "Landroid/content/BroadcastReceiver;", "notificationUtil", "Lcom/disappears/android/util/NotificationUtil;", "getNotificationUtil", "()Lcom/disappears/android/util/NotificationUtil;", "notificationUtil$delegate", "player", "Landroid/media/MediaPlayer;", "socketIO", "Lcom/disappears/android/chat/SocketIOConnection;", "getSocketIO", "()Lcom/disappears/android/chat/SocketIOConnection;", "socketIO$delegate", "video", "", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "createWakeLock", "", "initRingtonePLayer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInviteEndByUser", "username", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "setupUI", "Companion", "app_debug"})
public final class IncomingCallActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<java.lang.String> callMembers;
    private java.lang.String channelId;
    private final kotlin.Lazy displayName$delegate = null;
    private boolean video = false;
    private android.os.PowerManager.WakeLock wakeLock;
    private android.media.MediaPlayer player;
    private final kotlin.Lazy socketIO$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy notificationUtil$delegate = null;
    private final android.content.BroadcastReceiver end_call_broadcast_receiver = null;
    private static final int CALL_PERMISSIONS = 101;
    private static final java.lang.String EXTRA_CHANNEL_NAME = "channelName";
    private static final java.lang.String EXTRA_DISPLAY_NAME = "displayName";
    private static final java.lang.String EXTRA_CALL_MEMBERS = "channelMembers";
    private static final java.lang.String EXTRA_USE_VIDEO = "useVideo";
    private static final java.lang.String CALL_ACTION = "callAction";
    public static final com.disappears.android.flow.call.IncomingCallActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getDisplayName() {
        return null;
    }
    
    private final com.disappears.android.chat.SocketIOConnection getSocketIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.NotificationUtil getNotificationUtil() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onInviteEndByUser(java.lang.String username) {
    }
    
    private final void createWakeLock() {
    }
    
    private final void setupUI() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void initRingtonePLayer() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public IncomingCallActivity() {
        super();
    }
    
    public static final void startFromService(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName, @org.jetbrains.annotations.Nullable()
    java.lang.String channel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> members, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean video) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J@\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0012j\b\u0012\u0004\u0012\u00020\u0004`\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J>\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0012j\b\u0012\u0004\u0012\u00020\u0004`\u00132\u0006\u0010\u0014\u001a\u00020\u0015JO\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/disappears/android/flow/call/IncomingCallActivity$Companion;", "", "()V", "CALL_ACTION", "", "CALL_PERMISSIONS", "", "EXTRA_CALL_MEMBERS", "EXTRA_CHANNEL_NAME", "EXTRA_DISPLAY_NAME", "EXTRA_USE_VIDEO", "buildIntent", "Landroid/content/Intent;", "c", "Landroid/content/Context;", "displayName", "channel", "members", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "video", "", "start", "", "startFromService", "context", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)V", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.NotNull()
        java.lang.String displayName, @org.jetbrains.annotations.NotNull()
        java.lang.String channel, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> members, boolean video) {
        }
        
        public final void startFromService(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String displayName, @org.jetbrains.annotations.Nullable()
        java.lang.String channel, @org.jetbrains.annotations.Nullable()
        java.util.ArrayList<java.lang.String> members, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean video) {
        }
        
        private final android.content.Intent buildIntent(android.content.Context c, java.lang.String displayName, java.lang.String channel, java.util.ArrayList<java.lang.String> members, boolean video) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
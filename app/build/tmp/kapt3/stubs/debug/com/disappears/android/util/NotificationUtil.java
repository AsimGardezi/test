package com.disappears.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJA\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0015H\u0003J\b\u0010\u001c\u001a\u00020\u0015H\u0003J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/disappears/android/util/NotificationUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildNotification", "Lio/reactivex/Single;", "Landroid/app/Notification;", "friendName", "", "unread", "", "buildVoipNotification", "channelName", "callMembers", "Ljava/util/ArrayList;", "callType", "", "displayName", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/Single;", "clearNotification", "", "id", "", "notify", "n", "notifyVoip", "setUpChannelId", "setUpVoipChannelId", "showNotification", "notification", "Companion", "app_debug"})
public final class NotificationUtil {
    private final android.content.Context context = null;
    private static final java.lang.String CHANNEL_ID = "MSG_VANISH";
    private static final java.lang.String VOIP_CHANNEL_ID = "VOIP_VANISH";
    public static final com.disappears.android.util.NotificationUtil.Companion Companion = null;
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void setUpChannelId() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void setUpVoipChannelId() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<android.app.Notification> buildVoipNotification(@org.jetbrains.annotations.Nullable()
    java.lang.String channelName, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> callMembers, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean callType, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<android.app.Notification> buildNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, long unread) {
        return null;
    }
    
    public final void notify(@org.jetbrains.annotations.NotNull()
    android.app.Notification n, int id) {
    }
    
    public final void notifyVoip(@org.jetbrains.annotations.NotNull()
    android.app.Notification n, int id) {
    }
    
    private final void showNotification(android.app.Notification notification, int id) {
    }
    
    public final void clearNotification(int id) {
    }
    
    public NotificationUtil(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/disappears/android/util/NotificationUtil$Companion;", "", "()V", "CHANNEL_ID", "", "VOIP_CHANNEL_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
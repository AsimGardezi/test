package com.disappears.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\bR$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/disappears/android/util/SharedPrefUtil;", "", "prefs", "Landroid/content/SharedPreferences;", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/SharedPreferences;Lcom/google/gson/Gson;)V", "userControlId", "", "controlId", "getControlId", "()Ljava/lang/String;", "setControlId", "(Ljava/lang/String;)V", "username", "currentLoggedUser", "getCurrentLoggedUser", "setCurrentLoggedUser", "body", "Lcom/disappears/android/model/response/Profile;", "currentUserProfile", "getCurrentUserProfile", "()Lcom/disappears/android/model/response/Profile;", "setCurrentUserProfile", "(Lcom/disappears/android/model/response/Profile;)V", "isFirstTime", "", "logOut", "", "markFirstLogin", "Companion", "app_debug"})
public final class SharedPrefUtil {
    private final android.content.SharedPreferences prefs = null;
    private final com.google.gson.Gson gson = null;
    private static final java.lang.String PREF_CURRENT_LOGGED_USER = "current_user";
    private static final java.lang.String PREF_FIRST_TIME = "first_time_";
    private static final java.lang.String PREF_CONTROL_ID = "control_id";
    private static final java.lang.String PREF_CURRENT_LOGGED_PROFILE = "current_user_profile";
    public static final com.disappears.android.util.SharedPrefUtil.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentLoggedUser() {
        return null;
    }
    
    public final void setCurrentLoggedUser(@org.jetbrains.annotations.Nullable()
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getControlId() {
        return null;
    }
    
    public final void setControlId(@org.jetbrains.annotations.NotNull()
    java.lang.String userControlId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.response.Profile getCurrentUserProfile() {
        return null;
    }
    
    public final void setCurrentUserProfile(@org.jetbrains.annotations.Nullable()
    com.disappears.android.model.response.Profile body) {
    }
    
    public final void logOut() {
    }
    
    public final boolean isFirstTime(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return false;
    }
    
    public final void markFirstLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public SharedPrefUtil(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/disappears/android/util/SharedPrefUtil$Companion;", "", "()V", "PREF_CONTROL_ID", "", "PREF_CURRENT_LOGGED_PROFILE", "PREF_CURRENT_LOGGED_USER", "PREF_FIRST_TIME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.disappears.android;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/5/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lcom/disappears/android/ActivityLifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getCurrentActivityRef", "()Ljava/lang/ref/WeakReference;", "setCurrentActivityRef", "(Ljava/lang/ref/WeakReference;)V", "onActivityCreated", "", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "app_debug"})
public final class ActivityLifecycleCallback implements android.app.Application.ActivityLifecycleCallbacks {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<android.app.Activity> currentActivityRef;
    public static final com.disappears.android.ActivityLifecycleCallback INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<android.app.Activity> getCurrentActivityRef() {
        return null;
    }
    
    public final void setCurrentActivityRef(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<android.app.Activity> p0) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private ActivityLifecycleCallback() {
        super();
    }
}
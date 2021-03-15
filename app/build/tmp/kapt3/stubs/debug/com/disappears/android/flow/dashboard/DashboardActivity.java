package com.disappears.android.flow.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0007J\u0012\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020)H\u0014J\b\u00100\u001a\u00020)H\u0014J\b\u00101\u001a\u00020)H\u0014J\b\u00102\u001a\u00020)H\u0014J\b\u00103\u001a\u00020)H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00065"}, d2 = {"Lcom/disappears/android/flow/dashboard/DashboardActivity;", "Lcom/disappears/android/base/BaseActivity;", "Lcom/disappears/android/flow/dashboard/DashboardContract$Presenter;", "Lcom/disappears/android/flow/dashboard/DashboardContract$View;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "layoutResourceId", "", "getLayoutResourceId", "()I", "messagesObserver", "Lcom/disappears/android/mvvm/MessagesObserver;", "getMessagesObserver", "()Lcom/disappears/android/mvvm/MessagesObserver;", "messagesObserver$delegate", "Lkotlin/Lazy;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "getRxPermissions", "()Lcom/tbruyelle/rxpermissions2/RxPermissions;", "rxPermissions$delegate", "sectionsPagerAdapter", "Lcom/disappears/android/adapter/GenericViewPagerAdapter;", "getSectionsPagerAdapter", "()Lcom/disappears/android/adapter/GenericViewPagerAdapter;", "sectionsPagerAdapter$delegate", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thumbId", "Lcom/disappears/android/base/ThumbId;", "getThumbId", "()Lcom/disappears/android/base/ThumbId;", "setThumbId", "(Lcom/disappears/android/base/ThumbId;)V", "createTalk", "", "initTabs", "onAppForegrounded", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "runMessageService", "Companion", "app_debug"})
public final class DashboardActivity extends com.disappears.android.base.BaseActivity<com.disappears.android.flow.dashboard.DashboardContract.Presenter> implements com.disappears.android.flow.dashboard.DashboardContract.View, androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.base.ThumbId thumbId;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    private final int layoutResourceId = com.disappears.android.R.layout.activity_dashboard;
    private final kotlin.Lazy sectionsPagerAdapter$delegate = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final kotlin.Lazy messagesObserver$delegate = null;
    private final kotlin.Lazy rxPermissions$delegate = null;
    private static boolean alreadyLogin = false;
    private static boolean backStackFromProfile = false;
    public static final com.disappears.android.flow.dashboard.DashboardActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.base.ThumbId getThumbId() {
        return null;
    }
    
    public final void setThumbId(@org.jetbrains.annotations.Nullable()
    com.disappears.android.base.ThumbId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    private final com.disappears.android.adapter.GenericViewPagerAdapter getSectionsPagerAdapter() {
        return null;
    }
    
    private final com.disappears.android.mvvm.MessagesObserver getMessagesObserver() {
        return null;
    }
    
    private final com.tbruyelle.rxpermissions2.RxPermissions getRxPermissions() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initTabs() {
    }
    
    private final void createTalk() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onAppForegrounded() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void runMessageService() {
    }
    
    public DashboardActivity() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/disappears/android/flow/dashboard/DashboardActivity$Companion;", "", "()V", "alreadyLogin", "", "getAlreadyLogin", "()Z", "setAlreadyLogin", "(Z)V", "backStackFromProfile", "getBackStackFromProfile", "setBackStackFromProfile", "start", "", "c", "Landroid/content/Context;", "isAuthenticated", "app_debug"})
    public static final class Companion {
        
        public final boolean getAlreadyLogin() {
            return false;
        }
        
        public final void setAlreadyLogin(boolean p0) {
        }
        
        public final boolean getBackStackFromProfile() {
            return false;
        }
        
        public final void setBackStackFromProfile(boolean p0) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context c, boolean isAuthenticated) {
        }
        
        private Companion() {
            super();
        }
    }
}
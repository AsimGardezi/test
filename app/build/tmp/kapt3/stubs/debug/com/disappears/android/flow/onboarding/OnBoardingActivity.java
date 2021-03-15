package com.disappears.android.flow.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0007J\u0012\u0010.\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020,H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\b\u0018\u00010\u001eR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006:"}, d2 = {"Lcom/disappears/android/flow/onboarding/OnBoardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "api", "Lcom/disappears/android/api/VanishApi;", "getApi", "()Lcom/disappears/android/api/VanishApi;", "api$delegate", "Lkotlin/Lazy;", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "getEncryption", "()Lcom/disappears/android/encryption/EncryptionService;", "encryption$delegate", "from_dashboard", "", "getFrom_dashboard", "()Z", "from_dashboard$delegate", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "getLoginUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "loginUtil$delegate", "sectionsPagerAdapter", "Lcom/disappears/android/flow/onboarding/OnBoardingActivity$SectionsPagerAdapter;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thumbId", "Lcom/disappears/android/base/ThumbId;", "getThumbId", "()Lcom/disappears/android/base/ThumbId;", "setThumbId", "(Lcom/disappears/android/base/ThumbId;)V", "checkExtras", "", "onAppForegrounded", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "Companion", "SectionsPagerAdapter", "app_debug"})
public final class OnBoardingActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.lifecycle.LifecycleObserver {
    private final kotlin.Lazy from_dashboard$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.base.ThumbId thumbId;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    private com.disappears.android.flow.onboarding.OnBoardingActivity.SectionsPagerAdapter sectionsPagerAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginUtil$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy encryption$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_LOGGED_OUT = "logged_out";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_DASHBOARD = "from_dashboard";
    public static final com.disappears.android.flow.onboarding.OnBoardingActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final boolean getFrom_dashboard() {
        return false;
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.util.SharedPrefUtil getLoginUtil() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.encryption.EncryptionService getEncryption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.api.VanishApi getApi() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final java.lang.String getDeviceId() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkExtras() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onAppForegrounded() {
    }
    
    public OnBoardingActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/disappears/android/flow/onboarding/OnBoardingActivity$SectionsPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/disappears/android/flow/onboarding/OnBoardingActivity;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "app_debug"})
    public final class SectionsPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
        
        public SectionsPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/disappears/android/flow/onboarding/OnBoardingActivity$Companion;", "", "()V", "EXTRA_LOGGED_OUT", "", "FROM_DASHBOARD", "start", "", "c", "Landroid/content/Context;", "fromDashboard", "", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context c, boolean fromDashboard) {
        }
        
        private Companion() {
            super();
        }
    }
}
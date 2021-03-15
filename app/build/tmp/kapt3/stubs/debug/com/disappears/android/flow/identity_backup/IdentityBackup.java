package com.disappears.android.flow.identity_backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\"\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020%H\u0016J\u0012\u0010-\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u000202H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00064"}, d2 = {"Lcom/disappears/android/flow/identity_backup/IdentityBackup;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "api", "Lcom/disappears/android/api/VanishApi;", "getApi", "()Lcom/disappears/android/api/VanishApi;", "api$delegate", "Lkotlin/Lazy;", "enableBtn", "Landroid/widget/Button;", "getEnableBtn", "()Landroid/widget/Button;", "setEnableBtn", "(Landroid/widget/Button;)V", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "getEncryption", "()Lcom/disappears/android/encryption/EncryptionService;", "encryption$delegate", "firstTime", "", "getFirstTime", "()Z", "firstTime$delegate", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "getLoginUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "loginUtil$delegate", "skipBtn", "Landroid/widget/TextView;", "getSkipBtn", "()Landroid/widget/TextView;", "setSkipBtn", "(Landroid/widget/TextView;)V", "moveToDashboard", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "Companion", "app_debug"})
public final class IdentityBackup extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy firstTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginUtil$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy encryption$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button enableBtn;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView skipBtn;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FIRST_TIME_ACCESS = "first_time";
    public static final com.disappears.android.flow.identity_backup.IdentityBackup.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final boolean getFirstTime() {
        return false;
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getEnableBtn() {
        return null;
    }
    
    public final void setEnableBtn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSkipBtn() {
        return null;
    }
    
    public final void setSkipBtn(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void moveToDashboard() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public IdentityBackup() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/flow/identity_backup/IdentityBackup$Companion;", "", "()V", "EXTRA_FIRST_TIME_ACCESS", "", "start", "", "context", "Landroid/content/Context;", "firstTimeAccess", "", "app_debug"})
    public static final class Companion {
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean firstTimeAccess) {
        }
        
        private Companion() {
            super();
        }
    }
}
package com.disappears.android.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\'J\b\u0010/\u001a\u000200H\u0002J\u0006\u00101\u001a\u00020-J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u00020\'H\u0002J\u0006\u00104\u001a\u00020-J\u0006\u0010&\u001a\u00020-R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u00a8\u00065"}, d2 = {"Lcom/disappears/android/base/ThumbId;", "", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "biometricPrompt", "Landroidx/biometric/BiometricPrompt;", "callback", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "executor", "Ljava/util/concurrent/Executor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "toggleSwitch", "Landroid/widget/Switch;", "getToggleSwitch", "()Landroid/widget/Switch;", "setToggleSwitch", "(Landroid/widget/Switch;)V", "verificationStatus", "", "getVerificationStatus", "()Ljava/lang/String;", "setVerificationStatus", "(Ljava/lang/String;)V", "ThumbVerification", "", "activity", "buildBiometricPrompt", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "enabledChecked", "toast", "text", "verificationFailed", "app_debug"})
public final class ThumbId {
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences.Editor editor;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Switch toggleSwitch;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String verificationStatus = "";
    private androidx.biometric.BiometricPrompt biometricPrompt;
    private final java.util.concurrent.Executor executor = null;
    private final androidx.biometric.BiometricPrompt.AuthenticationCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.fragment.app.FragmentActivity context;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void setEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Switch getToggleSwitch() {
        return null;
    }
    
    public final void setToggleSwitch(@org.jetbrains.annotations.NotNull()
    android.widget.Switch p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVerificationStatus() {
        return null;
    }
    
    public final void setVerificationStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void ThumbVerification(@org.jetbrains.annotations.NotNull()
    java.lang.String activity) {
    }
    
    private final androidx.biometric.BiometricPrompt.PromptInfo buildBiometricPrompt() {
        return null;
    }
    
    private final void toast(java.lang.String text) {
    }
    
    public final void enabledChecked() {
    }
    
    public final void verificationStatus() {
    }
    
    public final void verificationFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity p0) {
    }
    
    public ThumbId(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context) {
        super();
    }
}
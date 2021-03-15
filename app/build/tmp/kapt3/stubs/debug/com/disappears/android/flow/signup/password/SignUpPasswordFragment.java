package com.disappears.android.flow.signup.password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J$\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u0002032\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020\u0018H\u0002R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\f\u00a8\u00067"}, d2 = {"Lcom/disappears/android/flow/signup/password/SignUpPasswordFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/signup/password/SignUpPasswordContract$Presenter;", "Lcom/disappears/android/flow/signup/password/SignUpPasswordContract$View;", "Landroid/widget/TextView$OnEditorActionListener;", "()V", "actionForwardVisible", "", "Ljava/lang/Boolean;", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "layoutResourceId", "", "getLayoutResourceId", "()I", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "username", "getUsername", "username$delegate", "Lkotlin/Lazy;", "handleError", "", "model", "Lcom/disappears/android/flow/signup/password/SignUpPasswordModel;", "handleProgress", "handleSuccessful", "invokeValidation", "navigateToDashboard", "navigateToLogin", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onEditorAction", "v", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "render", "subscribeValidator", "Companion", "app_debug"})
public final class SignUpPasswordFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.signup.password.SignUpPasswordContract.Presenter> implements com.disappears.android.flow.signup.password.SignUpPasswordContract.View, android.widget.TextView.OnEditorActionListener {
    private final kotlin.Lazy username$delegate = null;
    private java.lang.Boolean actionForwardVisible;
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_signup_password;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = null;
    private static final java.lang.String ARG_NAME = "name";
    public static final com.disappears.android.flow.signup.password.SignUpPasswordFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final java.lang.String getDeviceId() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeValidator() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void invokeValidation() {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.signup.password.SignUpPasswordModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleSuccessful(com.disappears.android.flow.signup.password.SignUpPasswordModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleError(com.disappears.android.flow.signup.password.SignUpPasswordModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProgress(com.disappears.android.flow.signup.password.SignUpPasswordModel model) {
    }
    
    private final void navigateToLogin() {
    }
    
    private final void navigateToDashboard() {
    }
    
    public SignUpPasswordFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/flow/signup/password/SignUpPasswordFragment$Companion;", "", "()V", "ARG_NAME", "", "TAG", "getTAG", "()Ljava/lang/String;", "newInstance", "Lcom/disappears/android/flow/signup/password/SignUpPasswordFragment;", "name", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.signup.password.SignUpPasswordFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
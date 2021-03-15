package com.disappears.android.flow.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\'"}, d2 = {"Lcom/disappears/android/flow/signin/LoginFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/signin/LoginContract$Presenter;", "Lcom/disappears/android/flow/signin/LoginContract$View;", "()V", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "layoutResourceId", "", "getLayoutResourceId", "()I", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "getRxPermissions", "()Lcom/tbruyelle/rxpermissions2/RxPermissions;", "setRxPermissions", "(Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "txtTos", "Landroid/widget/TextView;", "getTxtTos", "()Landroid/widget/TextView;", "setTxtTos", "(Landroid/widget/TextView;)V", "handleError", "", "model", "Lcom/disappears/android/flow/signin/LoginModel;", "handleProgress", "handleSuccessful", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "render", "Companion", "app_debug"})
public final class LoginFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.signin.LoginContract.Presenter> implements com.disappears.android.flow.signin.LoginContract.View {
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_login;
    @org.jetbrains.annotations.NotNull()
    public com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtTos;
    public static final com.disappears.android.flow.signin.LoginFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tbruyelle.rxpermissions2.RxPermissions getRxPermissions() {
        return null;
    }
    
    public final void setRxPermissions(@org.jetbrains.annotations.NotNull()
    com.tbruyelle.rxpermissions2.RxPermissions p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtTos() {
        return null;
    }
    
    public final void setTxtTos(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.signin.LoginModel model) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleSuccessful(com.disappears.android.flow.signin.LoginModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleError(com.disappears.android.flow.signin.LoginModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProgress(com.disappears.android.flow.signin.LoginModel model) {
    }
    
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final java.lang.String getDeviceId() {
        return null;
    }
    
    public LoginFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/signin/LoginFragment$Companion;", "", "()V", "newInstance", "Lcom/disappears/android/flow/signin/LoginFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.signin.LoginFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
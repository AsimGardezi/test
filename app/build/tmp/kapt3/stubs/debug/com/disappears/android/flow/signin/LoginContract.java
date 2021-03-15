package com.disappears.android.flow.signin;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/signin/LoginContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class LoginContract {
    
    public LoginContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/disappears/android/flow/signin/LoginContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "authenticate", "", "deviceId", "", "username", "password", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        public abstract void authenticate(@org.jetbrains.annotations.NotNull()
        java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.NotNull()
        java.lang.String password);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.signin.LoginContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.signin.LoginContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.signin.LoginContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/disappears/android/flow/signin/LoginContract$View;", "Lcom/disappears/android/base/BaseView;", "render", "", "model", "Lcom/disappears/android/flow/signin/LoginModel;", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.disappears.android.flow.signin.LoginModel model);
    }
}
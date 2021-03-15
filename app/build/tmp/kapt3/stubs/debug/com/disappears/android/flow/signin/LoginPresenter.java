package com.disappears.android.flow.signin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001cB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/disappears/android/flow/signin/LoginPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/signin/LoginContract$View;", "Lcom/disappears/android/flow/signin/LoginContract$Presenter;", "api", "Lcom/disappears/android/api/VanishApi;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "(Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/encryption/EncryptionService;Lcom/disappears/android/util/SharedPrefUtil;)V", "initialModel", "Lcom/disappears/android/flow/signin/LoginModel;", "<set-?>", "model", "getModel", "()Lcom/disappears/android/flow/signin/LoginModel;", "setModel", "(Lcom/disappears/android/flow/signin/LoginModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "authenticate", "", "deviceId", "", "username", "password", "handleApiCall", "Companion", "app_debug"})
public final class LoginPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.signin.LoginContract.View> implements com.disappears.android.flow.signin.LoginContract.Presenter {
    private final com.disappears.android.flow.signin.LoginModel initialModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty model$delegate = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.encryption.EncryptionService encryption = null;
    private final com.disappears.android.util.SharedPrefUtil loginUtil = null;
    private static final java.lang.String TAG = null;
    public static final com.disappears.android.flow.signin.LoginPresenter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.signin.LoginModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.signin.LoginModel p0) {
    }
    
    @java.lang.Override()
    public void authenticate(@org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void handleApiCall(java.lang.String deviceId, java.lang.String username, java.lang.String password) {
    }
    
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.encryption.EncryptionService encryption, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil loginUtil) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/signin/LoginPresenter$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
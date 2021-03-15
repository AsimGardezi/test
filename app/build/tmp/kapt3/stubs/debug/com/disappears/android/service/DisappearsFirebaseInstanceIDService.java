package com.disappears.android.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/disappears/android/service/DisappearsFirebaseInstanceIDService;", "Lcom/google/firebase/iid/FirebaseInstanceIdService;", "()V", "api", "Lcom/disappears/android/api/VanishApi;", "getApi", "()Lcom/disappears/android/api/VanishApi;", "api$delegate", "Lkotlin/Lazy;", "prefUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "getPrefUtil", "()Lcom/disappears/android/util/SharedPrefUtil;", "prefUtil$delegate", "onTokenRefresh", "", "app_debug"})
public final class DisappearsFirebaseInstanceIDService extends com.google.firebase.iid.FirebaseInstanceIdService {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy api$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy prefUtil$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.disappears.android.api.VanishApi getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.disappears.android.util.SharedPrefUtil getPrefUtil() {
        return null;
    }
    
    @java.lang.Override()
    public void onTokenRefresh() {
    }
    
    public DisappearsFirebaseInstanceIDService() {
        super();
    }
}
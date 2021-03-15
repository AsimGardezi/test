package com.disappears.android.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002\u00a8\u0006\u001a"}, d2 = {"Lcom/disappears/android/di/ApiModule;", "Lorg/koin/standalone/KoinComponent;", "()V", "getAuthenticator", "Lokhttp3/Authenticator;", "c", "Landroid/content/Context;", "util", "Lcom/disappears/android/util/SharedPrefUtil;", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "getBackendClient", "Lcom/disappears/android/api/VanishApi;", "gson", "Lcom/google/gson/Gson;", "client", "Lokhttp3/OkHttpClient;", "getModule", "Lkotlin/Function0;", "Lorg/koin/dsl/context/Context;", "getUnsafeOkHttpClient", "authenticator", "responseCount", "", "response", "Lokhttp3/Response;", "app_debug"})
public final class ApiModule implements org.koin.standalone.KoinComponent {
    public static final com.disappears.android.di.ApiModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<org.koin.dsl.context.Context> getModule() {
        return null;
    }
    
    private final com.disappears.android.api.VanishApi getBackendClient(android.content.Context c, com.google.gson.Gson gson, okhttp3.OkHttpClient client) {
        return null;
    }
    
    private final okhttp3.OkHttpClient getUnsafeOkHttpClient(android.content.Context c, okhttp3.Authenticator authenticator) {
        return null;
    }
    
    private final okhttp3.Authenticator getAuthenticator(android.content.Context c, com.disappears.android.util.SharedPrefUtil util, com.disappears.android.encryption.EncryptionService encryption) {
        return null;
    }
    
    private final int responseCount(okhttp3.Response response) {
        return 0;
    }
    
    private ApiModule() {
        super();
    }
}
package com.disappears.android.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/api/ApiUtil;", "", "()V", "DUMMY_RESPONSE_CODE", "", "getDUMMY_RESPONSE_CODE", "()I", "emptyErrorResponse", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "emptySuccessResponse", "app_debug"})
public final class ApiUtil {
    private static final int DUMMY_RESPONSE_CODE = 111;
    public static final com.disappears.android.api.ApiUtil INSTANCE = null;
    
    public final int getDUMMY_RESPONSE_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Response<okhttp3.ResponseBody> emptySuccessResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Response<okhttp3.ResponseBody> emptyErrorResponse() {
        return null;
    }
    
    private ApiUtil() {
        super();
    }
}
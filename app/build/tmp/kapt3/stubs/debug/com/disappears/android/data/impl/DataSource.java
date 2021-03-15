package com.disappears.android.data.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0004J\'\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\t0\u0006H\u0004\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/data/impl/DataSource;", "", "()V", "executeDataChange", "", "operation", "Lkotlin/Function1;", "Lio/realm/Realm;", "executeQuery", "T", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "app_debug"})
public class DataSource {
    
    protected final <T extends java.lang.Object>T executeQuery(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.realm.Realm, ? extends T> operation) {
        return null;
    }
    
    protected final void executeDataChange(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.realm.Realm, kotlin.Unit> operation) {
    }
    
    public DataSource() {
        super();
    }
}
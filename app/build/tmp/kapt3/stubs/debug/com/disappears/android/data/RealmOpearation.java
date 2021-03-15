package com.disappears.android.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/disappears/android/data/RealmOpearation;", "T", "", "run", "realm", "Lio/realm/Realm;", "(Lio/realm/Realm;)Ljava/lang/Object;", "app_debug"})
public abstract interface RealmOpearation<T extends java.lang.Object> {
    
    public abstract T run(@org.jetbrains.annotations.NotNull()
    io.realm.Realm realm);
}
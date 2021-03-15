package com.disappears.android.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0014R\u0012\u0010\b\u001a\u00020\tX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00028\u00008F\u00a2\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/disappears/android/base/BaseActivity;", "P", "Lcom/disappears/android/base/BasePresenter;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/disappears/android/base/BaseView;", "presenterClass", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "p", "getP", "()Lcom/disappears/android/base/BasePresenter;", "p$delegate", "Lkotlin/Lazy;", "presenter", "presenter$annotations", "()V", "getPresenter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public abstract class BaseActivity<P extends com.disappears.android.base.BasePresenter> extends androidx.appcompat.app.AppCompatActivity implements com.disappears.android.base.BaseView {
    private final kotlin.Lazy p$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract int getLayoutResourceId();
    
    private final com.disappears.android.base.BasePresenter getP() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    public static void presenter$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final P getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<P> presenterClass) {
        super();
    }
}
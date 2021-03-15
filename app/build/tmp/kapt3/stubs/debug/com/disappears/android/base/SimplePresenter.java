package com.disappears.android.base;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/29/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u000f\u001a\u00020\u0010\"\b\b\u0001\u0010\u0011*\u00020\u00022\u0006\u0010\t\u001a\u0002H\u0011H\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0014\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001b0\u001a\"\u0004\b\u0001\u0010\u001bJ\u000e\u0010\u001c\u001a\n \u001d*\u0004\u0018\u00010\u00180\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/disappears/android/base/SimplePresenter;", "V", "Lcom/disappears/android/base/BaseView;", "Lcom/disappears/android/base/BasePresenter;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "view", "getView", "()Lcom/disappears/android/base/BaseView;", "setView", "(Lcom/disappears/android/base/BaseView;)V", "Lcom/disappears/android/base/BaseView;", "attachView", "", "B", "detachView", "disposable", "block", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "io", "Lio/reactivex/Scheduler;", "ioToMain", "Lio/reactivex/ObservableTransformer;", "T", "main", "kotlin.jvm.PlatformType", "app_debug"})
public class SimplePresenter<V extends com.disappears.android.base.BaseView> implements com.disappears.android.base.BasePresenter {
    @org.jetbrains.annotations.Nullable()
    private V view;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.Nullable()
    public final V getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> ioToMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void disposable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends io.reactivex.disposables.Disposable> block) {
    }
    
    public final io.reactivex.Scheduler main() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Scheduler io() {
        return null;
    }
    
    @java.lang.Override()
    public <B extends com.disappears.android.base.BaseView>void attachView(@org.jetbrains.annotations.NotNull()
    B view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    public SimplePresenter() {
        super();
    }
    
    public void onResume() {
    }
    
    public void onPause() {
    }
    
    public void onDestroy() {
    }
}
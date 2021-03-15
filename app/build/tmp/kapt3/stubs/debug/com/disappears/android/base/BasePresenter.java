package com.disappears.android.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/disappears/android/base/BasePresenter;", "", "attachView", "", "V", "Lcom/disappears/android/base/BaseView;", "view", "(Lcom/disappears/android/base/BaseView;)V", "detachView", "onDestroy", "onPause", "onResume", "app_debug"})
public abstract interface BasePresenter {
    
    public abstract void onResume();
    
    public abstract void onPause();
    
    public abstract void onDestroy();
    
    public abstract <V extends com.disappears.android.base.BaseView>void attachView(@org.jetbrains.annotations.NotNull()
    V view);
    
    public abstract void detachView();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void onResume(com.disappears.android.base.BasePresenter $this) {
        }
        
        public static void onPause(com.disappears.android.base.BasePresenter $this) {
        }
        
        public static void onDestroy(com.disappears.android.base.BasePresenter $this) {
        }
    }
}
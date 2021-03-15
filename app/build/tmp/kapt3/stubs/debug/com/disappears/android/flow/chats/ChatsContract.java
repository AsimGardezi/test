package com.disappears.android.flow.chats;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class ChatsContract {
    
    public ChatsContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.chats.ChatsContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.chats.ChatsContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.chats.ChatsContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/disappears/android/flow/chats/ChatsContract$View;", "Lcom/disappears/android/base/BaseView;", "render", "", "result", "", "Lcom/disappears/android/model/Chat;", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        java.util.List<com.disappears.android.model.Chat> result);
    }
}
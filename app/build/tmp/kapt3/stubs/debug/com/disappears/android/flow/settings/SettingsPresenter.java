package com.disappears.android.flow.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/disappears/android/flow/settings/SettingsPresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/settings/SettingsContract$View;", "Lcom/disappears/android/flow/settings/SettingsContract$Presenter;", "api", "Lcom/disappears/android/api/VanishApi;", "friendData", "Lcom/disappears/android/data/FriendDataSource;", "chatData", "Lcom/disappears/android/data/ChatDataSource;", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "(Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/data/FriendDataSource;Lcom/disappears/android/data/ChatDataSource;Lcom/disappears/android/util/SharedPrefUtil;)V", "initialModel", "Lcom/disappears/android/flow/settings/SettingsModel;", "<set-?>", "model", "getModel", "()Lcom/disappears/android/flow/settings/SettingsModel;", "setModel", "(Lcom/disappears/android/flow/settings/SettingsModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "cleanUp", "", "loadProfile", "logout", "onResume", "app_debug"})
public final class SettingsPresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.settings.SettingsContract.View> implements com.disappears.android.flow.settings.SettingsContract.Presenter {
    private final com.disappears.android.flow.settings.SettingsModel initialModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty model$delegate = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.data.FriendDataSource friendData = null;
    private final com.disappears.android.data.ChatDataSource chatData = null;
    private final com.disappears.android.util.SharedPrefUtil loginUtil = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.settings.SettingsModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.settings.SettingsModel p0) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void logout() {
    }
    
    private final void cleanUp() {
    }
    
    private final void loadProfile() {
    }
    
    public SettingsPresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.FriendDataSource friendData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.data.ChatDataSource chatData, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil loginUtil) {
        super();
    }
}
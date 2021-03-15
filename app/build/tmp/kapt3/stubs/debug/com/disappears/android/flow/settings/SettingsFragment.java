package com.disappears.android.flow.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00017B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010\'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u001c2\u0006\u00105\u001a\u000206H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00068"}, d2 = {"Lcom/disappears/android/flow/settings/SettingsFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/settings/SettingsContract$Presenter;", "Lcom/disappears/android/flow/settings/SettingsContract$View;", "()V", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thumbId", "Lcom/disappears/android/base/ThumbId;", "getThumbId", "()Lcom/disappears/android/base/ThumbId;", "setThumbId", "(Lcom/disappears/android/base/ThumbId;)V", "callTouchVerificationDialog", "", "displayUsername", "currentUserName", "", "initClickListeners", "navigateToOnBoarding", "onAboutCLick", "view", "Landroid/view/View;", "onBackupAccountClick", "onEditProfileClick", "onFeedbackClick", "onHelpCLick", "onInviteFriendsClick", "onLogoutClick", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "render", "model", "Lcom/disappears/android/flow/settings/SettingsModel;", "renderProfile", "profile", "Lcom/disappears/android/model/response/Profile;", "setProgressEnabled", "isEnabled", "", "Companion", "app_debug"})
public final class SettingsFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.settings.SettingsContract.Presenter> implements com.disappears.android.flow.settings.SettingsContract.View {
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_settings;
    @org.jetbrains.annotations.Nullable()
    private com.disappears.android.base.ThumbId thumbId;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences.Editor editor;
    private static final java.lang.String TAG_DIALOG = "TAG_DIALOG";
    public static final com.disappears.android.flow.settings.SettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.base.ThumbId getThumbId() {
        return null;
    }
    
    public final void setThumbId(@org.jetbrains.annotations.Nullable()
    com.disappears.android.base.ThumbId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void setEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initClickListeners() {
    }
    
    private final void callTouchVerificationDialog() {
    }
    
    private final void onHelpCLick(android.view.View view) {
    }
    
    private final void onBackupAccountClick(android.view.View view) {
    }
    
    private final void onFeedbackClick(android.view.View view) {
    }
    
    private final void onInviteFriendsClick(android.view.View view) {
    }
    
    private final void onAboutCLick(android.view.View view) {
    }
    
    private final void onLogoutClick(android.view.View view) {
    }
    
    private final void onEditProfileClick(android.view.View view) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.settings.SettingsModel model) {
    }
    
    private final void setProgressEnabled(boolean isEnabled) {
    }
    
    private final void navigateToOnBoarding() {
    }
    
    private final void renderProfile(com.disappears.android.model.response.Profile profile) {
    }
    
    private final void displayUsername(java.lang.String currentUserName) {
    }
    
    public SettingsFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/disappears/android/flow/settings/SettingsFragment$Companion;", "", "()V", "TAG_DIALOG", "", "newInstance", "Lcom/disappears/android/flow/settings/SettingsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.settings.SettingsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
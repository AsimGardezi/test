package com.disappears.android.flow.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J$\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u000204H\u0002J+\u00105\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020:H\u0016\u00a2\u0006\u0002\u0010;J\u001a\u0010<\u001a\u00020\u00112\u0006\u00103\u001a\u0002042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017J\b\u0010=\u001a\u00020\u0011H\u0002J\u0010\u0010>\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010?\u001a\u00020\u0011H\u0002J\b\u0010@\u001a\u00020\u0011H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006B"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/profile/SetUpProfileContract$Presenter;", "Lcom/disappears/android/flow/profile/SetUpProfileContract$View;", "Landroid/widget/TextView$OnEditorActionListener;", "()V", "layoutResourceId", "", "getLayoutResourceId", "()I", "rxPermission", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "getRxPermission", "()Lcom/tbruyelle/rxpermissions2/RxPermissions;", "setRxPermission", "(Lcom/tbruyelle/rxpermissions2/RxPermissions;)V", "handleError", "", "model", "Lcom/disappears/android/flow/profile/SetUpProfileModel;", "handlePhotoFileForPicker", "handleProfile", "handleProfilePicturePath", "handleProgress", "handleSuccess", "navigateToIdentityBackup", "navigateToThumbVerificaiton", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "event", "Landroid/view/KeyEvent;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onProfilePictureClickListener", "view", "Landroid/view/View;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "pickPhoto", "render", "startPhotoFlow", "takePhoto", "Companion", "app_debug"})
public final class SetUpProfileFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.profile.SetUpProfileContract.Presenter> implements com.disappears.android.flow.profile.SetUpProfileContract.View, android.widget.TextView.OnEditorActionListener {
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_setup_profile;
    @org.jetbrains.annotations.Nullable()
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermission;
    private static final int REQUEST_IMAGE_CAPTURE = 10;
    private static final int REQUEST_STORAGE = 20;
    private static final int PICK_IMAGE_REQUEST = 30;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIALOG_TAG = "dialog";
    private static final java.lang.String TAG_DIALOG = "dialog";
    private static boolean firstTime = false;
    public static final com.disappears.android.flow.profile.SetUpProfileFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tbruyelle.rxpermissions2.RxPermissions getRxPermission() {
        return null;
    }
    
    public final void setRxPermission(@org.jetbrains.annotations.Nullable()
    com.tbruyelle.rxpermissions2.RxPermissions p0) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onProfilePictureClickListener(android.view.View view) {
    }
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void startPhotoFlow() {
    }
    
    private final void pickPhoto() {
    }
    
    private final void takePhoto() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    private final void navigateToThumbVerificaiton() {
    }
    
    private final void navigateToIdentityBackup() {
    }
    
    @androidx.annotation.MainThread()
    private final void handleSuccess(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handlePhotoFileForPicker(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProfilePicturePath(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleError(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProfile(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProgress(com.disappears.android.flow.profile.SetUpProfileModel model) {
    }
    
    public SetUpProfileFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileFragment$Companion;", "", "()V", "DIALOG_TAG", "", "PICK_IMAGE_REQUEST", "", "REQUEST_IMAGE_CAPTURE", "REQUEST_STORAGE", "TAG_DIALOG", "firstTime", "", "getFirstTime", "()Z", "setFirstTime", "(Z)V", "newInstance", "Lcom/disappears/android/flow/profile/SetUpProfileFragment;", "app_debug"})
    public static final class Companion {
        
        public final boolean getFirstTime() {
            return false;
        }
        
        public final void setFirstTime(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.profile.SetUpProfileFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
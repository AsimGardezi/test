package com.disappears.android.flow.signup.username;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0003J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J$\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0015H\u0002J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u00064"}, d2 = {"Lcom/disappears/android/flow/signup/username/SignUpUsernameFragment;", "Lcom/disappears/android/base/BasePresenterFragment;", "Lcom/disappears/android/flow/signup/username/SignUpUsernameContract$Presenter;", "Lcom/disappears/android/flow/signup/username/SignUpUsernameContract$View;", "Landroid/widget/TextView$OnEditorActionListener;", "()V", "actionForward", "Landroid/view/MenuItem;", "layoutResourceId", "", "getLayoutResourceId", "()I", "navigationCallback", "Lcom/disappears/android/flow/signup/NavigationCallback;", "txtTos", "Landroid/widget/TextView;", "getTxtTos", "()Landroid/widget/TextView;", "setTxtTos", "(Landroid/widget/TextView;)V", "handleProgress", "", "isProgressDisplayed", "", "handleUseNameAlreadyExists", "model", "Lcom/disappears/android/flow/signup/username/SignUpUsernameModel;", "handleUsernameValid", "onAttachCompat", "context", "Landroid/content/Context;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDetach", "onEditorAction", "v", "actionId", "event", "Landroid/view/KeyEvent;", "onOptionsItemSelected", "item", "onProceedClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "render", "Companion", "app_debug"})
public final class SignUpUsernameFragment extends com.disappears.android.base.BasePresenterFragment<com.disappears.android.flow.signup.username.SignUpUsernameContract.Presenter> implements com.disappears.android.flow.signup.username.SignUpUsernameContract.View, android.widget.TextView.OnEditorActionListener {
    private android.view.MenuItem actionForward;
    private final int layoutResourceId = com.disappears.android.R.layout.fragment_signup_username;
    private com.disappears.android.flow.signup.NavigationCallback navigationCallback;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtTos;
    public static final com.disappears.android.flow.signup.username.SignUpUsernameFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtTos() {
        return null;
    }
    
    public final void setTxtTos(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttachCompat(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
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
    
    @java.lang.Override()
    public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
    android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
    android.view.KeyEvent event) {
        return false;
    }
    
    private final void onProceedClicked() {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.signup.username.SignUpUsernameModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleUsernameValid(com.disappears.android.flow.signup.username.SignUpUsernameModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleUseNameAlreadyExists(com.disappears.android.flow.signup.username.SignUpUsernameModel model) {
    }
    
    @androidx.annotation.MainThread()
    private final void handleProgress(boolean isProgressDisplayed) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public SignUpUsernameFragment() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/signup/username/SignUpUsernameFragment$Companion;", "", "()V", "newInstance", "Lcom/disappears/android/flow/signup/username/SignUpUsernameFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.flow.signup.username.SignUpUsernameFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
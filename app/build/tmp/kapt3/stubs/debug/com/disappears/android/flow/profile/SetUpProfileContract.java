package com.disappears.android.flow.profile;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class SetUpProfileContract {
    
    public SetUpProfileContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "createPictureFile", "", "loadCurrentProfile", "updatePicture", "uri", "Landroid/net/Uri;", "updateProfileData", "name", "updateTakenPicture", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String getImagePath();
        
        public abstract void setImagePath(@org.jetbrains.annotations.Nullable()
        java.lang.String p0);
        
        public abstract void updateTakenPicture();
        
        public abstract void createPictureFile();
        
        public abstract void updatePicture(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
        
        public abstract void updateProfileData(@org.jetbrains.annotations.NotNull()
        java.lang.String name);
        
        public abstract void loadCurrentProfile();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.profile.SetUpProfileContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.profile.SetUpProfileContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.profile.SetUpProfileContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileContract$View;", "Lcom/disappears/android/base/BaseView;", "render", "", "model", "Lcom/disappears/android/flow/profile/SetUpProfileModel;", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.disappears.android.flow.profile.SetUpProfileModel model);
    }
}
package com.disappears.android.flow.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u0010H\u0016J\b\u00101\u001a\u00020)H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfilePresenter;", "Lcom/disappears/android/base/SimplePresenter;", "Lcom/disappears/android/flow/profile/SetUpProfileContract$View;", "Lcom/disappears/android/flow/profile/SetUpProfileContract$Presenter;", "api", "Lcom/disappears/android/api/VanishApi;", "loginUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "fileUtil", "Lcom/disappears/android/util/FileUtil;", "imageUtil", "Lcom/disappears/android/util/ImageUtil;", "stringProvider", "Lcom/disappears/android/util/StringProvider;", "(Lcom/disappears/android/api/VanishApi;Lcom/disappears/android/util/SharedPrefUtil;Lcom/disappears/android/util/FileUtil;Lcom/disappears/android/util/ImageUtil;Lcom/disappears/android/util/StringProvider;)V", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "initialModel", "Lcom/disappears/android/flow/profile/SetUpProfileModel;", "<set-?>", "model", "getModel", "()Lcom/disappears/android/flow/profile/SetUpProfileModel;", "setModel", "(Lcom/disappears/android/flow/profile/SetUpProfileModel;)V", "model$delegate", "Lkotlin/properties/ReadWriteProperty;", "pictureSingle", "Lio/reactivex/Single;", "Lretrofit2/Response;", "Ljava/lang/Void;", "getPictureSingle", "()Lio/reactivex/Single;", "resizedFile", "cleanup", "", "createPictureFile", "", "detachView", "loadCurrentProfile", "updatePicture", "uri", "Landroid/net/Uri;", "updateProfileData", "name", "updateTakenPicture", "app_debug"})
public final class SetUpProfilePresenter extends com.disappears.android.base.SimplePresenter<com.disappears.android.flow.profile.SetUpProfileContract.View> implements com.disappears.android.flow.profile.SetUpProfileContract.Presenter {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imagePath;
    private java.lang.String resizedFile;
    private final com.disappears.android.flow.profile.SetUpProfileModel initialModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty model$delegate = null;
    private final com.disappears.android.api.VanishApi api = null;
    private final com.disappears.android.util.SharedPrefUtil loginUtil = null;
    private final com.disappears.android.util.FileUtil fileUtil = null;
    private final com.disappears.android.util.ImageUtil imageUtil = null;
    private final com.disappears.android.util.StringProvider stringProvider = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getImagePath() {
        return null;
    }
    
    @java.lang.Override()
    public void setImagePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.profile.SetUpProfileModel getModel() {
        return null;
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    com.disappears.android.flow.profile.SetUpProfileModel p0) {
    }
    
    private final io.reactivex.Single<retrofit2.Response<java.lang.Void>> getPictureSingle() {
        return null;
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    @java.lang.Override()
    public void loadCurrentProfile() {
    }
    
    private final void updatePicture() {
    }
    
    @java.lang.Override()
    public void updatePicture(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void createPictureFile() {
    }
    
    @java.lang.Override()
    public void updateTakenPicture() {
    }
    
    @java.lang.Override()
    public void updateProfileData(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    private final boolean cleanup() {
        return false;
    }
    
    public SetUpProfilePresenter(@org.jetbrains.annotations.NotNull()
    com.disappears.android.api.VanishApi api, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil loginUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.FileUtil fileUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ImageUtil imageUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.StringProvider stringProvider) {
        super();
    }
}
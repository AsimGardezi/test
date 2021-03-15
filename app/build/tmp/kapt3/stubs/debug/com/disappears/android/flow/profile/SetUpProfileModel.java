package com.disappears.android.flow.profile;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/11/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\f\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/disappears/android/flow/profile/SetUpProfileModel;", "", "isProgressDisplayed", "", "profile", "Lcom/disappears/android/model/response/Profile;", "error", "", "imagePath", "", "photoFileForPicker", "Ljava/io/File;", "isSuccessful", "(ZLcom/disappears/android/model/response/Profile;Ljava/lang/Throwable;Ljava/lang/String;Ljava/io/File;Ljava/lang/Boolean;)V", "getError", "()Ljava/lang/Throwable;", "getImagePath", "()Ljava/lang/String;", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhotoFileForPicker", "()Ljava/io/File;", "getProfile", "()Lcom/disappears/android/model/response/Profile;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLcom/disappears/android/model/response/Profile;Ljava/lang/Throwable;Ljava/lang/String;Ljava/io/File;Ljava/lang/Boolean;)Lcom/disappears/android/flow/profile/SetUpProfileModel;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class SetUpProfileModel {
    private final boolean isProgressDisplayed = false;
    @org.jetbrains.annotations.Nullable()
    private final com.disappears.android.model.response.Profile profile = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imagePath = null;
    @org.jetbrains.annotations.Nullable()
    private final java.io.File photoFileForPicker = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isSuccessful = null;
    
    public final boolean isProgressDisplayed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.response.Profile getProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getPhotoFileForPicker() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSuccessful() {
        return null;
    }
    
    public SetUpProfileModel(boolean isProgressDisplayed, @org.jetbrains.annotations.Nullable()
    com.disappears.android.model.response.Profile profile, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error, @org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, @org.jetbrains.annotations.Nullable()
    java.io.File photoFileForPicker, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSuccessful) {
        super();
    }
    
    public SetUpProfileModel() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.response.Profile component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 12/11/17.
     * https://github.com/KucherenkoIhor
     */
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.flow.profile.SetUpProfileModel copy(boolean isProgressDisplayed, @org.jetbrains.annotations.Nullable()
    com.disappears.android.model.response.Profile profile, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error, @org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, @org.jetbrains.annotations.Nullable()
    java.io.File photoFileForPicker, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSuccessful) {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 12/11/17.
     * https://github.com/KucherenkoIhor
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by ihor_kucherenko on 12/11/17.
     * https://github.com/KucherenkoIhor
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by ihor_kucherenko on 12/11/17.
     * https://github.com/KucherenkoIhor
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}
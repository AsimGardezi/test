package com.disappears.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a*\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a(\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\u000e"}, d2 = {"addFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "backStackTag", "", "fragmentTransaction", "body", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "replaceFragment", "app_debug"})
public final class AppCompatActivityExtensionsKt {
    
    /**
     * Created by ihor_kucherenko on 12/7/17.
     * https://github.com/KucherenkoIhor
     */
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @androidx.annotation.IdRes()
    int containerId, @org.jetbrains.annotations.Nullable()
    java.lang.String backStackTag) {
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @androidx.annotation.IdRes()
    int containerId, @org.jetbrains.annotations.Nullable()
    java.lang.String backStackTag) {
    }
    
    public static final void fragmentTransaction(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$fragmentTransaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, kotlin.Unit> body, @org.jetbrains.annotations.Nullable()
    java.lang.String backStackTag) {
    }
}
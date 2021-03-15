package com.disappears.android.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/disappears/android/dialog/PicturePickerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "callback", "Lcom/disappears/android/dialog/PicturePickerDialog$PickCallback;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "setCallback", "", "cb", "Companion", "PickCallback", "app_debug"})
public final class PicturePickerDialog extends androidx.fragment.app.DialogFragment {
    private com.disappears.android.dialog.PicturePickerDialog.PickCallback callback;
    private static final java.lang.String ARG_TITLE = "title";
    public static final com.disappears.android.dialog.PicturePickerDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.disappears.android.dialog.PicturePickerDialog.PickCallback cb) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public PicturePickerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/dialog/PicturePickerDialog$PickCallback;", "", "pick", "", "take", "app_debug"})
    public static abstract interface PickCallback {
        
        public abstract void pick();
        
        public abstract void take();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/disappears/android/dialog/PicturePickerDialog$Companion;", "", "()V", "ARG_TITLE", "", "newInstance", "Lcom/disappears/android/dialog/PicturePickerDialog;", "title", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.disappears.android.dialog.PicturePickerDialog newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
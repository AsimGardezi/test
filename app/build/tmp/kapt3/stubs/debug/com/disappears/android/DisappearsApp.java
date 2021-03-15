package com.disappears.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/disappears/android/DisappearsApp;", "Landroidx/multidex/MultiDexApplication;", "Lcom/disappears/android/agora/openvcall/WorkerThreadHolder;", "Lcom/disappears/android/agora/openvcall/UserSettingsHolder;", "()V", "mWorkerThread", "Lcom/disappears/android/agora/openvcall/model/WorkerThread;", "deInitWorkerThread", "", "getWorkerThread", "initWorkerThread", "onCreate", "onTerminate", "app_debug"})
public class DisappearsApp extends androidx.multidex.MultiDexApplication implements com.disappears.android.agora.openvcall.WorkerThreadHolder, com.disappears.android.agora.openvcall.UserSettingsHolder {
    private com.disappears.android.agora.openvcall.model.WorkerThread mWorkerThread;
    
    @java.lang.Override()
    public synchronized void initWorkerThread() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public synchronized com.disappears.android.agora.openvcall.model.WorkerThread getWorkerThread() {
        return null;
    }
    
    @java.lang.Override()
    public synchronized void deInitWorkerThread() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    public DisappearsApp() {
        super();
    }
}
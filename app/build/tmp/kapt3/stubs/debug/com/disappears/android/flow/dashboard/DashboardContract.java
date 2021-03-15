package com.disappears.android.flow.dashboard;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/flow/dashboard/DashboardContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class DashboardContract {
    
    public DashboardContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/disappears/android/flow/dashboard/DashboardContract$Presenter;", "Lcom/disappears/android/base/BasePresenter;", "init", "", "app_debug"})
    public static abstract interface Presenter extends com.disappears.android.base.BasePresenter {
        
        public abstract void init();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onResume(com.disappears.android.flow.dashboard.DashboardContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onPause(com.disappears.android.flow.dashboard.DashboardContract.Presenter $this) {
            }
            
            @java.lang.Override()
            public static void onDestroy(com.disappears.android.flow.dashboard.DashboardContract.Presenter $this) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/disappears/android/flow/dashboard/DashboardContract$View;", "Lcom/disappears/android/base/BaseView;", "runMessageService", "", "app_debug"})
    public static abstract interface View extends com.disappears.android.base.BaseView {
        
        public abstract void runMessageService();
    }
}
package com.disappears.android.util.rx;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/5/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/disappears/android/util/rx/PageSelectedObservable;", "Lio/reactivex/Observable;", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "(Landroidx/viewpager/widget/ViewPager;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "app_debug"})
public final class PageSelectedObservable extends io.reactivex.Observable<java.lang.Integer> {
    private final androidx.viewpager.widget.ViewPager viewPager = null;
    
    @java.lang.Override()
    protected void subscribeActual(@org.jetbrains.annotations.Nullable()
    io.reactivex.Observer<? super java.lang.Integer> observer) {
    }
    
    public PageSelectedObservable(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager viewPager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007H\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0018\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/disappears/android/util/rx/PageSelectedObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "view", "Landroidx/viewpager/widget/ViewPager;", "observer", "Lio/reactivex/Observer;", "", "(Landroidx/viewpager/widget/ViewPager;Lio/reactivex/Observer;)V", "onDispose", "", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_debug"})
    static final class Listener extends io.reactivex.android.MainThreadDisposable implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private final androidx.viewpager.widget.ViewPager view = null;
        private final io.reactivex.Observer<? super java.lang.Integer> observer = null;
        
        @java.lang.Override()
        protected void onDispose() {
        }
        
        @java.lang.Override()
        public void onPageScrollStateChanged(int state) {
        }
        
        @java.lang.Override()
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
        
        public Listener(@org.jetbrains.annotations.NotNull()
        androidx.viewpager.widget.ViewPager view, @org.jetbrains.annotations.Nullable()
        io.reactivex.Observer<? super java.lang.Integer> observer) {
            super();
        }
    }
}
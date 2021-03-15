package com.disappears.android.util.rx

import android.os.Looper
import androidx.viewpager.widget.ViewPager
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.MainThreadDisposable

/**
 * Created by ihor_kucherenko on 12/5/17.
 * https://github.com/KucherenkoIhor
 */
class PageSelectedObservable(private val viewPager: ViewPager) : Observable<Int>() {
    override fun subscribeActual(observer: Observer<in Int>?) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            observer?.onError(IllegalStateException(
                    "Expected to be called on the main thread but was " + Thread.currentThread().name))
        } else {
            val listener = Listener(viewPager, observer)
            observer?.onSubscribe(listener)
            viewPager.addOnPageChangeListener(listener)
        }
    }

    private class Listener(
            private val view: ViewPager,
            private val observer: Observer<in Int>?)
        : MainThreadDisposable(), ViewPager.OnPageChangeListener {
        override fun onDispose() {
            view.removeOnPageChangeListener(this)
        }

        override fun onPageScrollStateChanged(state: Int) {}

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

        override fun onPageSelected(position: Int) {
            if (isDisposed.not()) {
                observer?.onNext(position)
            }
        }
    }
}
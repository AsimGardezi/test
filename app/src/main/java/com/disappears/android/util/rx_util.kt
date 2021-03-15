package com.disappears.android.util

import androidx.viewpager.widget.ViewPager
import com.disappears.android.util.rx.PageSelectedObservable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.SingleTransformer

/**
 * Created by AK on 11/20/17.
 */

fun <T : Any> Single<T>.io2ui(): Single<T> {
    @Suppress("UNCHECKED_CAST")
    return this.compose(com.disappears.android.util.RxUtil.UI_IO as SingleTransformer<T, T>)
}

val ViewPager.pageSelectedObservable: Observable<Int>
    get() {
        return PageSelectedObservable(this)
    }
package com.disappears.android.base

import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * Created by ihor_kucherenko on 11/29/17.
 * https://github.com/KucherenkoIhor
 */
open class SimplePresenter<V : BaseView> : BasePresenter {
    var view: V? = null

    fun <T> ioToMain() = ObservableTransformer<T, T> { upstream -> upstream.subscribeOn(io()).observeOn(main()) }

    protected val compositeDisposable = CompositeDisposable()

    fun disposable(block: () -> Disposable) {
        compositeDisposable.add(block())
    }

    fun main() = AndroidSchedulers.mainThread()

    fun io() = Schedulers.io()

    override fun <B : BaseView> attachView(view: B) {
        @Suppress("UNCHECKED_CAST")
        this.view = view as V
    }

    override fun detachView() {
        this.view = null
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.clear()
        }
    }
}
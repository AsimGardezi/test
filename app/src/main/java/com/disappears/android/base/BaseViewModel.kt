package com.disappears.android.base

import androidx.lifecycle.ViewModel
import io.reactivex.ObservableTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

open class BaseViewModel : ViewModel() {
    fun <T> ioToMain() = ObservableTransformer<T, T> { upstream -> upstream.subscribeOn(io()).observeOn(main()) }

    protected val compositeDisposable = CompositeDisposable()

    fun disposable(block: () -> Disposable) {
        compositeDisposable.add(block())
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun main() = AndroidSchedulers.mainThread()

    fun io() = Schedulers.io()
}
package com.disappears.android.base

interface BasePresenter {
    fun onResume() {}

    fun onPause() {}

    fun onDestroy() {}

    fun <V : BaseView> attachView(view: V)

    fun detachView()
}
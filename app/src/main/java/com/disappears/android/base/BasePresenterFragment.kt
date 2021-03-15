package com.disappears.android.base

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.android.ext.android.inject
import kotlin.reflect.KClass

abstract class BasePresenterFragment<P : BasePresenter>(presenterClass: KClass<P>) : BaseFragment(), BaseView {
    private var activityBaseView: BaseView? = null
    protected val p: BasePresenter by inject(presenterClass.qualifiedName!!)

    @Suppress("UNCHECKED_CAST")
    val presenter: P
        get() = p as P

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            onAttachCompat(activity)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            onAttachCompat(context)
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }

    open fun onAttachCompat(context: Context?) {
        if (context is BaseView) {
            activityBaseView = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        presenter.attachView(this)
        return view
    }

    override fun onDestroyView() {
        presenter.detachView()
        super.onDestroyView()
    }

    override fun onDetach() {
        activityBaseView = null
        super.onDetach()
    }
}


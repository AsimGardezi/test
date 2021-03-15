package com.disappears.android.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.inject
import kotlin.reflect.KClass

abstract class BaseActivity<P : BasePresenter>(presenterClass: KClass<P>) : AppCompatActivity(), BaseView {
    protected abstract val layoutResourceId: Int
    private val p: BasePresenter by inject(presenterClass.qualifiedName!!)

    @Suppress("UNCHECKED_CAST")
    val presenter: P
        get() = p as P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResourceId)
        presenter.attachView(this)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }
}

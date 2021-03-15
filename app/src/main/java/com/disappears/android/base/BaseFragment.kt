package com.disappears.android.base

import android.animation.Animator
import android.animation.ObjectAnimator
import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import org.koin.android.ext.android.inject
import kotlin.reflect.KClass

abstract class BaseFragment : Fragment() {
    abstract protected val layoutResourceId: Int
    protected val compositeDisposable = CompositeDisposable()

    override fun onCreateAnimator(transit: Int, enter: Boolean, nextAnim: Int): Animator {
        //todo: change animation
        return if (enter) {
            val animator = ObjectAnimator.ofFloat(view, View.ALPHA, 0f, 1f)
            animator.duration = 500
            animator
        } else {
            val animator = ObjectAnimator.ofFloat(view, View.ALPHA, 1f, 0f)
            animator.duration = 500
            animator
        }
    }

    fun disposable(block: () -> Disposable) {
        compositeDisposable.add(block())
    }

    override fun onDestroy() {
        if (compositeDisposable.isDisposed.not()) {
            compositeDisposable.dispose()
        }
        super.onDestroy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(layoutResourceId, container, false)
        setHasOptionsMenu(true)
        return view
    }
}


package com.disappears.android.dialog

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View
import com.disappears.android.R
import com.disappears.android.base.BaseFullScreenDialogFragment

class BasicProgressDialog : BaseFullScreenDialogFragment() {
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

    override val layoutResourceId = R.layout.dialog_progress
}

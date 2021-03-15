package com.disappears.android.util

import androidx.fragment.app.Fragment
import com.disappears.android.dialog.BasicProgressDialog
import timber.log.Timber

/**
 * Created by ihor_kucherenko on 12/26/17.
 * https://github.com/KucherenkoIhor
 */

const val PROGRESS_DIALOG_TAG = "PROGRESS_DIALOG_TAG"

fun Fragment.isProgressBarEnabled(isEnabled: Boolean) {
    if (!isAdded) return
    if (isEnabled) {
        if (childFragmentManager.findFragmentByTag(PROGRESS_DIALOG_TAG) == null) {
            val dialog = BasicProgressDialog()
            dialog.show(childFragmentManager, PROGRESS_DIALOG_TAG)
        } else {
            Timber.e("$PROGRESS_DIALOG_TAG is already added")
        }
    } else {
        childFragmentManager.findFragmentByTag(PROGRESS_DIALOG_TAG)?.let {
            childFragmentManager.beginTransaction()
                    .remove(it)
                    .commit()
        }
    }
}
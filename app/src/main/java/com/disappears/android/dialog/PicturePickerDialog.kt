package com.disappears.android.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog
import com.disappears.android.R

class PicturePickerDialog : DialogFragment() {
    private var callback: PickCallback? = null

    interface PickCallback {
        fun pick()
        fun take()
    }

    fun setCallback(cb: PickCallback) {
        callback = cb
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getString(ARG_TITLE)
        val builder = AlertDialog.Builder(activity ?: throw Exception("activity == null"))

        builder.setTitle(title)
                .setNegativeButton(R.string.pick) { _, _ -> callback?.pick() }
                .setPositiveButton(R.string.take_a_photo) { _, _ -> callback?.take() }
                .setCancelable(true)

        return builder.create()
    }

    companion object {
        private const val ARG_TITLE = "title"

        fun newInstance(title: String): PicturePickerDialog {
            val dialog = PicturePickerDialog()
            val b = Bundle()
            b.putString(ARG_TITLE, title)
            dialog.arguments = b
            return dialog
        }
    }
}

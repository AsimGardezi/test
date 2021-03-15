package com.disappears.android.custom

import com.google.android.material.textfield.TextInputLayout
import android.text.Editable
import android.text.TextWatcher

class TextChangedWrapper(vararg val layouts: TextInputLayout) : TextWatcher {
    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

    override fun afterTextChanged(s: Editable) {
        for (layout in layouts) {
            layout.error = null
        }
    }
}

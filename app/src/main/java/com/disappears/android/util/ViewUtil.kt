package com.disappears.android.util

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

fun EditText.showKeyboard() {
    this.post({
        this.requestFocus()
        val keyboard = this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        keyboard.showSoftInput(this, 0)
    })
}

fun View.hideKeyboard() {
    val keyboard = this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    keyboard.hideSoftInputFromWindow(this.windowToken, 0)
}

fun RecyclerView.addOnItemInterceptTouchListener(body: (RecyclerView, MotionEvent) -> Unit) {
    this.addOnItemTouchListener(object : RecyclerView.SimpleOnItemTouchListener() {
        override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
            if (rv != null && e != null) {
                body(rv, e)
            }
            return false
        }
    })
}



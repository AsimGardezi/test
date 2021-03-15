package com.disappears.android.flow.signin

/**
 * Created by ihor_kucherenko on 12/12/17.
 * https://github.com/KucherenkoIhor
 */
data class LoginModel(
        val isProgressDisplayed: Boolean = false,
        val error: Exception? = null,
        val isSuccessful: Boolean? = null)
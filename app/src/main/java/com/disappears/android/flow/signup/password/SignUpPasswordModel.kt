package com.disappears.android.flow.signup.password

/**
 * Created by ihor_kucherenko on 12/11/17.
 * https://github.com/KucherenkoIhor
 */
data class SignUpPasswordModel(
        val isProgressDisplayed: Boolean = false,
        val error: Throwable? = null,
        val isSuccessful: Boolean? = null)
package com.disappears.android.flow.signup.username

import com.disappears.android.base.Model

/**
 * Created by ihor_kucherenko on 12/8/17.
 * https://github.com/KucherenkoIhor
 */
data class SignUpUsernameModel(
        val isProgressDisplayed: Boolean = false,
        val isUsernameAlreadyExists: Boolean = false,
        val username: String? = null,
        val isUsernameValid: Boolean = false) : Model
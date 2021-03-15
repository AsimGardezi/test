package com.disappears.android.flow.signup.password

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class SignUpPasswordContract {
    interface Presenter : BasePresenter {
        fun validatePasswords(deviceId: String, username: String, userPassword: String, repeatedPassword: String)
    }

    interface View : BaseView {
        fun render(model: SignUpPasswordModel)
    }
}
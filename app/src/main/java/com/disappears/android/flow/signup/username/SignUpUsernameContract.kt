package com.disappears.android.flow.signup.username

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class SignUpUsernameContract {
    interface Presenter : BasePresenter {
        fun validateUsername(username: String)
    }

    interface View : BaseView {
        fun render(model: SignUpUsernameModel)
    }
}
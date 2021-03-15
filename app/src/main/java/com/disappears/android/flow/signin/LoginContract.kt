package com.disappears.android.flow.signin

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class LoginContract {
    interface Presenter : BasePresenter {
        fun authenticate(deviceId: String, username: String, password: String)
    }

    interface View : BaseView {
        fun render(model: LoginModel)
    }
}
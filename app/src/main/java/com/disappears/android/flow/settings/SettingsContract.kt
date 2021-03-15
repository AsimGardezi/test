package com.disappears.android.flow.settings

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class SettingsContract {
    interface Presenter : BasePresenter {
        fun logout()
    }

    interface View : BaseView {
        fun render(model: SettingsModel)
    }
}
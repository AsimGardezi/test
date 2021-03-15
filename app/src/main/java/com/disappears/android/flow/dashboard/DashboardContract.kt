package com.disappears.android.flow.dashboard

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class DashboardContract {
    interface Presenter : BasePresenter {
        fun init()
    }

    interface View : BaseView {
        fun runMessageService()
    }
}
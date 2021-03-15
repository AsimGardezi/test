package com.disappears.android.flow.chats

import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView
import com.disappears.android.model.Chat

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class ChatsContract {
    interface Presenter : BasePresenter

    interface View : BaseView {
        fun render(result: List<Chat>)
    }
}
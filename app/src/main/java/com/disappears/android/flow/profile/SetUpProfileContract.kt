package com.disappears.android.flow.profile

import android.net.Uri
import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView

/**
 * Created by ihor_kucherenko on 11/30/17.
 * https://github.com/KucherenkoIhor
 */
class SetUpProfileContract {
    interface Presenter : BasePresenter {
        var imagePath: String?
        fun updateTakenPicture()
        fun createPictureFile()
        fun updatePicture(uri: Uri)
        fun updateProfileData(name: String)
        fun loadCurrentProfile()
    }

    interface View : BaseView {
        fun render(model: SetUpProfileModel)
    }
}
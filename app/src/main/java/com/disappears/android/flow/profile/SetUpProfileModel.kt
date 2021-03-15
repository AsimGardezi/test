package com.disappears.android.flow.profile

import com.disappears.android.model.response.Profile
import java.io.File

/**
 * Created by ihor_kucherenko on 12/11/17.
 * https://github.com/KucherenkoIhor
 */
data class SetUpProfileModel(
        val isProgressDisplayed: Boolean = false,
        val profile: Profile? = null,
        val error: Throwable? = null,
        val imagePath: String? = null,
        val photoFileForPicker: File? = null,
        val isSuccessful: Boolean? = null)
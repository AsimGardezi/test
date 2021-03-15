package com.disappears.android.flow.settings

import com.disappears.android.model.response.Profile

/**
 * Created by ihor_kucherenko on 1/16/18.
 * https://github.com/KucherenkoIhor
 */
data class SettingsModel(val isProgressDisplayed: Boolean? = null,
                         val username: String? = null,
                         val profile: Profile? = null,
                         val error: Throwable? = null,
                         val isLogOuted: Boolean? = null)
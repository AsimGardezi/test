package com.disappears.android.model.request

import com.google.gson.annotations.SerializedName

class TokenUpdateRequest(@field:SerializedName("gcmId")
                         val token: String? = null)

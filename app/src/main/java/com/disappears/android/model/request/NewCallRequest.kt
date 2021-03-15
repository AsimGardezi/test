package com.disappears.android.model.request

import com.google.gson.annotations.SerializedName
import java.util.*

class NewCallRequest(@field:SerializedName("channelname")
                     var channelName: String? = null,
                     @field:SerializedName("calltype")
                     var callType: Boolean? = null,
                     @field:SerializedName("callmembers")
                     var callMembers: ArrayList<String>? = null,
                     @field:SerializedName("displayName")
                     var displayName: String? = null)

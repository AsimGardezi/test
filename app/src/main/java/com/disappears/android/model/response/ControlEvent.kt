package com.disappears.android.model.response

import com.google.gson.annotations.SerializedName

class ControlEvent {
    var type: Type? = null
    var action: Action? = null
    var from: String? = null
    var data: String? = null
    var moredata: String? = null

    @SerializedName("id")
    var controlId: Int = 0

    enum class Type {
        @SerializedName("user")
        USER,

        @SerializedName("message")
        MESSAGE
    }

    enum class Action {
        @SerializedName("revoke")
        REVOKE,

        @SerializedName("groupchatstarted")
        GROUP_CHAT_STARTED,

        @SerializedName("invited")
        INVITED,

        @SerializedName("added")
        ADDED,

        @SerializedName("invite")
        INVITE,

        @SerializedName("ignore")
        IGNORE,

        @SerializedName("delete")
        DELETE,

        @SerializedName("friendImage")
        FRIEND_IMAGE,

        @SerializedName("deleteAll")
        DELETE_ALL,

        @SerializedName("shareable")
        SHAREABLE,

        @SerializedName("notshareable")
        NOT_SHAREABLE
    }
}

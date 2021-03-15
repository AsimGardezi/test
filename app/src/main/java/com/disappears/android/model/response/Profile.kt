package com.disappears.android.model.response

import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.io.Serializable

open class Profile(
        @PrimaryKey
        var friendName: String? = null,
        var name: String? = null,
        var flags: Int? = null,
        @SerializedName("imageurl")
        var imageUrl: String? = null,
        var imageVersion: String? = null,
        var imageIv: String? = null,
        @SerializedName("last_seen")
        var lastSeen: String? = null,
        var username: String? = null) : RealmObject(), Serializable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Profile

        if (friendName != other.friendName) return false
        if (name != other.name) return false
        if (flags != other.flags) return false
        if (imageUrl != other.imageUrl) return false
        if (imageVersion != other.imageVersion) return false
        if (imageIv != other.imageIv) return false
        if (lastSeen != other.lastSeen) return false
        if (username != other.username) return false

        return true
    }

    override fun hashCode(): Int {
        var result = friendName?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (flags ?: 0)
        result = 31 * result + (imageUrl?.hashCode() ?: 0)
        result = 31 * result + (imageVersion?.hashCode() ?: 0)
        result = 31 * result + (imageIv?.hashCode() ?: 0)
        result = 31 * result + (lastSeen?.hashCode() ?: 0)
        result = 31 * result + (username?.hashCode() ?: 0)
        return result
    }
}

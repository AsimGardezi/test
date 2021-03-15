package com.disappears.android.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Message : RealmObject(), Serializable {
    fun plainText(): Boolean {
        return Mimetype.TEXT_PLAIN.type == mimeType
    }

    fun imageType(): Boolean {
        return Mimetype.IMAGE.type == mimeType
    }

    enum class Mimetype(val type: String) {
        TEXT_PLAIN("text/plain"),
        IMAGE("image/")
    }

    @PrimaryKey
    var id: String? = null

    @SerializedName("id")
    var numericId: Int? = null
    var data: String? = null

    @SerializedName("datetime")
    var dateTime: Long? = null
    var from: String? = null
    var fromVersion: String? = null
    var iv: String? = null
    var mimeType: String? = null
    var to: String? = null
    var toVersion: String? = null
    var read: Boolean = false
    var resend: Int = 0

    fun updateFrom(m: Message) {
        numericId = m.numericId
        data = m.data
        dateTime = m.dateTime
        from = m.from
        fromVersion = m.fromVersion
        iv = m.iv
        mimeType = m.mimeType
        to = m.to
        toVersion = m.toVersion
    }

    override fun toString(): String {
        val sb = StringBuffer("Message{")
        sb.append("id='").append(id).append('\'')
        sb.append(", numericId=").append(numericId)
        sb.append(", data='").append(data).append('\'')
        sb.append(", dateTime=").append(dateTime)
        sb.append(", from='").append(from).append('\'')
        sb.append(", fromVersion='").append(fromVersion).append('\'')
        sb.append(", iv='").append(iv).append('\'')
        sb.append(", mimeType='").append(mimeType).append('\'')
        sb.append(", to='").append(to).append('\'')
        sb.append(", toVersion='").append(toVersion).append('\'')
        sb.append(", resend=").append(resend)
        sb.append('}')
        return sb.append("\n").toString()
    }
}

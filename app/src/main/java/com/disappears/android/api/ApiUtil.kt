package com.disappears.android.api

import com.disappears.android.model.Message

import okhttp3.MediaType
import okhttp3.ResponseBody
import retrofit2.Response

object ApiUtil {
    val DUMMY_RESPONSE_CODE = 111

    fun emptySuccessResponse(): Response<ResponseBody> {
        return Response.success(ResponseBody.create(MediaType.parse(Message.Mimetype.TEXT_PLAIN.type), ""))
    }

    fun emptyErrorResponse(): Response<ResponseBody> {
        return Response.error(DUMMY_RESPONSE_CODE,
                ResponseBody.create(MediaType.parse(Message.Mimetype.TEXT_PLAIN.type), ""))
    }
}

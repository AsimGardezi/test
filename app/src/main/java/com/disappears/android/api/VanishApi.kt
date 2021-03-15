package com.disappears.android.api

import com.disappears.android.model.Message
import com.disappears.android.model.User
import com.disappears.android.model.request.SetNameRequest
import com.disappears.android.model.request.TokenUpdateRequest
import com.disappears.android.model.response.ConversationResponse
import com.disappears.android.model.response.FriendResponse
import com.disappears.android.model.response.Profile
import com.disappears.android.model.response.PublicKeyData
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface VanishApi {
    @GET("/users/{username}/exists")
    fun userExist(@Path("username") username: String): Single<Response<Boolean>>

    @POST("/users")
    fun signUp(@Body user: User): Single<Response<Void>>

    @POST("/login")
    fun login(@Body user: User): Single<Response<Void>>

    @POST("/logout")
    fun logout(): Single<Response<Void>>

    @GET("/user/{username}")
    fun userProfile(@Path("username") username: String): Single<Response<Profile>>

    @POST("/invite/{friendName}")
    fun inviteFriend(@Path("friendName") friendName: String): Observable<Response<ResponseBody>>

    @GET("/friends")
    fun friends(): Observable<Response<FriendResponse>>

    @Multipart
    @POST("/user/{username}/{version}/setPhoto")
    fun setUserPhoto(
            @Path("username") username: String,
            @Path("version") version: String,
            @Part file: MultipartBody.Part): Single<Response<Void>>

    @POST("/user/{username}/setName")
    fun setUserName(@Path("username") username: String,
                    @Body name: SetNameRequest): Single<Response<Void>>

    @GET("/publickeys/{username}")
    fun getPublicKeys(@Path("username") username: String): Call<PublicKeyData>

    @GET("/publickeys/{username}")
    fun getPublicKeysAsync(@Path("username") username: String): Observable<Response<PublicKeyData>>

    @POST("/optdata/{userControlId}")
    fun getData(@Path("userControlId") controlId: String): Observable<Response<ConversationResponse>>

    @POST("/invites/{friendName}/{action}")
    fun respondToInvite(@Path("friendName") friendName: String,
                        @Path("action") action: String): Observable<Response<Void>>

    @GET("/messagesopt/{username}/before/{messageId}")
    fun getMessages(@Path("username") username: String,
                    @Path("messageId") messageId: String): Call<List<Message>>

    @GET("/messagesopt/{username}/before/{messageId}")
    fun getMessagesAsync(@Path("username") username: String,
                         @Path("messageId") messageId: String): Observable<Response<List<Message>>>

    @GET("/messagedataopt/{username}/{messageId}/{controlId}")
    fun getMessages(@Path("username") username: String,
                    @Path("messageId") messageId: String,
                    @Path("controlId") controlId: String): Call<Response<ResponseBody>>

    @DELETE("/friends/{friendName}")
    fun deleteFriend(@Path("friendName") friendName: String): Observable<Response<ResponseBody>>

    @DELETE("/messagesutai/{username}/{messageId}")
    fun deleteAllMessages(@Path("username") username: String,
                          @Path("messageId") lastMessageId: String): Observable<Response<ResponseBody>>

    @DELETE("/messages/{username}/{messageId}")
    fun deleteMessage(@Path("username") username: String,
                      @Path("messageId") messageId: String): Observable<Response<ResponseBody>>

    @Multipart
    @POST("/images/{usernameVersion}/{friendName}/{friendVersion}")
    fun uploadPhoto(@Path("usernameVersion") currentUserVersion: String,
                    @Path("friendName") friendName: String,
                    @Path("friendVersion") friendVersion: String,
                    @Part file: MultipartBody.Part): Single<Response<ResponseBody>>

    @Multipart
    @POST("/images/{usernameVersion}/{friendName}/{friendVersion}")
    fun uploadPhotoSync(@Path("usernameVersion") currentUserVersion: String,
                        @Path("friendName") friendName: String,
                        @Path("friendVersion") friendVersion: String,
                        @Part file: MultipartBody.Part): Call<ResponseBody>

    @POST("/registergcm")
    fun updatePushNotificationToken(@Body tokenData: TokenUpdateRequest): Completable

    @GET
    fun downloadFile(@Url fileUrl: String): Observable<Response<ResponseBody>>
}
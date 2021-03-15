package com.disappears.android.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J(\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\'J2\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\'J.\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H\'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u001e2\b\b\u0001\u0010 \u001a\u00020!H\'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u001eH\'J(\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010$\u001a\u00020\u0007H\'J(\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u001e2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010&\u001a\u00020\'H\'J2\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u001e2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010)\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020+H\'J\u001e\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u001e2\b\b\u0001\u0010 \u001a\u00020!H\'J\u0012\u0010-\u001a\u00020.2\b\b\u0001\u0010/\u001a\u000200H\'J<\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u001e2\b\b\u0001\u00102\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020+H\'J6\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0001\u00102\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u00103\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020+H\'J\u001e\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\u001e2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00040\u001e2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u00069"}, d2 = {"Lcom/disappears/android/api/VanishApi;", "", "deleteAllMessages", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "username", "", "lastMessageId", "deleteFriend", "friendName", "deleteMessage", "messageId", "downloadFile", "fileUrl", "friends", "Lcom/disappears/android/model/response/FriendResponse;", "getData", "Lcom/disappears/android/model/response/ConversationResponse;", "controlId", "getMessages", "Lretrofit2/Call;", "", "Lcom/disappears/android/model/Message;", "getMessagesAsync", "getPublicKeys", "Lcom/disappears/android/model/response/PublicKeyData;", "getPublicKeysAsync", "inviteFriend", "login", "Lio/reactivex/Single;", "Ljava/lang/Void;", "user", "Lcom/disappears/android/model/User;", "logout", "respondToInvite", "action", "setUserName", "name", "Lcom/disappears/android/model/request/SetNameRequest;", "setUserPhoto", "version", "file", "Lokhttp3/MultipartBody$Part;", "signUp", "updatePushNotificationToken", "Lio/reactivex/Completable;", "tokenData", "Lcom/disappears/android/model/request/TokenUpdateRequest;", "uploadPhoto", "currentUserVersion", "friendVersion", "uploadPhotoSync", "userExist", "", "userProfile", "Lcom/disappears/android/model/response/Profile;", "app_debug"})
public abstract interface VanishApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{username}/exists")
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Boolean>> userExist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/users")
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> signUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.disappears.android.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/login")
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.disappears.android.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/logout")
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> logout();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/user/{username}")
    public abstract io.reactivex.Single<retrofit2.Response<com.disappears.android.model.response.Profile>> userProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/invite/{friendName}")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> inviteFriend(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendName")
    java.lang.String friendName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/friends")
    public abstract io.reactivex.Observable<retrofit2.Response<com.disappears.android.model.response.FriendResponse>> friends();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/user/{username}/{version}/setPhoto")
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> setUserPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "version")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/user/{username}/setName")
    public abstract io.reactivex.Single<retrofit2.Response<java.lang.Void>> setUserName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.disappears.android.model.request.SetNameRequest name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/publickeys/{username}")
    public abstract retrofit2.Call<com.disappears.android.model.response.PublicKeyData> getPublicKeys(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/publickeys/{username}")
    public abstract io.reactivex.Observable<retrofit2.Response<com.disappears.android.model.response.PublicKeyData>> getPublicKeysAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/optdata/{userControlId}")
    public abstract io.reactivex.Observable<retrofit2.Response<com.disappears.android.model.response.ConversationResponse>> getData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "userControlId")
    java.lang.String controlId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/invites/{friendName}/{action}")
    public abstract io.reactivex.Observable<retrofit2.Response<java.lang.Void>> respondToInvite(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendName")
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "action")
    java.lang.String action);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/messagesopt/{username}/before/{messageId}")
    public abstract retrofit2.Call<java.util.List<com.disappears.android.model.Message>> getMessages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/messagesopt/{username}/before/{messageId}")
    public abstract io.reactivex.Observable<retrofit2.Response<java.util.List<com.disappears.android.model.Message>>> getMessagesAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/messagedataopt/{username}/{messageId}/{controlId}")
    public abstract retrofit2.Call<retrofit2.Response<okhttp3.ResponseBody>> getMessages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "messageId")
    java.lang.String messageId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "controlId")
    java.lang.String controlId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/friends/{friendName}")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> deleteFriend(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendName")
    java.lang.String friendName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/messagesutai/{username}/{messageId}")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> deleteAllMessages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "messageId")
    java.lang.String lastMessageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/messages/{username}/{messageId}")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> deleteMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "messageId")
    java.lang.String messageId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/images/{usernameVersion}/{friendName}/{friendVersion}")
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Single<retrofit2.Response<okhttp3.ResponseBody>> uploadPhoto(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameVersion")
    java.lang.String currentUserVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendName")
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendVersion")
    java.lang.String friendVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/images/{usernameVersion}/{friendName}/{friendVersion}")
    @retrofit2.http.Multipart()
    public abstract retrofit2.Call<okhttp3.ResponseBody> uploadPhotoSync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "usernameVersion")
    java.lang.String currentUserVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendName")
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "friendVersion")
    java.lang.String friendVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part file);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/registergcm")
    public abstract io.reactivex.Completable updatePushNotificationToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.disappears.android.model.request.TokenUpdateRequest tokenData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> downloadFile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String fileUrl);
}
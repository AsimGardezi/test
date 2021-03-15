package com.disappears.android.flow.signin

import android.util.Log
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.request.TokenUpdateRequest
import com.disappears.android.util.SharedPrefUtil
import com.google.firebase.iid.FirebaseInstanceId
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kotlin.properties.Delegates

class LoginPresenter constructor(
        private val api: VanishApi,
        private val encryption: EncryptionService,
        private val loginUtil: SharedPrefUtil
) : SimplePresenter<LoginContract.View>(), LoginContract.Presenter {
    private val initialModel = LoginModel()

    var model by Delegates.observable(initialModel) { _, _, newValue ->
        view?.render(newValue)
    }

    override fun authenticate(deviceId: String, username: String, password: String) {
        model = initialModel.copy(isProgressDisplayed = true)
        handleApiCall(deviceId, username, password)
    }

    private fun handleApiCall(deviceId: String, username: String, password: String) {
        val user = encryption.buildUserObjectForLogin(deviceId, username, password)
        if (user == null) {
            model = initialModel.copy(isProgressDisplayed = false, error = Exception("user = null"))
            return
        }
        val token = FirebaseInstanceId.getInstance().token

        disposable {
            api.login(user)
                    .doOnSuccess {
                        if (token.isNullOrEmpty().not()) {
                            api.updatePushNotificationToken(TokenUpdateRequest(token))
                        } else {
                            Log.e(TAG, "gcm token: " + token)
                        }
                    }
                    .subscribeOn(Schedulers.io())
                    .doAfterTerminate { model = initialModel.copy(isProgressDisplayed = false) }
                    .flatMap { response ->
                        if (response.isSuccessful) {
                            loginUtil.currentLoggedUser = username
                            response.headers().values(Constants.Api.COOKIE_HEADER).forEach {
                                if (it.startsWith("connect.sid")) {
                                    encryption.updateIdentity(username, it)
                                }
                            }
                            api.userProfile(username).doOnSuccess { loginUtil.currentUserProfile = it.body() }
                        } else {
                            Single.just(response)
                        }
                    }
                    .subscribe { response ->
                        model = if (response.isSuccessful) {
                            initialModel.copy(isSuccessful = true)
                        } else {
                            model.copy(error = Exception(response.errorBody().toString()))
                        }
                    }
        }
    }

    companion object {
        private val TAG = LoginPresenter::class.java.name
    }
}

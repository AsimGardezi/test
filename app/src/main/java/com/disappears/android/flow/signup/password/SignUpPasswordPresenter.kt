package com.disappears.android.flow.signup.password

import com.crashlytics.android.Crashlytics
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.encryption.CryptoUtil
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Identity
import com.disappears.android.model.User
import com.disappears.android.model.request.TokenUpdateRequest
import com.disappears.android.util.SharedPrefUtil
import com.disappears.android.util.d
import com.google.firebase.iid.FirebaseInstanceId
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kotlin.properties.Delegates

class SignUpPasswordPresenter constructor(
        private val api: VanishApi,
        private val encryption: EncryptionService,
        private val loginUtil: SharedPrefUtil
) : SimplePresenter<SignUpPasswordContract.View>(), SignUpPasswordContract.Presenter {
    private val initialModel = SignUpPasswordModel()

    var model by Delegates.observable(initialModel) { _, _, newValue ->
        view?.render(newValue)
    }

    override fun validatePasswords(deviceId: String, username: String, userPassword: String, repeatedPassword: String) {
        val usernameLowerCase = username.toLowerCase()
        model = initialModel.copy(isProgressDisplayed = true)
        val saltAndKey = encryption.deriveKeyFromPassword(userPassword)
        val user = User(
                username = usernameLowerCase,
                password = saltAndKey[1])
        val ecdh = encryption.generateECDHKeyPair()
        val ecdsa = encryption.generateECDSAKeyPair()
        user.dhPub = CryptoUtil.getKeyEncodedPem(ecdh.public.encoded)
        user.dsaPub = CryptoUtil.getKeyEncodedPem(ecdsa.public.encoded)
        user.version = Constants.Api.API_VERSION
        user.platform = Constants.Api.PLATFORM
        user.authSig = encryption.generateAuthSignature(
                user.username,
                user.password,
                ecdsa.private)
        user.gcmId = FirebaseInstanceId.getInstance().token

        disposable {
            api.signUp(user)
                    .subscribeOn(Schedulers.io())
                    .flatMap { response ->
                        if (response.isSuccessful) {
                            encryption.createKeyStore(user.username)
                            val identity = Identity()
                            identity.username = user.username
                            identity.password = userPassword
                            identity.salt = saltAndKey[0]
                            identity.dhPub = CryptoUtil.encodeBase64(ecdh.public.encoded)
                            identity.dsaPub = CryptoUtil.encodeBase64(ecdsa.public.encoded)
                            identity.dhPriv = CryptoUtil.encodeBase64(ecdh.private.encoded)
                            identity.dsaPriv = CryptoUtil.encodeBase64(ecdsa.private.encoded)
                            response.headers().values(Constants.Api.COOKIE_HEADER).forEach {
                                if (it.startsWith("connect.sid")) {
                                    identity.cookie = it
                                }
                            }
                            identity.version = Constants.Api.INITIAL_IDENTITY_VERSION
                            encryption.storeIdentity(identity)
                            encryption.buildUserObjectForLogin(deviceId, username, userPassword)?.let {
                                api.login(it)
                            }
                        } else {
                            val exception = Exception(response.errorBody()?.string() ?: "")
                            Single.error(exception)
                        }

                    }
                    .doAfterTerminate { model = model.copy(isProgressDisplayed = false) }
                    .doOnError { model = model.copy(error = it) }
                    .subscribe({ voidResponse ->
                        if (voidResponse.isSuccessful) {
                            loginUtil.currentLoggedUser = usernameLowerCase
                            model = model.copy(isSuccessful = true)
                        } else {
                            model = model.copy(isSuccessful = false)
                        }
                        updateFirebaseToken()
                    }, {
                        Crashlytics.logException(it)
                        it.printStackTrace()
                    })
        }
    }

    private fun updateFirebaseToken() {
        val token = FirebaseInstanceId.getInstance().token
        if (token.isNullOrEmpty().not()) {
            disposable {
                api.updatePushNotificationToken(TokenUpdateRequest(token))
                        .subscribeOn(Schedulers.io())
                        .subscribe { d("Token updated") }
            }
        }
    }

    companion object {
        private val TAG = SignUpPasswordPresenter::class.java.name
    }
}

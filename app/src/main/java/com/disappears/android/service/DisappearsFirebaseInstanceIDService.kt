package com.disappears.android.service

import android.util.Log
import com.disappears.android.api.VanishApi
import com.disappears.android.model.request.TokenUpdateRequest
import com.disappears.android.util.SharedPrefUtil
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import io.reactivex.schedulers.Schedulers
import org.koin.android.ext.android.inject

class DisappearsFirebaseInstanceIDService : FirebaseInstanceIdService() {
    protected val api: VanishApi by inject()
    protected val prefUtil: SharedPrefUtil by inject()

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.e(">>>>>", "refreshedToken" + refreshedToken)
        if (prefUtil.currentLoggedUser != null && refreshedToken.isNullOrEmpty().not()) {
            Log.e(">>>>>", "refreshedToken" + refreshedToken)
            api.updatePushNotificationToken(TokenUpdateRequest(refreshedToken))
                    .subscribeOn(Schedulers.io())
                    .subscribe { Log.e(">>>>>", "Token Updated") }
        }
    }
}

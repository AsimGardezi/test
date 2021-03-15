package com.disappears.android.flow.dashboard

import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.util.SharedPrefUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DashboardPresenter constructor(
        private val api: VanishApi,
        private val encryption: EncryptionService,
        private val prefUtil: SharedPrefUtil
) : SimplePresenter<DashboardContract.View>(), DashboardContract.Presenter {
    override fun init() {
        prefUtil.currentLoggedUser?.let {
            encryption.loadKeyStore(it)
        }
        prefUtil.currentUserProfile?.let {
            loadProfile()
        }
        view?.runMessageService()
    }

    private fun loadProfile() {
        prefUtil.currentLoggedUser?.let {
            api.userProfile(it)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({ friendResponse ->
                        if (friendResponse.isSuccessful) {
                            prefUtil.currentUserProfile = friendResponse.body()
                        }
                    }) { throwable -> throwable.printStackTrace() }
        }
    }
}

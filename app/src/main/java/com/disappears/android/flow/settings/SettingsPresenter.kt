package com.disappears.android.flow.settings

import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.data.ChatDataSource
import com.disappears.android.data.FriendDataSource
import com.disappears.android.util.SharedPrefUtil
import com.disappears.android.util.io2ui
import kotlin.properties.Delegates

class SettingsPresenter constructor(
        private val api: VanishApi,
        private val friendData: FriendDataSource,
        private val chatData: ChatDataSource,
        private val loginUtil: SharedPrefUtil
) : SimplePresenter<SettingsContract.View>(), SettingsContract.Presenter {
    private val initialModel = SettingsModel()

    var model by Delegates.observable(initialModel) { _, _, newModel ->
        view?.render(newModel)
    }

    override fun onResume() {
        loadProfile()
        loginUtil.currentLoggedUser?.let { model = initialModel.copy(username = it) }
    }

    override fun logout() {
        api.logout()
                .io2ui()
                .toCompletable()
                .doOnSubscribe { compositeDisposable.add(it) }
                .doOnSubscribe { model = initialModel.copy(isProgressDisplayed = true) }
                .doAfterTerminate(this::cleanUp)
                .doOnError { model = initialModel.copy(error = it) }
                .subscribe()
    }

    private fun cleanUp() {
        loginUtil.logOut()
        chatData.deleteData()
        friendData.deleteData()
        model = initialModel.copy(isLogOuted = true, isProgressDisplayed = false)
    }

    private fun loadProfile() {
        loginUtil.currentUserProfile?.let { model = initialModel.copy(profile = it) }
    }
}

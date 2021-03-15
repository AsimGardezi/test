package com.disappears.android.flow.signup.username

import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.properties.Delegates

class SignUpUsernamePresenter constructor(
        private val api: VanishApi
) : SimplePresenter<SignUpUsernameContract.View>(), SignUpUsernameContract.Presenter {
    private val initialModel = SignUpUsernameModel()

    var model by Delegates.observable(initialModel) { _, _, newValue ->
        view?.render(newValue)
    }

    override fun validateUsername(username: String) {
        disposable {
            api.userExist(username.toLowerCase())
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .doOnSubscribe { model = initialModel.copy(isProgressDisplayed = true) }
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doAfterTerminate { model = initialModel.copy(isProgressDisplayed = false) }
                    .subscribe { response ->
                        if (response.isSuccessful) {
                            val result = response.body()
                            model = if (result == true) {
                                initialModel.copy(isUsernameAlreadyExists = true, username = username)
                            } else {
                                initialModel.copy(isUsernameValid = true, username = username)
                            }
                        }
                    }
        }
    }
}

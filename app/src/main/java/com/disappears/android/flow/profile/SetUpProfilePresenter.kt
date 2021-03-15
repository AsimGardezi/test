package com.disappears.android.flow.profile

import android.net.Uri
import com.crashlytics.android.Crashlytics
import com.disappears.android.api.Constants
import com.disappears.android.api.VanishApi
import com.disappears.android.base.SimplePresenter
import com.disappears.android.model.request.SetNameRequest
import com.disappears.android.util.FileUtil
import com.disappears.android.util.ImageUtil
import com.disappears.android.util.SharedPrefUtil
import com.disappears.android.util.StringProvider
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import timber.log.Timber
import java.io.File
import java.io.IOException
import kotlin.properties.Delegates

class SetUpProfilePresenter constructor(
        private val api: VanishApi,
        private val loginUtil: SharedPrefUtil,
        private val fileUtil: FileUtil,
        private val imageUtil: ImageUtil,
        private val stringProvider: StringProvider
) : SimplePresenter<SetUpProfileContract.View>(), SetUpProfileContract.Presenter {
    override var imagePath: String? = null
    private var resizedFile: String? = null
    private val initialModel = SetUpProfileModel()

    var model by Delegates.observable(initialModel) { _, _, newModel ->
        view?.render(newModel)
    }

    private val pictureSingle: Single<Response<Void>>
        get() {
            return if (imagePath.isNullOrEmpty().not()) {
                resizedFile = imageUtil.resizeImageFile(imagePath, 200, 200)
                val fileToUpload = RequestBody.create(MultipartBody.FORM, File(resizedFile))
                val body = MultipartBody.Part.createFormData("data", Constants.Api.UPLOAD_PICTURE_NAME, fileToUpload)
                api.setUserPhoto(loginUtil.currentLoggedUser
                        ?: throw Exception("loggedUser == null"), Constants.Api.API_VERSION, body)
            } else {
                throw Exception("imagePath.isNullOrEmpty")
            }
        }


    override fun detachView() {
        super.detachView()
        cleanup()
    }

    override fun loadCurrentProfile() {
        loginUtil.currentUserProfile?.let {
            model = model.copy(profile = it)
            it.username?.let {
                loginUtil.isFirstTime(it)
            }
        } ?: Timber.e("current profile is empty")

        loginUtil.currentLoggedUser?.let {
            if (loginUtil.isFirstTime(it)) {
                loginUtil.markFirstLogin(it)
            }
        }
    }

    private fun updatePicture() {
        imagePath?.let { model = initialModel.copy(imagePath = it) }
    }

    override fun updatePicture(uri: Uri) {
        imagePath = fileUtil.getPath(uri)
        updatePicture()
    }

    override fun createPictureFile() {
        imageUtil.createPictureFile()?.let {
            imagePath = it.absolutePath
            model = initialModel.copy(photoFileForPicker = it)
        }
    }

    override fun updateTakenPicture() {
        imagePath?.let {
            model = initialModel.copy(imagePath = Uri.fromFile(File(imagePath)).toString())
        }
    }

    override fun updateProfileData(name: String) {
        val user = loginUtil.currentLoggedUser
        if (user == null) {
            model = initialModel.copy(error = Exception(stringProvider.getCannotLoadCurrentUser()))
            return
        }

        disposable {
            api.setUserName(user, SetNameRequest(name))
                    .doOnSubscribe { model = initialModel.copy(isProgressDisplayed = true) }
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .subscribeOn(Schedulers.io())
                    .flatMap {
                        if (it.isSuccessful && imagePath.isNullOrEmpty().not()) {
                            pictureSingle
                        } else {
                            Single.just(it)
                        }
                    }
                    .flatMap {
                        if (it.isSuccessful) {
                            api.userProfile(user)
                                    .doOnSuccess { response ->
                                        if (response.isSuccessful) {
                                            loginUtil.currentUserProfile = response.body()
                                            cleanup()
                                        }
                                    }
                        } else {
                            Single.just(it)
                        }
                    }
                    .doAfterTerminate { model = model.copy(isProgressDisplayed = false) }
                    .doOnError { model = model.copy(error = IOException()) }
                    .subscribe({ profileResponse ->
                        model = model.copy(isSuccessful = profileResponse.isSuccessful)

                        loginUtil.currentLoggedUser?.let {
                            if (loginUtil.isFirstTime(it)) {
                                loginUtil.markFirstLogin(it)
                            }
                        }
                    }, {
                        it.printStackTrace()
                        Crashlytics.logException(it)
                    })
        }
    }

    private fun cleanup(): Boolean {
        return if (resizedFile.isNullOrEmpty().not() && imagePath != resizedFile) {
            File(resizedFile).delete()
        } else false
    }
}

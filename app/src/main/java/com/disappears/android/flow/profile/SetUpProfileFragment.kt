package com.disappears.android.flow.profile

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.*
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.annotation.MainThread
import androidx.annotation.RequiresApi
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.dialog.BasicProgressDialog
import com.disappears.android.dialog.PicturePickerDialog
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.flow.fingerprint.ThumbVerification
import com.disappears.android.flow.identity_backup.IdentityBackup
import com.disappears.android.util.ImageUtil
import com.disappears.android.util.PermissionUtil
import com.disappears.android.util.loadImage
import com.google.android.material.snackbar.Snackbar
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_setup_profile.*
import java.io.IOException
import java.util.concurrent.TimeUnit

class SetUpProfileFragment : BasePresenterFragment<SetUpProfileContract.Presenter>(SetUpProfileContract.Presenter::class),
        SetUpProfileContract.View,
        TextView.OnEditorActionListener {
    override val layoutResourceId = R.layout.fragment_setup_profile
    var rxPermission: RxPermissions? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadCurrentProfile()

        tilName.onReady = { observable ->
            observable
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .debounce { Observable.timer(if (it) 500L else 0L, TimeUnit.MILLISECONDS) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        etName.setOnEditorActionListener(if (it) this else null)
                        setHasOptionsMenu(it)
                    }
        }

        ivProfilePicture.setOnClickListener(this::onProfilePictureClickListener)
        tvChangeProfilePicture.setOnClickListener(this::onProfilePictureClickListener)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rxPermission = activity?.let { RxPermissions(it) }
    }

    private fun onProfilePictureClickListener(view: View) {
        rxPermission?.let {
            it.request(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA).subscribe({ result ->
                if (result) {
                    startPhotoFlow()
                }
            }, { it.printStackTrace() })
        }
    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        if (actionId == EditorInfo.IME_ACTION_DONE) {
            presenter.updateProfileData(etName?.text.toString())
            return true
        }
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_setup_profile, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_forward -> {
                presenter.updateProfileData(etName?.text.toString())
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun startPhotoFlow() {
        val df = PicturePickerDialog.newInstance(getString(R.string.add_profile_picture))
        df.setCallback(object : PicturePickerDialog.PickCallback {
            override fun pick() {
                pickPhoto()
            }

            override fun take() {
                takePhoto()
            }
        })
        df.show(childFragmentManager, DIALOG_TAG)
    }

    private fun pickPhoto() {
        ImageUtil.pickPhoto(this, PICK_IMAGE_REQUEST)
    }

    private fun takePhoto() {
        presenter.createPictureFile()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            presenter.updateTakenPicture()

        } else if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            data?.data?.let { presenter.updatePicture(it) }
        } else {
            presenter.imagePath = null
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (PermissionUtil.allGranted(grantResults)) {
            ivProfilePicture?.postDelayed({ startPhotoFlow() }, 200)
        }
    }

    override fun render(model: SetUpProfileModel) {
        Handler(Looper.getMainLooper()).post {
            handleProgress(model)
            handleProfile(model)
            handleError(model)
            handleProfilePicturePath(model)
            handlePhotoFileForPicker(model)
            handleSuccess(model)
        }
    }

    private fun navigateToThumbVerificaiton() {
        activity?.let {
            ThumbVerification.start(it, true)
            it.finish()
        }
    }

    private fun navigateToIdentityBackup() {
        firstTime = firstTime != true
        activity?.let {
            IdentityBackup.start(it, true)
            it.finish()
        }
    }

    @MainThread
    private fun handleSuccess(model: SetUpProfileModel) {
        model.isSuccessful?.let { isSuccessful ->
            if (isSuccessful) {
                if (firstTime && Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context!!.packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
                    navigateToThumbVerificaiton()
                } else if (firstTime) {
                    navigateToIdentityBackup()
                } else {
                    DashboardActivity.alreadyLogin = true
                    DashboardActivity.backStackFromProfile = true
                    this.context?.let { DashboardActivity.start(it) }
                }
            } else {
                view?.let {
                    Snackbar.make(it, getString(R.string.generic_network_error), Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }

    @MainThread
    private fun handlePhotoFileForPicker(model: SetUpProfileModel) {
        model.photoFileForPicker?.let {
            ImageUtil.startCamera(this, it, REQUEST_IMAGE_CAPTURE)
        }
    }

    @MainThread
    private fun handleProfilePicturePath(model: SetUpProfileModel) {
        model.imagePath?.let { ivProfilePicture.loadImage(it) }
    }

    @MainThread
    private fun handleError(model: SetUpProfileModel) {
        model.error?.let { exception ->
            when (exception) {
                is IOException -> {
                    view?.let {
                        Snackbar.make(it, getString(R.string.generic_network_error), Snackbar.LENGTH_SHORT).show()
                    }
                }
                else -> {
                    view?.let {
                        Snackbar.make(it, exception.localizedMessage, Snackbar.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    @MainThread
    private fun handleProfile(model: SetUpProfileModel) {
        val profile = model.profile ?: return
        etName.setText(profile.name)
        profile.name?.length?.let { etName.setSelection(it) }
        profile.imageUrl?.let { ivProfilePicture.loadImage(it) }
    }

    @MainThread
    private fun handleProgress(model: SetUpProfileModel) {
        if (model.isProgressDisplayed) {
            if (childFragmentManager.findFragmentByTag(TAG_DIALOG) == null) {
                val dialog = BasicProgressDialog()
                dialog.show(childFragmentManager, TAG_DIALOG)
            } else {
                Log.e(TAG_DIALOG, "already added")
            }
        } else {
            childFragmentManager.findFragmentByTag(TAG_DIALOG)?.let {
                if (it.isAdded) {
                    childFragmentManager.beginTransaction()
                            .remove(it)
                            .commitAllowingStateLoss()
                }
            }
        }
    }

    companion object {
        private val REQUEST_IMAGE_CAPTURE = 10
        private val REQUEST_STORAGE = 20
        private val PICK_IMAGE_REQUEST = 30
        const val DIALOG_TAG = "dialog"
        private val TAG_DIALOG = DIALOG_TAG
        var firstTime: Boolean = false
        fun newInstance() = SetUpProfileFragment()

    }
}

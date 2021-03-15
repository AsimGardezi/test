package com.disappears.android.flow.signin

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.TextView
import androidx.annotation.MainThread
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.flow.dashboard.DashboardActivity
import com.google.android.material.snackbar.Snackbar
import com.kucherenko.RxValidationTextInputLayout
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_login.*
import java.net.ConnectException
import java.net.UnknownHostException
import java.util.concurrent.TimeUnit

class LoginFragment : BasePresenterFragment<LoginContract.Presenter>(LoginContract.Presenter::class), LoginContract.View {
    override val layoutResourceId = R.layout.fragment_login
    lateinit var rxPermissions: RxPermissions
    lateinit var txtTos: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtTos = getView()!!.findViewById<View>(R.id.txtTos) as TextView
        txtTos.setOnClickListener {
            val webpage = Uri.parse(getString(R.string.terms_of_service))
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(activity?.packageManager!!) != null) {
                startActivity(intent)
            }
        }

        authenticate.setOnClickListener {
            rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE)?.subscribe { result ->
                presenter.authenticate(
                        deviceId,
                        username.text.toString(),
                        password.text.toString())
            }
        }

        RxValidationTextInputLayout.combineOnReady(tilUserName, tilPassword) { observable ->
            observable
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .debounce { Observable.timer(if (it) 500L else 0L, TimeUnit.MILLISECONDS) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe { authenticate.isEnabled = it }
        }

    }

    override fun render(model: LoginModel) {
        activity?.runOnUiThread {
            handleProgress(model)
            handleError(model)
            handleSuccessful(model)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.let { rxPermissions = RxPermissions(it) }
    }

    @MainThread
    private fun handleSuccessful(model: LoginModel) {
        model.isSuccessful?.let {
            if (it) {
                DashboardActivity.alreadyLogin = true
                activity?.let { DashboardActivity.start(it) }
                activity?.finish()
            }
        }
    }

    @MainThread
    private fun handleError(model: LoginModel) {
        model.error?.let {
            it.printStackTrace()

            val errorText = when (it) {
                is UnknownHostException -> {
                    R.string.network_error
                }
                is ConnectException -> {
                    R.string.network_error
                }
                else -> {
                    R.string.wrong_usr_or_pwd
                }
            }
            view?.let { Snackbar.make(it, errorText, Snackbar.LENGTH_LONG).show() }
        }
    }

    @MainThread
    private fun handleProgress(model: LoginModel) {
        if (model.isProgressDisplayed) {
            authenticate.isEnabled = false
            progress.visibility = View.VISIBLE
        } else {
            authenticate.isEnabled = true
            progress.visibility = View.GONE
        }
    }

    private val deviceId: String
        @SuppressLint("HardwareIds")
        get() = Settings.Secure.getString(context?.contentResolver, Settings.Secure.ANDROID_ID)

    companion object {
        fun newInstance() = LoginFragment()
    }
}

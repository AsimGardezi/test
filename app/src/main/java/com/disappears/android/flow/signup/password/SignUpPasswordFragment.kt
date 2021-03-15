package com.disappears.android.flow.signup.password

import android.Manifest
import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.Settings
import androidx.annotation.MainThread
import android.view.*
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.flow.profile.SetUpProfileActivity
import com.disappears.android.flow.signin.LoginActivity
import com.disappears.android.util.hideKeyboard
import com.disappears.android.util.showKeyboard
import com.kucherenko.RxValidationTextInputLayout
import com.tbruyelle.rxpermissions2.RxPermissions
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_signup_password.*
import java.util.concurrent.TimeUnit

class SignUpPasswordFragment : BasePresenterFragment<SignUpPasswordContract.Presenter>(SignUpPasswordContract.Presenter::class),
        SignUpPasswordContract.View,
        TextView.OnEditorActionListener {
    private val username by lazy { arguments?.getString(ARG_NAME) }

    private var actionForwardVisible: Boolean? = null
    override val layoutResourceId = R.layout.fragment_signup_password
    private lateinit var rxPermissions: RxPermissions

    private val deviceId: String
        @SuppressLint("HardwareIds")
        get() = Settings.Secure.getString(context?.contentResolver, Settings.Secure.ANDROID_ID)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rxPermissions = RxPermissions(activity!!)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(false)
        subscribeValidator()
        etPassword.showKeyboard()
    }

    private fun subscribeValidator() {
        RxValidationTextInputLayout.combineOnReady(tilPassword, tilRepeatPassword) { observable ->
            compositeDisposable.add(observable
                    .debounce { Observable.timer(if (it) 500L else 0L, TimeUnit.MILLISECONDS) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        setHasOptionsMenu(it)
                        etRepeatPassword.setOnEditorActionListener(if (it) this else null)
                    })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater?.inflate(R.menu.menu_signup_password, menu)
        actionForwardVisible?.let {
            menu?.findItem(R.id.action_forward)?.setVisible(it)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.action_forward -> {
                invokeValidation()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        if (actionId == EditorInfo.IME_ACTION_DONE) {
            invokeValidation()
            v?.isFocusable = false
            return true
        }
        return false
    }

    private fun invokeValidation() {
        username?.let {
            rxPermissions.request(Manifest.permission.WRITE_EXTERNAL_STORAGE).subscribe { result ->
                presenter?.validatePasswords(
                        deviceId,
                        it,
                        etPassword.text.toString(),
                        etRepeatPassword.text.toString())
            }
        }
        etPassword.hideKeyboard()
    }

    override fun render(model: SignUpPasswordModel) {
        activity?.runOnUiThread {
            handleProgress(model)
            handleError(model)
            handleSuccessful(model)
        }
    }

    @MainThread
    private fun handleSuccessful(model: SignUpPasswordModel) {
        model.isSuccessful?.let { isSuccessful ->
            if (isSuccessful) {
                navigateToDashboard()
            } else {
                navigateToLogin()
            }
        }
    }

    @MainThread
    private fun handleError(model: SignUpPasswordModel) {
        model.error?.let {}
    }

    @MainThread
    private fun handleProgress(model: SignUpPasswordModel) {
        if (model.isProgressDisplayed) {
            actionForwardVisible = false
            progressBar?.visibility = View.VISIBLE
        } else {
            progressBar?.visibility = View.GONE
            actionForwardVisible = true
        }
        activity?.invalidateOptionsMenu()
    }

    private fun navigateToLogin() {
        activity?.let {
            LoginActivity.start(it, true)
            it.finish()
        }
    }

    private fun navigateToDashboard() {
        activity?.let {
            SetUpProfileActivity.start(it, true)
            it.finish()
        }
    }

    companion object {
        val TAG: String = SignUpPasswordFragment::class.java.simpleName
        private const val ARG_NAME = "name"

        fun newInstance(name: String): SignUpPasswordFragment {
            val f = SignUpPasswordFragment()
            val args = Bundle()
            args.putString(ARG_NAME, name)
            f.arguments = args
            return f
        }
    }
}

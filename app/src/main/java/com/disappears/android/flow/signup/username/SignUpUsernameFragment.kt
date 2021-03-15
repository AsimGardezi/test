package com.disappears.android.flow.signup.username

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.annotation.MainThread
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.flow.signup.NavigationCallback
import com.disappears.android.util.hideKeyboard
import com.disappears.android.util.showKeyboard
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.fragment_signup_username.*
import java.util.concurrent.TimeUnit

class SignUpUsernameFragment : BasePresenterFragment<SignUpUsernameContract.Presenter>(SignUpUsernameContract.Presenter::class),
        SignUpUsernameContract.View,
        TextView.OnEditorActionListener {
    private var actionForward: MenuItem? = null
    override val layoutResourceId = R.layout.fragment_signup_username
    private var navigationCallback: NavigationCallback? = null
    lateinit var txtTos: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtTos = getView()!!.findViewById<View>(R.id.txtTos) as TextView

        Log.e("Test", "push")

        txtTos.setOnClickListener {
            val webpage = Uri.parse(getString(R.string.terms_of_service))
            val intent = Intent(Intent.ACTION_VIEW, webpage)
            if (intent.resolveActivity(activity?.packageManager!!) != null) {
                startActivity(intent)
            }
        }
        setHasOptionsMenu(false)

        tilUserName.onReady = { observable ->
            observable
                    .doOnSubscribe { compositeDisposable.add(it) }
                    .debounce { Observable.timer(if (it) 500L else 0L, TimeUnit.MILLISECONDS) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe {
                        etUserName.setOnEditorActionListener(if (it) this else null)
                        setHasOptionsMenu(it)
                    }
        }
        etUserName.showKeyboard()
    }

    override fun onAttachCompat(context: Context?) {
        super.onAttachCompat(context)
        this.navigationCallback = context as? NavigationCallback
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_signup_username, menu)
        actionForward = menu.findItem(R.id.action_forward)
        super.onCreateOptionsMenu(menu, inflater)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_forward -> {
                onProceedClicked()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
        if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_NEXT) {
            onProceedClicked()
            return true
        }
        return false
    }

    private fun onProceedClicked() {
        etUserName.hideKeyboard()
        presenter.validateUsername(etUserName.text.toString())
    }

    override fun render(model: SignUpUsernameModel) {
        activity?.runOnUiThread {
            handleProgress(model.isProgressDisplayed)
            handleUseNameAlreadyExists(model)
            handleUsernameValid(model)
        }
    }

    @MainThread
    private fun handleUsernameValid(model: SignUpUsernameModel) {
        if (model.isUsernameValid) {
            model.username?.let { navigationCallback?.navigateToSignUpPassword(it) }
        }
    }

    @MainThread
    private fun handleUseNameAlreadyExists(model: SignUpUsernameModel) {
        if (model.isUsernameAlreadyExists) {
            etUserName.showKeyboard()
            model.username?.let { tilUserName.triggerError(getString(R.string.username_exists, it)) }
        }
    }

    @MainThread
    private fun handleProgress(isProgressDisplayed: Boolean) {
        if (isProgressDisplayed) {
            actionForward?.isEnabled = false
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
            actionForward?.isEnabled = true
        }
    }

    override fun onDetach() {
        navigationCallback = null
        super.onDetach()
    }

    companion object {
        fun newInstance(): SignUpUsernameFragment = SignUpUsernameFragment()
    }
}

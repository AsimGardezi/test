package com.disappears.android.base

import android.R
import android.app.Dialog
import android.content.Context
import android.content.SharedPreferences
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.Switch
import android.widget.Toast
import androidx.biometric.BiometricConstants
import androidx.biometric.BiometricPrompt
import androidx.fragment.app.FragmentActivity
import com.disappears.android.flow.dashboard.DashboardActivity
import com.disappears.android.flow.onboarding.OnBoardingActivity
import java.util.concurrent.Executor

class ThumbId(var context: FragmentActivity) {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var toggleSwitch: Switch
    var dialog: Dialog? = null
    var verificationStatus: String = ""
    private var biometricPrompt: BiometricPrompt? = null
    private val executor: Executor = MainThreadExecutor()
    private val callback: BiometricPrompt.AuthenticationCallback = object : BiometricPrompt.AuthenticationCallback() {
        override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
            super.onAuthenticationError(errorCode, errString)
            if (errorCode == BiometricConstants.ERROR_NEGATIVE_BUTTON && biometricPrompt != null) biometricPrompt!!.cancelAuthentication()
            toast(errString.toString())
            dialog?.dismiss()
            verificationFailed()
        }

        override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
            super.onAuthenticationSucceeded(result)
            toast("Authentication succeed")
            dialog?.dismiss()
            verificationStatus()
            enabledChecked()
        }

        override fun onAuthenticationFailed() {
            super.onAuthenticationFailed()
            toast("Application did not recognize the placed finger print. Please try again!")
        }
    }

    fun ThumbVerification(activity: String) {
        sharedPreferences = context.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        dialog?.dismiss()
        dialog = null

        dialog = Dialog(context, R.style.Theme_Black)
        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val window: Window = dialog!!.window!!
        val wlp: WindowManager.LayoutParams = window.attributes
        wlp.gravity = Gravity.CENTER
        window.attributes = wlp
        dialog?.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog?.show()

        verificationStatus = activity
        if (biometricPrompt == null) biometricPrompt = BiometricPrompt(context, executor, callback)
        val promptInfo = buildBiometricPrompt()
        biometricPrompt!!.authenticate(promptInfo)
    }

    private fun buildBiometricPrompt(): BiometricPrompt.PromptInfo {
        return BiometricPrompt.PromptInfo.Builder()
                .setTitle("Login")
                .setSubtitle("Login into your account")
                .setDescription("Touch your finger on the fingerprint sensor to authorise your account.")
                .setNegativeButtonText("Cancel")
                .build()
    }

    private fun toast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun enabledChecked() {
        if (verificationStatus == "enableCheckedSettings") {
            editor.putBoolean("allowTouchId", true)
            editor.commit()
        }
    }

    fun verificationStatus() {
        if (verificationStatus == "OnBoardingActivity") {
            DashboardActivity.start(context, true)
        }
        if (verificationStatus == "DashboardActivity") {
            DashboardActivity.alreadyLogin = true
        }
        if (verificationStatus == "enableCheckedSettings") {
            toggleSwitch.setChecked(true)
            toast("Touch ID Enabled")
        }
    }

    fun verificationFailed() {
        if (verificationStatus == "OnBoardingActivity") {
        } else if (verificationStatus == "enableCheckedSettings") {
            toggleSwitch.setChecked(false)
        } else {
            OnBoardingActivity.start(context, true)
        }
    }
}


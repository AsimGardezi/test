package com.disappears.android.flow.settings

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.disappears.android.R
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.base.ThumbId
import com.disappears.android.dialog.BasicProgressDialog
import com.disappears.android.flow.help.HelpActivity
import com.disappears.android.flow.identity_backup.IdentityBackup
import com.disappears.android.flow.onboarding.OnBoardingActivity
import com.disappears.android.flow.profile.SetUpProfileActivity
import com.disappears.android.model.response.Profile
import com.disappears.android.service.MessageService
import com.disappears.android.util.loadImage
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : BasePresenterFragment<SettingsContract.Presenter>(SettingsContract.Presenter::class),
        SettingsContract.View {
    override val layoutResourceId = R.layout.fragment_settings
    var thumbId: ThumbId? = null
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        thumbId = ThumbId(context as FragmentActivity)
        sharedPreferences = activity!!.getSharedPreferences("enableDisableTouchId", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
        initClickListeners()
    }

    private fun initClickListeners() {
        tvLogout.setOnClickListener(this::onLogoutClick)
        tvEditProfile.setOnClickListener(this::onEditProfileClick)
        tvAbout.setOnClickListener(this::onAboutCLick)
        tvInviteFriends.setOnClickListener(this::onInviteFriendsClick)
        tvFeedback.setOnClickListener(this::onFeedbackClick)
        tvHelp.setOnClickListener(this::onHelpCLick)
        tvBackup.setOnClickListener(this::onBackupAccountClick)

        if (sharedPreferences.getBoolean("allowTouchId", true)) {
            enableDisableSwitch.setChecked(true)
        } else {
            enableDisableSwitch.setChecked(false)
        }

        enableDisableSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                if (enableDisableSwitch.isPressed) {
                    thumbId!!.ThumbVerification("enableCheckedSettings")
                    thumbId!!.toggleSwitch = enableDisableSwitch
                }
            } else {
                if (enableDisableSwitch.isPressed) {
                    callTouchVerificationDialog()
                }
            }
        }
    }

    private fun callTouchVerificationDialog() {
        AlertDialog.Builder(context)
                .setIcon(R.drawable.ic_launcher)
                .setTitle("Confirm Action")
                .setMessage("Are you sure to disable Touch ID")
                .setCancelable(false)
                .setPositiveButton("Yes", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        editor.putBoolean("allowTouchId", false)
                        editor.commit()
                        Toast.makeText(context, "Touch ID Disabled", Toast.LENGTH_SHORT).show()
                    }
                })
                .setNegativeButton("No", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        enableDisableSwitch.setChecked(true)
                    }
                }).show()
    }

    private fun onHelpCLick(view: View) {
        val i = Intent(view.context, HelpActivity::class.java)
        view.context.startActivity(i)
    }

    private fun onBackupAccountClick(view: View) {
        val i = Intent(view.context, IdentityBackup::class.java)
        view.context.startActivity(i)
    }

    private fun onFeedbackClick(view: View) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:feedback@disappears.com")
        intent.putExtra(Intent.EXTRA_EMAIL, getString(R.string.feedback_mail))
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.feedback_subject))
        if (intent.resolveActivity(activity?.packageManager!!) != null) {
            startActivity(intent)
        }
    }

    private fun onInviteFriendsClick(view: View) {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Vanish Messenger now at https://vanish.com/dl") // Simple text and URL to share
        sendIntent.type = "text/plain"
        startActivity(sendIntent)
    }

    private fun onAboutCLick(view: View) {
        val webpage = Uri.parse(getString(R.string.about_webpage))
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if (intent.resolveActivity(activity?.packageManager!!) != null) {
            startActivity(intent)
        }
    }

    private fun onLogoutClick(view: View) {
        presenter.logout()
    }

    private fun onEditProfileClick(view: View) {
        SetUpProfileActivity.start(view.context, false)
    }

    override fun render(model: SettingsModel) {
        model.isProgressDisplayed?.let { setProgressEnabled(it) }
        model.error?.let { }
        model.isLogOuted?.let { navigateToOnBoarding() }
        model.profile?.let { renderProfile(it) }
        model.username?.let { displayUsername(it) }
    }

    private fun setProgressEnabled(isEnabled: Boolean) {
        if (isEnabled) {
            fragmentManager?.let { BasicProgressDialog().show(it, TAG_DIALOG) }
        } else {
            fragmentManager?.beginTransaction()
                    ?.remove(fragmentManager?.findFragmentByTag(TAG_DIALOG)!!)
                    ?.commitAllowingStateLoss()
        }
    }

    private fun navigateToOnBoarding() {
        activity?.stopService(Intent(activity, MessageService::class.java))
        activity?.let { OnBoardingActivity.start(it, false) }
        activity?.finish()
    }

    private fun renderProfile(profile: Profile) {
        profile.imageUrl?.let { ivProfilePicture.loadImage(it) }
        tvDisplayName.text = profile.name
    }

    private fun displayUsername(currentUserName: String) {
        tvUsername.text = getString(R.string.username, currentUserName)
    }

    companion object {
        fun newInstance() = SettingsFragment()
        private const val TAG_DIALOG = "TAG_DIALOG"
    }
}

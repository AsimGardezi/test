package com.disappears.android.flow.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.disappears.android.R
import com.disappears.android.flow.signup.SignUpActivity
import kotlinx.android.synthetic.main.fragment_onboarding.*

class OnBoardingFragment : Fragment() {
    private val layoutResourceId = R.layout.fragment_onboarding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResourceId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = arguments?.getString(ARG_TITLE)
        subtitle.text = arguments?.getString(ARG_SUBTITLE)

        getStarted.setOnClickListener {
            SignUpActivity.start(it.context)
        }

        when {
            arguments?.getString(ARG_TITLE) == "VANISH" -> imageOnBoarding.setImageResource(R.drawable.vanishlogo)
            arguments?.getString(ARG_TITLE) == "SECURE" -> imageOnBoarding.setImageResource(R.drawable.secure_onboarding)
            arguments?.getString(ARG_TITLE) == "ERASE MESSAGES" -> imageOnBoarding.setImageResource(R.drawable.erasemsg_onboarding)
            arguments?.getString(ARG_TITLE) == "AUDIO & VIDEO CALLS" -> imageOnBoarding.setImageResource(R.drawable.call_onboarding)
        }
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_SUBTITLE = "subtitle"

        fun newInstance(title: String, subtitle: String): OnBoardingFragment {
            val fragment = OnBoardingFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_SUBTITLE, subtitle)
            fragment.arguments = args
            return fragment
        }
    }
}

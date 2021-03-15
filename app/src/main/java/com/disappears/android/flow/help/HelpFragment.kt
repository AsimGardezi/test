package com.disappears.android.flow.help

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.disappears.android.R
import kotlinx.android.synthetic.main.fragment_onboarding.*

class HelpFragment : Fragment() {
    private val layoutResourceId = R.layout.fragment_help

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutResourceId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = arguments?.getString(ARG_TITLE)
        subtitle.text = arguments?.getString(ARG_SUBTITLE)
        when {
            arguments?.getString(ARG_TITLE) == "ADD A CONTACT" -> imageOnBoarding.setImageResource(R.drawable.how_to_contacts)
            arguments?.getString(ARG_TITLE) == "ERASE A MESSAGE" -> imageOnBoarding.setImageResource(R.drawable.how_to_message)
            arguments?.getString(ARG_TITLE) == "VANISH A CONTACT" -> imageOnBoarding.setImageResource(R.drawable.how_to_vanish)
            arguments?.getString(ARG_TITLE) == "AUDIO & VIDEO CALLS" -> imageOnBoarding.setImageResource(R.drawable.how_to_call)
        }
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val ARG_SUBTITLE = "subtitle"

        fun newInstance(title: String, subtitle: String): HelpFragment {
            val fragment = HelpFragment()
            val args = Bundle()
            args.putString(ARG_TITLE, title)
            args.putString(ARG_SUBTITLE, subtitle)
            fragment.arguments = args
            return fragment
        }
    }
}

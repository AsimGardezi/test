package com.disappears.android.flow.contacts.pick

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import com.disappears.android.R
import com.disappears.android.adapter.ContactsAdapter
import com.disappears.android.agora.openvcall.ui.ChatActivity
import com.disappears.android.base.BasePresenterFragment
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.model.ContactFeedItem
import com.disappears.android.util.PermissionUtil
import com.disappears.android.util.SharedPrefUtil
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_create_chat.*
import kotlinx.android.synthetic.main.fragment_contacts.*
import org.koin.android.ext.android.inject

class PickContactFragment : BasePresenterFragment<PickContactContract.Presenter>(PickContactContract.Presenter::class), PickContactContract.View {
    override val layoutResourceId = R.layout.fragment_pick_contact

    @Suppress("ProtectedInFinal")
    protected val loginUtil: SharedPrefUtil by inject()
    private val socketIO: SocketIOConnection by inject()
    private var adapter: ContactsAdapter? = null
    private var menu: Menu? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        activity?.newAudioCall?.setOnClickListener { view -> handleCallClick(view) }
        activity?.newVideoCall?.setOnClickListener { view -> handleCallClick(view) }

        activity?.let {
            adapter = ContactsAdapter(it, loginUtil, ArrayList(), true, null)
        }

        contacts.adapter = adapter

        adapter?.onSelectionToggle = {
            if (it == 0) {
                menu?.findItem(R.id.action_new_audio_call)?.isVisible = false
                menu?.findItem(R.id.action_new_video_call)?.isVisible = false
            }
        }

        if (PermissionUtil.requestPermissions(this, READ_CONTACTS_REQUEST, Manifest.permission.READ_CONTACTS)) {
            presenter.loadContacts()
        }
    }

    private fun handleCallClick(view: View) {
        if (adapter?.getSelectedItems()?.isEmpty() == true) {
            return
        }

        when (view.id) {
            R.id.newAudioCall -> {
                menu?.findItem(R.id.action_new_audio_call)?.isVisible = true
                menu?.findItem(R.id.action_new_video_call)?.isVisible = false
            }
            R.id.newVideoCall -> {
                menu?.findItem(R.id.action_new_audio_call)?.isVisible = false
                menu?.findItem(R.id.action_new_video_call)?.isVisible = true
            }
            else -> {
                TODO()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_create_chat, menu)
        this.menu = menu
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_new_audio_call -> {
                presenter.startAudioCall(adapter?.getSelectedItems() as MutableList<ContactFeedItem>)
                return true
            }
            R.id.action_new_video_call -> {
                presenter.startVideoCall(adapter?.getSelectedItems() as MutableList<ContactFeedItem>)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onInviteRefusedByUser(username: String?) {
        activity?.let {
            startActivity(ChatActivity.newEndIntent(it))
        }
    }

    override fun renderResult(items: ArrayList<ContactFeedItem>) {
        adapter?.update(items)
    }

    private var chatIntent: Intent? = null

    override fun goToCallScreen(channelId: String, callMembers: ArrayList<String>, video: Boolean) {
        activity?.let {
            loginUtil.currentLoggedUser?.let { callMembers.add(it) }
            chatIntent = ChatActivity.newIntent(
                    it,
                    channelId,
                    callMembers,
                    video,
                    false)

            if (PermissionUtil.requestPermissions(it, CALL_PERMISSIONS, *ChatActivity.CALL_PERMISSIONS)) {
                startActivityForResult(chatIntent, ChatActivity.FINISH_REQUEST_CODE)
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == CALL_PERMISSIONS && PermissionUtil.allGranted(grantResults)) {
            startActivityForResult(chatIntent, ChatActivity.FINISH_REQUEST_CODE)
        } else {
            view?.let {
                Snackbar.make(it,
                        R.string.call_permissions_is_denied,
                        Snackbar.LENGTH_LONG).show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && requestCode == ChatActivity.FINISH_REQUEST_CODE) {
            if (data?.getBooleanExtra(ChatActivity.HANG_UP, false) == true) {
                val channelId = data.getStringExtra("channelId")
                val callMembers = data.getStringArrayListExtra("names")
                val video = data.getBooleanExtra("isVideoEnabled", false)
                if (!channelId.isNullOrEmpty()) {
                    socketIO.sendCallTerminateMessage(channelId, video, callMembers)
                }
                presenter.leaveChannel()
                presenter.cancelInvite()
            } else {
                view?.let {
                    Snackbar.make(
                            it,
                            R.string.call_was_ended_by_another_user,
                            Snackbar.LENGTH_LONG).show()
                }
                presenter.leaveChannel()
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    companion object {
        private const val CALL_PERMISSIONS = 101
        private const val READ_CONTACTS_REQUEST = 10
        fun newInstance() = PickContactFragment()
    }
}

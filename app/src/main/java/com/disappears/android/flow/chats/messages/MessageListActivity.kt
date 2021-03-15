package com.disappears.android.flow.chats.messages

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.disappears.android.R
import com.disappears.android.agora.openvcall.ui.ChatActivity
import com.disappears.android.base.BaseActivity
import com.disappears.android.chat.SocketIOConnection
import com.disappears.android.dialog.PicturePickerDialog
import com.disappears.android.flow.chats.MessagesList
import com.disappears.android.flow.photo.FullScreenPhotoPreviewActivity
import com.disappears.android.model.adapter.AdapterMessage
import com.disappears.android.model.response.Friend
import com.disappears.android.service.MessageService
import com.disappears.android.util.*
import com.google.android.material.snackbar.Snackbar
import com.stfalcon.chatkit.commons.models.IMessage
import com.stfalcon.chatkit.messages.MessagesListAdapter
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.activity_message_list.*
import org.koin.android.ext.android.inject
import java.io.File

class MessageListActivity : BaseActivity<MessageListContract.Presenter>(MessageListContract.Presenter::class),
        MessageListContract.View,
        MessagesList {
    override fun startMessageService() {
        MessageService::class.startService(this)
    }

    override val layoutResourceId = R.layout.activity_message_list
    private var adapter: MessagesListAdapter<IMessage>? = null
    private var lastTouchedItem: View? = null
    protected val loginUtil: SharedPrefUtil by inject()
    private val socketIO: SocketIOConnection by inject()
    private var rxPermissions: RxPermissions? = null

    override val friendName: String? by lazy { intent.getStringExtra(EXTRA_FRIEND_NAME) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rxPermissions = RxPermissions(this)
        window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
        init()
    }

    private fun init() {
        initUi()
        setupAdapter()
        friendName?.let { presenter.loadFriend(it) }
        presenter.loadMessages()
    }

    private fun initUi() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbarTitle.text = presenter.friendName
        toolbar.navigationIcon?.setColorFilter(
                ContextCompat.getColor(this, R.color.chat_toolbar_subtitle),
                PorterDuff.Mode.SRC_ATOP)
        input.setInputListener(this::messageInputListener)
        input.setAttachmentsListener(this::onSetAttachmentsListener)
        profilePicture.setOnClickListener(this::onPictureClick)
    }

    private fun messageInputListener(text: CharSequence): Boolean {
        presenter.sendMessage(text.toString())
        return true
    }

    private fun onSetAttachmentsListener() {
        rxPermissions?.let {
            it.request(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA).subscribe({ result ->
                if (result) {
                    startPhotoFlow()
                }
            }, { it.printStackTrace() })
        }
    }

    private fun startPhotoFlow() {
        PicturePickerDialog.newInstance(getString(R.string.send_photo)).apply {
            setCallback(object : PicturePickerDialog.PickCallback {
                override fun pick() {
                    ImageUtil.pickPhoto(this@MessageListActivity, PICK_IMAGE_REQUEST)
                }

                override fun take() {
                    presenter.createPictureFile()
                }
            })
        }.show(supportFragmentManager, DIALOG_TAG)
    }

    private fun setupAdapter() {
        adapter = MessagesListAdapter(presenter.loggedUsername, EncryptedImageLoader())
        adapter?.setOnMessageLongClickListener(this::onMessageLongClickListener)
        adapter?.setOnMessageClickListener(this::onMessageClickListener)
        messagesList.setAdapter(adapter)
        messagesList.addOnItemInterceptTouchListener(this::onItemInterceptTouchListener)
    }

    private fun onItemInterceptTouchListener(recyclerView: RecyclerView, motionEvent: MotionEvent) {
        lastTouchedItem = recyclerView.findChildViewUnder(motionEvent.x, motionEvent.y)
    }

    private fun displayPopup(message: IMessage, anchor: View) {
        val menu = PopupMenu(messagesList.context, anchor)
        menu.inflate(R.menu.menu_message)
        menu.setOnMenuItemClickListener {
            presenter.deleteMessage(message)
            true
        }
        menu.show()
    }

    private fun onMessageLongClickListener(message: IMessage?) {
        message ?: return
        if (!presenter.isPlaceholderMessage(message.id)) {
            val anchor = lastTouchedItem?.findViewById<View?>(R.id.messageText) ?: lastTouchedItem
            ?: return
            displayPopup(message, anchor)
        }
    }

    private fun onMessageClickListener(message: IMessage?) {
        val adapterMessage = message as AdapterMessage
        adapterMessage.imageUrl?.let {
            FullScreenPhotoPreviewActivity.start(this, it)
            overridePendingTransition(R.anim.slide_in_bottom, 0)
        }
    }

    private fun displayPopup(anchor: View?, menuId: Int) {
        PopupMenu(messagesList.context, anchor ?: return).also {
            it.inflate(menuId)
            it.setOnMenuItemClickListener(this::onPopupMenuItemClick)
        }.show()
    }

    private fun onPopupMenuItemClick(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.deleteAll -> presenter.deleteAllMessages()
            R.id.disappearUser -> presenter.disappearUser()
            R.id.call -> presenter.initCall(false)
            R.id.videoCall -> presenter.initCall(true)
            R.id.mute -> presenter.toggleMuteState(true)
            R.id.unmute -> presenter.toggleMuteState(false)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun render(model: MessageListModel) {
        model.initialMessages?.let {
            adapter?.clear()
            adapter?.notifyDataSetChanged()
            adapter?.addToEnd(it, true)
        }
        model.newMessage?.let {
            adapter?.addToStart(it, true)
        }
        model.error?.let {
            Snackbar.make(findViewById(Window.ID_ANDROID_CONTENT), it.localizedMessage, Snackbar.LENGTH_LONG).show()
        }
        model.deletedMessageId?.let {
            adapter?.deleteById(it)
        }
    }

    override fun errorBuildingMessage() {
        Snackbar.make(messagesList, R.string.failure_message_build, Snackbar.LENGTH_SHORT).show()
    }

    override fun errorDeletingMessage() {
        Snackbar.make(messagesList, R.string.failure_message_deletion, Snackbar.LENGTH_SHORT).show()
    }

    override fun displayFriendData(displayName: String?, picture: String?, lastSeen: String?) {
        toolbarTitle.text = displayName
        toolbarSubtitle.text = lastSeen
        if (picture?.isNotEmpty() == true) {
            profilePicture.loadImage(picture)
        }
    }

    override fun deletedAllMessages() {
        finish()
    }

    override fun showFriendDisappearedMessagesInfo() {
        Snackbar.make(
                findViewById(android.R.id.content),
                getString(R.string.friend_deleted_message, presenter.friendName),
                Snackbar.LENGTH_SHORT).show()
    }

    override fun takePhoto(file: File) {
        ImageUtil.startCamera(this, file, REQUEST_IMAGE_CAPTURE)
    }

    private var chatIntent: Intent? = null

    override fun goToCall(channelId: String, friendName: String, isVideoEnabled: Boolean) {
        chatIntent = ChatActivity.newIntent(
                this,
                channelId,
                listOf(friendName, loginUtil.currentLoggedUser),
                isVideoEnabled,
                false)

        if (PermissionUtil.requestPermissions(
                        this,
                        CALL_PERMISSIONS,
                        *ChatActivity.CALL_PERMISSIONS)
                && chatIntent != null) {
            startActivityForResult(chatIntent, ChatActivity.FINISH_REQUEST_CODE)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (requestCode == CALL_PERMISSIONS && PermissionUtil.allGranted(grantResults) && chatIntent != null) {
            startActivityForResult(chatIntent, ChatActivity.FINISH_REQUEST_CODE)
        } else {
            Snackbar.make(
                    findViewById(Window.ID_ANDROID_CONTENT),
                    R.string.call_permissions_is_denied,
                    Snackbar.LENGTH_LONG).show()
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onInviteRefusedByPeer(username: String?) {
        startActivity(ChatActivity.newEndIntent(this))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            handleOnActivityResultOk(requestCode, data)
        } else if (resultCode == Activity.RESULT_CANCELED) {
            onChatActivityFinishResult(data)
        } else {
            Snackbar.make(
                    findViewById(android.R.id.content),
                    R.string.generic_network_error,
                    Snackbar.LENGTH_LONG).show()
        }
    }

    private fun handleOnActivityResultOk(requestCode: Int, data: Intent?) {
        when (requestCode) {
            ChatActivity.FINISH_REQUEST_CODE -> onChatActivityFinishResult(data)
            REQUEST_IMAGE_CAPTURE -> presenter.sendTakenFile()
            PICK_IMAGE_REQUEST -> data?.data?.let { presenter.sendFile(it) }
            else -> Snackbar.make(
                    findViewById(android.R.id.content),
                    R.string.generic_network_error,
                    Snackbar.LENGTH_LONG).show()
        }
    }

    private fun onChatActivityFinishResult(intent: Intent?) {
        when {
            intent?.getBooleanExtra(ChatActivity.HANG_UP, false) == true -> {
                val channelId = intent.getStringExtra("channelId")
                val callMembers = intent.getStringArrayListExtra("names")
                val video = intent.getBooleanExtra("isVideoEnabled", false)
                if (!channelId.isNullOrEmpty()) {
                    socketIO.sendCallTerminateMessage(channelId, video, callMembers)
                }
                presenter.leaveChannel()
            }
            else -> {
                Snackbar.make(
                        findViewById<View>(android.R.id.content),
                        R.string.call_was_ended_by_another_user,
                        Snackbar.LENGTH_LONG).show()
                presenter.leaveChannel()
            }
        }
    }

    override fun showErrorPickImage() {
        Snackbar.make(findViewById(Window.ID_ANDROID_CONTENT),
                R.string.cannnot_load_image, Snackbar.LENGTH_LONG).show()
    }

    private fun onPictureClick(view: View) {
        displayPopup(view,
                if (presenter.isCurrentFriendMuted() == true) R.menu.menu_profile_muted else R.menu.menu_profile_unmuted)
    }

    companion object {
        private const val CALL_PERMISSIONS = 101
        private const val EXTRA_FRIEND_NAME = "friend_name"
        private const val REQUEST_IMAGE_CAPTURE = 10
        private const val REQUEST_STORAGE = 20
        private const val PICK_IMAGE_REQUEST = 30
        private const val DIALOG_TAG = "dialog"

        fun start(c: Context, friend: Friend) {
            c.startActivity(get(c, friend))
        }

        operator fun get(c: Context, friend: Friend): Intent {
            val i = Intent(c, MessageListActivity::class.java)
            i.putExtra(EXTRA_FRIEND_NAME, friend.name)
            return i
        }

        operator fun get(c: Context, friendName: String): Intent {
            val i = Intent(c, MessageListActivity::class.java)
            i.putExtra(EXTRA_FRIEND_NAME, friendName)
            return i
        }
    }
}

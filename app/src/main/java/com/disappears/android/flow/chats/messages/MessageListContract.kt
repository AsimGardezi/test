package com.disappears.android.flow.chats.messages

import android.net.Uri
import com.disappears.android.base.BasePresenter
import com.disappears.android.base.BaseView
import com.stfalcon.chatkit.commons.models.IMessage
import java.io.File

/**
 * Created by ihor_kucherenko on 12/1/17.
 * https://github.com/KucherenkoIhor
 */
class MessageListContract {
    interface Presenter : BasePresenter {
        var friendName: String
        val loggedUsername: String?

        fun loadMessages()
        fun sendMessage(data: String)
        fun isCurrentFriendMuted(): Boolean
        fun deleteMessage(message: IMessage)
        fun loadFriend(friendName: String)
        fun deleteAllMessages()
        fun disappearUser()
        fun createPictureFile()
        fun sendFile(uri: Uri?)
        fun initCall(useVideo: Boolean)
        fun toggleMuteState(muted: Boolean)
        fun markMessagesAsRead()
        fun sendTakenFile()
        fun leaveChannel()
        fun isPlaceholderMessage(id: String?): Boolean
    }

    interface View : BaseView {
        fun render(model: MessageListModel)
        fun errorBuildingMessage()
        fun errorDeletingMessage()
        fun displayFriendData(displayName: String?, picture: String?, lastSeen: String?)
        fun deletedAllMessages()
        fun showFriendDisappearedMessagesInfo()
        fun takePhoto(file: File)
        fun goToCall(channelId: String, friendName: String, isVideoEnabled: Boolean = true)
        fun onInviteRefusedByPeer(username: String?)
        fun showErrorPickImage()
        fun startMessageService()
    }
}
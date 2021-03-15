package com.disappears.android.agora.signalling

import io.agora.AgoraAPIOnlySignal
import io.agora.IAgoraAPI
import java.lang.IllegalStateException

/**
 * Created by ihor_kucherenko on 12/19/17.
 * https://github.com/KucherenkoIhor
 */

abstract class Signalling: IAgoraAPI.ICallBack {

    var username: String? = null

    var currentChannelUserCount = 0

    var onLoginSuccess: ((Int) -> Unit)? = null

    var onInviteRefusedByPeer: ((username: String?) -> Unit)? = null

    var onInviteEndByPeer: ((username: String?) -> Unit)? = null

    var onInviteReceivedByPeer: ((username: String?) -> Unit)? = null

    var onUsersListChangedListener: ((uids: IntArray?) -> Unit)? = null

    var onInviteReceived: ((channel: String?, username: String?) -> Unit)? = null

    protected abstract val agoraApi: AgoraAPIOnlySignal

    protected var uid: Int = 0

    var currentChannel: String? = null

    protected var iAmInvitedByThisUsername: String? = null

    open fun login(username: String) {
        this.username = username
    }

    fun logout() {
        agoraApi.logout()
    }

    override fun onInviteReceivedByPeer(channel: String?, username: String?, uid: Int) {
       onInviteReceivedByPeer?.invoke(username)
    }

    override fun onChannelUserList(usernames: Array<out String>?, uids: IntArray?) {
        onUsersListChangedListener?.invoke(uids)
        currentChannelUserCount = usernames?.size ?: 0
    }

    override fun onLoginSuccess(uid: Int, fd: Int) {
        this.uid = uid
        onLoginSuccess?.invoke(uid)
    }

    override fun onInviteEndByPeer(channel: String?, username: String?, uid: Int, extra: String?) {
        onInviteEndByPeer?.invoke(username)
    }

    override fun onInviteRefusedByPeer(channel: String?, username: String?, uid: Int, extra: String?) {
        onInviteRefusedByPeer?.invoke(username)
    }

    override fun onInviteReceived(channel: String?, username: String?, uid: Int, extra: String?) {
        iAmInvitedByThisUsername = username
        onInviteReceived?.invoke(channel, username)
    }

    @Throws(IllegalStateException::class)
    fun joinChannel(channel: String) {
        if (currentChannel != null) {
            leftChannel()
        }
        this.currentChannel = channel
        agoraApi.channelJoin(channel)
    }

    fun inviteUserToCall(channel: String, username: String) {
        currentChannel = channel
        agoraApi.channelInviteUser(currentChannel, username, 0)
    }

    fun rejectInviteToCall(username: String) {
        agoraApi.channelInviteEnd(currentChannel, username, 0)
    }

    @Throws(IllegalStateException::class)
    fun leftChannel() {
        if (currentChannel != null) {
            agoraApi.channelLeave(currentChannel)
            currentChannel = null
        } else {
            throwError("You are not joined to a channel ")
        }
    }

    @Throws(IllegalStateException::class)
    fun acceptIncomingCall(channel: String) {
        if (username == null) {
            throwError("You are not logged In")
        } else {
            currentChannel = channel
            agoraApi.channelInviteAccept(currentChannel, username, uid)
        }
    }

    @Throws(IllegalStateException::class)
    fun rejectIncomingCall(channel: String) {
        if (iAmInvitedByThisUsername == null) {
            throwError("You are not invited")
        } else {
            agoraApi.channelInviteRefuse(channel, iAmInvitedByThisUsername, 0, null)
            iAmInvitedByThisUsername = null
        }
    }

    @Throws(IllegalStateException::class)
    protected abstract fun throwError(message: String)

    companion object {
        private val TAG = Signalling::class.java.simpleName
    }

}

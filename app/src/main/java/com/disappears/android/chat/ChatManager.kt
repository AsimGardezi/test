package com.disappears.android.chat

import com.disappears.android.api.Constants
import com.disappears.android.data.impl.FriendRealmDataSource
import com.disappears.android.encryption.EncryptionService
import com.disappears.android.model.Identity
import com.disappears.android.model.Message
import com.disappears.android.util.*
import io.reactivex.Observable
import java.io.File
import java.util.*
import java.util.concurrent.Callable

class ChatManager constructor(private val encryption: EncryptionService,
                              private val fileUtil: FileUtil,
                              private val prefUtil: SharedPrefUtil,
                              private val imageUtil: ImageUtil) {

    @Throws(Exception::class)
    fun buildEncryptedImage(friendName: String, src: File): Observable<Pair<Message, File>> {
        return Observable.fromCallable(Callable<Pair<Message, File>> {
            val friendDataSource = FriendRealmDataSource()
            DLog.d(TAG,
                    String.format(Locale.getDefault(),
                            "Sending image message: %s to %s with mime type %s",
                            src.absolutePath,
                            friendName,
                            Message.Mimetype.IMAGE))
            val currentLoggedUser = prefUtil.currentLoggedUser
                    ?: throw Exception("buildEncryptedImage")
            encryption.loadKeyStore(currentLoggedUser)
            val userIdentity = encryption.getIndentity(currentLoggedUser)
            val messageToSend = buildMessage(friendName, currentLoggedUser, userIdentity, Message.Mimetype.IMAGE)
            messageToSend.data = Constants.Api.DATA_PREFIX + messageToSend.iv

            var dst: File? = fileUtil.createFileInAppData(messageToSend.iv?.replace("/", "")
                    ?: throw Exception("iv == null"))
            val resized = File(imageUtil.resizeImageFile(src.absolutePath, 1280, 720))
            val friendKeys = friendDataSource.getKeyData(friendName)
            dst = encryption.encryptFile(
                    resized,
                    dst ?: throw Exception("buildEncryptedImage"),
                    currentLoggedUser,
                    userIdentity.version ?: throw Exception("buildEncryptedImage"),
                    friendName,
                    friendKeys ?: throw Exception("buildEncryptedImage"),
                    messageToSend.iv ?: throw Exception("buildEncryptedImage"))
            Pair(messageToSend, dst)
        })
    }

    private fun buildMessage(friendName: String,
                             currentLoggedUser: String?,
                             userIdentity: Identity,
                             mimetype: Message.Mimetype): Message {
        val messageToSend = Message()
        messageToSend.to = friendName
        messageToSend.from = currentLoggedUser
        messageToSend.fromVersion = userIdentity.version
        messageToSend.dateTime = System.currentTimeMillis()
        messageToSend.iv = encryption.generateIv()
        d("generated iv ${messageToSend.iv}")
        messageToSend.mimeType = mimetype.type
        return messageToSend
    }

    companion object {
        private val TAG = ChatManager::class.java.name
    }
}

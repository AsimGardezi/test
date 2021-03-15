package com.disappears.android.encryption

import com.disappears.android.model.Identity
import com.disappears.android.model.User
import com.disappears.android.model.response.PublicKeyData
import java.io.File
import java.io.InputStream
import java.security.KeyPair
import java.security.PrivateKey

interface EncryptionService {
    fun loadKeyStore(username: String): Boolean

    fun storeIdentity(i: Identity): Boolean

    fun updateIdentity(name: String, authCookie: String): Boolean

    fun generateSharedSecret(currentUser: String, currentVersion: String, friendName: String, friendData: PublicKeyData): String

    fun decryptMessage(data: String, currentUser: String, currentVersion: String, peerUsername: String, friendKey: PublicKeyData, iv: String): String

    fun encryptMessage(data: String, currentUser: String, currentVersion: String, peerUsername: String, friendKeyData: PublicKeyData, iv: String): String

    fun encryptFile(src: File, dst: File, currentUser: String, currentVersion: String, peerUsername: String, friendKeyData: PublicKeyData, iv: String): File

    fun decryptStream(stream: InputStream, dst: File, currentUser: String, currentVersion: String, peerUsername: String, friendKeyData: PublicKeyData, iv: String): File

    fun getIndentity(username: String): Identity

    fun exportIdentity(username: String): String

    fun createKeyStore(forUsername: String): Boolean

    fun generateECDSAKeyPair(): KeyPair

    fun generateECDHKeyPair(): KeyPair

    fun generateAuthSignature(username: String, derivedPassword: String, key: PrivateKey): String

    fun generateAuthSignature(username: String, derivedPassword: String, base64EncodedKey: String): String

    fun deriveKeyFromPassword(password: String): Array<String>

    fun generateIv(): String

    fun buildUserObjectForLogin(deviceId: String, username: String, password: String): User?

    fun deriveKeyFromPassword(saltBase64: String, password: String): String
}

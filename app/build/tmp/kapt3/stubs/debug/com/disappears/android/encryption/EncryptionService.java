package com.disappears.android.encryption;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J8\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H&J@\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H&J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J@\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H&J8\u0010\u001f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H&J \u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H&J\b\u0010&\u001a\u00020\'H&J\b\u0010(\u001a\u00020\'H&J\b\u0010)\u001a\u00020\u0005H&J(\u0010*\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0011H&J\u0010\u0010-\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010/\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020.H&J\u0018\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H&\u00a8\u00065"}, d2 = {"Lcom/disappears/android/encryption/EncryptionService;", "", "buildUserObjectForLogin", "Lcom/disappears/android/model/User;", "deviceId", "", "username", "password", "createKeyStore", "", "forUsername", "decryptMessage", "data", "currentUser", "currentVersion", "peerUsername", "friendKey", "Lcom/disappears/android/model/response/PublicKeyData;", "iv", "decryptStream", "Ljava/io/File;", "stream", "Ljava/io/InputStream;", "dst", "friendKeyData", "deriveKeyFromPassword", "", "(Ljava/lang/String;)[Ljava/lang/String;", "saltBase64", "encryptFile", "src", "encryptMessage", "exportIdentity", "generateAuthSignature", "derivedPassword", "key", "Ljava/security/PrivateKey;", "base64EncodedKey", "generateECDHKeyPair", "Ljava/security/KeyPair;", "generateECDSAKeyPair", "generateIv", "generateSharedSecret", "friendName", "friendData", "getIndentity", "Lcom/disappears/android/model/Identity;", "loadKeyStore", "storeIdentity", "i", "updateIdentity", "name", "authCookie", "app_debug"})
public abstract interface EncryptionService {
    
    public abstract boolean loadKeyStore(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract boolean storeIdentity(@org.jetbrains.annotations.NotNull()
    com.disappears.android.model.Identity i);
    
    public abstract boolean updateIdentity(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String authCookie);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateSharedSecret(@org.jetbrains.annotations.NotNull()
    java.lang.String currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.PublicKeyData friendData);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String decryptMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String peerUsername, @org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.PublicKeyData friendKey, @org.jetbrains.annotations.NotNull()
    java.lang.String iv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String encryptMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String data, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String peerUsername, @org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.PublicKeyData friendKeyData, @org.jetbrains.annotations.NotNull()
    java.lang.String iv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.io.File encryptFile(@org.jetbrains.annotations.NotNull()
    java.io.File src, @org.jetbrains.annotations.NotNull()
    java.io.File dst, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String peerUsername, @org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.PublicKeyData friendKeyData, @org.jetbrains.annotations.NotNull()
    java.lang.String iv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.io.File decryptStream(@org.jetbrains.annotations.NotNull()
    java.io.InputStream stream, @org.jetbrains.annotations.NotNull()
    java.io.File dst, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String currentVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String peerUsername, @org.jetbrains.annotations.NotNull()
    com.disappears.android.model.response.PublicKeyData friendKeyData, @org.jetbrains.annotations.NotNull()
    java.lang.String iv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.disappears.android.model.Identity getIndentity(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String exportIdentity(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract boolean createKeyStore(@org.jetbrains.annotations.NotNull()
    java.lang.String forUsername);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.security.KeyPair generateECDSAKeyPair();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.security.KeyPair generateECDHKeyPair();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateAuthSignature(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String derivedPassword, @org.jetbrains.annotations.NotNull()
    java.security.PrivateKey key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateAuthSignature(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String derivedPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String base64EncodedKey);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String[] deriveKeyFromPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String generateIv();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.disappears.android.model.User buildUserObjectForLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String deriveKeyFromPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String saltBase64, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
}
package com.disappears.android.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ*\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/disappears/android/chat/ChatManager;", "", "encryption", "Lcom/disappears/android/encryption/EncryptionService;", "fileUtil", "Lcom/disappears/android/util/FileUtil;", "prefUtil", "Lcom/disappears/android/util/SharedPrefUtil;", "imageUtil", "Lcom/disappears/android/util/ImageUtil;", "(Lcom/disappears/android/encryption/EncryptionService;Lcom/disappears/android/util/FileUtil;Lcom/disappears/android/util/SharedPrefUtil;Lcom/disappears/android/util/ImageUtil;)V", "buildEncryptedImage", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lcom/disappears/android/model/Message;", "Ljava/io/File;", "friendName", "", "src", "buildMessage", "currentLoggedUser", "userIdentity", "Lcom/disappears/android/model/Identity;", "mimetype", "Lcom/disappears/android/model/Message$Mimetype;", "Companion", "app_debug"})
public final class ChatManager {
    private final com.disappears.android.encryption.EncryptionService encryption = null;
    private final com.disappears.android.util.FileUtil fileUtil = null;
    private final com.disappears.android.util.SharedPrefUtil prefUtil = null;
    private final com.disappears.android.util.ImageUtil imageUtil = null;
    private static final java.lang.String TAG = null;
    public static final com.disappears.android.chat.ChatManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Pair<com.disappears.android.model.Message, java.io.File>> buildEncryptedImage(@org.jetbrains.annotations.NotNull()
    java.lang.String friendName, @org.jetbrains.annotations.NotNull()
    java.io.File src) {
        return null;
    }
    
    private final com.disappears.android.model.Message buildMessage(java.lang.String friendName, java.lang.String currentLoggedUser, com.disappears.android.model.Identity userIdentity, com.disappears.android.model.Message.Mimetype mimetype) {
        return null;
    }
    
    public ChatManager(@org.jetbrains.annotations.NotNull()
    com.disappears.android.encryption.EncryptionService encryption, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.FileUtil fileUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.SharedPrefUtil prefUtil, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ImageUtil imageUtil) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/chat/ChatManager$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
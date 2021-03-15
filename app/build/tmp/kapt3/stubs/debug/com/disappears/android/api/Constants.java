package com.disappears.android.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/disappears/android/api/Constants;", "", "()V", "Api", "InviteAction", "app_debug"})
public final class Constants {
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/disappears/android/api/Constants$InviteAction;", "", "(Ljava/lang/String;I)V", "ACCEPT", "BLOCK", "IGNORE", "app_debug"})
    public static enum InviteAction {
        /*public static final*/ ACCEPT /* = new ACCEPT() */,
        /*public static final*/ BLOCK /* = new BLOCK() */,
        /*public static final*/ IGNORE /* = new IGNORE() */;
        
        InviteAction() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/disappears/android/api/Constants$Api;", "", "()V", "API_VERSION", "", "getAPI_VERSION", "()Ljava/lang/String;", "setAPI_VERSION", "(Ljava/lang/String;)V", "COOKIE_HEADER", "DATA_PREFIX", "getDATA_PREFIX", "INITIAL_IDENTITY_VERSION", "getINITIAL_IDENTITY_VERSION", "setINITIAL_IDENTITY_VERSION", "PLATFORM", "getPLATFORM", "setPLATFORM", "UPLOAD_PICTURE_NAME", "getUPLOAD_PICTURE_NAME", "app_debug"})
    public static final class Api {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String UPLOAD_PICTURE_NAME = "profile.jpg";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String API_VERSION = "50";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String PLATFORM = "Android";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String INITIAL_IDENTITY_VERSION = "1";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COOKIE_HEADER = "Set-Cookie";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String DATA_PREFIX = "dataKey_";
        public static final com.disappears.android.api.Constants.Api INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUPLOAD_PICTURE_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAPI_VERSION() {
            return null;
        }
        
        public final void setAPI_VERSION(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPLATFORM() {
            return null;
        }
        
        public final void setPLATFORM(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getINITIAL_IDENTITY_VERSION() {
            return null;
        }
        
        public final void setINITIAL_IDENTITY_VERSION(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATA_PREFIX() {
            return null;
        }
        
        private Api() {
            super();
        }
    }
}
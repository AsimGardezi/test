package com.disappears.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0013H\u0002J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010%\u001a\u00020\u000eJ\u0010\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010\'\u001a\u00020\u001cJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010)\u001a\u00020\u000eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\"J\u000e\u0010,\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0018\u00a8\u00060"}, d2 = {"Lcom/disappears/android/util/ContactUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "allContactsDetailedList", "", "Lcom/disappears/android/model/Contact;", "getAllContactsDetailedList", "()Ljava/util/List;", "allContactsSimpleList", "getAllContactsSimpleList", "allNumbers", "", "", "getAllNumbers", "()Ljava/util/Map;", "contactIdsWithPhone", "", "", "getContactIdsWithPhone", "()Ljava/util/Set;", "sContactColumns", "", "[Ljava/lang/String;", "sFullRawAndDataProjection", "sSimpleContactProjection", "buildContactUri", "Landroid/net/Uri;", "id", "lookupId", "createPhoneModel", "Lcom/disappears/android/model/PhoneNumber;", "c", "Landroid/database/Cursor;", "rawContactId", "getAllContactsSimple", "orderBy", "getContact", "contactUri", "getContactsByName", "name", "modelFromCursor", "cursor", "modelFromCursorSimple", "setCommonContactData", "", "cm", "app_debug"})
public final class ContactUtil {
    private final java.lang.String[] sSimpleContactProjection = {"contact_id", "lookup", "display_name", "photo_uri", "last_time_contacted", "starred", "has_phone_number", "mimetype", "data2", "data3", "data5", "raw_contact_id"};
    private final java.lang.String[] sContactColumns = {"_id", "lookup", "display_name", "photo_uri", "last_time_contacted", "starred", "has_phone_number"};
    private final java.lang.String[] sFullRawAndDataProjection = {"_id", "lookup", "raw_contact_id", "display_name", "account_type", "data2", "data5", "data3", "data4", "data6", "photo_uri", "starred", "last_time_contacted", "times_contacted", "account_name", "account_type", "data_set", "dirty", "version", "sourceid", "sync1", "sync2", "sync3", "sync4", "deleted", "data_id", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2", "data_sync3", "data_sync4", "data_version", "is_primary", "is_super_primary", "mimetype"};
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.disappears.android.model.Contact> getAllContactsDetailedList() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getAllNumbers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.disappears.android.model.Contact> getAllContactsSimpleList() {
        return null;
    }
    
    private final java.util.Set<java.lang.Long> getContactIdsWithPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri buildContactUri(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri buildContactUri(@org.jetbrains.annotations.NotNull()
    java.lang.String lookupId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.Contact getContact(@org.jetbrains.annotations.NotNull()
    android.net.Uri contactUri) {
        return null;
    }
    
    private final void setCommonContactData(com.disappears.android.model.Contact cm, android.database.Cursor c) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.disappears.android.model.Contact modelFromCursor(@org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
        return null;
    }
    
    private final com.disappears.android.model.PhoneNumber createPhoneModel(android.database.Cursor c, long rawContactId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.disappears.android.model.Contact modelFromCursorSimple(@org.jetbrains.annotations.NotNull()
    android.database.Cursor c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.disappears.android.model.Contact> getContactsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.disappears.android.model.Contact> getAllContactsSimple(@org.jetbrains.annotations.NotNull()
    java.lang.String orderBy) {
        return null;
    }
    
    public ContactUtil(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}
package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_disappears_android_model_response_FriendRealmProxy extends com.disappears.android.model.response.Friend
    implements RealmObjectProxy, com_disappears_android_model_response_FriendRealmProxyInterface {

    static final class FriendColumnInfo extends ColumnInfo {
        long nameIndex;
        long aliasPlainIndex;
        long aliasDataIndex;
        long aliasVersionIndex;
        long profileIndex;
        long lastReceivedMessageIdIndex;
        long flagsIndex;
        long hasNewMessageIndex;
        long availableMessageIdIndex;
        long availableMessageControlIdIndex;
        long keysIndex;

        FriendColumnInfo(OsSchemaInfo schemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Friend");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.aliasPlainIndex = addColumnDetails("aliasPlain", "aliasPlain", objectSchemaInfo);
            this.aliasDataIndex = addColumnDetails("aliasData", "aliasData", objectSchemaInfo);
            this.aliasVersionIndex = addColumnDetails("aliasVersion", "aliasVersion", objectSchemaInfo);
            this.profileIndex = addColumnDetails("profile", "profile", objectSchemaInfo);
            this.lastReceivedMessageIdIndex = addColumnDetails("lastReceivedMessageId", "lastReceivedMessageId", objectSchemaInfo);
            this.flagsIndex = addColumnDetails("flags", "flags", objectSchemaInfo);
            this.hasNewMessageIndex = addColumnDetails("hasNewMessage", "hasNewMessage", objectSchemaInfo);
            this.availableMessageIdIndex = addColumnDetails("availableMessageId", "availableMessageId", objectSchemaInfo);
            this.availableMessageControlIdIndex = addColumnDetails("availableMessageControlId", "availableMessageControlId", objectSchemaInfo);
            this.keysIndex = addColumnDetails("keys", "keys", objectSchemaInfo);
        }

        FriendColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FriendColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FriendColumnInfo src = (FriendColumnInfo) rawSrc;
            final FriendColumnInfo dst = (FriendColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.aliasPlainIndex = src.aliasPlainIndex;
            dst.aliasDataIndex = src.aliasDataIndex;
            dst.aliasVersionIndex = src.aliasVersionIndex;
            dst.profileIndex = src.profileIndex;
            dst.lastReceivedMessageIdIndex = src.lastReceivedMessageIdIndex;
            dst.flagsIndex = src.flagsIndex;
            dst.hasNewMessageIndex = src.hasNewMessageIndex;
            dst.availableMessageIdIndex = src.availableMessageIdIndex;
            dst.availableMessageControlIdIndex = src.availableMessageControlIdIndex;
            dst.keysIndex = src.keysIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FriendColumnInfo columnInfo;
    private ProxyState<com.disappears.android.model.response.Friend> proxyState;

    com_disappears_android_model_response_FriendRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FriendColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.disappears.android.model.response.Friend>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'name' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$aliasPlain() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.aliasPlainIndex);
    }

    @Override
    public void realmSet$aliasPlain(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.aliasPlainIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.aliasPlainIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.aliasPlainIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.aliasPlainIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$aliasData() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.aliasDataIndex);
    }

    @Override
    public void realmSet$aliasData(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.aliasDataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.aliasDataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.aliasDataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.aliasDataIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$aliasVersion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.aliasVersionIndex);
    }

    @Override
    public void realmSet$aliasVersion(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.aliasVersionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.aliasVersionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.aliasVersionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.aliasVersionIndex, value);
    }

    @Override
    public com.disappears.android.model.response.Profile realmGet$profile() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.profileIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.disappears.android.model.response.Profile.class, proxyState.getRow$realm().getLink(columnInfo.profileIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$profile(com.disappears.android.model.response.Profile value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("profile")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.profileIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.profileIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.profileIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.profileIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$lastReceivedMessageId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.lastReceivedMessageIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.lastReceivedMessageIdIndex);
    }

    @Override
    public void realmSet$lastReceivedMessageId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastReceivedMessageIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.lastReceivedMessageIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastReceivedMessageIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.lastReceivedMessageIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$flags() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.flagsIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.flagsIndex);
    }

    @Override
    public void realmSet$flags(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.flagsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.flagsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.flagsIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.flagsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$hasNewMessage() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.hasNewMessageIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.hasNewMessageIndex);
    }

    @Override
    public void realmSet$hasNewMessage(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.hasNewMessageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.hasNewMessageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.hasNewMessageIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.hasNewMessageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$availableMessageId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.availableMessageIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.availableMessageIdIndex);
    }

    @Override
    public void realmSet$availableMessageId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.availableMessageIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.availableMessageIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.availableMessageIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.availableMessageIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$availableMessageControlId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.availableMessageControlIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.availableMessageControlIdIndex);
    }

    @Override
    public void realmSet$availableMessageControlId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.availableMessageControlIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.availableMessageControlIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.availableMessageControlIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.availableMessageControlIdIndex, value);
    }

    @Override
    public com.disappears.android.model.response.PublicKeyData realmGet$keys() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.keysIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.disappears.android.model.response.PublicKeyData.class, proxyState.getRow$realm().getLink(columnInfo.keysIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$keys(com.disappears.android.model.response.PublicKeyData value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("keys")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.keysIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.keysIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.keysIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.keysIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Friend", 11, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("aliasPlain", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("aliasData", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("aliasVersion", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("profile", RealmFieldType.OBJECT, "Profile");
        builder.addPersistedProperty("lastReceivedMessageId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flags", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("hasNewMessage", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("availableMessageId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("availableMessageControlId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("keys", RealmFieldType.OBJECT, "PublicKeyData");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FriendColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FriendColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Friend";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Friend";
    }

    @SuppressWarnings("cast")
    public static com.disappears.android.model.response.Friend createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.disappears.android.model.response.Friend obj = null;
        if (update) {
            Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
            FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
            long pkColumnIndex = columnInfo.nameIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("name")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("name"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_disappears_android_model_response_FriendRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("profile")) {
                excludeFields.add("profile");
            }
            if (json.has("keys")) {
                excludeFields.add("keys");
            }
            if (json.has("name")) {
                if (json.isNull("name")) {
                    obj = (io.realm.com_disappears_android_model_response_FriendRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.Friend.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_disappears_android_model_response_FriendRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.Friend.class, json.getString("name"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'name'.");
            }
        }

        final com_disappears_android_model_response_FriendRealmProxyInterface objProxy = (com_disappears_android_model_response_FriendRealmProxyInterface) obj;
        if (json.has("aliasPlain")) {
            if (json.isNull("aliasPlain")) {
                objProxy.realmSet$aliasPlain(null);
            } else {
                objProxy.realmSet$aliasPlain((String) json.getString("aliasPlain"));
            }
        }
        if (json.has("aliasData")) {
            if (json.isNull("aliasData")) {
                objProxy.realmSet$aliasData(null);
            } else {
                objProxy.realmSet$aliasData((String) json.getString("aliasData"));
            }
        }
        if (json.has("aliasVersion")) {
            if (json.isNull("aliasVersion")) {
                objProxy.realmSet$aliasVersion(null);
            } else {
                objProxy.realmSet$aliasVersion((String) json.getString("aliasVersion"));
            }
        }
        if (json.has("profile")) {
            if (json.isNull("profile")) {
                objProxy.realmSet$profile(null);
            } else {
                com.disappears.android.model.response.Profile profileObj = com_disappears_android_model_response_ProfileRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("profile"), update);
                objProxy.realmSet$profile(profileObj);
            }
        }
        if (json.has("lastReceivedMessageId")) {
            if (json.isNull("lastReceivedMessageId")) {
                objProxy.realmSet$lastReceivedMessageId(null);
            } else {
                objProxy.realmSet$lastReceivedMessageId((int) json.getInt("lastReceivedMessageId"));
            }
        }
        if (json.has("flags")) {
            if (json.isNull("flags")) {
                objProxy.realmSet$flags(null);
            } else {
                objProxy.realmSet$flags((int) json.getInt("flags"));
            }
        }
        if (json.has("hasNewMessage")) {
            if (json.isNull("hasNewMessage")) {
                objProxy.realmSet$hasNewMessage(null);
            } else {
                objProxy.realmSet$hasNewMessage((boolean) json.getBoolean("hasNewMessage"));
            }
        }
        if (json.has("availableMessageId")) {
            if (json.isNull("availableMessageId")) {
                objProxy.realmSet$availableMessageId(null);
            } else {
                objProxy.realmSet$availableMessageId((int) json.getInt("availableMessageId"));
            }
        }
        if (json.has("availableMessageControlId")) {
            if (json.isNull("availableMessageControlId")) {
                objProxy.realmSet$availableMessageControlId(null);
            } else {
                objProxy.realmSet$availableMessageControlId((int) json.getInt("availableMessageControlId"));
            }
        }
        if (json.has("keys")) {
            if (json.isNull("keys")) {
                objProxy.realmSet$keys(null);
            } else {
                com.disappears.android.model.response.PublicKeyData keysObj = com_disappears_android_model_response_PublicKeyDataRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("keys"), update);
                objProxy.realmSet$keys(keysObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.disappears.android.model.response.Friend createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.disappears.android.model.response.Friend obj = new com.disappears.android.model.response.Friend();
        final com_disappears_android_model_response_FriendRealmProxyInterface objProxy = (com_disappears_android_model_response_FriendRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("aliasPlain")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$aliasPlain((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$aliasPlain(null);
                }
            } else if (name.equals("aliasData")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$aliasData((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$aliasData(null);
                }
            } else if (name.equals("aliasVersion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$aliasVersion((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$aliasVersion(null);
                }
            } else if (name.equals("profile")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$profile(null);
                } else {
                    com.disappears.android.model.response.Profile profileObj = com_disappears_android_model_response_ProfileRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$profile(profileObj);
                }
            } else if (name.equals("lastReceivedMessageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastReceivedMessageId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastReceivedMessageId(null);
                }
            } else if (name.equals("flags")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flags((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$flags(null);
                }
            } else if (name.equals("hasNewMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$hasNewMessage((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$hasNewMessage(null);
                }
            } else if (name.equals("availableMessageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$availableMessageId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$availableMessageId(null);
                }
            } else if (name.equals("availableMessageControlId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$availableMessageControlId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$availableMessageControlId(null);
                }
            } else if (name.equals("keys")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$keys(null);
                } else {
                    com.disappears.android.model.response.PublicKeyData keysObj = com_disappears_android_model_response_PublicKeyDataRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$keys(keysObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'name'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.disappears.android.model.response.Friend copyOrUpdate(Realm realm, com.disappears.android.model.response.Friend object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.response.Friend) cachedRealmObject;
        }

        com.disappears.android.model.response.Friend realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
            FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
            long pkColumnIndex = columnInfo.nameIndex;
            String value = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$name();
            long rowIndex = Table.NO_MATCH;
            if (value == null) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, value);
            }
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_disappears_android_model_response_FriendRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.disappears.android.model.response.Friend copy(Realm realm, com.disappears.android.model.response.Friend newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.response.Friend) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.disappears.android.model.response.Friend realmObject = realm.createObjectInternal(com.disappears.android.model.response.Friend.class, ((com_disappears_android_model_response_FriendRealmProxyInterface) newObject).realmGet$name(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_disappears_android_model_response_FriendRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_FriendRealmProxyInterface) newObject;
        com_disappears_android_model_response_FriendRealmProxyInterface realmObjectCopy = (com_disappears_android_model_response_FriendRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$aliasPlain(realmObjectSource.realmGet$aliasPlain());
        realmObjectCopy.realmSet$aliasData(realmObjectSource.realmGet$aliasData());
        realmObjectCopy.realmSet$aliasVersion(realmObjectSource.realmGet$aliasVersion());

        com.disappears.android.model.response.Profile profileObj = realmObjectSource.realmGet$profile();
        if (profileObj == null) {
            realmObjectCopy.realmSet$profile(null);
        } else {
            com.disappears.android.model.response.Profile cacheprofile = (com.disappears.android.model.response.Profile) cache.get(profileObj);
            if (cacheprofile != null) {
                realmObjectCopy.realmSet$profile(cacheprofile);
            } else {
                realmObjectCopy.realmSet$profile(com_disappears_android_model_response_ProfileRealmProxy.copyOrUpdate(realm, profileObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$lastReceivedMessageId(realmObjectSource.realmGet$lastReceivedMessageId());
        realmObjectCopy.realmSet$flags(realmObjectSource.realmGet$flags());
        realmObjectCopy.realmSet$hasNewMessage(realmObjectSource.realmGet$hasNewMessage());
        realmObjectCopy.realmSet$availableMessageId(realmObjectSource.realmGet$availableMessageId());
        realmObjectCopy.realmSet$availableMessageControlId(realmObjectSource.realmGet$availableMessageControlId());

        com.disappears.android.model.response.PublicKeyData keysObj = realmObjectSource.realmGet$keys();
        if (keysObj == null) {
            realmObjectCopy.realmSet$keys(null);
        } else {
            com.disappears.android.model.response.PublicKeyData cachekeys = (com.disappears.android.model.response.PublicKeyData) cache.get(keysObj);
            if (cachekeys != null) {
                realmObjectCopy.realmSet$keys(cachekeys);
            } else {
                realmObjectCopy.realmSet$keys(com_disappears_android_model_response_PublicKeyDataRealmProxy.copyOrUpdate(realm, keysObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, com.disappears.android.model.response.Friend object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
        long tableNativePtr = table.getNativePtr();
        FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
        long pkColumnIndex = columnInfo.nameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$name();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$aliasPlain = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasPlain();
        if (realmGet$aliasPlain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, realmGet$aliasPlain, false);
        }
        String realmGet$aliasData = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasData();
        if (realmGet$aliasData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, realmGet$aliasData, false);
        }
        String realmGet$aliasVersion = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasVersion();
        if (realmGet$aliasVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, realmGet$aliasVersion, false);
        }

        com.disappears.android.model.response.Profile profileObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$profile();
        if (profileObj != null) {
            Long cacheprofile = cache.get(profileObj);
            if (cacheprofile == null) {
                cacheprofile = com_disappears_android_model_response_ProfileRealmProxy.insert(realm, profileObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.profileIndex, rowIndex, cacheprofile, false);
        }
        Number realmGet$lastReceivedMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$lastReceivedMessageId();
        if (realmGet$lastReceivedMessageId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, realmGet$lastReceivedMessageId.longValue(), false);
        }
        Number realmGet$flags = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$flags();
        if (realmGet$flags != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
        }
        Boolean realmGet$hasNewMessage = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$hasNewMessage();
        if (realmGet$hasNewMessage != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, realmGet$hasNewMessage, false);
        }
        Number realmGet$availableMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageId();
        if (realmGet$availableMessageId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, realmGet$availableMessageId.longValue(), false);
        }
        Number realmGet$availableMessageControlId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageControlId();
        if (realmGet$availableMessageControlId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, realmGet$availableMessageControlId.longValue(), false);
        }

        com.disappears.android.model.response.PublicKeyData keysObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$keys();
        if (keysObj != null) {
            Long cachekeys = cache.get(keysObj);
            if (cachekeys == null) {
                cachekeys = com_disappears_android_model_response_PublicKeyDataRealmProxy.insert(realm, keysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.keysIndex, rowIndex, cachekeys, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
        long tableNativePtr = table.getNativePtr();
        FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
        long pkColumnIndex = columnInfo.nameIndex;
        com.disappears.android.model.response.Friend object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.Friend) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$name();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$aliasPlain = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasPlain();
            if (realmGet$aliasPlain != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, realmGet$aliasPlain, false);
            }
            String realmGet$aliasData = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasData();
            if (realmGet$aliasData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, realmGet$aliasData, false);
            }
            String realmGet$aliasVersion = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasVersion();
            if (realmGet$aliasVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, realmGet$aliasVersion, false);
            }

            com.disappears.android.model.response.Profile profileObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$profile();
            if (profileObj != null) {
                Long cacheprofile = cache.get(profileObj);
                if (cacheprofile == null) {
                    cacheprofile = com_disappears_android_model_response_ProfileRealmProxy.insert(realm, profileObj, cache);
                }
                table.setLink(columnInfo.profileIndex, rowIndex, cacheprofile, false);
            }
            Number realmGet$lastReceivedMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$lastReceivedMessageId();
            if (realmGet$lastReceivedMessageId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, realmGet$lastReceivedMessageId.longValue(), false);
            }
            Number realmGet$flags = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$flags();
            if (realmGet$flags != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
            }
            Boolean realmGet$hasNewMessage = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$hasNewMessage();
            if (realmGet$hasNewMessage != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, realmGet$hasNewMessage, false);
            }
            Number realmGet$availableMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageId();
            if (realmGet$availableMessageId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, realmGet$availableMessageId.longValue(), false);
            }
            Number realmGet$availableMessageControlId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageControlId();
            if (realmGet$availableMessageControlId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, realmGet$availableMessageControlId.longValue(), false);
            }

            com.disappears.android.model.response.PublicKeyData keysObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$keys();
            if (keysObj != null) {
                Long cachekeys = cache.get(keysObj);
                if (cachekeys == null) {
                    cachekeys = com_disappears_android_model_response_PublicKeyDataRealmProxy.insert(realm, keysObj, cache);
                }
                table.setLink(columnInfo.keysIndex, rowIndex, cachekeys, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.disappears.android.model.response.Friend object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
        long tableNativePtr = table.getNativePtr();
        FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
        long pkColumnIndex = columnInfo.nameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$name();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$aliasPlain = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasPlain();
        if (realmGet$aliasPlain != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, realmGet$aliasPlain, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, false);
        }
        String realmGet$aliasData = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasData();
        if (realmGet$aliasData != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, realmGet$aliasData, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, false);
        }
        String realmGet$aliasVersion = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasVersion();
        if (realmGet$aliasVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, realmGet$aliasVersion, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, false);
        }

        com.disappears.android.model.response.Profile profileObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$profile();
        if (profileObj != null) {
            Long cacheprofile = cache.get(profileObj);
            if (cacheprofile == null) {
                cacheprofile = com_disappears_android_model_response_ProfileRealmProxy.insertOrUpdate(realm, profileObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.profileIndex, rowIndex, cacheprofile, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.profileIndex, rowIndex);
        }
        Number realmGet$lastReceivedMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$lastReceivedMessageId();
        if (realmGet$lastReceivedMessageId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, realmGet$lastReceivedMessageId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, false);
        }
        Number realmGet$flags = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$flags();
        if (realmGet$flags != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.flagsIndex, rowIndex, false);
        }
        Boolean realmGet$hasNewMessage = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$hasNewMessage();
        if (realmGet$hasNewMessage != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, realmGet$hasNewMessage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, false);
        }
        Number realmGet$availableMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageId();
        if (realmGet$availableMessageId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, realmGet$availableMessageId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, false);
        }
        Number realmGet$availableMessageControlId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageControlId();
        if (realmGet$availableMessageControlId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, realmGet$availableMessageControlId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, false);
        }

        com.disappears.android.model.response.PublicKeyData keysObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$keys();
        if (keysObj != null) {
            Long cachekeys = cache.get(keysObj);
            if (cachekeys == null) {
                cachekeys = com_disappears_android_model_response_PublicKeyDataRealmProxy.insertOrUpdate(realm, keysObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.keysIndex, rowIndex, cachekeys, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.keysIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.Friend.class);
        long tableNativePtr = table.getNativePtr();
        FriendColumnInfo columnInfo = (FriendColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Friend.class);
        long pkColumnIndex = columnInfo.nameIndex;
        com.disappears.android.model.response.Friend object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.Friend) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$name();
            long rowIndex = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
            } else {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$aliasPlain = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasPlain();
            if (realmGet$aliasPlain != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, realmGet$aliasPlain, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.aliasPlainIndex, rowIndex, false);
            }
            String realmGet$aliasData = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasData();
            if (realmGet$aliasData != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, realmGet$aliasData, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.aliasDataIndex, rowIndex, false);
            }
            String realmGet$aliasVersion = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$aliasVersion();
            if (realmGet$aliasVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, realmGet$aliasVersion, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.aliasVersionIndex, rowIndex, false);
            }

            com.disappears.android.model.response.Profile profileObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$profile();
            if (profileObj != null) {
                Long cacheprofile = cache.get(profileObj);
                if (cacheprofile == null) {
                    cacheprofile = com_disappears_android_model_response_ProfileRealmProxy.insertOrUpdate(realm, profileObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.profileIndex, rowIndex, cacheprofile, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.profileIndex, rowIndex);
            }
            Number realmGet$lastReceivedMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$lastReceivedMessageId();
            if (realmGet$lastReceivedMessageId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, realmGet$lastReceivedMessageId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastReceivedMessageIdIndex, rowIndex, false);
            }
            Number realmGet$flags = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$flags();
            if (realmGet$flags != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.flagsIndex, rowIndex, false);
            }
            Boolean realmGet$hasNewMessage = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$hasNewMessage();
            if (realmGet$hasNewMessage != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, realmGet$hasNewMessage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.hasNewMessageIndex, rowIndex, false);
            }
            Number realmGet$availableMessageId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageId();
            if (realmGet$availableMessageId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, realmGet$availableMessageId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.availableMessageIdIndex, rowIndex, false);
            }
            Number realmGet$availableMessageControlId = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$availableMessageControlId();
            if (realmGet$availableMessageControlId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, realmGet$availableMessageControlId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.availableMessageControlIdIndex, rowIndex, false);
            }

            com.disappears.android.model.response.PublicKeyData keysObj = ((com_disappears_android_model_response_FriendRealmProxyInterface) object).realmGet$keys();
            if (keysObj != null) {
                Long cachekeys = cache.get(keysObj);
                if (cachekeys == null) {
                    cachekeys = com_disappears_android_model_response_PublicKeyDataRealmProxy.insertOrUpdate(realm, keysObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.keysIndex, rowIndex, cachekeys, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.keysIndex, rowIndex);
            }
        }
    }

    public static com.disappears.android.model.response.Friend createDetachedCopy(com.disappears.android.model.response.Friend realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.disappears.android.model.response.Friend unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.disappears.android.model.response.Friend();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.disappears.android.model.response.Friend) cachedObject.object;
            }
            unmanagedObject = (com.disappears.android.model.response.Friend) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_disappears_android_model_response_FriendRealmProxyInterface unmanagedCopy = (com_disappears_android_model_response_FriendRealmProxyInterface) unmanagedObject;
        com_disappears_android_model_response_FriendRealmProxyInterface realmSource = (com_disappears_android_model_response_FriendRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$aliasPlain(realmSource.realmGet$aliasPlain());
        unmanagedCopy.realmSet$aliasData(realmSource.realmGet$aliasData());
        unmanagedCopy.realmSet$aliasVersion(realmSource.realmGet$aliasVersion());

        // Deep copy of profile
        unmanagedCopy.realmSet$profile(com_disappears_android_model_response_ProfileRealmProxy.createDetachedCopy(realmSource.realmGet$profile(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$lastReceivedMessageId(realmSource.realmGet$lastReceivedMessageId());
        unmanagedCopy.realmSet$flags(realmSource.realmGet$flags());
        unmanagedCopy.realmSet$hasNewMessage(realmSource.realmGet$hasNewMessage());
        unmanagedCopy.realmSet$availableMessageId(realmSource.realmGet$availableMessageId());
        unmanagedCopy.realmSet$availableMessageControlId(realmSource.realmGet$availableMessageControlId());

        // Deep copy of keys
        unmanagedCopy.realmSet$keys(com_disappears_android_model_response_PublicKeyDataRealmProxy.createDetachedCopy(realmSource.realmGet$keys(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    static com.disappears.android.model.response.Friend update(Realm realm, com.disappears.android.model.response.Friend realmObject, com.disappears.android.model.response.Friend newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_disappears_android_model_response_FriendRealmProxyInterface realmObjectTarget = (com_disappears_android_model_response_FriendRealmProxyInterface) realmObject;
        com_disappears_android_model_response_FriendRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_FriendRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$aliasPlain(realmObjectSource.realmGet$aliasPlain());
        realmObjectTarget.realmSet$aliasData(realmObjectSource.realmGet$aliasData());
        realmObjectTarget.realmSet$aliasVersion(realmObjectSource.realmGet$aliasVersion());
        com.disappears.android.model.response.Profile profileObj = realmObjectSource.realmGet$profile();
        if (profileObj == null) {
            realmObjectTarget.realmSet$profile(null);
        } else {
            com.disappears.android.model.response.Profile cacheprofile = (com.disappears.android.model.response.Profile) cache.get(profileObj);
            if (cacheprofile != null) {
                realmObjectTarget.realmSet$profile(cacheprofile);
            } else {
                realmObjectTarget.realmSet$profile(com_disappears_android_model_response_ProfileRealmProxy.copyOrUpdate(realm, profileObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$lastReceivedMessageId(realmObjectSource.realmGet$lastReceivedMessageId());
        realmObjectTarget.realmSet$flags(realmObjectSource.realmGet$flags());
        realmObjectTarget.realmSet$hasNewMessage(realmObjectSource.realmGet$hasNewMessage());
        realmObjectTarget.realmSet$availableMessageId(realmObjectSource.realmGet$availableMessageId());
        realmObjectTarget.realmSet$availableMessageControlId(realmObjectSource.realmGet$availableMessageControlId());
        com.disappears.android.model.response.PublicKeyData keysObj = realmObjectSource.realmGet$keys();
        if (keysObj == null) {
            realmObjectTarget.realmSet$keys(null);
        } else {
            com.disappears.android.model.response.PublicKeyData cachekeys = (com.disappears.android.model.response.PublicKeyData) cache.get(keysObj);
            if (cachekeys != null) {
                realmObjectTarget.realmSet$keys(cachekeys);
            } else {
                realmObjectTarget.realmSet$keys(com_disappears_android_model_response_PublicKeyDataRealmProxy.copyOrUpdate(realm, keysObj, true, cache));
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Friend = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{aliasPlain:");
        stringBuilder.append(realmGet$aliasPlain() != null ? realmGet$aliasPlain() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{aliasData:");
        stringBuilder.append(realmGet$aliasData() != null ? realmGet$aliasData() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{aliasVersion:");
        stringBuilder.append(realmGet$aliasVersion() != null ? realmGet$aliasVersion() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{profile:");
        stringBuilder.append(realmGet$profile() != null ? "Profile" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastReceivedMessageId:");
        stringBuilder.append(realmGet$lastReceivedMessageId() != null ? realmGet$lastReceivedMessageId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flags:");
        stringBuilder.append(realmGet$flags() != null ? realmGet$flags() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{hasNewMessage:");
        stringBuilder.append(realmGet$hasNewMessage() != null ? realmGet$hasNewMessage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{availableMessageId:");
        stringBuilder.append(realmGet$availableMessageId() != null ? realmGet$availableMessageId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{availableMessageControlId:");
        stringBuilder.append(realmGet$availableMessageControlId() != null ? realmGet$availableMessageControlId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{keys:");
        stringBuilder.append(realmGet$keys() != null ? "PublicKeyData" : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}

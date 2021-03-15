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
public class com_disappears_android_model_response_ProfileRealmProxy extends com.disappears.android.model.response.Profile
    implements RealmObjectProxy, com_disappears_android_model_response_ProfileRealmProxyInterface {

    static final class ProfileColumnInfo extends ColumnInfo {
        long friendNameIndex;
        long nameIndex;
        long flagsIndex;
        long imageUrlIndex;
        long imageVersionIndex;
        long imageIvIndex;
        long lastSeenIndex;
        long usernameIndex;

        ProfileColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Profile");
            this.friendNameIndex = addColumnDetails("friendName", "friendName", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.flagsIndex = addColumnDetails("flags", "flags", objectSchemaInfo);
            this.imageUrlIndex = addColumnDetails("imageUrl", "imageUrl", objectSchemaInfo);
            this.imageVersionIndex = addColumnDetails("imageVersion", "imageVersion", objectSchemaInfo);
            this.imageIvIndex = addColumnDetails("imageIv", "imageIv", objectSchemaInfo);
            this.lastSeenIndex = addColumnDetails("lastSeen", "lastSeen", objectSchemaInfo);
            this.usernameIndex = addColumnDetails("username", "username", objectSchemaInfo);
        }

        ProfileColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ProfileColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ProfileColumnInfo src = (ProfileColumnInfo) rawSrc;
            final ProfileColumnInfo dst = (ProfileColumnInfo) rawDst;
            dst.friendNameIndex = src.friendNameIndex;
            dst.nameIndex = src.nameIndex;
            dst.flagsIndex = src.flagsIndex;
            dst.imageUrlIndex = src.imageUrlIndex;
            dst.imageVersionIndex = src.imageVersionIndex;
            dst.imageIvIndex = src.imageIvIndex;
            dst.lastSeenIndex = src.lastSeenIndex;
            dst.usernameIndex = src.usernameIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ProfileColumnInfo columnInfo;
    private ProxyState<com.disappears.android.model.response.Profile> proxyState;

    com_disappears_android_model_response_ProfileRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ProfileColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.disappears.android.model.response.Profile>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$friendName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.friendNameIndex);
    }

    @Override
    public void realmSet$friendName(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'friendName' cannot be changed after object was created.");
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
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
    public String realmGet$imageUrl() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageUrlIndex);
    }

    @Override
    public void realmSet$imageUrl(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageUrlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageUrlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageUrlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageUrlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$imageVersion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageVersionIndex);
    }

    @Override
    public void realmSet$imageVersion(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageVersionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageVersionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageVersionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageVersionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$imageIv() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageIvIndex);
    }

    @Override
    public void realmSet$imageIv(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageIvIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageIvIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageIvIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageIvIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastSeenIndex);
    }

    @Override
    public void realmSet$lastSeen(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastSeenIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastSeenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastSeenIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastSeenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$username() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.usernameIndex);
    }

    @Override
    public void realmSet$username(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.usernameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.usernameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.usernameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.usernameIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Profile", 8, 0);
        builder.addPersistedProperty("friendName", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("flags", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("imageUrl", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("imageVersion", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("imageIv", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lastSeen", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("username", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProfileColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ProfileColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Profile";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Profile";
    }

    @SuppressWarnings("cast")
    public static com.disappears.android.model.response.Profile createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.disappears.android.model.response.Profile obj = null;
        if (update) {
            Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
            ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
            long pkColumnIndex = columnInfo.friendNameIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("friendName")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("friendName"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_disappears_android_model_response_ProfileRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("friendName")) {
                if (json.isNull("friendName")) {
                    obj = (io.realm.com_disappears_android_model_response_ProfileRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.Profile.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_disappears_android_model_response_ProfileRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.Profile.class, json.getString("friendName"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'friendName'.");
            }
        }

        final com_disappears_android_model_response_ProfileRealmProxyInterface objProxy = (com_disappears_android_model_response_ProfileRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("flags")) {
            if (json.isNull("flags")) {
                objProxy.realmSet$flags(null);
            } else {
                objProxy.realmSet$flags((int) json.getInt("flags"));
            }
        }
        if (json.has("imageUrl")) {
            if (json.isNull("imageUrl")) {
                objProxy.realmSet$imageUrl(null);
            } else {
                objProxy.realmSet$imageUrl((String) json.getString("imageUrl"));
            }
        }
        if (json.has("imageVersion")) {
            if (json.isNull("imageVersion")) {
                objProxy.realmSet$imageVersion(null);
            } else {
                objProxy.realmSet$imageVersion((String) json.getString("imageVersion"));
            }
        }
        if (json.has("imageIv")) {
            if (json.isNull("imageIv")) {
                objProxy.realmSet$imageIv(null);
            } else {
                objProxy.realmSet$imageIv((String) json.getString("imageIv"));
            }
        }
        if (json.has("lastSeen")) {
            if (json.isNull("lastSeen")) {
                objProxy.realmSet$lastSeen(null);
            } else {
                objProxy.realmSet$lastSeen((String) json.getString("lastSeen"));
            }
        }
        if (json.has("username")) {
            if (json.isNull("username")) {
                objProxy.realmSet$username(null);
            } else {
                objProxy.realmSet$username((String) json.getString("username"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.disappears.android.model.response.Profile createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.disappears.android.model.response.Profile obj = new com.disappears.android.model.response.Profile();
        final com_disappears_android_model_response_ProfileRealmProxyInterface objProxy = (com_disappears_android_model_response_ProfileRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("friendName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$friendName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$friendName(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("flags")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$flags((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$flags(null);
                }
            } else if (name.equals("imageUrl")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imageUrl((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imageUrl(null);
                }
            } else if (name.equals("imageVersion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imageVersion((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imageVersion(null);
                }
            } else if (name.equals("imageIv")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$imageIv((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$imageIv(null);
                }
            } else if (name.equals("lastSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastSeen((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastSeen(null);
                }
            } else if (name.equals("username")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$username((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$username(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'friendName'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.disappears.android.model.response.Profile copyOrUpdate(Realm realm, com.disappears.android.model.response.Profile object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.disappears.android.model.response.Profile) cachedRealmObject;
        }

        com.disappears.android.model.response.Profile realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
            ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
            long pkColumnIndex = columnInfo.friendNameIndex;
            String value = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$friendName();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_disappears_android_model_response_ProfileRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.disappears.android.model.response.Profile copy(Realm realm, com.disappears.android.model.response.Profile newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.response.Profile) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.disappears.android.model.response.Profile realmObject = realm.createObjectInternal(com.disappears.android.model.response.Profile.class, ((com_disappears_android_model_response_ProfileRealmProxyInterface) newObject).realmGet$friendName(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_disappears_android_model_response_ProfileRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_ProfileRealmProxyInterface) newObject;
        com_disappears_android_model_response_ProfileRealmProxyInterface realmObjectCopy = (com_disappears_android_model_response_ProfileRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$flags(realmObjectSource.realmGet$flags());
        realmObjectCopy.realmSet$imageUrl(realmObjectSource.realmGet$imageUrl());
        realmObjectCopy.realmSet$imageVersion(realmObjectSource.realmGet$imageVersion());
        realmObjectCopy.realmSet$imageIv(realmObjectSource.realmGet$imageIv());
        realmObjectCopy.realmSet$lastSeen(realmObjectSource.realmGet$lastSeen());
        realmObjectCopy.realmSet$username(realmObjectSource.realmGet$username());
        return realmObject;
    }

    public static long insert(Realm realm, com.disappears.android.model.response.Profile object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$friendName();
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
        String realmGet$name = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        Number realmGet$flags = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$flags();
        if (realmGet$flags != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
        }
        String realmGet$imageUrl = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, realmGet$imageUrl, false);
        }
        String realmGet$imageVersion = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageVersion();
        if (realmGet$imageVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, realmGet$imageVersion, false);
        }
        String realmGet$imageIv = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageIv();
        if (realmGet$imageIv != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIvIndex, rowIndex, realmGet$imageIv, false);
        }
        String realmGet$lastSeen = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$lastSeen();
        if (realmGet$lastSeen != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, realmGet$lastSeen, false);
        }
        String realmGet$username = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        com.disappears.android.model.response.Profile object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.Profile) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$friendName();
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
            String realmGet$name = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            Number realmGet$flags = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$flags();
            if (realmGet$flags != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
            }
            String realmGet$imageUrl = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageUrl();
            if (realmGet$imageUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, realmGet$imageUrl, false);
            }
            String realmGet$imageVersion = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageVersion();
            if (realmGet$imageVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, realmGet$imageVersion, false);
            }
            String realmGet$imageIv = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageIv();
            if (realmGet$imageIv != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIvIndex, rowIndex, realmGet$imageIv, false);
            }
            String realmGet$lastSeen = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$lastSeen();
            if (realmGet$lastSeen != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, realmGet$lastSeen, false);
            }
            String realmGet$username = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$username();
            if (realmGet$username != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.disappears.android.model.response.Profile object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$friendName();
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
        String realmGet$name = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        Number realmGet$flags = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$flags();
        if (realmGet$flags != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.flagsIndex, rowIndex, false);
        }
        String realmGet$imageUrl = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, false);
        }
        String realmGet$imageVersion = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageVersion();
        if (realmGet$imageVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, realmGet$imageVersion, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, false);
        }
        String realmGet$imageIv = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageIv();
        if (realmGet$imageIv != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIvIndex, rowIndex, realmGet$imageIv, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageIvIndex, rowIndex, false);
        }
        String realmGet$lastSeen = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$lastSeen();
        if (realmGet$lastSeen != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, realmGet$lastSeen, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, false);
        }
        String realmGet$username = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$username();
        if (realmGet$username != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.usernameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.Profile.class);
        long tableNativePtr = table.getNativePtr();
        ProfileColumnInfo columnInfo = (ProfileColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.Profile.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        com.disappears.android.model.response.Profile object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.Profile) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$friendName();
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
            String realmGet$name = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            Number realmGet$flags = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$flags();
            if (realmGet$flags != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.flagsIndex, rowIndex, realmGet$flags.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.flagsIndex, rowIndex, false);
            }
            String realmGet$imageUrl = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageUrl();
            if (realmGet$imageUrl != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, realmGet$imageUrl, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageUrlIndex, rowIndex, false);
            }
            String realmGet$imageVersion = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageVersion();
            if (realmGet$imageVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, realmGet$imageVersion, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageVersionIndex, rowIndex, false);
            }
            String realmGet$imageIv = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$imageIv();
            if (realmGet$imageIv != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIvIndex, rowIndex, realmGet$imageIv, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageIvIndex, rowIndex, false);
            }
            String realmGet$lastSeen = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$lastSeen();
            if (realmGet$lastSeen != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, realmGet$lastSeen, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastSeenIndex, rowIndex, false);
            }
            String realmGet$username = ((com_disappears_android_model_response_ProfileRealmProxyInterface) object).realmGet$username();
            if (realmGet$username != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.usernameIndex, rowIndex, realmGet$username, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.usernameIndex, rowIndex, false);
            }
        }
    }

    public static com.disappears.android.model.response.Profile createDetachedCopy(com.disappears.android.model.response.Profile realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.disappears.android.model.response.Profile unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.disappears.android.model.response.Profile();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.disappears.android.model.response.Profile) cachedObject.object;
            }
            unmanagedObject = (com.disappears.android.model.response.Profile) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_disappears_android_model_response_ProfileRealmProxyInterface unmanagedCopy = (com_disappears_android_model_response_ProfileRealmProxyInterface) unmanagedObject;
        com_disappears_android_model_response_ProfileRealmProxyInterface realmSource = (com_disappears_android_model_response_ProfileRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$friendName(realmSource.realmGet$friendName());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$flags(realmSource.realmGet$flags());
        unmanagedCopy.realmSet$imageUrl(realmSource.realmGet$imageUrl());
        unmanagedCopy.realmSet$imageVersion(realmSource.realmGet$imageVersion());
        unmanagedCopy.realmSet$imageIv(realmSource.realmGet$imageIv());
        unmanagedCopy.realmSet$lastSeen(realmSource.realmGet$lastSeen());
        unmanagedCopy.realmSet$username(realmSource.realmGet$username());

        return unmanagedObject;
    }

    static com.disappears.android.model.response.Profile update(Realm realm, com.disappears.android.model.response.Profile realmObject, com.disappears.android.model.response.Profile newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_disappears_android_model_response_ProfileRealmProxyInterface realmObjectTarget = (com_disappears_android_model_response_ProfileRealmProxyInterface) realmObject;
        com_disappears_android_model_response_ProfileRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_ProfileRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$flags(realmObjectSource.realmGet$flags());
        realmObjectTarget.realmSet$imageUrl(realmObjectSource.realmGet$imageUrl());
        realmObjectTarget.realmSet$imageVersion(realmObjectSource.realmGet$imageVersion());
        realmObjectTarget.realmSet$imageIv(realmObjectSource.realmGet$imageIv());
        realmObjectTarget.realmSet$lastSeen(realmObjectSource.realmGet$lastSeen());
        realmObjectTarget.realmSet$username(realmObjectSource.realmGet$username());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Profile = proxy[");
        stringBuilder.append("{friendName:");
        stringBuilder.append(realmGet$friendName() != null ? realmGet$friendName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{flags:");
        stringBuilder.append(realmGet$flags() != null ? realmGet$flags() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imageUrl:");
        stringBuilder.append(realmGet$imageUrl() != null ? realmGet$imageUrl() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imageVersion:");
        stringBuilder.append(realmGet$imageVersion() != null ? realmGet$imageVersion() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imageIv:");
        stringBuilder.append(realmGet$imageIv() != null ? realmGet$imageIv() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastSeen:");
        stringBuilder.append(realmGet$lastSeen() != null ? realmGet$lastSeen() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{username:");
        stringBuilder.append(realmGet$username() != null ? realmGet$username() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}

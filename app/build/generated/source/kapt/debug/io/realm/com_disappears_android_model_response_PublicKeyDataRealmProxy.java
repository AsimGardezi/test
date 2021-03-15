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
public class com_disappears_android_model_response_PublicKeyDataRealmProxy extends com.disappears.android.model.response.PublicKeyData
    implements RealmObjectProxy, com_disappears_android_model_response_PublicKeyDataRealmProxyInterface {

    static final class PublicKeyDataColumnInfo extends ColumnInfo {
        long friendNameIndex;
        long versionIndex;
        long dhPubIndex;
        long dhPubSigIndex;
        long dsaPubIndex;
        long dsaPubSigIndex;

        PublicKeyDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PublicKeyData");
            this.friendNameIndex = addColumnDetails("friendName", "friendName", objectSchemaInfo);
            this.versionIndex = addColumnDetails("version", "version", objectSchemaInfo);
            this.dhPubIndex = addColumnDetails("dhPub", "dhPub", objectSchemaInfo);
            this.dhPubSigIndex = addColumnDetails("dhPubSig", "dhPubSig", objectSchemaInfo);
            this.dsaPubIndex = addColumnDetails("dsaPub", "dsaPub", objectSchemaInfo);
            this.dsaPubSigIndex = addColumnDetails("dsaPubSig", "dsaPubSig", objectSchemaInfo);
        }

        PublicKeyDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PublicKeyDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PublicKeyDataColumnInfo src = (PublicKeyDataColumnInfo) rawSrc;
            final PublicKeyDataColumnInfo dst = (PublicKeyDataColumnInfo) rawDst;
            dst.friendNameIndex = src.friendNameIndex;
            dst.versionIndex = src.versionIndex;
            dst.dhPubIndex = src.dhPubIndex;
            dst.dhPubSigIndex = src.dhPubSigIndex;
            dst.dsaPubIndex = src.dsaPubIndex;
            dst.dsaPubSigIndex = src.dsaPubSigIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PublicKeyDataColumnInfo columnInfo;
    private ProxyState<com.disappears.android.model.response.PublicKeyData> proxyState;

    com_disappears_android_model_response_PublicKeyDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PublicKeyDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.disappears.android.model.response.PublicKeyData>(this);
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
    public String realmGet$version() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.versionIndex);
    }

    @Override
    public void realmSet$version(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.versionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.versionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.versionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.versionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dhPub() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dhPubIndex);
    }

    @Override
    public void realmSet$dhPub(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dhPubIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dhPubIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dhPubIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dhPubIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dhPubSig() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dhPubSigIndex);
    }

    @Override
    public void realmSet$dhPubSig(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dhPubSigIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dhPubSigIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dhPubSigIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dhPubSigIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dsaPub() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dsaPubIndex);
    }

    @Override
    public void realmSet$dsaPub(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dsaPubIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dsaPubIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dsaPubIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dsaPubIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dsaPubSig() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dsaPubSigIndex);
    }

    @Override
    public void realmSet$dsaPubSig(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dsaPubSigIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dsaPubSigIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dsaPubSigIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dsaPubSigIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PublicKeyData", 6, 0);
        builder.addPersistedProperty("friendName", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("version", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dhPub", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dhPubSig", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dsaPub", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dsaPubSig", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PublicKeyDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PublicKeyDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PublicKeyData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PublicKeyData";
    }

    @SuppressWarnings("cast")
    public static com.disappears.android.model.response.PublicKeyData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.disappears.android.model.response.PublicKeyData obj = null;
        if (update) {
            Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
            PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_disappears_android_model_response_PublicKeyDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("friendName")) {
                if (json.isNull("friendName")) {
                    obj = (io.realm.com_disappears_android_model_response_PublicKeyDataRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.PublicKeyData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_disappears_android_model_response_PublicKeyDataRealmProxy) realm.createObjectInternal(com.disappears.android.model.response.PublicKeyData.class, json.getString("friendName"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'friendName'.");
            }
        }

        final com_disappears_android_model_response_PublicKeyDataRealmProxyInterface objProxy = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) obj;
        if (json.has("version")) {
            if (json.isNull("version")) {
                objProxy.realmSet$version(null);
            } else {
                objProxy.realmSet$version((String) json.getString("version"));
            }
        }
        if (json.has("dhPub")) {
            if (json.isNull("dhPub")) {
                objProxy.realmSet$dhPub(null);
            } else {
                objProxy.realmSet$dhPub((String) json.getString("dhPub"));
            }
        }
        if (json.has("dhPubSig")) {
            if (json.isNull("dhPubSig")) {
                objProxy.realmSet$dhPubSig(null);
            } else {
                objProxy.realmSet$dhPubSig((String) json.getString("dhPubSig"));
            }
        }
        if (json.has("dsaPub")) {
            if (json.isNull("dsaPub")) {
                objProxy.realmSet$dsaPub(null);
            } else {
                objProxy.realmSet$dsaPub((String) json.getString("dsaPub"));
            }
        }
        if (json.has("dsaPubSig")) {
            if (json.isNull("dsaPubSig")) {
                objProxy.realmSet$dsaPubSig(null);
            } else {
                objProxy.realmSet$dsaPubSig((String) json.getString("dsaPubSig"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.disappears.android.model.response.PublicKeyData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.disappears.android.model.response.PublicKeyData obj = new com.disappears.android.model.response.PublicKeyData();
        final com_disappears_android_model_response_PublicKeyDataRealmProxyInterface objProxy = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) obj;
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
            } else if (name.equals("version")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$version((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$version(null);
                }
            } else if (name.equals("dhPub")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dhPub((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dhPub(null);
                }
            } else if (name.equals("dhPubSig")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dhPubSig((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dhPubSig(null);
                }
            } else if (name.equals("dsaPub")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dsaPub((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dsaPub(null);
                }
            } else if (name.equals("dsaPubSig")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dsaPubSig((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dsaPubSig(null);
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

    public static com.disappears.android.model.response.PublicKeyData copyOrUpdate(Realm realm, com.disappears.android.model.response.PublicKeyData object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.disappears.android.model.response.PublicKeyData) cachedRealmObject;
        }

        com.disappears.android.model.response.PublicKeyData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
            PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
            long pkColumnIndex = columnInfo.friendNameIndex;
            String value = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$friendName();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_disappears_android_model_response_PublicKeyDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.disappears.android.model.response.PublicKeyData copy(Realm realm, com.disappears.android.model.response.PublicKeyData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.response.PublicKeyData) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.disappears.android.model.response.PublicKeyData realmObject = realm.createObjectInternal(com.disappears.android.model.response.PublicKeyData.class, ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) newObject).realmGet$friendName(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) newObject;
        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface realmObjectCopy = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$version(realmObjectSource.realmGet$version());
        realmObjectCopy.realmSet$dhPub(realmObjectSource.realmGet$dhPub());
        realmObjectCopy.realmSet$dhPubSig(realmObjectSource.realmGet$dhPubSig());
        realmObjectCopy.realmSet$dsaPub(realmObjectSource.realmGet$dsaPub());
        realmObjectCopy.realmSet$dsaPubSig(realmObjectSource.realmGet$dsaPubSig());
        return realmObject;
    }

    public static long insert(Realm realm, com.disappears.android.model.response.PublicKeyData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
        long tableNativePtr = table.getNativePtr();
        PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$friendName();
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
        String realmGet$version = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$version();
        if (realmGet$version != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.versionIndex, rowIndex, realmGet$version, false);
        }
        String realmGet$dhPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPub();
        if (realmGet$dhPub != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dhPubIndex, rowIndex, realmGet$dhPub, false);
        }
        String realmGet$dhPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPubSig();
        if (realmGet$dhPubSig != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, realmGet$dhPubSig, false);
        }
        String realmGet$dsaPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPub();
        if (realmGet$dsaPub != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, realmGet$dsaPub, false);
        }
        String realmGet$dsaPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPubSig();
        if (realmGet$dsaPubSig != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, realmGet$dsaPubSig, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
        long tableNativePtr = table.getNativePtr();
        PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        com.disappears.android.model.response.PublicKeyData object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.PublicKeyData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$friendName();
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
            String realmGet$version = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$version();
            if (realmGet$version != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.versionIndex, rowIndex, realmGet$version, false);
            }
            String realmGet$dhPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPub();
            if (realmGet$dhPub != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dhPubIndex, rowIndex, realmGet$dhPub, false);
            }
            String realmGet$dhPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPubSig();
            if (realmGet$dhPubSig != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, realmGet$dhPubSig, false);
            }
            String realmGet$dsaPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPub();
            if (realmGet$dsaPub != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, realmGet$dsaPub, false);
            }
            String realmGet$dsaPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPubSig();
            if (realmGet$dsaPubSig != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, realmGet$dsaPubSig, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.disappears.android.model.response.PublicKeyData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
        long tableNativePtr = table.getNativePtr();
        PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        String primaryKeyValue = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$friendName();
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
        String realmGet$version = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$version();
        if (realmGet$version != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.versionIndex, rowIndex, realmGet$version, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.versionIndex, rowIndex, false);
        }
        String realmGet$dhPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPub();
        if (realmGet$dhPub != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dhPubIndex, rowIndex, realmGet$dhPub, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dhPubIndex, rowIndex, false);
        }
        String realmGet$dhPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPubSig();
        if (realmGet$dhPubSig != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, realmGet$dhPubSig, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, false);
        }
        String realmGet$dsaPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPub();
        if (realmGet$dsaPub != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, realmGet$dsaPub, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, false);
        }
        String realmGet$dsaPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPubSig();
        if (realmGet$dsaPubSig != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, realmGet$dsaPubSig, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.response.PublicKeyData.class);
        long tableNativePtr = table.getNativePtr();
        PublicKeyDataColumnInfo columnInfo = (PublicKeyDataColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.response.PublicKeyData.class);
        long pkColumnIndex = columnInfo.friendNameIndex;
        com.disappears.android.model.response.PublicKeyData object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.response.PublicKeyData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$friendName();
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
            String realmGet$version = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$version();
            if (realmGet$version != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.versionIndex, rowIndex, realmGet$version, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.versionIndex, rowIndex, false);
            }
            String realmGet$dhPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPub();
            if (realmGet$dhPub != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dhPubIndex, rowIndex, realmGet$dhPub, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dhPubIndex, rowIndex, false);
            }
            String realmGet$dhPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dhPubSig();
            if (realmGet$dhPubSig != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, realmGet$dhPubSig, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dhPubSigIndex, rowIndex, false);
            }
            String realmGet$dsaPub = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPub();
            if (realmGet$dsaPub != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, realmGet$dsaPub, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dsaPubIndex, rowIndex, false);
            }
            String realmGet$dsaPubSig = ((com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) object).realmGet$dsaPubSig();
            if (realmGet$dsaPubSig != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, realmGet$dsaPubSig, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dsaPubSigIndex, rowIndex, false);
            }
        }
    }

    public static com.disappears.android.model.response.PublicKeyData createDetachedCopy(com.disappears.android.model.response.PublicKeyData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.disappears.android.model.response.PublicKeyData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.disappears.android.model.response.PublicKeyData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.disappears.android.model.response.PublicKeyData) cachedObject.object;
            }
            unmanagedObject = (com.disappears.android.model.response.PublicKeyData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface unmanagedCopy = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) unmanagedObject;
        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface realmSource = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$friendName(realmSource.realmGet$friendName());
        unmanagedCopy.realmSet$version(realmSource.realmGet$version());
        unmanagedCopy.realmSet$dhPub(realmSource.realmGet$dhPub());
        unmanagedCopy.realmSet$dhPubSig(realmSource.realmGet$dhPubSig());
        unmanagedCopy.realmSet$dsaPub(realmSource.realmGet$dsaPub());
        unmanagedCopy.realmSet$dsaPubSig(realmSource.realmGet$dsaPubSig());

        return unmanagedObject;
    }

    static com.disappears.android.model.response.PublicKeyData update(Realm realm, com.disappears.android.model.response.PublicKeyData realmObject, com.disappears.android.model.response.PublicKeyData newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface realmObjectTarget = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) realmObject;
        com_disappears_android_model_response_PublicKeyDataRealmProxyInterface realmObjectSource = (com_disappears_android_model_response_PublicKeyDataRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$version(realmObjectSource.realmGet$version());
        realmObjectTarget.realmSet$dhPub(realmObjectSource.realmGet$dhPub());
        realmObjectTarget.realmSet$dhPubSig(realmObjectSource.realmGet$dhPubSig());
        realmObjectTarget.realmSet$dsaPub(realmObjectSource.realmGet$dsaPub());
        realmObjectTarget.realmSet$dsaPubSig(realmObjectSource.realmGet$dsaPubSig());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PublicKeyData = proxy[");
        stringBuilder.append("{friendName:");
        stringBuilder.append(realmGet$friendName() != null ? realmGet$friendName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{version:");
        stringBuilder.append(realmGet$version() != null ? realmGet$version() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dhPub:");
        stringBuilder.append(realmGet$dhPub() != null ? realmGet$dhPub() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dhPubSig:");
        stringBuilder.append(realmGet$dhPubSig() != null ? realmGet$dhPubSig() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dsaPub:");
        stringBuilder.append(realmGet$dsaPub() != null ? realmGet$dsaPub() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dsaPubSig:");
        stringBuilder.append(realmGet$dsaPubSig() != null ? realmGet$dsaPubSig() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_disappears_android_model_response_PublicKeyDataRealmProxy aPublicKeyData = (com_disappears_android_model_response_PublicKeyDataRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPublicKeyData.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPublicKeyData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPublicKeyData.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

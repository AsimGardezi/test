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
public class com_disappears_android_model_FriendSettingsRealmProxy extends com.disappears.android.model.FriendSettings
    implements RealmObjectProxy, com_disappears_android_model_FriendSettingsRealmProxyInterface {

    static final class FriendSettingsColumnInfo extends ColumnInfo {
        long nameIndex;
        long mutedIndex;

        FriendSettingsColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FriendSettings");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.mutedIndex = addColumnDetails("muted", "muted", objectSchemaInfo);
        }

        FriendSettingsColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FriendSettingsColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FriendSettingsColumnInfo src = (FriendSettingsColumnInfo) rawSrc;
            final FriendSettingsColumnInfo dst = (FriendSettingsColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.mutedIndex = src.mutedIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FriendSettingsColumnInfo columnInfo;
    private ProxyState<com.disappears.android.model.FriendSettings> proxyState;

    com_disappears_android_model_FriendSettingsRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FriendSettingsColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.disappears.android.model.FriendSettings>(this);
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
    public boolean realmGet$muted() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.mutedIndex);
    }

    @Override
    public void realmSet$muted(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.mutedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.mutedIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("FriendSettings", 2, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("muted", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FriendSettingsColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FriendSettingsColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FriendSettings";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FriendSettings";
    }

    @SuppressWarnings("cast")
    public static com.disappears.android.model.FriendSettings createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.disappears.android.model.FriendSettings obj = null;
        if (update) {
            Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
            FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_disappears_android_model_FriendSettingsRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("name")) {
                if (json.isNull("name")) {
                    obj = (io.realm.com_disappears_android_model_FriendSettingsRealmProxy) realm.createObjectInternal(com.disappears.android.model.FriendSettings.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_disappears_android_model_FriendSettingsRealmProxy) realm.createObjectInternal(com.disappears.android.model.FriendSettings.class, json.getString("name"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'name'.");
            }
        }

        final com_disappears_android_model_FriendSettingsRealmProxyInterface objProxy = (com_disappears_android_model_FriendSettingsRealmProxyInterface) obj;
        if (json.has("muted")) {
            if (json.isNull("muted")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'muted' to null.");
            } else {
                objProxy.realmSet$muted((boolean) json.getBoolean("muted"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.disappears.android.model.FriendSettings createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.disappears.android.model.FriendSettings obj = new com.disappears.android.model.FriendSettings();
        final com_disappears_android_model_FriendSettingsRealmProxyInterface objProxy = (com_disappears_android_model_FriendSettingsRealmProxyInterface) obj;
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
            } else if (name.equals("muted")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$muted((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'muted' to null.");
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

    public static com.disappears.android.model.FriendSettings copyOrUpdate(Realm realm, com.disappears.android.model.FriendSettings object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.disappears.android.model.FriendSettings) cachedRealmObject;
        }

        com.disappears.android.model.FriendSettings realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
            FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
            long pkColumnIndex = columnInfo.nameIndex;
            String value = ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$name();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_disappears_android_model_FriendSettingsRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.disappears.android.model.FriendSettings copy(Realm realm, com.disappears.android.model.FriendSettings newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.FriendSettings) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.disappears.android.model.FriendSettings realmObject = realm.createObjectInternal(com.disappears.android.model.FriendSettings.class, ((com_disappears_android_model_FriendSettingsRealmProxyInterface) newObject).realmGet$name(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_disappears_android_model_FriendSettingsRealmProxyInterface realmObjectSource = (com_disappears_android_model_FriendSettingsRealmProxyInterface) newObject;
        com_disappears_android_model_FriendSettingsRealmProxyInterface realmObjectCopy = (com_disappears_android_model_FriendSettingsRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$muted(realmObjectSource.realmGet$muted());
        return realmObject;
    }

    public static long insert(Realm realm, com.disappears.android.model.FriendSettings object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
        long tableNativePtr = table.getNativePtr();
        FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
        long pkColumnIndex = columnInfo.nameIndex;
        String primaryKeyValue = ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$name();
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
        Table.nativeSetBoolean(tableNativePtr, columnInfo.mutedIndex, rowIndex, ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$muted(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
        long tableNativePtr = table.getNativePtr();
        FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
        long pkColumnIndex = columnInfo.nameIndex;
        com.disappears.android.model.FriendSettings object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.FriendSettings) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$name();
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
            Table.nativeSetBoolean(tableNativePtr, columnInfo.mutedIndex, rowIndex, ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$muted(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.disappears.android.model.FriendSettings object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
        long tableNativePtr = table.getNativePtr();
        FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
        long pkColumnIndex = columnInfo.nameIndex;
        String primaryKeyValue = ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$name();
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
        Table.nativeSetBoolean(tableNativePtr, columnInfo.mutedIndex, rowIndex, ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$muted(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.FriendSettings.class);
        long tableNativePtr = table.getNativePtr();
        FriendSettingsColumnInfo columnInfo = (FriendSettingsColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.FriendSettings.class);
        long pkColumnIndex = columnInfo.nameIndex;
        com.disappears.android.model.FriendSettings object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.FriendSettings) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$name();
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
            Table.nativeSetBoolean(tableNativePtr, columnInfo.mutedIndex, rowIndex, ((com_disappears_android_model_FriendSettingsRealmProxyInterface) object).realmGet$muted(), false);
        }
    }

    public static com.disappears.android.model.FriendSettings createDetachedCopy(com.disappears.android.model.FriendSettings realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.disappears.android.model.FriendSettings unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.disappears.android.model.FriendSettings();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.disappears.android.model.FriendSettings) cachedObject.object;
            }
            unmanagedObject = (com.disappears.android.model.FriendSettings) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_disappears_android_model_FriendSettingsRealmProxyInterface unmanagedCopy = (com_disappears_android_model_FriendSettingsRealmProxyInterface) unmanagedObject;
        com_disappears_android_model_FriendSettingsRealmProxyInterface realmSource = (com_disappears_android_model_FriendSettingsRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$muted(realmSource.realmGet$muted());

        return unmanagedObject;
    }

    static com.disappears.android.model.FriendSettings update(Realm realm, com.disappears.android.model.FriendSettings realmObject, com.disappears.android.model.FriendSettings newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_disappears_android_model_FriendSettingsRealmProxyInterface realmObjectTarget = (com_disappears_android_model_FriendSettingsRealmProxyInterface) realmObject;
        com_disappears_android_model_FriendSettingsRealmProxyInterface realmObjectSource = (com_disappears_android_model_FriendSettingsRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$muted(realmObjectSource.realmGet$muted());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("FriendSettings = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{muted:");
        stringBuilder.append(realmGet$muted());
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
        com_disappears_android_model_FriendSettingsRealmProxy aFriendSettings = (com_disappears_android_model_FriendSettingsRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aFriendSettings.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFriendSettings.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aFriendSettings.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

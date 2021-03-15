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
public class com_disappears_android_model_MessageRealmProxy extends com.disappears.android.model.Message
    implements RealmObjectProxy, com_disappears_android_model_MessageRealmProxyInterface {

    static final class MessageColumnInfo extends ColumnInfo {
        long idIndex;
        long numericIdIndex;
        long dataIndex;
        long dateTimeIndex;
        long fromIndex;
        long fromVersionIndex;
        long ivIndex;
        long mimeTypeIndex;
        long toIndex;
        long toVersionIndex;
        long readIndex;
        long resendIndex;

        MessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Message");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.numericIdIndex = addColumnDetails("numericId", "numericId", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.dateTimeIndex = addColumnDetails("dateTime", "dateTime", objectSchemaInfo);
            this.fromIndex = addColumnDetails("from", "from", objectSchemaInfo);
            this.fromVersionIndex = addColumnDetails("fromVersion", "fromVersion", objectSchemaInfo);
            this.ivIndex = addColumnDetails("iv", "iv", objectSchemaInfo);
            this.mimeTypeIndex = addColumnDetails("mimeType", "mimeType", objectSchemaInfo);
            this.toIndex = addColumnDetails("to", "to", objectSchemaInfo);
            this.toVersionIndex = addColumnDetails("toVersion", "toVersion", objectSchemaInfo);
            this.readIndex = addColumnDetails("read", "read", objectSchemaInfo);
            this.resendIndex = addColumnDetails("resend", "resend", objectSchemaInfo);
        }

        MessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MessageColumnInfo src = (MessageColumnInfo) rawSrc;
            final MessageColumnInfo dst = (MessageColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.numericIdIndex = src.numericIdIndex;
            dst.dataIndex = src.dataIndex;
            dst.dateTimeIndex = src.dateTimeIndex;
            dst.fromIndex = src.fromIndex;
            dst.fromVersionIndex = src.fromVersionIndex;
            dst.ivIndex = src.ivIndex;
            dst.mimeTypeIndex = src.mimeTypeIndex;
            dst.toIndex = src.toIndex;
            dst.toVersionIndex = src.toVersionIndex;
            dst.readIndex = src.readIndex;
            dst.resendIndex = src.resendIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MessageColumnInfo columnInfo;
    private ProxyState<com.disappears.android.model.Message> proxyState;

    com_disappears_android_model_MessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.disappears.android.model.Message>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$numericId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.numericIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.numericIdIndex);
    }

    @Override
    public void realmSet$numericId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.numericIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.numericIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.numericIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.numericIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataIndex);
    }

    @Override
    public void realmSet$data(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Long realmGet$dateTime() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.dateTimeIndex)) {
            return null;
        }
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateTimeIndex);
    }

    @Override
    public void realmSet$dateTime(Long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dateTimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.dateTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dateTimeIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.dateTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$from() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fromIndex);
    }

    @Override
    public void realmSet$from(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.fromIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fromIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fromVersion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fromVersionIndex);
    }

    @Override
    public void realmSet$fromVersion(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromVersionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.fromVersionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromVersionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fromVersionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$iv() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.ivIndex);
    }

    @Override
    public void realmSet$iv(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ivIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.ivIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ivIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.ivIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mimeType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mimeTypeIndex);
    }

    @Override
    public void realmSet$mimeType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mimeTypeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.mimeTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mimeTypeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mimeTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$to() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.toIndex);
    }

    @Override
    public void realmSet$to(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.toIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.toIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.toIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.toIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$toVersion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.toVersionIndex);
    }

    @Override
    public void realmSet$toVersion(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.toVersionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.toVersionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.toVersionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.toVersionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readIndex);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$resend() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.resendIndex);
    }

    @Override
    public void realmSet$resend(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.resendIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.resendIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Message", 12, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("numericId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("data", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("dateTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("from", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fromVersion", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("iv", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("mimeType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("to", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("toVersion", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("resend", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Message";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Message";
    }

    @SuppressWarnings("cast")
    public static com.disappears.android.model.Message createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.disappears.android.model.Message obj = null;
        if (update) {
            Table table = realm.getTable(com.disappears.android.model.Message.class);
            MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_disappears_android_model_MessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_disappears_android_model_MessageRealmProxy) realm.createObjectInternal(com.disappears.android.model.Message.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_disappears_android_model_MessageRealmProxy) realm.createObjectInternal(com.disappears.android.model.Message.class, json.getString("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_disappears_android_model_MessageRealmProxyInterface objProxy = (com_disappears_android_model_MessageRealmProxyInterface) obj;
        if (json.has("numericId")) {
            if (json.isNull("numericId")) {
                objProxy.realmSet$numericId(null);
            } else {
                objProxy.realmSet$numericId((int) json.getInt("numericId"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                objProxy.realmSet$data((String) json.getString("data"));
            }
        }
        if (json.has("dateTime")) {
            if (json.isNull("dateTime")) {
                objProxy.realmSet$dateTime(null);
            } else {
                objProxy.realmSet$dateTime((long) json.getLong("dateTime"));
            }
        }
        if (json.has("from")) {
            if (json.isNull("from")) {
                objProxy.realmSet$from(null);
            } else {
                objProxy.realmSet$from((String) json.getString("from"));
            }
        }
        if (json.has("fromVersion")) {
            if (json.isNull("fromVersion")) {
                objProxy.realmSet$fromVersion(null);
            } else {
                objProxy.realmSet$fromVersion((String) json.getString("fromVersion"));
            }
        }
        if (json.has("iv")) {
            if (json.isNull("iv")) {
                objProxy.realmSet$iv(null);
            } else {
                objProxy.realmSet$iv((String) json.getString("iv"));
            }
        }
        if (json.has("mimeType")) {
            if (json.isNull("mimeType")) {
                objProxy.realmSet$mimeType(null);
            } else {
                objProxy.realmSet$mimeType((String) json.getString("mimeType"));
            }
        }
        if (json.has("to")) {
            if (json.isNull("to")) {
                objProxy.realmSet$to(null);
            } else {
                objProxy.realmSet$to((String) json.getString("to"));
            }
        }
        if (json.has("toVersion")) {
            if (json.isNull("toVersion")) {
                objProxy.realmSet$toVersion(null);
            } else {
                objProxy.realmSet$toVersion((String) json.getString("toVersion"));
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        if (json.has("resend")) {
            if (json.isNull("resend")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'resend' to null.");
            } else {
                objProxy.realmSet$resend((int) json.getInt("resend"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.disappears.android.model.Message createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.disappears.android.model.Message obj = new com.disappears.android.model.Message();
        final com_disappears_android_model_MessageRealmProxyInterface objProxy = (com_disappears_android_model_MessageRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("numericId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numericId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$numericId(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$data((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                }
            } else if (name.equals("dateTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dateTime(null);
                }
            } else if (name.equals("from")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$from((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$from(null);
                }
            } else if (name.equals("fromVersion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fromVersion((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fromVersion(null);
                }
            } else if (name.equals("iv")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$iv((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$iv(null);
                }
            } else if (name.equals("mimeType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mimeType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mimeType(null);
                }
            } else if (name.equals("to")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$to((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$to(null);
                }
            } else if (name.equals("toVersion")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$toVersion((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$toVersion(null);
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else if (name.equals("resend")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$resend((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'resend' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.disappears.android.model.Message copyOrUpdate(Realm realm, com.disappears.android.model.Message object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.disappears.android.model.Message) cachedRealmObject;
        }

        com.disappears.android.model.Message realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.disappears.android.model.Message.class);
            MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
            long pkColumnIndex = columnInfo.idIndex;
            String value = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$id();
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_disappears_android_model_MessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.disappears.android.model.Message copy(Realm realm, com.disappears.android.model.Message newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.disappears.android.model.Message) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.disappears.android.model.Message realmObject = realm.createObjectInternal(com.disappears.android.model.Message.class, ((com_disappears_android_model_MessageRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_disappears_android_model_MessageRealmProxyInterface realmObjectSource = (com_disappears_android_model_MessageRealmProxyInterface) newObject;
        com_disappears_android_model_MessageRealmProxyInterface realmObjectCopy = (com_disappears_android_model_MessageRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$numericId(realmObjectSource.realmGet$numericId());
        realmObjectCopy.realmSet$data(realmObjectSource.realmGet$data());
        realmObjectCopy.realmSet$dateTime(realmObjectSource.realmGet$dateTime());
        realmObjectCopy.realmSet$from(realmObjectSource.realmGet$from());
        realmObjectCopy.realmSet$fromVersion(realmObjectSource.realmGet$fromVersion());
        realmObjectCopy.realmSet$iv(realmObjectSource.realmGet$iv());
        realmObjectCopy.realmSet$mimeType(realmObjectSource.realmGet$mimeType());
        realmObjectCopy.realmSet$to(realmObjectSource.realmGet$to());
        realmObjectCopy.realmSet$toVersion(realmObjectSource.realmGet$toVersion());
        realmObjectCopy.realmSet$read(realmObjectSource.realmGet$read());
        realmObjectCopy.realmSet$resend(realmObjectSource.realmGet$resend());
        return realmObject;
    }

    public static long insert(Realm realm, com.disappears.android.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$id();
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
        Number realmGet$numericId = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$numericId();
        if (realmGet$numericId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.numericIdIndex, rowIndex, realmGet$numericId.longValue(), false);
        }
        String realmGet$data = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        }
        Number realmGet$dateTime = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$dateTime();
        if (realmGet$dateTime != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, realmGet$dateTime.longValue(), false);
        }
        String realmGet$from = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIndex, rowIndex, realmGet$from, false);
        }
        String realmGet$fromVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$fromVersion();
        if (realmGet$fromVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, realmGet$fromVersion, false);
        }
        String realmGet$iv = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$iv();
        if (realmGet$iv != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ivIndex, rowIndex, realmGet$iv, false);
        }
        String realmGet$mimeType = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, realmGet$mimeType, false);
        }
        String realmGet$to = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIndex, rowIndex, realmGet$to, false);
        }
        String realmGet$toVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$toVersion();
        if (realmGet$toVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toVersionIndex, rowIndex, realmGet$toVersion, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.resendIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$resend(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.disappears.android.model.Message object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$id();
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
            Number realmGet$numericId = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$numericId();
            if (realmGet$numericId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.numericIdIndex, rowIndex, realmGet$numericId.longValue(), false);
            }
            String realmGet$data = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            }
            Number realmGet$dateTime = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$dateTime();
            if (realmGet$dateTime != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, realmGet$dateTime.longValue(), false);
            }
            String realmGet$from = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$from();
            if (realmGet$from != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIndex, rowIndex, realmGet$from, false);
            }
            String realmGet$fromVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$fromVersion();
            if (realmGet$fromVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, realmGet$fromVersion, false);
            }
            String realmGet$iv = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$iv();
            if (realmGet$iv != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ivIndex, rowIndex, realmGet$iv, false);
            }
            String realmGet$mimeType = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$mimeType();
            if (realmGet$mimeType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, realmGet$mimeType, false);
            }
            String realmGet$to = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$to();
            if (realmGet$to != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIndex, rowIndex, realmGet$to, false);
            }
            String realmGet$toVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$toVersion();
            if (realmGet$toVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toVersionIndex, rowIndex, realmGet$toVersion, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.resendIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$resend(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.disappears.android.model.Message object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.disappears.android.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        String primaryKeyValue = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$id();
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
        Number realmGet$numericId = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$numericId();
        if (realmGet$numericId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.numericIdIndex, rowIndex, realmGet$numericId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.numericIdIndex, rowIndex, false);
        }
        String realmGet$data = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
        }
        Number realmGet$dateTime = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$dateTime();
        if (realmGet$dateTime != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, realmGet$dateTime.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, false);
        }
        String realmGet$from = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$from();
        if (realmGet$from != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIndex, rowIndex, realmGet$from, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromIndex, rowIndex, false);
        }
        String realmGet$fromVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$fromVersion();
        if (realmGet$fromVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, realmGet$fromVersion, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, false);
        }
        String realmGet$iv = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$iv();
        if (realmGet$iv != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.ivIndex, rowIndex, realmGet$iv, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ivIndex, rowIndex, false);
        }
        String realmGet$mimeType = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, realmGet$mimeType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, false);
        }
        String realmGet$to = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$to();
        if (realmGet$to != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIndex, rowIndex, realmGet$to, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.toIndex, rowIndex, false);
        }
        String realmGet$toVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$toVersion();
        if (realmGet$toVersion != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toVersionIndex, rowIndex, realmGet$toVersion, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.toVersionIndex, rowIndex, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$read(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.resendIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$resend(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.disappears.android.model.Message.class);
        long tableNativePtr = table.getNativePtr();
        MessageColumnInfo columnInfo = (MessageColumnInfo) realm.getSchema().getColumnInfo(com.disappears.android.model.Message.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.disappears.android.model.Message object = null;
        while (objects.hasNext()) {
            object = (com.disappears.android.model.Message) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            String primaryKeyValue = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$id();
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
            Number realmGet$numericId = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$numericId();
            if (realmGet$numericId != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.numericIdIndex, rowIndex, realmGet$numericId.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.numericIdIndex, rowIndex, false);
            }
            String realmGet$data = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
            }
            Number realmGet$dateTime = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$dateTime();
            if (realmGet$dateTime != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, realmGet$dateTime.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dateTimeIndex, rowIndex, false);
            }
            String realmGet$from = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$from();
            if (realmGet$from != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIndex, rowIndex, realmGet$from, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromIndex, rowIndex, false);
            }
            String realmGet$fromVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$fromVersion();
            if (realmGet$fromVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, realmGet$fromVersion, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromVersionIndex, rowIndex, false);
            }
            String realmGet$iv = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$iv();
            if (realmGet$iv != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.ivIndex, rowIndex, realmGet$iv, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ivIndex, rowIndex, false);
            }
            String realmGet$mimeType = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$mimeType();
            if (realmGet$mimeType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, realmGet$mimeType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mimeTypeIndex, rowIndex, false);
            }
            String realmGet$to = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$to();
            if (realmGet$to != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIndex, rowIndex, realmGet$to, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.toIndex, rowIndex, false);
            }
            String realmGet$toVersion = ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$toVersion();
            if (realmGet$toVersion != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toVersionIndex, rowIndex, realmGet$toVersion, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.toVersionIndex, rowIndex, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$read(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.resendIndex, rowIndex, ((com_disappears_android_model_MessageRealmProxyInterface) object).realmGet$resend(), false);
        }
    }

    public static com.disappears.android.model.Message createDetachedCopy(com.disappears.android.model.Message realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.disappears.android.model.Message unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.disappears.android.model.Message();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.disappears.android.model.Message) cachedObject.object;
            }
            unmanagedObject = (com.disappears.android.model.Message) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_disappears_android_model_MessageRealmProxyInterface unmanagedCopy = (com_disappears_android_model_MessageRealmProxyInterface) unmanagedObject;
        com_disappears_android_model_MessageRealmProxyInterface realmSource = (com_disappears_android_model_MessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$numericId(realmSource.realmGet$numericId());
        unmanagedCopy.realmSet$data(realmSource.realmGet$data());
        unmanagedCopy.realmSet$dateTime(realmSource.realmGet$dateTime());
        unmanagedCopy.realmSet$from(realmSource.realmGet$from());
        unmanagedCopy.realmSet$fromVersion(realmSource.realmGet$fromVersion());
        unmanagedCopy.realmSet$iv(realmSource.realmGet$iv());
        unmanagedCopy.realmSet$mimeType(realmSource.realmGet$mimeType());
        unmanagedCopy.realmSet$to(realmSource.realmGet$to());
        unmanagedCopy.realmSet$toVersion(realmSource.realmGet$toVersion());
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());
        unmanagedCopy.realmSet$resend(realmSource.realmGet$resend());

        return unmanagedObject;
    }

    static com.disappears.android.model.Message update(Realm realm, com.disappears.android.model.Message realmObject, com.disappears.android.model.Message newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_disappears_android_model_MessageRealmProxyInterface realmObjectTarget = (com_disappears_android_model_MessageRealmProxyInterface) realmObject;
        com_disappears_android_model_MessageRealmProxyInterface realmObjectSource = (com_disappears_android_model_MessageRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$numericId(realmObjectSource.realmGet$numericId());
        realmObjectTarget.realmSet$data(realmObjectSource.realmGet$data());
        realmObjectTarget.realmSet$dateTime(realmObjectSource.realmGet$dateTime());
        realmObjectTarget.realmSet$from(realmObjectSource.realmGet$from());
        realmObjectTarget.realmSet$fromVersion(realmObjectSource.realmGet$fromVersion());
        realmObjectTarget.realmSet$iv(realmObjectSource.realmGet$iv());
        realmObjectTarget.realmSet$mimeType(realmObjectSource.realmGet$mimeType());
        realmObjectTarget.realmSet$to(realmObjectSource.realmGet$to());
        realmObjectTarget.realmSet$toVersion(realmObjectSource.realmGet$toVersion());
        realmObjectTarget.realmSet$read(realmObjectSource.realmGet$read());
        realmObjectTarget.realmSet$resend(realmObjectSource.realmGet$resend());
        return realmObject;
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
        com_disappears_android_model_MessageRealmProxy aMessage = (com_disappears_android_model_MessageRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aMessage.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aMessage.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}

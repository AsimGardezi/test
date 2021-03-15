package com.disappears.android.util

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.provider.ContactsContract
import android.provider.ContactsContract.*
import android.text.TextUtils
import com.disappears.android.model.Contact
import com.disappears.android.model.PhoneNumber
import timber.log.Timber
import java.util.*

class ContactUtil
constructor(private val context: Context) {
    private val sSimpleContactProjection = arrayOf(
            RawContacts.CONTACT_ID,
            Contacts.LOOKUP_KEY,
            Contacts.DISPLAY_NAME,
            Contacts.PHOTO_URI,
            Contacts.LAST_TIME_CONTACTED,
            Contacts.Entity.STARRED,
            Contacts.HAS_PHONE_NUMBER,
            Contacts.Data.MIMETYPE,
            Contacts.Data.DATA2,
            Contacts.Data.DATA3,
            Contacts.Data.DATA5,
            Data.RAW_CONTACT_ID)
    private val sContactColumns = arrayOf(
            Contacts._ID,
            Contacts.LOOKUP_KEY,
            Contacts.DISPLAY_NAME,
            Contacts.PHOTO_URI,
            Contacts.LAST_TIME_CONTACTED,
            Contacts.Entity.STARRED,
            Contacts.HAS_PHONE_NUMBER)
    private val sFullRawAndDataProjection = arrayOf(
            Contacts.Entity._ID,
            Contacts.Entity.LOOKUP_KEY,
            Contacts.Entity.RAW_CONTACT_ID,
            Contacts.Entity.DISPLAY_NAME,
            Contacts.Entity.ACCOUNT_TYPE,
            CommonDataKinds.StructuredName.GIVEN_NAME,
            CommonDataKinds.StructuredName.MIDDLE_NAME,
            CommonDataKinds.StructuredName.FAMILY_NAME,
            CommonDataKinds.StructuredName.PREFIX,
            CommonDataKinds.StructuredName.SUFFIX,
            Contacts.Entity.PHOTO_URI,
            Contacts.Entity.STARRED,
            Contacts.Entity.LAST_TIME_CONTACTED,
            Contacts.Entity.TIMES_CONTACTED,
            RawContacts.ACCOUNT_NAME,
            RawContacts.ACCOUNT_TYPE,
            RawContacts.DATA_SET,
            RawContacts.DIRTY,
            RawContacts.VERSION,
            RawContacts.SOURCE_ID,
            RawContacts.SYNC1,
            RawContacts.SYNC2,
            RawContacts.SYNC3,
            RawContacts.SYNC4,
            RawContacts.DELETED,
            Contacts.Entity.DATA_ID,
            Data.DATA1,
            Data.DATA2,
            Data.DATA3,
            Data.DATA4,
            Data.DATA5,
            Data.DATA6,
            Data.DATA7,
            Data.DATA8,
            Data.DATA9,
            Data.DATA10,
            Data.DATA11,
            Data.DATA12,
            Data.DATA13,
            Data.DATA14,
            Data.DATA15,
            Data.SYNC1,
            Data.SYNC2,
            Data.SYNC3,
            Data.SYNC4,
            Data.DATA_VERSION,
            Data.IS_PRIMARY,
            Data.IS_SUPER_PRIMARY,
            Data.MIMETYPE)

    val allContactsDetailedList: List<Contact>
        get() {
            val simpleContacts = allContactsSimpleList
            val numbers = allNumbers

            for (i in simpleContacts.indices) {
                val c = simpleContacts[i]
                val pn = PhoneNumber()
                pn.number = numbers[c.lookupId]
                c.setPhoneNumber(pn)
            }
            return simpleContacts
        }

    private val allNumbers: Map<String, String>
        get() {
            val managedCursor = context.contentResolver
                    .query(
                            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                            arrayOf(
                                    CommonDataKinds.Phone.LOOKUP_KEY,
                                    CommonDataKinds.Phone.DISPLAY_NAME,
                                    CommonDataKinds.Phone.NUMBER),
                            null,
                            null,
                            "${CommonDataKinds.Phone.DISPLAY_NAME} ASC")

            val map = HashMap<String, String>()

            if (managedCursor?.moveToFirst() == true) {
                do {
                    val id = managedCursor.getString(0)
                    val num = managedCursor.getString(2)
                    map.put(id, num)
                } while (managedCursor.moveToNext())
            }
            managedCursor!!.close()

            return map
        }

    val allContactsSimpleList: List<Contact>
        get() = getAllContactsSimple(Contacts.DISPLAY_NAME + " COLLATE NOCASE ASC")

    private val contactIdsWithPhone: Set<Long>
        get() {
            val includedIds = HashSet<Long>()
            val cursor = context.contentResolver.query(
                    Data.CONTENT_URI,
                    sSimpleContactProjection,
                    Data.MIMETYPE + "=?",
                    arrayOf(CommonDataKinds.Phone.CONTENT_ITEM_TYPE),
                    null)

            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        includedIds.add(cursor.getLong(cursor.getColumnIndex(RawContacts.CONTACT_ID)))
                    } while (cursor.moveToNext())
                }
                cursor.close()
            }

            return includedIds
        }

    fun buildContactUri(id: Long): Uri {
        return Uri.withAppendedPath(
                ContactsContract.Contacts.CONTENT_URI, id.toString())
                .buildUpon()
                .appendPath(ContactsContract.Contacts.Entity.CONTENT_DIRECTORY)
                .build()
    }

    fun buildContactUri(lookupId: String): Uri {
        return Uri.withAppendedPath(
                ContactsContract.Contacts.CONTENT_LOOKUP_URI, lookupId)
                .buildUpon()
                .appendPath(ContactsContract.Contacts.Entity.CONTENT_DIRECTORY)
                .build()
    }

    fun getContact(contactUri: Uri): Contact? {
        val c = context.contentResolver.query(
                contactUri,
                sFullRawAndDataProjection,
                null,
                null,
                ContactsContract.Contacts.Entity.RAW_CONTACT_ID + " ASC")
        return modelFromCursor(c)
    }

    private fun setCommonContactData(cm: Contact, c: Cursor) {
        cm.displayName = c.getString(c.getColumnIndex(Contacts.DISPLAY_NAME))
        cm.id = c.getLong(c.getColumnIndex(Contacts._ID))
        cm.lookupId = c.getString(c.getColumnIndex(Contacts.LOOKUP_KEY))
        cm.photoPath = c.getString(c.getColumnIndex(Contacts.Entity.PHOTO_URI))
        cm.isFavorite = c.getInt(c.getColumnIndex(Contacts.Entity.STARRED)) == 1
        cm.lastTimeContacted = c.getLong(c.getColumnIndex(Contacts.Entity.LAST_TIME_CONTACTED))
        cm.setTimesContacted(c.getInt(c.getColumnIndex(Contacts.Entity.TIMES_CONTACTED)))
    }

    fun modelFromCursor(cursor: Cursor?): Contact? {
        var cm: Contact? = null
        var currentRawContactId: Long = -1
        var rawContactId: Long
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                cm = Contact()
                setCommonContactData(cm, cursor)
                do {
                    rawContactId = cursor.getLong(cursor.getColumnIndex(Contacts.Entity.RAW_CONTACT_ID))
                    if (rawContactId != currentRawContactId) {
                        currentRawContactId = rawContactId
                    }
                    val mimeType = cursor.getString(cursor.getColumnIndex(Contacts.Entity.MIMETYPE))
                    if (!TextUtils.isEmpty(mimeType)) {
                        when (mimeType) {
                            CommonDataKinds.Phone.CONTENT_ITEM_TYPE -> cm.setPhoneNumber(createPhoneModel(cursor, rawContactId))
                            CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE -> {
                                cm.givenName = cursor.getString(cursor.getColumnIndex(CommonDataKinds.StructuredName.GIVEN_NAME))
                                cm.middleName = cursor.getString(cursor.getColumnIndex(CommonDataKinds.StructuredName.MIDDLE_NAME))
                                cm.familyName = cursor.getString(cursor.getColumnIndex(CommonDataKinds.StructuredName.FAMILY_NAME))
                                cm.namePrefix = cursor.getString(cursor.getColumnIndex(CommonDataKinds.StructuredName.PREFIX))
                                cm.nameSuffix = cursor.getString(cursor.getColumnIndex(CommonDataKinds.StructuredName.SUFFIX))
                            }
                            else -> {
                            }
                        }
                    }
                } while (cursor.moveToNext())
            }
            cursor.close()
        }
        return cm
    }

    private fun createPhoneModel(c: Cursor, rawContactId: Long): PhoneNumber {
        val phone = PhoneNumber()
        phone.rawContactId = rawContactId
        phone.dataId = c.getLong(c.getColumnIndex(Contacts.Entity.DATA_ID))
        phone.number = c.getString(c.getColumnIndex(CommonDataKinds.Phone.NUMBER))
        phone.normalizedNumber = c.getString(c.getColumnIndex(CommonDataKinds.Phone.NORMALIZED_NUMBER))
        return phone
    }

    fun modelFromCursorSimple(c: Cursor): Contact {
        val cm = Contact()
        cm.id = c.getLong(c.getColumnIndex(Contacts._ID))
        cm.lookupId = c.getString(c.getColumnIndex(Contacts.LOOKUP_KEY))
        cm.displayName = c.getString(c.getColumnIndex(Contacts.DISPLAY_NAME))
        cm.photoPath = c.getString(c.getColumnIndex(Contacts.PHOTO_URI))
        cm.lastTimeContacted = c.getLong(c.getColumnIndex(Contacts.LAST_TIME_CONTACTED))
        cm.lookupUri = buildContactUri(cm.lookupId)
        cm.isFavorite = c.getInt(c.getColumnIndex(Contacts.Entity.STARRED)) == 1
        return cm
    }

    fun getContactsByName(name: String): List<Contact> {
        val result = ArrayList<Contact>()
        if (!TextUtils.isEmpty(name)) {
            val c = context.contentResolver.query(
                    Uri.withAppendedPath(Contacts.CONTENT_FILTER_URI, name),
                    arrayOf(ContactsContract.PhoneLookup._ID),
                    null,
                    null,
                    null)
            if (c != null) {
                if (c.moveToFirst()) {
                    do {
                        val id = c.getLong(0)
                        getContact(buildContactUri(id))?.let { result.add(it) }
                    } while (c.moveToNext())
                }
                c.close()
            }
        }
        return result
    }

    fun getAllContactsSimple(orderBy: String): List<Contact> {
        val result = ArrayList<Contact>()
        try {
            val cursor = context.contentResolver.query(
                    Contacts.CONTENT_URI,
                    sContactColumns,
                    null,
                    null,
                    orderBy)
            val includedIds = contactIdsWithPhone

            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        val contactId = cursor.getLong(cursor.getColumnIndex(Contacts._ID))
                        if (includedIds.contains(contactId)) {
                            result.add(modelFromCursorSimple(cursor))
                        }
                    } while (cursor.moveToNext())
                }
                cursor.close()
            }
        } catch (e: SecurityException) {
            Timber.e(e)
        }
        return result
    }
}

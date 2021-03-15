package com.disappears.android.model;

import android.net.Uri;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Contact implements ContactFeedItem {
    private String lookupId;
    private String displayName = "";
    private long id = -1;
    private String photoPath;
    private boolean favorite;
    private long lastTimeContacted;
    private long timesContacted;
    private String namePrefix;
    private String givenName;
    private String middleName;
    private String familyName;
    private String nameSuffix;
    private String note;
    private String sip;
    private String nickname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void clearPhoneNumbers() {
        this.phoneNumbers = new ArrayList<>();
    }

    private List<PhoneNumber> phoneNumbers;
    private Uri lookupUri;
    private boolean hasPhones;

    public Contact() {
        phoneNumbers = new ArrayList<>();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName != null ? displayName : " ";
    }

    public void setPhoneNumber(PhoneNumber number) {
        phoneNumbers.add(number);
    }

    public boolean hasPhoneNumber() {
        return hasPhones || !phoneNumbers.isEmpty();
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getLookupId() {
        return lookupId;
    }

    public void setLookupId(String lookupId) {
        this.lookupId = lookupId;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public long getLastTimeContacted() {
        return lastTimeContacted;
    }

    public void setLastTimeContacted(long lastTimeContacted) {
        this.lastTimeContacted = lastTimeContacted;
    }

    public long getTimesContacted() {
        return timesContacted;
    }

    public void setTimesContacted(int timesContacted) {
        this.timesContacted = timesContacted;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String prefix) {
        namePrefix = prefix;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String suffix) {
        nameSuffix = suffix;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public Uri getLookupUri() {
        return lookupUri;
    }

    public void setLookupUri(Uri lookupUri) {
        this.lookupUri = lookupUri;
    }

    @NonNull
    public List<String> getContactPhonesAsList() {
        List<String> result = new ArrayList<>();
        for (PhoneNumber p : getPhoneNumbers()) {
            result.add(p.getNumber());
        }
        return result;
    }

    @Override
    public String getName() {
        return displayName;
    }

    @Override
    public String getPhoto() {
        return photoPath;
    }
}

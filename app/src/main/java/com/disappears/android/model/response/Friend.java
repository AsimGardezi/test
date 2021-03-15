package com.disappears.android.model.response;

import androidx.annotation.Nullable;

import com.disappears.android.model.ContactFeedItem;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Friend extends RealmObject implements Serializable, ContactFeedItem {
    public enum Flag {
        DELETED(1), INVITED(2), NEW_FRIEND(4), CHAT_ACTIVE(8), MESSAGE_ACTIVITY(16), INVITER(32);
        public final int value;

        Flag(int value) {
            this.value = value;
        }
    }

    @PrimaryKey
    private String name;
    public String aliasPlain;
    public String aliasData;
    public String aliasVersion;
    public Profile profile;
    public Integer lastReceivedMessageId;
    public Integer flags;
    public Boolean hasNewMessage;
    public Integer availableMessageId;
    public Integer availableMessageControlId;
    public PublicKeyData keys;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return name != null ? name.equals(friend.name) : friend.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Nullable
    @Override
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Override
    public String getPhoto() {
        if (profile != null) {
            return profile.getImageUrl();
        }
        return null;
    }

    public boolean isDeleted() {
        return (flags & Flag.DELETED.value) == Flag.DELETED.value;
    }

    public boolean isInvited() {
        return (flags & Flag.INVITED.value) == Flag.INVITED.value;
    }

    public boolean isInviter() {
        return (flags & Flag.INVITER.value) == Flag.INVITER.value;
    }

    public boolean isChatActive() {
        return (flags & Flag.CHAT_ACTIVE.value) == Flag.CHAT_ACTIVE.value;
    }

    public boolean isFriend() {
        return !isInvited() && !isInviter();
    }

    public boolean hasNewMessages() {
        if (hasNewMessage == null) {
            return false;
        } else {
            return hasNewMessage;
        }
    }
}

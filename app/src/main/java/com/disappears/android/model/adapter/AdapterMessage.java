package com.disappears.android.model.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;
import com.stfalcon.chatkit.commons.models.MessageContentType;

import java.util.Date;

public class AdapterMessage implements IMessage, MessageContentType.Image {
    @NonNull
    public MessageAuthor friend = new MessageAuthor();
    @Nullable
    public String id;
    @Nullable
    public String text;
    @Nullable
    public long timestamp;

    @Nullable
    @Override
    public String getId() {
        return id;
    }

    @Nullable
    @Override
    public String getText() {
        return text;
    }

    @Nullable
    @Override
    public IUser getUser() {
        return friend;
    }

    @Nullable
    @Override
    public Date getCreatedAt() {
        return new Date(timestamp);
    }

    @Nullable
    @Override
    public String getImageUrl() {
        if (text.startsWith("https") || text.startsWith("http") || text.startsWith("dataKey_")) {
            return text;
        } else {
            return null;
        }
    }
}

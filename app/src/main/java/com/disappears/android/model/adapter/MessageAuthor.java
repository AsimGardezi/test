package com.disappears.android.model.adapter;

import androidx.annotation.Nullable;

import com.stfalcon.chatkit.commons.models.IUser;

public class MessageAuthor implements IUser {
    @Nullable
    public String avatar;
    @Nullable
    public String name;

    @Nullable
    @Override
    public String getId() {
        return name;
    }

    @Nullable
    @Override
    public String getName() {
        return name;
    }

    @Nullable
    @Override
    public String getAvatar() {
        return avatar;
    }
}

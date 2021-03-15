package com.disappears.android.util;

import androidx.annotation.Nullable;

import com.bugfender.sdk.Bugfender;
import com.bugfender.sdk.LogLevel;

import timber.log.Timber;

public class BugfenderTree extends Timber.Tree {
    @Override
    protected void log(int priority, @Nullable String tag, @Nullable String message, @Nullable Throwable t) {
        if (t != null) {
            Bugfender.e(tag, t.getMessage());
        } else {
            Bugfender.log(0, "", "", LogLevel.Debug, tag, message);
        }
    }
}

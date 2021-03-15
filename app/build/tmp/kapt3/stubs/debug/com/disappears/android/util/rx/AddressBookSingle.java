package com.disappears.android.util.rx;

import java.lang.System;

/**
 * Created by ihor_kucherenko on 12/18/17.
 * https://github.com/KucherenkoIhor
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/disappears/android/util/rx/AddressBookSingle;", "Lio/reactivex/Single;", "", "Lcom/disappears/android/model/ContactFeedItem;", "query", "", "contactDataSource", "Lcom/disappears/android/util/ContactUtil;", "title", "(Ljava/lang/String;Lcom/disappears/android/util/ContactUtil;Ljava/lang/String;)V", "subscribeActual", "", "observer", "Lio/reactivex/SingleObserver;", "app_debug"})
public final class AddressBookSingle extends io.reactivex.Single<java.util.List<? extends com.disappears.android.model.ContactFeedItem>> {
    private final java.lang.String query = null;
    private final com.disappears.android.util.ContactUtil contactDataSource = null;
    private final java.lang.String title = null;
    
    @java.lang.Override()
    protected void subscribeActual(@org.jetbrains.annotations.NotNull()
    io.reactivex.SingleObserver<? super java.util.List<? extends com.disappears.android.model.ContactFeedItem>> observer) {
    }
    
    public AddressBookSingle(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.disappears.android.util.ContactUtil contactDataSource, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        super();
    }
}
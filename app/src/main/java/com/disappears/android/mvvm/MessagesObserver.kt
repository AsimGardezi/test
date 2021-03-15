package com.disappears.android.mvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import com.disappears.android.model.Message
import com.disappears.android.util.livedata.NullableLiveData
import timber.log.Timber

class MessagesObserver : LifecycleObserver {
    @JvmField
    val isMessagesLoaded = MutableLiveData<Boolean>()

    @JvmField
    val isFriendsLoaded = MutableLiveData<Boolean>()

    @JvmField
    val chatsRefreshEvent = MutableLiveData<Unit>()

    @JvmField
    val messageArrivedEvent = NullableLiveData<Message>()

    @JvmField
    val friendDisappearedEvent = MutableLiveData<String>()

    @JvmField
    val messagesDeletedEvent = NullableLiveData<Message>()

    @JvmField
    val tempMessageDeleted = NullableLiveData<Message>()

    @JvmField
    val messagesDeletedAllEvent = NullableLiveData<String>()

    @JvmField
    val friendWasDeleted = MutableLiveData<String>()

    @JvmField
    val messagingServiceStopped = NullableLiveData<Boolean>()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Timber.d("onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Timber.d("onDestroy")
    }
}
package com.disappears.android.util.livedata

class NullableLiveData<T> : OneTimeLiveData<T>() {
    public override fun postValue(value: T) {
        super.postValue(value)
    }
}
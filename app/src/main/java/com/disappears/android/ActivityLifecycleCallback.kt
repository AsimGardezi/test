package com.disappears.android

import android.app.Activity
import android.app.Application
import android.os.Bundle
import java.lang.ref.WeakReference

/**
 * Created by ihor_kucherenko on 12/5/17.
 * https://github.com/KucherenkoIhor
 */
object ActivityLifecycleCallback : Application.ActivityLifecycleCallbacks {
    var currentActivityRef: WeakReference<Activity?>? = null

    override fun onActivityPaused(activity: Activity?) {}

    override fun onActivityResumed(activity: Activity?) {}

    override fun onActivityStarted(activity: Activity?) {
        currentActivityRef = WeakReference(activity)
    }

    override fun onActivityDestroyed(activity: Activity?) {}

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

    override fun onActivityStopped(activity: Activity?) {
        if (currentActivityRef?.get() === activity) {
            currentActivityRef?.clear()
        }
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {}
}
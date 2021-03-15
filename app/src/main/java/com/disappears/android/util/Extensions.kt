package com.disappears.android.util

import android.app.Activity
import android.app.Service
import androidx.lifecycle.*
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.target.Target
import com.crashlytics.android.Crashlytics
import com.disappears.android.R
import com.disappears.android.api.Constants
import timber.log.Timber
import java.io.File
import java.io.Serializable
import kotlin.reflect.KClass

fun KClass<out Activity>.start(withContext: Context,
                               vararg data: Pair<String, Any>) =
        Intent(withContext, this.java)
                .apply { data.forEach { (key, value) -> setExtra(key, value) } }
                .let { withContext.startActivity(it) }

fun KClass<out Service>.startService(withContext: Context,
                                     vararg data: Pair<String, Any>, withAction: String? = null) =
        Intent(withContext, this.java)
                .apply {
                    data.forEach { (key, value) -> setExtra(key, value) }
                    withAction?.let { this.action = it }
                }
                .let { withContext.startService(it) }

fun Intent.setExtra(key: String, value: Any) {
    when (value) {
        is Int -> putExtra(key, value)
        is Long -> putExtra(key, value)
        is Float -> putExtra(key, value)
        is Double -> putExtra(key, value)
        is String -> putExtra(key, value)
        is Parcelable -> putExtra(key, value)
        is Serializable -> putExtra(key, value)
        else -> IllegalArgumentException("Cannot handle type ${value.javaClass.simpleName}")
    }
}

fun ImageView.loadImage(path: String) {
    Timber.d("path is" + path)
    Glide
            .with(this.context)
            .load(if (path.startsWith("content")) Uri.parse(path) else path)//.override(Target.SIZE_ORIGINAL)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
                    return true
                }

                override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                    return false
                }

            })
            .into(this)
}

fun ImageView.loadEncryptedImage(path: String) {
    if (path.startsWith(Constants.Api.DATA_PREFIX)) {
        loadImage(File(path.replace(Constants.Api.DATA_PREFIX, "")).absolutePath)
    } else {
        val u = Uri.parse(path)
        val fileName = u.lastPathSegment
        val f = fileName?.let { FileUtil(context).createFileInAppData(it) }
        loadImage(f!!.absolutePath)
    }
}

fun Context.loadImage(path: String, target: SimpleTarget<Bitmap>) {
    Glide
            .with(this)
            .asBitmap()
            .load(if (path.startsWith("content")) Uri.parse(path) else path)
            .into(target)
}

fun Any.d(msg: String) = Log.d(this::class.qualifiedName, msg)
fun Any.e(msg: String) = Log.e(this::class.qualifiedName, msg)

inline fun <reified T : ViewModel> Fragment.getViewModel(viewModelFactory: ViewModelProvider.Factory): T {
    return ViewModelProviders.of(this, viewModelFactory)[T::class.java]
}

inline fun <reified T : ViewModel> Fragment.withViewModel(viewModelFactory: ViewModelProvider.Factory, body: T.() -> Unit): T {
    val vm = getViewModel<T>(viewModelFactory)
    vm.body()
    return vm
}

fun <T : Any, L : LiveData<T>> LifecycleOwner.observe(liveData: L, body: (T?) -> Unit) {
    liveData.observe(this, Observer(body))
}



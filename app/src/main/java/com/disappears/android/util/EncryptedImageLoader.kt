package com.disappears.android.util

import android.net.Uri
import android.widget.ImageView
import com.disappears.android.api.Constants
import com.stfalcon.chatkit.commons.ImageLoader
import timber.log.Timber
import java.io.File

class EncryptedImageLoader : ImageLoader {
    override fun loadImage(imageView: ImageView, url: String) {
        if (url.startsWith(Constants.Api.DATA_PREFIX)) {
            Timber.d("loadinging here");
            imageView.loadImage(File(url.replace(Constants.Api.DATA_PREFIX, "")).absolutePath)
        } else {
            val u = Uri.parse(url)
            val fileName = u.lastPathSegment
            val f = FileUtil(imageView.context).createFileInAppData(fileName!!)
            Timber.d("path is 1" + f)
            imageView.loadImage(f.absolutePath)
        }
    }
}

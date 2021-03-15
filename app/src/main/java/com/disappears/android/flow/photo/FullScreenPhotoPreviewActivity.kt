package com.disappears.android.flow.photo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.disappears.android.R
import com.disappears.android.util.loadEncryptedImage
import kotlinx.android.synthetic.main.activity_fullscreen_photo_preview.*

class FullScreenPhotoPreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen_photo_preview)
        image.loadEncryptedImage(intent.getStringExtra(EXTRA_IMAGE_URI))
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(0, R.anim.slide_out_bottom)
    }

    companion object {
        private val EXTRA_IMAGE_URI = "extra_image_uri"

        fun start(c: Context, uri: String) {
            val i = Intent(c, FullScreenPhotoPreviewActivity::class.java)
            i.putExtra(EXTRA_IMAGE_URI, uri)
            c.startActivity(i)
        }
    }
}
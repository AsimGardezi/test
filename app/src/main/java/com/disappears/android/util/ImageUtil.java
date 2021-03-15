package com.disappears.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.core.content.FileProvider;

import com.disappears.android.R;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageUtil {
    private final Context context;
    private final FileUtil fileUtil;

    public ImageUtil(Context c, FileUtil fileUtil) {
        context = c;
        this.fileUtil = fileUtil;
    }

    public String resizeImageFile(final String filePath, int desiredWidth, int desiredHeight) {
        final Matrix matrix = new Matrix();
        try {
            final ExifInterface exif = new ExifInterface(filePath);
            final int rotation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL);
            final int rotationInDegrees = exifToDegrees(rotation);
            if (rotation != 0f) {
                matrix.preRotate(rotationInDegrees);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(filePath, options);
        int imageHeight = options.outHeight;
        int imageWidth = options.outWidth;
        int sampleSize = Math.min(imageHeight / desiredHeight, imageWidth / desiredWidth);
        float scale = Math.max((float) desiredHeight / imageHeight, (float) desiredWidth / imageWidth);
        if (scale < 1) {
            options.inJustDecodeBounds = false;
            options.inSampleSize = sampleSize;
            Bitmap b = BitmapFactory.decodeFile(filePath, options);
            b = Bitmap.createBitmap(b, 0, 0, (int) (scale * imageWidth), (int) (scale * imageHeight), matrix, true);
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            b.compress(Bitmap.CompressFormat.PNG, 90, outStream);
            FileOutputStream fo;
            try {
                File f = fileUtil.createImageFileInAppData();
                fo = new FileOutputStream(f);
                fo.write(outStream.toByteArray());
                fo.flush();
                fo.close();
                return f.getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return filePath;
    }

    private static int exifToDegrees(int exifOrientation) {
        if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_90) {
            return 90;
        } else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_180) {
            return 180;
        } else if (exifOrientation == ExifInterface.ORIENTATION_ROTATE_270) {
            return 270;
        }
        return 0;
    }

    public static void pickPhoto(Activity a, int requestCode) {
        Intent intent = getPickIntent();
        a.startActivityForResult(intent, requestCode);
    }

    public static void pickPhoto(Fragment f, int requestCode) {
        Intent intent = getPickIntent();
        f.startActivityForResult(intent, requestCode);
    }

    @NonNull
    private static Intent getPickIntent() {
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        photoPickerIntent.setType("image/*");
        photoPickerIntent.putExtra(Intent.EXTRA_LOCAL_ONLY, true);
        return photoPickerIntent;
    }

    public File createPictureFile() {
        File photoFile = null;
        try {
            photoFile = fileUtil.createImageFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return photoFile;
    }

    public static void startCamera(Fragment f, File photoFile, int requstCode) {
        Intent takePictureIntent = getTakePhotoIntent(f.getActivity(), photoFile);
        if (takePictureIntent != null) {
            f.startActivityForResult(takePictureIntent, requstCode);
        }
    }

    private static Intent getTakePhotoIntent(Activity a, File photoFile) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(a.getPackageManager()) != null) {
            Uri photoURI = FileProvider.getUriForFile(a, a.getString(R.string.disappears_file_provider), photoFile);
            takePictureIntent.putExtra("crop", true);
            takePictureIntent.putExtra("outputX", 1280);
            takePictureIntent.putExtra("outputY", 720);
            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
            return takePictureIntent;
        }
        return null;
    }

    public static void startCamera(Activity a, File photoFile, int requstCode) {
        Intent takePictureIntent = getTakePhotoIntent(a, photoFile);
        if (takePictureIntent != null) {
            a.startActivityForResult(takePictureIntent, requstCode);
        }
    }
}

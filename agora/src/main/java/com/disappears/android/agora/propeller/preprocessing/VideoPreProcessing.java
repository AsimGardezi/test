package com.disappears.android.agora.propeller.preprocessing;

public class VideoPreProcessing {
    static {
        System.loadLibrary("apm-plugin-video-preprocessing");
    }

    public native void enablePreProcessing(boolean enable);
}

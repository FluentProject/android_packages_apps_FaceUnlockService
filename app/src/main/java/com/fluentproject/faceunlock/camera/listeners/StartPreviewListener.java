package com.fluentproject.faceunlock.camera.listeners;

public interface StartPreviewListener extends CallableListener {

    class StartPreviewData {
        public int mDisplayOrientation;
        public int mFacing;
    }
}

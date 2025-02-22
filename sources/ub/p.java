package ub;

import com.lassi.presentation.cameraview.controls.CameraView;

public final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraView f15981a;

    public p(CameraView cameraView) {
        this.f15981a = cameraView;
    }

    public final void run() {
        CameraView cameraView = this.f15981a;
        cameraView.L = cameraView.getKeepScreenOn();
        if (!cameraView.L) {
            cameraView.setKeepScreenOn(true);
        }
    }
}

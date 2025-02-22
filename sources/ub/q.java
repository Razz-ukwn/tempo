package ub;

import com.lassi.presentation.cameraview.controls.CameraView;

public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CameraView f15982a;

    public q(CameraView cameraView) {
        this.f15982a = cameraView;
    }

    public final void run() {
        CameraView cameraView = this.f15982a;
        boolean keepScreenOn = cameraView.getKeepScreenOn();
        boolean z10 = cameraView.L;
        if (keepScreenOn != z10) {
            cameraView.setKeepScreenOn(z10);
        }
    }
}

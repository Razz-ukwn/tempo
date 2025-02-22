package ub;

import android.hardware.Camera;
import com.lassi.presentation.cameraview.controls.g;
import com.lassi.presentation.cameraview.controls.l;
import com.lassi.presentation.cameraview.controls.n;

public final class t implements Camera.ShutterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f15986a;

    public t(l lVar) {
        this.f15986a = lVar;
    }

    public final void onShutter() {
        n.a aVar = this.f15986a.f6531b;
        if (aVar != null) {
            ((g) aVar).f6477a.c(false);
        }
    }
}

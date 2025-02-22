package ub;

import android.hardware.Camera;
import com.lassi.presentation.cameraview.controls.g;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tb.l f15975a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f15976b;

    public l(g gVar, tb.l lVar) {
        this.f15976b = gVar;
        this.f15975a = lVar;
    }

    public final void run() {
        g gVar = this.f15976b;
        Camera.Parameters parameters = gVar.V.getParameters();
        if (gVar.t(parameters, this.f15975a)) {
            gVar.V.setParameters(parameters);
        }
    }
}

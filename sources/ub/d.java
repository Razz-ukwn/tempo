package ub;

import android.hardware.Camera;
import com.lassi.presentation.cameraview.controls.g;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ tb.d f15964a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f15965b;

    public d(g gVar, tb.d dVar) {
        this.f15965b = gVar;
        this.f15964a = dVar;
    }

    public final void run() {
        g gVar = this.f15965b;
        Camera.Parameters parameters = gVar.V.getParameters();
        if (gVar.p(parameters, this.f15964a)) {
            gVar.V.setParameters(parameters);
        }
    }
}

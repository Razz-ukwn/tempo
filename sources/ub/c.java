package ub;

import android.hardware.Camera;
import com.lassi.presentation.cameraview.controls.g;
import tb.h;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f15962a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f15963b;

    public c(g gVar, h hVar) {
        this.f15963b = gVar;
        this.f15962a = hVar;
    }

    public final void run() {
        g gVar = this.f15963b;
        Camera.Parameters parameters = gVar.V.getParameters();
        if (gVar.q(parameters, this.f15962a)) {
            gVar.V.setParameters(parameters);
        }
    }
}

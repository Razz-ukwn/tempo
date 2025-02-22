package ub;

import android.hardware.Camera;
import android.location.Location;
import com.lassi.presentation.cameraview.controls.g;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f15972a;

    public j(g gVar, Location location) {
        this.f15972a = gVar;
    }

    public final void run() {
        g gVar = this.f15972a;
        Camera.Parameters parameters = gVar.V.getParameters();
        gVar.r(parameters);
        gVar.V.setParameters(parameters);
    }
}

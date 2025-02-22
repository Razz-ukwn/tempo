package com.lassi.presentation.cameraview.controls;

import android.hardware.Camera;
import ub.w;
import wb.a;

public final class l extends n {

    /* renamed from: c  reason: collision with root package name */
    public Camera f6523c;

    static {
        String str = a.f16661b;
    }

    public l(w wVar, g gVar, Camera camera) {
        super(wVar, gVar);
        this.f6523c = camera;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setRotation(this.f6530a.f15989a);
        this.f6523c.setParameters(parameters);
    }
}

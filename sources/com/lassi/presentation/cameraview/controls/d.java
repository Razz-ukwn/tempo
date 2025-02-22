package com.lassi.presentation.cameraview.controls;

import android.graphics.PointF;
import android.hardware.Camera;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f6455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6456b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PointF[] f6457c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f6458d;

    public d(g gVar, float f10, boolean z10, PointF[] pointFArr) {
        this.f6458d = gVar;
        this.f6455a = f10;
        this.f6456b = z10;
        this.f6457c = pointFArr;
    }

    public final void run() {
        g gVar = this.f6458d;
        if (gVar.f6491p.f6516i) {
            float f10 = this.f6455a;
            gVar.f6488l = f10;
            Camera.Parameters parameters = gVar.V.getParameters();
            parameters.setZoom((int) (((float) parameters.getMaxZoom()) * f10));
            gVar.V.setParameters(parameters);
            if (this.f6456b) {
                gVar.f6477a.m(f10, this.f6457c);
            }
        }
    }
}

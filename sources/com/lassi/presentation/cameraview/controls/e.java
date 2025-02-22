package com.lassi.presentation.cameraview.controls;

import android.graphics.PointF;
import android.hardware.Camera;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f6459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6460b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float[] f6461c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PointF[] f6462d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f6463e;

    public e(g gVar, float f10, boolean z10, float[] fArr, PointF[] pointFArr) {
        this.f6463e = gVar;
        this.f6459a = f10;
        this.f6460b = z10;
        this.f6461c = fArr;
        this.f6462d = pointFArr;
    }

    public final void run() {
        g gVar = this.f6463e;
        j jVar = gVar.f6491p;
        if (jVar.f6517j) {
            float f10 = jVar.f6519l;
            float f11 = jVar.f6518k;
            float f12 = this.f6459a;
            if (f12 < f11) {
                f10 = f11;
            } else if (f12 <= f10) {
                f10 = f12;
            }
            gVar.m = f10;
            Camera.Parameters parameters = gVar.V.getParameters();
            parameters.setExposureCompensation((int) (f10 / parameters.getExposureCompensationStep()));
            gVar.V.setParameters(parameters);
            if (this.f6460b) {
                gVar.f6477a.h(f10, this.f6461c, this.f6462d);
            }
        }
    }
}

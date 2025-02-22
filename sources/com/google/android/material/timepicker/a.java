package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6237a;

    public a(ClockFaceView clockFaceView) {
        this.f6237a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6237a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.P.f6234d) - clockFaceView.f6224a0;
        if (height != clockFaceView.N) {
            clockFaceView.N = height;
            clockFaceView.i();
            int i8 = clockFaceView.N;
            ClockHandView clockHandView = clockFaceView.P;
            clockHandView.H = i8;
            clockHandView.invalidate();
        }
        return true;
    }
}

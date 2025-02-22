package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p8.b;
import p8.d;
import p8.g;
import p8.h;
import p8.i;
import p8.n;

public final class CircularProgressIndicator extends b<h> {
    public static final /* synthetic */ int I = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        h hVar = (h) this.f12475a;
        setIndeterminateDrawable(new n(context2, hVar, new d(hVar), new g(hVar)));
        setProgressDrawable(new i(getContext(), hVar, new d(hVar)));
    }

    public int getIndicatorDirection() {
        return ((h) this.f12475a).f12510i;
    }

    public int getIndicatorInset() {
        return ((h) this.f12475a).f12509h;
    }

    public int getIndicatorSize() {
        return ((h) this.f12475a).f12508g;
    }

    public void setIndicatorDirection(int i8) {
        ((h) this.f12475a).f12510i = i8;
        invalidate();
    }

    public void setIndicatorInset(int i8) {
        S s10 = this.f12475a;
        if (((h) s10).f12509h != i8) {
            ((h) s10).f12509h = i8;
            invalidate();
        }
    }

    public void setIndicatorSize(int i8) {
        int max = Math.max(i8, getTrackThickness() * 2);
        S s10 = this.f12475a;
        if (((h) s10).f12508g != max) {
            ((h) s10).f12508g = max;
            ((h) s10).getClass();
            invalidate();
        }
    }

    public void setTrackThickness(int i8) {
        super.setTrackThickness(i8);
        ((h) this.f12475a).getClass();
    }
}

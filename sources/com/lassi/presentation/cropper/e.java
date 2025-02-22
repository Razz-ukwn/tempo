package com.lassi.presentation.cropper;

import android.graphics.RectF;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f6634a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f6635b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public float f6636c;

    /* renamed from: d  reason: collision with root package name */
    public float f6637d;

    /* renamed from: e  reason: collision with root package name */
    public float f6638e;

    /* renamed from: f  reason: collision with root package name */
    public float f6639f;

    /* renamed from: g  reason: collision with root package name */
    public float f6640g;

    /* renamed from: h  reason: collision with root package name */
    public float f6641h;

    /* renamed from: i  reason: collision with root package name */
    public float f6642i;

    /* renamed from: j  reason: collision with root package name */
    public float f6643j;

    /* renamed from: k  reason: collision with root package name */
    public float f6644k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public float f6645l = 1.0f;

    public static boolean b(float f10, float f11, float f12, float f13, float f14) {
        return Math.abs(f10 - f12) <= f14 && Math.abs(f11 - f13) <= f14;
    }

    public final RectF a() {
        RectF rectF = this.f6635b;
        rectF.set(this.f6634a);
        return rectF;
    }
}

package com.google.android.gms.internal.p000firebaseauthapi;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r4  reason: invalid package */
public final class r4 extends t4 {
    public r4(Unsafe unsafe) {
        super(unsafe);
    }

    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f4941a.getLong(obj, j10));
    }

    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f4941a.getInt(obj, j10));
    }

    public final void c(Object obj, long j10, boolean z10) {
        if (u4.f4983g) {
            u4.c(obj, j10, z10);
        } else {
            u4.d(obj, j10, z10 ? (byte) 1 : 0);
        }
    }

    public final void d(Object obj, long j10, byte b10) {
        if (u4.f4983g) {
            u4.c(obj, j10, b10);
        } else {
            u4.d(obj, j10, b10);
        }
    }

    public final void e(Object obj, long j10, double d10) {
        this.f4941a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void f(Object obj, long j10, float f10) {
        this.f4941a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean g(Object obj, long j10) {
        return u4.f4983g ? u4.t(obj, j10) : u4.u(obj, j10);
    }
}

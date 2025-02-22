package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

public final class k9 extends m9 {
    public k9(Unsafe unsafe) {
        super(unsafe);
    }

    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f5401a.getLong(obj, j10));
    }

    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f5401a.getInt(obj, j10));
    }

    public final void c(Object obj, long j10, boolean z10) {
        if (n9.f5424g) {
            n9.c(obj, j10, z10);
        } else {
            n9.d(obj, j10, z10 ? (byte) 1 : 0);
        }
    }

    public final void d(Object obj, long j10, byte b10) {
        if (n9.f5424g) {
            n9.c(obj, j10, b10);
        } else {
            n9.d(obj, j10, b10);
        }
    }

    public final void e(Object obj, long j10, double d10) {
        this.f5401a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void f(Object obj, long j10, float f10) {
        this.f5401a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean g(Object obj, long j10) {
        return n9.f5424g ? n9.s(obj, j10) : n9.t(obj, j10);
    }
}

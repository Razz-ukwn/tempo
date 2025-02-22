package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

public abstract class m9 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f5401a;

    public m9(Unsafe unsafe) {
        this.f5401a = unsafe;
    }

    public abstract double a(Object obj, long j10);

    public abstract float b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d10);

    public abstract void f(Object obj, long j10, float f10);

    public abstract boolean g(Object obj, long j10);
}

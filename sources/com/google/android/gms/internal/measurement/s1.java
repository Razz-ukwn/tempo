package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

public abstract class s1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f5510a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public final long f5511b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5512c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y1 f5513d;

    public s1(y1 y1Var, boolean z10) {
        this.f5513d = y1Var;
        y1Var.f5594b.getClass();
        y1Var.f5594b.getClass();
        this.f5511b = SystemClock.elapsedRealtime();
        this.f5512c = z10;
    }

    public abstract void a();

    public void b() {
    }

    public final void run() {
        y1 y1Var = this.f5513d;
        if (y1Var.f5599g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            y1Var.a(e10, false, this.f5512c);
            b();
        }
    }
}

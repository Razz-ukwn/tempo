package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z1  reason: invalid package */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public final y1 f5119a;

    public z1(y1 y1Var) {
        Charset charset = u2.f4974a;
        this.f5119a = y1Var;
        y1Var.f5092a = this;
    }

    public final void a(int i8, int i10) {
        this.f5119a.y(i8, (i10 >> 31) ^ (i10 + i10));
    }

    public final void b(int i8, long j10) {
        this.f5119a.A(i8, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i8, int i10) {
        this.f5119a.y(i8, i10);
    }

    public final void d(int i8, long j10) {
        this.f5119a.A(i8, j10);
    }

    public final void e(int i8, boolean z10) {
        this.f5119a.n(i8, z10);
    }

    public final void f(int i8, q1 q1Var) {
        this.f5119a.o(i8, q1Var);
    }

    public final void g(int i8, double d10) {
        this.f5119a.r(i8, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i8, int i10) {
        this.f5119a.t(i8, i10);
    }

    public final void i(int i8, int i10) {
        this.f5119a.p(i8, i10);
    }

    public final void j(int i8, long j10) {
        this.f5119a.r(i8, j10);
    }

    public final void k(int i8, float f10) {
        this.f5119a.p(i8, Float.floatToRawIntBits(f10));
    }

    public final void l(int i8, z3 z3Var, Object obj) {
        y1 y1Var = this.f5119a;
        y1Var.x(i8, 3);
        z3Var.c((o3) obj, y1Var.f5092a);
        y1Var.x(i8, 4);
    }

    public final void m(int i8, int i10) {
        this.f5119a.t(i8, i10);
    }

    public final void n(int i8, long j10) {
        this.f5119a.A(i8, j10);
    }

    public final void o(int i8, z3 z3Var, Object obj) {
        this.f5119a.v(i8, (o3) obj, z3Var);
    }

    public final void p(int i8, int i10) {
        this.f5119a.p(i8, i10);
    }

    public final void q(int i8, long j10) {
        this.f5119a.r(i8, j10);
    }
}

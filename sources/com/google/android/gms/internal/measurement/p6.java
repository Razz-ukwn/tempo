package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

public final class p6 {

    /* renamed from: a  reason: collision with root package name */
    public final o6 f5465a;

    public p6(m6 m6Var) {
        Charset charset = m7.f5399a;
        this.f5465a = m6Var;
        m6Var.f5448c = this;
    }

    public final void a(int i8, int i10) {
        this.f5465a.o(i8, (i10 >> 31) ^ (i10 + i10));
    }

    public final void b(int i8, long j10) {
        this.f5465a.q(i8, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i8, int i10) {
        this.f5465a.o(i8, i10);
    }

    public final void d(int i8, long j10) {
        this.f5465a.q(i8, j10);
    }

    public final void e(int i8, boolean z10) {
        this.f5465a.e(i8, z10);
    }

    public final void f(int i8, k6 k6Var) {
        this.f5465a.f(i8, k6Var);
    }

    public final void g(int i8, double d10) {
        this.f5465a.i(i8, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i8, int i10) {
        this.f5465a.k(i8, i10);
    }

    public final void i(int i8, int i10) {
        this.f5465a.g(i8, i10);
    }

    public final void j(int i8, long j10) {
        this.f5465a.i(i8, j10);
    }

    public final void k(int i8, float f10) {
        this.f5465a.g(i8, Float.floatToRawIntBits(f10));
    }

    public final void l(int i8, s8 s8Var, Object obj) {
        o6 o6Var = this.f5465a;
        o6Var.n(i8, 3);
        s8Var.c((h8) obj, o6Var.f5448c);
        o6Var.n(i8, 4);
    }

    public final void m(int i8, int i10) {
        this.f5465a.k(i8, i10);
    }

    public final void n(int i8, long j10) {
        this.f5465a.q(i8, j10);
    }

    public final void o(int i8, s8 s8Var, Object obj) {
        h8 h8Var = (h8) obj;
        m6 m6Var = (m6) this.f5465a;
        m6Var.p((i8 << 3) | 2);
        m6Var.p(((z5) h8Var).c(s8Var));
        s8Var.c(h8Var, m6Var.f5448c);
    }

    public final void p(int i8, int i10) {
        this.f5465a.g(i8, i10);
    }

    public final void q(int i8, long j10) {
        this.f5465a.i(i8, j10);
    }
}

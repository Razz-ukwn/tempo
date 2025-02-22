package com.google.android.gms.internal.measurement;

import java.util.logging.Logger;
import q2.d;

public abstract class o6 extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f5446d = Logger.getLogger(o6.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f5447e = n9.f5422e;

    /* renamed from: c  reason: collision with root package name */
    public p6 f5448c;

    public o6() {
        super(10);
    }

    public /* synthetic */ o6(int i8) {
        super(10);
    }

    @Deprecated
    public static int s(int i8, h8 h8Var, s8 s8Var) {
        int c3 = ((z5) h8Var).c(s8Var);
        int v3 = v(i8 << 3);
        return v3 + v3 + c3;
    }

    public static int t(int i8) {
        if (i8 >= 0) {
            return v(i8);
        }
        return 10;
    }

    public static int u(String str) {
        int i8;
        try {
            i8 = r9.c(str);
        } catch (q9 unused) {
            i8 = str.getBytes(m7.f5399a).length;
        }
        return v(i8) + i8;
    }

    public static int v(int i8) {
        if ((i8 & -128) == 0) {
            return 1;
        }
        if ((i8 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i8) == 0) {
            return 3;
        }
        return (i8 & -268435456) == 0 ? 4 : 5;
    }

    public static int w(long j10) {
        int i8;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i8 += 2;
        }
        return (j10 & -16384) != 0 ? i8 + 1 : i8;
    }

    public abstract void d(byte b10);

    public abstract void e(int i8, boolean z10);

    public abstract void f(int i8, k6 k6Var);

    public abstract void g(int i8, int i10);

    public abstract void h(int i8);

    public abstract void i(int i8, long j10);

    public abstract void j(long j10);

    public abstract void k(int i8, int i10);

    public abstract void l(int i8);

    public abstract void m(int i8, String str);

    public abstract void n(int i8, int i10);

    public abstract void o(int i8, int i10);

    public abstract void p(int i8);

    public abstract void q(int i8, long j10);

    public abstract void r(long j10);
}

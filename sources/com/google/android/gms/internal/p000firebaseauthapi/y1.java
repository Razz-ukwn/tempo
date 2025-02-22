package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y1  reason: invalid package */
public abstract class y1 extends x {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f5090b = Logger.getLogger(y1.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5091c = u4.f4981e;

    /* renamed from: a  reason: collision with root package name */
    public z1 f5092a;

    public y1() {
    }

    public /* synthetic */ y1(int i8) {
    }

    @Deprecated
    public static int C(int i8, o3 o3Var, z3 z3Var) {
        int c3 = ((e1) o3Var).c(z3Var);
        int j10 = j(i8 << 3);
        return j10 + j10 + c3;
    }

    public static int D(int i8) {
        if (i8 >= 0) {
            return j(i8);
        }
        return 10;
    }

    public static int E(String str) {
        int i8;
        try {
            i8 = y4.c(str);
        } catch (x4 unused) {
            i8 = str.getBytes(u2.f4974a).length;
        }
        return j(i8) + i8;
    }

    public static int j(int i8) {
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

    public static int k(long j10) {
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

    public abstract void A(int i8, long j10);

    public abstract void B(long j10);

    public final void l(String str, x4 x4Var) {
        f5090b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", x4Var);
        byte[] bytes = str.getBytes(u2.f4974a);
        try {
            int length = bytes.length;
            z(length);
            a(bytes, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new w1(e10);
        }
    }

    public abstract void m(byte b10);

    public abstract void n(int i8, boolean z10);

    public abstract void o(int i8, q1 q1Var);

    public abstract void p(int i8, int i10);

    public abstract void q(int i8);

    public abstract void r(int i8, long j10);

    public abstract void s(long j10);

    public abstract void t(int i8, int i10);

    public abstract void u(int i8);

    public abstract void v(int i8, o3 o3Var, z3 z3Var);

    public abstract void w(int i8, String str);

    public abstract void x(int i8, int i10);

    public abstract void y(int i8, int i10);

    public abstract void z(int i8);
}

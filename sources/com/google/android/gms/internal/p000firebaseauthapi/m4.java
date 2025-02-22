package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m4  reason: invalid package */
public final class m4 extends k4 {
    public final /* synthetic */ int a(Object obj) {
        return ((l4) obj).a();
    }

    public final int b(Object obj) {
        l4 l4Var = (l4) obj;
        int i8 = l4Var.f4707d;
        if (i8 != -1) {
            return i8;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < l4Var.f4704a; i11++) {
            Logger logger = y1.f5090b;
            int c3 = ((q1) l4Var.f4706c[i11]).c();
            int j10 = y1.j(c3) + c3;
            int j11 = y1.j(16);
            int j12 = y1.j(l4Var.f4705b[i11] >>> 3);
            int j13 = y1.j(8);
            i10 += y1.j(24) + j10 + j11 + j12 + j13 + j13;
        }
        l4Var.f4707d = i10;
        return i10;
    }

    public final /* bridge */ /* synthetic */ l4 c(Object obj) {
        p2 p2Var = (p2) obj;
        l4 l4Var = p2Var.zzc;
        if (l4Var != l4.f4703f) {
            return l4Var;
        }
        l4 b10 = l4.b();
        p2Var.zzc = b10;
        return b10;
    }

    public final /* synthetic */ l4 d(Object obj) {
        return ((p2) obj).zzc;
    }

    public final Object e(Object obj, Object obj2) {
        l4 l4Var = l4.f4703f;
        if (l4Var.equals(obj2)) {
            return obj;
        }
        if (l4Var.equals(obj)) {
            l4 l4Var2 = (l4) obj2;
            l4 l4Var3 = (l4) obj;
            int i8 = l4Var3.f4704a + l4Var2.f4704a;
            int[] copyOf = Arrays.copyOf(l4Var3.f4705b, i8);
            System.arraycopy(l4Var2.f4705b, 0, copyOf, l4Var3.f4704a, l4Var2.f4704a);
            Object[] copyOf2 = Arrays.copyOf(l4Var3.f4706c, i8);
            System.arraycopy(l4Var2.f4706c, 0, copyOf2, l4Var3.f4704a, l4Var2.f4704a);
            return new l4(i8, copyOf, copyOf2, true);
        }
        l4 l4Var4 = (l4) obj2;
        l4 l4Var5 = (l4) obj;
        l4Var5.getClass();
        if (l4Var4.equals(l4Var)) {
            return obj;
        }
        if (l4Var5.f4708e) {
            int i10 = l4Var5.f4704a + l4Var4.f4704a;
            l4Var5.e(i10);
            System.arraycopy(l4Var4.f4705b, 0, l4Var5.f4705b, l4Var5.f4704a, l4Var4.f4704a);
            System.arraycopy(l4Var4.f4706c, 0, l4Var5.f4706c, l4Var5.f4704a, l4Var4.f4704a);
            l4Var5.f4704a = i10;
            return obj;
        }
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ l4 f() {
        return l4.b();
    }

    public final Object g(Object obj) {
        l4 l4Var = (l4) obj;
        if (l4Var.f4708e) {
            l4Var.f4708e = false;
        }
        return obj;
    }

    public final /* bridge */ /* synthetic */ void h(Object obj, int i8, int i10) {
        ((l4) obj).c((i8 << 3) | 5, Integer.valueOf(i10));
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, int i8, long j10) {
        ((l4) obj).c((i8 << 3) | 1, Long.valueOf(j10));
    }

    public final /* bridge */ /* synthetic */ void j(Object obj, int i8, Object obj2) {
        ((l4) obj).c((i8 << 3) | 3, obj2);
    }

    public final /* bridge */ /* synthetic */ void k(Object obj, int i8, q1 q1Var) {
        ((l4) obj).c((i8 << 3) | 2, q1Var);
    }

    public final /* bridge */ /* synthetic */ void l(Object obj, int i8, long j10) {
        ((l4) obj).c(i8 << 3, Long.valueOf(j10));
    }

    public final void m(Object obj) {
        l4 l4Var = ((p2) obj).zzc;
        if (l4Var.f4708e) {
            l4Var.f4708e = false;
        }
    }

    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((p2) obj).zzc = (l4) obj2;
    }

    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((p2) obj).zzc = (l4) obj2;
    }

    public final void q() {
    }

    public final /* synthetic */ void r(Object obj, z1 z1Var) {
        ((l4) obj).d(z1Var);
    }
}

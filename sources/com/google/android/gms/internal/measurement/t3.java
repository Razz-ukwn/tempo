package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class t3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final t3 zza;
    private k7 zzd;
    private k7 zze;
    private l7 zzf;
    private l7 zzg;

    static {
        t3 t3Var = new t3();
        zza = t3Var;
        g7.p(t3.class, t3Var);
    }

    public t3() {
        w7 w7Var = w7.f5570d;
        this.zzd = w7Var;
        this.zze = w7Var;
        q8 q8Var = q8.f5487d;
        this.zzf = q8Var;
        this.zzg = q8Var;
    }

    public static void E(t3 t3Var, List list) {
        k7 k7Var = t3Var.zzd;
        if (!((a6) k7Var).f5147a) {
            t3Var.zzd = g7.l(k7Var);
        }
        z5.d(list, t3Var.zzd);
    }

    public static void F(t3 t3Var) {
        t3Var.zzd = w7.f5570d;
    }

    public static void G(t3 t3Var, List list) {
        k7 k7Var = t3Var.zze;
        if (!((a6) k7Var).f5147a) {
            t3Var.zze = g7.l(k7Var);
        }
        z5.d(list, t3Var.zze);
    }

    public static void H(t3 t3Var) {
        t3Var.zze = w7.f5570d;
    }

    public static /* synthetic */ void I(t3 t3Var, ArrayList arrayList) {
        l7 l7Var = t3Var.zzf;
        if (!l7Var.zzc()) {
            t3Var.zzf = g7.m(l7Var);
        }
        z5.d(arrayList, t3Var.zzf);
    }

    public static void J(t3 t3Var) {
        t3Var.zzf = q8.f5487d;
    }

    public static /* synthetic */ void K(t3 t3Var, List list) {
        l7 l7Var = t3Var.zzg;
        if (!l7Var.zzc()) {
            t3Var.zzg = g7.m(l7Var);
        }
        z5.d(list, t3Var.zzg);
    }

    public static void L(t3 t3Var) {
        t3Var.zzg = q8.f5487d;
    }

    public static s3 x() {
        return (s3) zza.i();
    }

    public static t3 z() {
        return zza;
    }

    public final l7 A() {
        return this.zzf;
    }

    public final List B() {
        return this.zze;
    }

    public final l7 C() {
        return this.zzg;
    }

    public final k7 D() {
        return this.zzd;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", d3.class, "zzg", v3.class});
        } else if (i10 == 3) {
            return new t3();
        } else {
            if (i10 == 4) {
                return new s3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzf.size();
    }

    public final int u() {
        return this.zze.size();
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int w() {
        return this.zzd.size();
    }
}

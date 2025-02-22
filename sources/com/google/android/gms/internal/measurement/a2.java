package com.google.android.gms.internal.measurement;

import java.util.List;

public final class a2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final a2 zza;
    private int zzd;
    private int zze;
    private l7 zzf;
    private l7 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        a2 a2Var = new a2();
        zza = a2Var;
        g7.p(a2.class, a2Var);
    }

    public a2() {
        q8 q8Var = q8.f5487d;
        this.zzf = q8Var;
        this.zzg = q8Var;
    }

    public static /* synthetic */ void B(a2 a2Var, int i8, k2 k2Var) {
        l7 l7Var = a2Var.zzf;
        if (!l7Var.zzc()) {
            a2Var.zzf = g7.m(l7Var);
        }
        a2Var.zzf.set(i8, k2Var);
    }

    public static /* synthetic */ void C(a2 a2Var, int i8, c2 c2Var) {
        l7 l7Var = a2Var.zzg;
        if (!l7Var.zzc()) {
            a2Var.zzg = g7.m(l7Var);
        }
        a2Var.zzg.set(i8, c2Var);
    }

    public final l7 A() {
        return this.zzf;
    }

    public final boolean D() {
        return (this.zzd & 1) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", k2.class, "zzg", c2.class, "zzh", "zzi"});
        } else if (i10 == 3) {
            return new a2();
        } else {
            if (i10 == 4) {
                return new z1(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zze;
    }

    public final int u() {
        return this.zzg.size();
    }

    public final int v() {
        return this.zzf.size();
    }

    public final c2 x(int i8) {
        return (c2) this.zzg.get(i8);
    }

    public final k2 y(int i8) {
        return (k2) this.zzf.get(i8);
    }

    public final List z() {
        return this.zzg;
    }
}

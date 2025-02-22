package com.google.android.gms.internal.measurement;

import java.util.List;

public final class f3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final f3 zza;
    private int zzd;
    private l7 zze = q8.f5487d;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        f3 f3Var = new f3();
        zza = f3Var;
        g7.p(f3.class, f3Var);
    }

    public static /* synthetic */ void C(f3 f3Var, int i8, j3 j3Var) {
        f3Var.N();
        f3Var.zze.set(i8, j3Var);
    }

    public static /* synthetic */ void D(f3 f3Var, j3 j3Var) {
        f3Var.N();
        f3Var.zze.add(j3Var);
    }

    public static /* synthetic */ void E(f3 f3Var, Iterable iterable) {
        f3Var.N();
        z5.d(iterable, f3Var.zze);
    }

    public static void F(f3 f3Var) {
        f3Var.zze = q8.f5487d;
    }

    public static /* synthetic */ void G(f3 f3Var, int i8) {
        f3Var.N();
        f3Var.zze.remove(i8);
    }

    public static /* synthetic */ void H(f3 f3Var, String str) {
        str.getClass();
        f3Var.zzd |= 1;
        f3Var.zzf = str;
    }

    public static /* synthetic */ void I(long j10, f3 f3Var) {
        f3Var.zzd |= 2;
        f3Var.zzg = j10;
    }

    public static /* synthetic */ void J(long j10, f3 f3Var) {
        f3Var.zzd |= 4;
        f3Var.zzh = j10;
    }

    public static e3 x() {
        return (e3) zza.i();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzd & 8) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 2) != 0;
    }

    public final void N() {
        l7 l7Var = this.zze;
        if (!l7Var.zzc()) {
            this.zze = g7.m(l7Var);
        }
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", j3.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i10 == 3) {
            return new f3();
        } else {
            if (i10 == 4) {
                return new e3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzi;
    }

    public final int u() {
        return this.zze.size();
    }

    public final long v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzg;
    }

    public final j3 z(int i8) {
        return (j3) this.zze.get(i8);
    }
}

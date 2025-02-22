package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class j3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final j3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private l7 zzj = q8.f5487d;

    static {
        j3 j3Var = new j3();
        zza = j3Var;
        g7.p(j3.class, j3Var);
    }

    public static /* synthetic */ void C(j3 j3Var, String str) {
        str.getClass();
        j3Var.zzd |= 1;
        j3Var.zze = str;
    }

    public static /* synthetic */ void D(j3 j3Var, String str) {
        str.getClass();
        j3Var.zzd |= 2;
        j3Var.zzf = str;
    }

    public static /* synthetic */ void E(j3 j3Var) {
        j3Var.zzd &= -3;
        j3Var.zzf = zza.zzf;
    }

    public static /* synthetic */ void F(j3 j3Var, long j10) {
        j3Var.zzd |= 4;
        j3Var.zzg = j10;
    }

    public static /* synthetic */ void G(j3 j3Var) {
        j3Var.zzd &= -5;
        j3Var.zzg = 0;
    }

    public static /* synthetic */ void H(j3 j3Var, double d10) {
        j3Var.zzd |= 16;
        j3Var.zzi = d10;
    }

    public static /* synthetic */ void I(j3 j3Var) {
        j3Var.zzd &= -17;
        j3Var.zzi = 0.0d;
    }

    public static void J(j3 j3Var, j3 j3Var2) {
        l7 l7Var = j3Var.zzj;
        if (!l7Var.zzc()) {
            j3Var.zzj = g7.m(l7Var);
        }
        j3Var.zzj.add(j3Var2);
    }

    public static void K(j3 j3Var, ArrayList arrayList) {
        l7 l7Var = j3Var.zzj;
        if (!l7Var.zzc()) {
            j3Var.zzj = g7.m(l7Var);
        }
        z5.d(arrayList, j3Var.zzj);
    }

    public static void L(j3 j3Var) {
        j3Var.zzj = q8.f5487d;
    }

    public static i3 x() {
        return (i3) zza.i();
    }

    public final String A() {
        return this.zzf;
    }

    public final List B() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }

    public final boolean O() {
        return (this.zzd & 4) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 2) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", j3.class});
        } else if (i10 == 3) {
            return new j3();
        } else {
            if (i10 == 4) {
                return new i3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double t() {
        return this.zzi;
    }

    public final float u() {
        return this.zzh;
    }

    public final int v() {
        return this.zzj.size();
    }

    public final long w() {
        return this.zzg;
    }

    public final String z() {
        return this.zze;
    }
}

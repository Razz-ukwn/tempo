package com.google.android.gms.internal.measurement;

public final class x3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final x3 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        x3 x3Var = new x3();
        zza = x3Var;
        g7.p(x3.class, x3Var);
    }

    public static /* synthetic */ void A(x3 x3Var, long j10) {
        x3Var.zzd |= 1;
        x3Var.zze = j10;
    }

    public static /* synthetic */ void B(x3 x3Var, String str) {
        str.getClass();
        x3Var.zzd |= 2;
        x3Var.zzf = str;
    }

    public static /* synthetic */ void C(x3 x3Var, String str) {
        str.getClass();
        x3Var.zzd |= 4;
        x3Var.zzg = str;
    }

    public static /* synthetic */ void D(x3 x3Var) {
        x3Var.zzd &= -5;
        x3Var.zzg = zza.zzg;
    }

    public static /* synthetic */ void E(x3 x3Var, long j10) {
        x3Var.zzd |= 8;
        x3Var.zzh = j10;
    }

    public static /* synthetic */ void F(x3 x3Var) {
        x3Var.zzd &= -9;
        x3Var.zzh = 0;
    }

    public static /* synthetic */ void G(x3 x3Var, double d10) {
        x3Var.zzd |= 32;
        x3Var.zzj = d10;
    }

    public static /* synthetic */ void H(x3 x3Var) {
        x3Var.zzd &= -33;
        x3Var.zzj = 0.0d;
    }

    public static w3 w() {
        return (w3) zza.i();
    }

    public final boolean I() {
        return (this.zzd & 32) != 0;
    }

    public final boolean J() {
        return (this.zzd & 8) != 0;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i10 == 3) {
            return new x3();
        } else {
            if (i10 == 4) {
                return new w3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final double t() {
        return this.zzj;
    }

    public final long u() {
        return this.zzh;
    }

    public final long v() {
        return this.zze;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}

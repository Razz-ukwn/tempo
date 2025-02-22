package com.google.android.gms.internal.measurement;

public final class k2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final k2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private e2 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        k2 k2Var = new k2();
        zza = k2Var;
        g7.p(k2.class, k2Var);
    }

    public static j2 v() {
        return (j2) zza.i();
    }

    public static /* synthetic */ void y(k2 k2Var, String str) {
        k2Var.zzd |= 2;
        k2Var.zzf = str;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return (this.zzd & 1) != 0;
    }

    public final boolean D() {
        return (this.zzd & 32) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i10 == 3) {
            return new k2();
        } else {
            if (i10 == 4) {
                return new j2(0);
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

    public final e2 u() {
        e2 e2Var = this.zzg;
        return e2Var == null ? e2.u() : e2Var;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzh;
    }
}

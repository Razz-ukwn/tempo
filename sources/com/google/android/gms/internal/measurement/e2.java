package com.google.android.gms.internal.measurement;

public final class e2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final e2 zza;
    private int zzd;
    private n2 zze;
    private i2 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        e2 e2Var = new e2();
        zza = e2Var;
        g7.p(e2.class, e2Var);
    }

    public static e2 u() {
        return zza;
    }

    public static /* synthetic */ void y(e2 e2Var, String str) {
        e2Var.zzd |= 8;
        e2Var.zzh = str;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 2) != 0;
    }

    public final boolean C() {
        return (this.zzd & 8) != 0;
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
            return new r8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new e2();
        } else {
            if (i10 == 4) {
                return new d2(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final i2 v() {
        i2 i2Var = this.zzf;
        return i2Var == null ? i2.u() : i2Var;
    }

    public final n2 w() {
        n2 n2Var = this.zze;
        return n2Var == null ? n2.v() : n2Var;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzg;
    }
}

package com.google.android.gms.internal.measurement;

public final class b3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final b3 zza;
    private int zzd;
    private int zze;
    private t3 zzf;
    private t3 zzg;
    private boolean zzh;

    static {
        b3 b3Var = new b3();
        zza = b3Var;
        g7.p(b3.class, b3Var);
    }

    public static /* synthetic */ void A(b3 b3Var, t3 t3Var) {
        b3Var.zzg = t3Var;
        b3Var.zzd |= 4;
    }

    public static /* synthetic */ void B(b3 b3Var, boolean z10) {
        b3Var.zzd |= 8;
        b3Var.zzh = z10;
    }

    public static a3 u() {
        return (a3) zza.i();
    }

    public static /* synthetic */ void y(b3 b3Var, int i8) {
        b3Var.zzd |= 1;
        b3Var.zze = i8;
    }

    public static /* synthetic */ void z(b3 b3Var, t3 t3Var) {
        b3Var.zzf = t3Var;
        b3Var.zzd |= 2;
    }

    public final boolean C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zzd & 1) != 0;
    }

    public final boolean E() {
        return (this.zzd & 8) != 0;
    }

    public final boolean F() {
        return (this.zzd & 4) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new b3();
        } else {
            if (i10 == 4) {
                return new a3(0);
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

    public final t3 w() {
        t3 t3Var = this.zzf;
        return t3Var == null ? t3.z() : t3Var;
    }

    public final t3 x() {
        t3 t3Var = this.zzg;
        return t3Var == null ? t3.z() : t3Var;
    }
}

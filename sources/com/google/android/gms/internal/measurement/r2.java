package com.google.android.gms.internal.measurement;

public final class r2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final r2 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        r2 r2Var = new r2();
        zza = r2Var;
        g7.p(r2.class, r2Var);
    }

    public static /* synthetic */ void w(r2 r2Var, String str) {
        str.getClass();
        r2Var.zzd |= 1;
        r2Var.zze = str;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 8) != 0;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new r2();
        } else {
            if (i10 == 4) {
                return new q2(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzh;
    }

    public final String v() {
        return this.zze;
    }

    public final boolean x() {
        return this.zzf;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzd & 2) != 0;
    }
}

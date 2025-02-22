package com.google.android.gms.internal.measurement;

public final class d4 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final d4 zza;
    private int zzd;
    private int zze;
    private l7 zzf = q8.f5487d;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        d4 d4Var = new d4();
        zza = d4Var;
        g7.p(d4.class, d4Var);
    }

    public final boolean A() {
        return (this.zzd & 16) != 0;
    }

    public final boolean B() {
        return (this.zzd & 4) != 0;
    }

    public final int C() {
        int i8;
        int i10 = this.zze;
        if (i10 != 0) {
            i8 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i8 = 4;
                    if (i10 != 3) {
                        i8 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i8 = 3;
                }
            }
        } else {
            i8 = 1;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", c4.f5173a, "zzf", d4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i10 == 3) {
            return new d4();
        } else {
            if (i10 == 4) {
                return new u2(0);
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

    public final String v() {
        return this.zzg;
    }

    public final String w() {
        return this.zzh;
    }

    public final l7 x() {
        return this.zzf;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return (this.zzd & 8) != 0;
    }
}

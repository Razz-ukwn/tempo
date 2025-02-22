package com.google.android.gms.internal.measurement;

public final class i2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final i2 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        i2 i2Var = new i2();
        zza = i2Var;
        g7.p(i2.class, i2Var);
    }

    public static i2 u() {
        return zza;
    }

    public final boolean A() {
        return (this.zzd & 4) != 0;
    }

    public final boolean B() {
        return (this.zzd & 2) != 0;
    }

    public final boolean C() {
        return (this.zzd & 16) != 0;
    }

    public final boolean D() {
        return (this.zzd & 8) != 0;
    }

    public final int E() {
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
            return new r8(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", h2.f5302a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i10 == 3) {
            return new i2();
        } else {
            if (i10 == 4) {
                return new g2();
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String v() {
        return this.zzg;
    }

    public final String w() {
        return this.zzi;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzd & 1) != 0;
    }
}

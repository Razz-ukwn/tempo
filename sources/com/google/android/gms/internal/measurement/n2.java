package com.google.android.gms.internal.measurement;

public final class n2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final n2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private l7 zzh = q8.f5487d;

    static {
        n2 n2Var = new n2();
        zza = n2Var;
        g7.p(n2.class, n2Var);
    }

    public static n2 v() {
        return zza;
    }

    public final boolean A() {
        return (this.zzd & 2) != 0;
    }

    public final boolean B() {
        return (this.zzd & 1) != 0;
    }

    public final int C() {
        int e10 = ag.n2.e(this.zze);
        if (e10 == 0) {
            return 1;
        }
        return e10;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", m2.f5396a, "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new n2();
        } else {
            if (i10 == 4) {
                return new l2();
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzh.size();
    }

    public final String w() {
        return this.zzf;
    }

    public final l7 x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzd & 4) != 0;
    }
}

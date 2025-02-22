package com.google.android.gms.internal.measurement;

public final class z3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final z3 zza;
    private l7 zzd = q8.f5487d;

    static {
        z3 z3Var = new z3();
        zza = z3Var;
        g7.p(z3.class, z3Var);
    }

    public static z3 v() {
        return zza;
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", a4.class});
        } else if (i10 == 3) {
            return new z3();
        } else {
            if (i10 == 4) {
                return new y3();
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final int t() {
        return this.zzd.size();
    }

    public final l7 w() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.measurement;

public final class b4 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final b4 zza;
    private int zzd;
    private l7 zze = q8.f5487d;
    private z3 zzf;

    static {
        b4 b4Var = new b4();
        zza = b4Var;
        g7.p(b4.class, b4Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", d4.class, "zzf"});
        } else if (i10 == 3) {
            return new b4();
        } else {
            if (i10 == 4) {
                return new g2((f2) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final z3 t() {
        z3 z3Var = this.zzf;
        return z3Var == null ? z3.v() : z3Var;
    }

    public final l7 v() {
        return this.zze;
    }
}

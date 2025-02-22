package com.google.android.gms.internal.measurement;

public final class r3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final r3 zza;
    private int zzd;
    private int zze = 1;
    private l7 zzf = q8.f5487d;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        g7.p(r3.class, r3Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", q3.f5480a, "zzf", h3.class});
        } else if (i10 == 3) {
            return new r3();
        } else {
            if (i10 == 4) {
                return new p3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}

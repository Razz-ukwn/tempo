package com.google.android.gms.internal.measurement;

public final class a4 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final a4 zza;
    private int zzd;
    private String zze = "";
    private l7 zzf = q8.f5487d;

    static {
        a4 a4Var = new a4();
        zza = a4Var;
        g7.p(a4.class, a4Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", d4.class});
        } else if (i10 == 3) {
            return new a4();
        } else {
            if (i10 == 4) {
                return new y2(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }

    public final String u() {
        return this.zze;
    }

    public final l7 v() {
        return this.zzf;
    }
}

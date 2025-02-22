package com.google.android.gms.internal.measurement;

public final class v2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final v2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        v2 v2Var = new v2();
        zza = v2Var;
        g7.p(v2.class, v2Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new v2();
        } else {
            if (i10 == 4) {
                return new u2();
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}

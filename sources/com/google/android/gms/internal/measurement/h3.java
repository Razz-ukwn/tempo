package com.google.android.gms.internal.measurement;

public final class h3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final h3 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        h3 h3Var = new h3();
        zza = h3Var;
        g7.p(h3.class, h3Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new h3();
        } else {
            if (i10 == 4) {
                return new g3(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}

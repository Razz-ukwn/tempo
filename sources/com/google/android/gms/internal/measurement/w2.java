package com.google.android.gms.internal.measurement;

public final class w2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final w2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        w2 w2Var = new w2();
        zza = w2Var;
        g7.p(w2.class, w2Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new w2();
        } else {
            if (i10 == 4) {
                return new l2(0);
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

    public final String v() {
        return this.zzf;
    }
}

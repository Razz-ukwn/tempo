package com.google.android.gms.internal.measurement;

public final class k3 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final k3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private z2 zzg;

    static {
        k3 k3Var = new k3();
        zza = k3Var;
        g7.p(k3.class, k3Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new k3();
        } else {
            if (i10 == 4) {
                return new g2((Object) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}

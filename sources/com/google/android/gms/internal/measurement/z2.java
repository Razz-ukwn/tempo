package com.google.android.gms.internal.measurement;

public final class z2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final z2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        z2 z2Var = new z2();
        zza = z2Var;
        g7.p(z2.class, z2Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i10 == 3) {
            return new z2();
        } else {
            if (i10 == 4) {
                return new y2();
            }
            if (i10 != 5) {
                return null;
            }
            return zza;
        }
    }
}

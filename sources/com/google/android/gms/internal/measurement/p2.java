package com.google.android.gms.internal.measurement;

public final class p2 extends g7 implements i8 {
    /* access modifiers changed from: private */
    public static final p2 zza;
    private int zzd;
    private String zze = "";
    private l7 zzf = q8.f5487d;
    private boolean zzg;

    static {
        p2 p2Var = new p2();
        zza = p2Var;
        g7.p(p2.class, p2Var);
    }

    public final Object s(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new r8(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", v2.class, "zzg"});
        } else if (i10 == 3) {
            return new p2();
        } else {
            if (i10 == 4) {
                return new g2(0);
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
}

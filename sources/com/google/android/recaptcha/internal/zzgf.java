package com.google.android.recaptcha.internal;

public final class zzgf extends zzhb {
    /* access modifiers changed from: private */
    public static final zzgf zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private byte zzl = 2;

    static {
        zzgf zzgf = new zzgf();
        zzd = zzgf;
        zzhf.zzC(zzgf.class, zzgf);
    }

    private zzgf() {
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b10 = 1;
        if (i10 == 2) {
            return new zzja(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zze", "zzf", zzga.zza, "zzg", zzfz.zza, "zzh", zzgd.zza, "zzi", zzge.zza, "zzj", zzgc.zza, "zzk", zzgb.zza});
        } else if (i10 == 3) {
            return new zzgf();
        } else {
            if (i10 == 4) {
                return new zzfy((zzfv) null);
            }
            if (i10 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzl = b10;
            return null;
        }
    }
}

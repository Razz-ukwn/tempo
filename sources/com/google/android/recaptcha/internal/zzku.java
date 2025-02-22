package com.google.android.recaptcha.internal;

public final class zzku extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzku zzb;
    private int zzd;
    private zzgn zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzku zzku = new zzku();
        zzb = zzku;
        zzhf.zzC(zzku.class, zzku);
    }

    private zzku() {
    }

    public static zzkt zzf() {
        return (zzkt) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzku zzku, zzgn zzgn) {
        zzgn.getClass();
        zzku.zze = zzgn;
        zzku.zzd |= 1;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new zzku();
        } else {
            if (i10 == 4) {
                return new zzkt((zzks) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

package com.google.android.recaptcha.internal;

public final class zzlj extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzlj zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private String zzg = "";
    private int zzh;
    private String zzi = "";
    private int zzj;

    static {
        zzlj zzlj = new zzlj();
        zzb = zzlj;
        zzhf.zzC(zzlj.class, zzlj);
    }

    private zzlj() {
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i10 == 3) {
            return new zzlj();
        } else {
            if (i10 == 4) {
                return new zzli((zzlh) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

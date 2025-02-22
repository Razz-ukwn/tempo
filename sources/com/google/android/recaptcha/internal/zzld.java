package com.google.android.recaptcha.internal;

public final class zzld extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzld zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzld zzld = new zzld();
        zzb = zzld;
        zzhf.zzC(zzld.class, zzld);
    }

    private zzld() {
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i10 == 3) {
            return new zzld();
        } else {
            if (i10 == 4) {
                return new zzlc((zzlb) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

package com.google.android.recaptcha.internal;

public final class zzms extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzms zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzms zzms = new zzms();
        zzb = zzms;
        zzhf.zzC(zzms.class, zzms);
    }

    private zzms() {
    }

    public static zzmr zzf() {
        return (zzmr) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzms zzms, String str) {
        str.getClass();
        zzms.zzd = str;
    }

    public static /* synthetic */ void zzj(zzms zzms, String str) {
        str.getClass();
        zzms.zze = str;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new zzms();
        } else {
            if (i10 == 4) {
                return new zzmr((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

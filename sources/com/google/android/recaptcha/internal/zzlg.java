package com.google.android.recaptcha.internal;

public final class zzlg extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzlg zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzlg zzlg = new zzlg();
        zzb = zzlg;
        zzhf.zzC(zzlg.class, zzlg);
    }

    private zzlg() {
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new zzlg();
        } else {
            if (i10 == 4) {
                return new zzlf((zzle) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

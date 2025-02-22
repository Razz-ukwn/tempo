package com.google.android.recaptcha.internal;

import java.io.InputStream;

public final class zzmi extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzmi zzb;
    private zzmg zzd;
    private zzmg zze;

    static {
        zzmi zzmi = new zzmi();
        zzb = zzmi;
        zzhf.zzC(zzmi.class, zzmi);
    }

    private zzmi() {
    }

    public static zzmi zzj(InputStream inputStream) {
        return (zzmi) zzhf.zzt(zzb, inputStream);
    }

    public final zzmg zzf() {
        zzmg zzmg = this.zzd;
        return zzmg == null ? zzmg.zzg() : zzmg;
    }

    public final zzmg zzg() {
        zzmg zzmg = this.zze;
        return zzmg == null ? zzmg.zzg() : zzmg;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new zzmi();
        } else {
            if (i10 == 4) {
                return new zzmh((zzme) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

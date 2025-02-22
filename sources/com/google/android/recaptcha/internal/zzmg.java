package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzmg extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzmg zzb;
    private zzhm zzd = zzhf.zzw();

    static {
        zzmg zzmg = new zzmg();
        zzb = zzmg;
        zzhf.zzC(zzmg.class, zzmg);
    }

    private zzmg() {
    }

    public static zzmg zzg() {
        return zzb;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new zzmg();
        } else {
            if (i10 == 4) {
                return new zzmf((zzme) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final List zzi() {
        return this.zzd;
    }
}

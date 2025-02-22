package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzna extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzna zzb;
    private zzhm zzd = zzhf.zzw();

    static {
        zzna zzna = new zzna();
        zzb = zzna;
        zzhf.zzC(zzna.class, zzna);
    }

    private zzna() {
    }

    public static zzna zzg(byte[] bArr) {
        return (zzna) zzhf.zzu(zzb, bArr);
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zznm.class});
        } else if (i10 == 3) {
            return new zzna();
        } else {
            if (i10 == 4) {
                return new zzmz((zzmm) null);
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

package com.google.android.recaptcha.internal;

public final class zzmu extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzmu zzb;
    private int zzd;

    static {
        zzmu zzmu = new zzmu();
        zzb = zzmu;
        zzhf.zzC(zzmu.class, zzmu);
    }

    private zzmu() {
    }

    public static zzmu zzg(byte[] bArr) {
        return (zzmu) zzhf.zzu(zzb, bArr);
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new zzmu();
        } else {
            if (i10 == 4) {
                return new zzmt((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzmw zzi() {
        zzmw zzb2 = zzmw.zzb(this.zzd);
        return zzb2 == null ? zzmw.UNRECOGNIZED : zzb2;
    }
}

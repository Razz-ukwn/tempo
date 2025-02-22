package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzni extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzni zzb;
    private String zzd = "";
    private zzhk zze = zzhf.zzv();

    static {
        zzni zzni = new zzni();
        zzb = zzni;
        zzhf.zzC(zzni.class, zzni);
    }

    private zzni() {
    }

    public static zzni zzg(byte[] bArr) {
        return (zzni) zzhf.zzu(zzb, bArr);
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new zzni();
        } else {
            if (i10 == 4) {
                return new zznh((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zze;
    }
}

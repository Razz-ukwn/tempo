package com.google.android.recaptcha.internal;

public final class zzgn extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzgn zzb;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgn zzgn = new zzgn();
        zzb = zzgn;
        zzhf.zzC(zzgn.class, zzgn);
    }

    private zzgn() {
    }

    public static zzgm zzi() {
        return (zzgm) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new zzja(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new zzgn();
        } else {
            if (i10 == 4) {
                return new zzgm((zzgl) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

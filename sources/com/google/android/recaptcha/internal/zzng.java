package com.google.android.recaptcha.internal;

public final class zzng extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzng zzb;
    private zzhm zzd = zzhf.zzw();
    private int zze;

    static {
        zzng zzng = new zzng();
        zzb = zzng;
        zzhf.zzC(zzng.class, zzng);
    }

    private zzng() {
    }

    public static zznd zzf() {
        return (zznd) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzng zzng, zznf zznf) {
        zznf.getClass();
        zzng.zzk();
        zzng.zzd.add(zznf);
    }

    public static /* synthetic */ void zzj(zzng zzng, Iterable iterable) {
        zzng.zzk();
        zzer.zzc(iterable, zzng.zzd);
    }

    private final void zzk() {
        zzhm zzhm = this.zzd;
        if (!zzhm.zzc()) {
            this.zzd = zzhf.zzx(zzhm);
        }
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zznf.class, "zze"});
        } else if (i10 == 3) {
            return new zzng();
        } else {
            if (i10 == 4) {
                return new zznd((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

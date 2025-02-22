package com.google.android.recaptcha.internal;

public final class zzmy extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzmy zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzmy zzmy = new zzmy();
        zzb = zzmy;
        zzhf.zzC(zzmy.class, zzmy);
    }

    private zzmy() {
    }

    public static /* synthetic */ void zzG(zzmy zzmy, zzlo zzlo) {
        zzlo.getClass();
        zzmy.zze = zzlo;
        zzmy.zzd = 1;
    }

    public static zzmx zzi() {
        return (zzmx) zzb.zzp();
    }

    public static zzmy zzk(byte[] bArr) {
        return (zzmy) zzhf.zzu(zzb, bArr);
    }

    public final int zzH() {
        int i8 = this.zzd;
        if (i8 == 0) {
            return 3;
        }
        int i10 = 1;
        if (i8 != 1) {
            i10 = 2;
            if (i8 != 2) {
                return 0;
            }
        }
        return i10;
    }

    public final zzlo zzf() {
        return this.zzd == 1 ? (zzlo) this.zze : zzlo.zzG();
    }

    public final zzmd zzg() {
        return this.zzd == 2 ? (zzmd) this.zze : zzmd.zzg();
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzlo.class, zzmd.class});
        } else if (i10 == 3) {
            return new zzmy();
        } else {
            if (i10 == 4) {
                return new zzmx((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

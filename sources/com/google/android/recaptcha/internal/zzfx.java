package com.google.android.recaptcha.internal;

public final class zzfx extends zzhb {
    /* access modifiers changed from: private */
    public static final zzfx zzd;
    private int zze;
    private boolean zzf;
    private zzgf zzg;
    private zzhm zzh = zziz.zze();
    private byte zzi = 2;

    static {
        zzfx zzfx = new zzfx();
        zzd = zzfx;
        zzhf.zzC(zzfx.class, zzfx);
    }

    private zzfx() {
    }

    public static zzfx zzg() {
        return zzd;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzi);
        }
        byte b10 = 1;
        if (i10 == 2) {
            return new zzja(zzd, "\u0001\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", zzgj.class});
        } else if (i10 == 3) {
            return new zzfx();
        } else {
            if (i10 == 4) {
                return new zzfw((zzfv) null);
            }
            if (i10 == 5) {
                return zzd;
            }
            if (obj == null) {
                b10 = 0;
            }
            this.zzi = b10;
            return null;
        }
    }
}

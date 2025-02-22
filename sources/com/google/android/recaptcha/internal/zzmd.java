package com.google.android.recaptcha.internal;

public final class zzmd extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zzmd zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzgn zzh;
    private zzju zzi;
    private int zzj;
    private zzlj zzk;
    private zzhm zzl = zzhf.zzw();

    static {
        zzmd zzmd = new zzmd();
        zzb = zzmd;
        zzhf.zzC(zzmd.class, zzmd);
    }

    private zzmd() {
    }

    public static zzmd zzg() {
        return zzb;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\t\u0000\u0000\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003\t\u0004\t\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000b\t", new Object[]{"zzd", "zzh", "zzi", "zzj", "zzl", zzlu.class, "zze", "zzf", "zzg", "zzk"});
        } else if (i10 == 3) {
            return new zzmd();
        } else {
            if (i10 == 4) {
                return new zzmc((zzmb) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

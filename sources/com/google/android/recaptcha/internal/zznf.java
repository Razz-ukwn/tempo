package com.google.android.recaptcha.internal;

public final class zznf extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zznf zzb;
    private int zzd = 0;
    private Object zze;
    private int zzf;

    static {
        zznf zznf = new zznf();
        zzb = zznf;
        zzhf.zzC(zznf.class, zznf);
    }

    private zznf() {
    }

    public static /* synthetic */ void zzG(zznf zznf, String str) {
        str.getClass();
        zznf.zzd = 11;
        zznf.zze = str;
    }

    public static /* synthetic */ void zzH(zznf zznf, boolean z10) {
        zznf.zzd = 1;
        zznf.zze = Boolean.valueOf(z10);
    }

    public static /* synthetic */ void zzI(zznf zznf, zzfi zzfi) {
        zznf.zzd = 2;
        zznf.zze = zzfi;
    }

    public static /* synthetic */ void zzJ(zznf zznf, String str) {
        str.getClass();
        zznf.zzd = 3;
        zznf.zze = str;
    }

    public static /* synthetic */ void zzK(zznf zznf, int i8) {
        zznf.zzd = 4;
        zznf.zze = Integer.valueOf(i8);
    }

    public static /* synthetic */ void zzL(zznf zznf, int i8) {
        zznf.zzd = 5;
        zznf.zze = Integer.valueOf(i8);
    }

    public static zzne zzf() {
        return (zzne) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zznf zznf, long j10) {
        zznf.zzd = 7;
        zznf.zze = Long.valueOf(j10);
    }

    public static /* synthetic */ void zzj(zznf zznf, float f10) {
        zznf.zzd = 9;
        zznf.zze = Float.valueOf(f10);
    }

    public static /* synthetic */ void zzk(zznf zznf, double d10) {
        zznf.zzd = 10;
        zznf.zze = Double.valueOf(d10);
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000\f\u000b", new Object[]{"zze", "zzd", "zzf"});
        } else if (i10 == 3) {
            return new zznf();
        } else {
            if (i10 == 4) {
                return new zzne((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

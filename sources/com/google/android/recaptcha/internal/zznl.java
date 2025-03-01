package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

public final class zznl extends zzhf implements zziq {
    /* access modifiers changed from: private */
    public static final zznl zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zznl zznl = new zznl();
        zzb = zznl;
        zzhf.zzC(zznl.class, zznl);
    }

    private zznl() {
    }

    public final long zzG() {
        if (this.zzd == 8) {
            return ((Long) this.zze).longValue();
        }
        return 0;
    }

    public final zzfi zzH() {
        return this.zzd == 3 ? (zzfi) this.zze : zzfi.zzb;
    }

    public final String zzJ() {
        return this.zzd == 4 ? (String) this.zze : "";
    }

    public final String zzK() {
        return this.zzd == 12 ? (String) this.zze : "";
    }

    public final boolean zzL() {
        if (this.zzd == 2) {
            return ((Boolean) this.zze).booleanValue();
        }
        return false;
    }

    public final boolean zzM() {
        return this.zzd == 1;
    }

    public final int zzN() {
        switch (this.zzd) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case ModuleDescriptor.MODULE_VERSION:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf() {
        if (this.zzd == 11) {
            return ((Double) this.zze).doubleValue();
        }
        return 0.0d;
    }

    public final float zzg() {
        if (this.zzd == 10) {
            return ((Float) this.zze).floatValue();
        }
        return 0.0f;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zze", "zzd"});
        } else if (i10 == 3) {
            return new zznl();
        } else {
            if (i10 == 4) {
                return new zznk((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzi() {
        if (this.zzd == 1) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzj() {
        if (this.zzd == 5) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }

    public final int zzk() {
        if (this.zzd == 6) {
            return ((Integer) this.zze).intValue();
        }
        return 0;
    }
}

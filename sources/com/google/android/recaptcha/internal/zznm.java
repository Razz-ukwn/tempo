package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.List;

public final class zznm extends zzhf implements zziq {
    public static final zzhd zzb;
    public static final zzhd zzd;
    /* access modifiers changed from: private */
    public static final zznm zze;
    private int zzf;
    private int zzg;
    private zzhm zzh = zzhf.zzw();

    static {
        zznm zznm = new zznm();
        zze = zznm;
        zzhf.zzC(zznm.class, zznm);
        zzfx zzg2 = zzfx.zzg();
        zzkm zzkm = zzkm.STRING;
        zzb = zzhf.zzq(zzg2, "", (zzip) null, (zzhi) null, 490775251, zzkm, String.class);
        zzd = zzhf.zzq(zzfx.zzg(), "", (zzip) null, (zzhi) null, 490775252, zzkm, String.class);
    }

    private zznm() {
    }

    public final int zzf() {
        return this.zzf;
    }

    public final int zzg() {
        return this.zzg;
    }

    public final Object zzh(int i8, Object obj, Object obj2) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzhf.zzz(zze, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zzf", "zzg", "zzh", zznl.class});
        } else if (i10 == 3) {
            return new zznm();
        } else {
            if (i10 == 4) {
                return new zznj((zzmm) null);
            }
            if (i10 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final List zzj() {
        return this.zzh;
    }

    public final int zzk() {
        int i8;
        switch (this.zzf) {
            case 0:
                i8 = 2;
                break;
            case 1:
                i8 = 3;
                break;
            case 2:
                i8 = 4;
                break;
            case 3:
                i8 = 5;
                break;
            case 4:
                i8 = 6;
                break;
            case 5:
                i8 = 7;
                break;
            case 6:
                i8 = 8;
                break;
            case 7:
                i8 = 9;
                break;
            case 8:
                i8 = 10;
                break;
            case 9:
                i8 = 11;
                break;
            case 10:
                i8 = 12;
                break;
            case ModuleDescriptor.MODULE_VERSION:
                i8 = 13;
                break;
            case 12:
                i8 = 14;
                break;
            case 13:
                i8 = 15;
                break;
            case 14:
                i8 = 16;
                break;
            case 15:
                i8 = 17;
                break;
            case 16:
                i8 = 18;
                break;
            case 17:
                i8 = 19;
                break;
            case 18:
                i8 = 20;
                break;
            case 19:
                i8 = 21;
                break;
            case 20:
                i8 = 22;
                break;
            case 21:
                i8 = 23;
                break;
            case 22:
                i8 = 24;
                break;
            case 23:
                i8 = 25;
                break;
            case 24:
                i8 = 26;
                break;
            case 25:
                i8 = 27;
                break;
            case 26:
                i8 = 28;
                break;
            case 27:
                i8 = 29;
                break;
            case 28:
                i8 = 30;
                break;
            case 29:
                i8 = 31;
                break;
            case 30:
                i8 = 32;
                break;
            case 31:
                i8 = 33;
                break;
            case 32:
                i8 = 34;
                break;
            case 33:
                i8 = 35;
                break;
            case 34:
                i8 = 36;
                break;
            case 35:
                i8 = 37;
                break;
            case 36:
                i8 = 38;
                break;
            case 37:
                i8 = 39;
                break;
            case 38:
                i8 = 40;
                break;
            case 39:
                i8 = 41;
                break;
            case 40:
                i8 = 42;
                break;
            default:
                i8 = 0;
                break;
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }
}

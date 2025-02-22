package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lf  reason: invalid package */
public final class lf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final lf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        lf lfVar = new lf();
        zzb = lfVar;
        p2.g(lf.class, lfVar);
    }

    public static kf t() {
        return (kf) zzb.o();
    }

    public static lf v() {
        return zzb;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new lf();
        } else {
            if (i10 == 4) {
                return new kf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int w() {
        int i8 = this.zzf;
        int i10 = 2;
        if (i8 != 0) {
            i10 = i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 5 : 4 : 3;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int x() {
        int i8 = this.zze;
        int i10 = 2;
        if (i8 != 0) {
            i10 = i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 5 : 4 : 3;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int y() {
        int i8 = this.zzd;
        int i10 = 2;
        if (i8 != 0) {
            i10 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 0 : 6 : 5 : 4 : 3;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}

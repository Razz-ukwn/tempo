package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ff  reason: invalid package */
public final class ff extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ff zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        ff ffVar = new ff();
        zzb = ffVar;
        p2.g(ff.class, ffVar);
    }

    public static ef u() {
        return (ef) zzb.o();
    }

    public static ff w() {
        return zzb;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new ff();
        } else {
            if (i10 == 4) {
                return new ef(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zze;
    }

    public final int y() {
        int i8 = this.zzd;
        int i10 = 2;
        if (i8 != 0) {
            if (i8 == 1) {
                i10 = 3;
            } else if (i8 != 2) {
                i10 = 5;
                if (i8 != 3) {
                    i10 = i8 != 4 ? i8 != 5 ? 0 : 7 : 6;
                }
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}

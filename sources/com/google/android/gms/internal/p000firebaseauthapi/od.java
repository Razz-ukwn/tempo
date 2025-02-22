package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.od  reason: invalid package */
public final class od extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final od zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        od odVar = new od();
        zzb = odVar;
        p2.g(od.class, odVar);
    }

    public static nd u() {
        return (nd) zzb.o();
    }

    public static od w() {
        return zzb;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new od();
        } else {
            if (i10 == 4) {
                return new nd(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zzd;
    }
}

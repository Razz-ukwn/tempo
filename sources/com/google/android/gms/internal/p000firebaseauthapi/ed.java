package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ed  reason: invalid package */
public final class ed extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ed zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        ed edVar = new ed();
        zzb = edVar;
        p2.g(ed.class, edVar);
    }

    public static dd u() {
        return (dd) zzb.o();
    }

    public static ed w() {
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
            return new ed();
        } else {
            if (i10 == 4) {
                return new dd(0);
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

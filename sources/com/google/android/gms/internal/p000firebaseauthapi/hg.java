package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.hg  reason: invalid package */
public final class hg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final hg zzb;
    private String zzd = "";

    static {
        hg hgVar = new hg();
        zzb = hgVar;
        p2.g(hg.class, hgVar);
    }

    public static hg u() {
        return zzb;
    }

    public static hg v(q1 q1Var, c2 c2Var) {
        return (hg) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new hg();
        } else {
            if (i10 == 4) {
                return new ke(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String w() {
        return this.zzd;
    }
}

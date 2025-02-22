package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.if  reason: invalid class name and invalid package */
public final class Cif extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final Cif zzb;
    /* access modifiers changed from: private */
    public lf zzd;

    static {
        Cif ifVar = new Cif();
        zzb = ifVar;
        p2.g(Cif.class, ifVar);
    }

    public static hf t() {
        return (hf) zzb.o();
    }

    public static Cif v(q1 q1Var, c2 c2Var) {
        return (Cif) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new Cif();
        } else {
            if (i10 == 4) {
                return new hf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final lf w() {
        lf lfVar = this.zzd;
        return lfVar == null ? lf.v() : lfVar;
    }
}

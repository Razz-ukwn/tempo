package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nf  reason: invalid package */
public final class nf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final nf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public pf zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        nf nfVar = new nf();
        zzb = nfVar;
        p2.g(nf.class, nfVar);
    }

    public static mf u() {
        return (mf) zzb.o();
    }

    public static nf w(q1 q1Var, c2 c2Var) {
        return (nf) p2.r(zzb, q1Var, c2Var);
    }

    public final boolean C() {
        return this.zze != null;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new nf();
        } else {
            if (i10 == 4) {
                return new mf(0);
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

    public final pf x() {
        pf pfVar = this.zze;
        return pfVar == null ? pf.x() : pfVar;
    }

    public final q1 y() {
        return this.zzf;
    }
}

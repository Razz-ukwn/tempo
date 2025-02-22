package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cd  reason: invalid package */
public final class cd extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final cd zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public ed zze;

    static {
        cd cdVar = new cd();
        zzb = cdVar;
        p2.g(cd.class, cdVar);
    }

    public static bd u() {
        return (bd) zzb.o();
    }

    public static cd w(q1 q1Var, c2 c2Var) {
        return (cd) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new cd();
        } else {
            if (i10 == 4) {
                return new bd(0);
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

    public final ed x() {
        ed edVar = this.zze;
        return edVar == null ? ed.w() : edVar;
    }
}

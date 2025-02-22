package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.id  reason: invalid package */
public final class id extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final id zzb;
    /* access modifiers changed from: private */
    public md zzd;
    /* access modifiers changed from: private */
    public df zze;

    static {
        id idVar = new id();
        zzb = idVar;
        p2.g(id.class, idVar);
    }

    public static hd t() {
        return (hd) zzb.o();
    }

    public static id v(q1 q1Var, c2 c2Var) {
        return (id) p2.r(zzb, q1Var, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new id();
        } else {
            if (i10 == 4) {
                return new hd(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final md w() {
        md mdVar = this.zzd;
        return mdVar == null ? md.w() : mdVar;
    }

    public final df x() {
        df dfVar = this.zze;
        return dfVar == null ? df.w() : dfVar;
    }
}

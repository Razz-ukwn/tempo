package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ze  reason: invalid package */
public final class ze extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ze zzb;
    /* access modifiers changed from: private */
    public q1 zzd = q1.f4830b;
    /* access modifiers changed from: private */
    public eg zze;

    static {
        ze zeVar = new ze();
        zzb = zeVar;
        p2.g(ze.class, zeVar);
    }

    public static ye t() {
        return (ye) zzb.o();
    }

    public static ze v(InputStream inputStream, c2 c2Var) {
        return (ze) p2.s(zzb, inputStream, c2Var);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new ze();
        } else {
            if (i10 == 4) {
                return new ye(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final q1 w() {
        return this.zzd;
    }
}

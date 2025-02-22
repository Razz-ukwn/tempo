package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ne  reason: invalid package */
public final class ne extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final ne zzb;
    private tf zzd;

    static {
        ne neVar = new ne();
        zzb = neVar;
        p2.g(ne.class, neVar);
    }

    public static me t() {
        return (me) zzb.o();
    }

    public static ne v() {
        return zzb;
    }

    public static /* synthetic */ void x(ne neVar, tf tfVar) {
        tfVar.getClass();
        neVar.zzd = tfVar;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i10 == 3) {
            return new ne();
        } else {
            if (i10 == 4) {
                return new me(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final tf w() {
        tf tfVar = this.zzd;
        return tfVar == null ? tf.v() : tfVar;
    }
}

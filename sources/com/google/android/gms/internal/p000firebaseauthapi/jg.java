package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jg  reason: invalid package */
public final class jg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final jg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private lg zze;

    static {
        jg jgVar = new jg();
        zzb = jgVar;
        p2.g(jg.class, jgVar);
    }

    public static ig u() {
        return (ig) zzb.o();
    }

    public static jg w(q1 q1Var, c2 c2Var) {
        return (jg) p2.r(zzb, q1Var, c2Var);
    }

    public static /* synthetic */ void z(jg jgVar, lg lgVar) {
        lgVar.getClass();
        jgVar.zze = lgVar;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i10 == 3) {
            return new jg();
        } else {
            if (i10 == 4) {
                return new ig(0);
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

    public final lg x() {
        lg lgVar = this.zze;
        return lgVar == null ? lg.v() : lgVar;
    }
}

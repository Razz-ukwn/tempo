package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tf  reason: invalid package */
public final class tf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final tf zzb;
    private String zzd = "";
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        tf tfVar = new tf();
        zzb = tfVar;
        p2.g(tf.class, tfVar);
    }

    public static sf t() {
        return (sf) zzb.o();
    }

    public static tf v() {
        return zzb;
    }

    public static /* synthetic */ void z(tf tfVar, String str) {
        str.getClass();
        tfVar.zzd = str;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new tf();
        } else {
            if (i10 == 4) {
                return new sf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final mg w() {
        mg a10 = mg.a(this.zzf);
        return a10 == null ? mg.UNRECOGNIZED : a10;
    }

    public final q1 x() {
        return this.zze;
    }

    public final String y() {
        return this.zzd;
    }
}

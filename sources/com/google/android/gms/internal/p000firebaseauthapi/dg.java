package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.dg  reason: invalid package */
public final class dg extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final dg zzb;
    private String zzd = "";
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        dg dgVar = new dg();
        zzb = dgVar;
        p2.g(dg.class, dgVar);
    }

    public static cg u() {
        return (cg) zzb.o();
    }

    public static /* synthetic */ void w(dg dgVar, String str) {
        str.getClass();
        dgVar.zzd = str;
    }

    public static void z(dg dgVar, int i8) {
        if (i8 != 1) {
            dgVar.zze = i8 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new dg();
        } else {
            if (i10 == 4) {
                return new cg(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int t() {
        return this.zzf;
    }
}

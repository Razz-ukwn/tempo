package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xe  reason: invalid package */
public final class xe extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final xe zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public q1 zzf = q1.f4830b;

    static {
        xe xeVar = new xe();
        zzb = xeVar;
        p2.g(xe.class, xeVar);
    }

    public static void A(xe xeVar) {
        xeVar.zzd = 2;
    }

    public static we t() {
        return (we) zzb.o();
    }

    public static xe v() {
        return zzb;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new xe();
        } else {
            if (i10 == 4) {
                return new we(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final q1 w() {
        return this.zzf;
    }

    public final int y() {
        int i8 = this.zzd;
        int i10 = 2;
        if (i8 != 0) {
            i10 = i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? 0 : 7 : 6 : 5 : 4;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int z() {
        int i8 = this.zze;
        int i10 = 2;
        if (i8 != 0) {
            if (i8 == 1) {
                i10 = 3;
            } else if (i8 != 2) {
                i10 = 5;
                if (i8 != 3) {
                    i10 = i8 != 4 ? i8 != 5 ? 0 : 7 : 6;
                }
            } else {
                i10 = 4;
            }
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}

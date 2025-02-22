package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.re  reason: invalid package */
public final class re extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final re zzb;
    /* access modifiers changed from: private */
    public xe zzd;
    /* access modifiers changed from: private */
    public ne zze;
    private int zzf;

    static {
        re reVar = new re();
        zzb = reVar;
        p2.g(re.class, reVar);
    }

    public static void B(re reVar, int i8) {
        if (i8 != 1) {
            reVar.zzf = i8 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qe u() {
        return (qe) zzb.o();
    }

    public static re w() {
        return zzb;
    }

    public final int A() {
        int i8 = this.zzf;
        int i10 = 2;
        if (i8 != 0) {
            i10 = i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 5 : 4 : 3;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new re();
        } else {
            if (i10 == 4) {
                return new qe(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final ne t() {
        ne neVar = this.zze;
        return neVar == null ? ne.v() : neVar;
    }

    public final xe x() {
        xe xeVar = this.zzd;
        return xeVar == null ? xe.v() : xeVar;
    }
}

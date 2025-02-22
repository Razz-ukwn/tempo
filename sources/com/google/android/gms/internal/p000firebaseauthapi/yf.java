package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yf  reason: invalid package */
public final class yf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final yf zzb;
    private rf zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        yf yfVar = new yf();
        zzb = yfVar;
        p2.g(yf.class, yfVar);
    }

    public static void D(yf yfVar) {
        yfVar.zze = 1;
    }

    public static xf v() {
        return (xf) zzb.o();
    }

    public static /* synthetic */ void y(yf yfVar, rf rfVar) {
        rfVar.getClass();
        yfVar.zzd = rfVar;
    }

    public final boolean B() {
        return this.zzd != null;
    }

    public final int C() {
        int i8 = this.zze;
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
            return new y3(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i10 == 3) {
            return new yf();
        } else {
            if (i10 == 4) {
                return new xf(0);
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

    public final rf u() {
        rf rfVar = this.zzd;
        return rfVar == null ? rf.w() : rfVar;
    }

    public final mg x() {
        mg a10 = mg.a(this.zzg);
        return a10 == null ? mg.UNRECOGNIZED : a10;
    }
}

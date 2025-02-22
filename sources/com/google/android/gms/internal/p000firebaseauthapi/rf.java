package com.google.android.gms.internal.p000firebaseauthapi;

import androidx.fragment.app.f1;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.rf  reason: invalid package */
public final class rf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final rf zzb;
    /* access modifiers changed from: private */
    public String zzd = "";
    /* access modifiers changed from: private */
    public q1 zze = q1.f4830b;
    private int zzf;

    static {
        rf rfVar = new rf();
        zzb = rfVar;
        p2.g(rf.class, rfVar);
    }

    public static void B(rf rfVar, int i8) {
        if (i8 != 6) {
            rfVar.zzf = f1.b(i8);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static qf t() {
        return (qf) zzb.o();
    }

    public static rf w() {
        return zzb;
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i10 == 3) {
            return new rf();
        } else {
            if (i10 == 4) {
                return new qf(0);
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int u() {
        int i8 = this.zzf;
        int i10 = 1;
        if (i8 != 0) {
            int i11 = 2;
            if (i8 != 1) {
                i10 = 3;
                if (i8 != 2) {
                    i11 = 4;
                    if (i8 != 3) {
                        i10 = i8 != 4 ? 0 : 5;
                    }
                }
            }
            i10 = i11;
        }
        if (i10 == 0) {
            return 6;
        }
        return i10;
    }

    public final q1 x() {
        return this.zze;
    }

    public final String y() {
        return this.zzd;
    }
}

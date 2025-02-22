package com.google.android.gms.internal.p000firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vf  reason: invalid package */
public final class vf extends p2 implements p3 {
    /* access modifiers changed from: private */
    public static final vf zzb;
    private String zzd = "";
    private String zze = "";
    private int zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        vf vfVar = new vf();
        zzb = vfVar;
        p2.g(vf.class, vfVar);
    }

    public final Object n(int i8) {
        int i10 = i8 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new y3(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i10 == 3) {
            return new vf();
        } else {
            if (i10 == 4) {
                return new uf();
            }
            if (i10 != 5) {
                return null;
            }
            return zzb;
        }
    }
}

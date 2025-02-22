package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g3  reason: invalid package */
public final class g3 implements n3 {

    /* renamed from: a  reason: collision with root package name */
    public final n3[] f4566a;

    public g3(n3... n3VarArr) {
        this.f4566a = n3VarArr;
    }

    public final m3 zzb(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            n3 n3Var = this.f4566a[i8];
            if (n3Var.zzc(cls)) {
                return n3Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f4566a[i8].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

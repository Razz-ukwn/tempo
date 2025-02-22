package com.google.android.gms.internal.measurement;

public final class y7 implements g8 {

    /* renamed from: a  reason: collision with root package name */
    public final g8[] f5606a;

    public y7(g8... g8VarArr) {
        this.f5606a = g8VarArr;
    }

    public final f8 zzb(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            g8 g8Var = this.f5606a[i8];
            if (g8Var.zzc(cls)) {
                return g8Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f5606a[i8].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}

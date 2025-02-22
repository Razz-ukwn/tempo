package com.google.android.gms.internal.measurement;

public final class u7 extends v7 {
    public final void a(Object obj, long j10) {
        ((l7) n9.j(obj, j10)).zzb();
    }

    public final void b(Object obj, long j10, Object obj2) {
        l7 l7Var = (l7) n9.j(obj, j10);
        l7 l7Var2 = (l7) n9.j(obj2, j10);
        int size = l7Var.size();
        int size2 = l7Var2.size();
        if (size > 0 && size2 > 0) {
            if (!l7Var.zzc()) {
                l7Var = l7Var.zzd(size2 + size);
            }
            l7Var.addAll(l7Var2);
        }
        if (size > 0) {
            l7Var2 = l7Var;
        }
        n9.r(obj, j10, l7Var2);
    }
}

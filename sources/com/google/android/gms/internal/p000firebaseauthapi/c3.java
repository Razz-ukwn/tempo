package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c3  reason: invalid package */
public final class c3 extends d3 {
    public final List a(Object obj, long j10) {
        t2 t2Var = (t2) u4.j(obj, j10);
        if (t2Var.zzc()) {
            return t2Var;
        }
        int size = t2Var.size();
        t2 zzd = t2Var.zzd(size == 0 ? 10 : size + size);
        u4.s(obj, j10, zzd);
        return zzd;
    }

    public final void b(Object obj, long j10) {
        ((t2) u4.j(obj, j10)).zzb();
    }

    public final void c(Object obj, Object obj2, long j10) {
        t2 t2Var = (t2) u4.j(obj, j10);
        t2 t2Var2 = (t2) u4.j(obj2, j10);
        int size = t2Var.size();
        int size2 = t2Var2.size();
        if (size > 0 && size2 > 0) {
            if (!t2Var.zzc()) {
                t2Var = t2Var.zzd(size2 + size);
            }
            t2Var.addAll(t2Var2);
        }
        if (size > 0) {
            t2Var2 = t2Var;
        }
        u4.s(obj, j10, t2Var2);
    }
}

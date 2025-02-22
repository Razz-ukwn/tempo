package com.google.android.gms.internal.measurement;

import j1.c;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class ld extends i {

    /* renamed from: c  reason: collision with root package name */
    public final q5 f5393c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5394d = new HashMap();

    public ld(q5 q5Var) {
        super("require");
        this.f5393c = q5Var;
    }

    public final o e(c cVar, List list) {
        o oVar;
        f4.h("require", 1, list);
        String zzi = cVar.m((o) list.get(0)).zzi();
        HashMap hashMap = this.f5394d;
        if (hashMap.containsKey(zzi)) {
            return (o) hashMap.get(zzi);
        }
        q5 q5Var = this.f5393c;
        if (q5Var.f5482a.containsKey(zzi)) {
            try {
                oVar = (o) ((Callable) q5Var.f5482a.get(zzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(zzi)));
            }
        } else {
            oVar = o.f5428j;
        }
        if (oVar instanceof i) {
            hashMap.put(zzi, (i) oVar);
        }
        return oVar;
    }
}

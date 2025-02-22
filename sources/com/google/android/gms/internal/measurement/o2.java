package com.google.android.gms.internal.measurement;

import androidx.compose.ui.platform.j3;
import j1.c;

public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    public final j3 f5440a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5441b;

    /* renamed from: c  reason: collision with root package name */
    public final c f5442c;

    /* renamed from: d  reason: collision with root package name */
    public final q5 f5443d;

    public o2() {
        j3 j3Var = new j3(11);
        this.f5440a = j3Var;
        c cVar = new c((c) null, j3Var);
        this.f5442c = cVar;
        this.f5441b = cVar.l();
        q5 q5Var = new q5();
        this.f5443d = q5Var;
        cVar.q("require", new ld(q5Var));
        q5Var.f5482a.put("internal.platform", w1.f5566a);
        cVar.q("runtime.counter", new h(Double.valueOf(0.0d)));
    }

    public final o a(c cVar, d4... d4VarArr) {
        o oVar = o.f5428j;
        for (d4 a10 : d4VarArr) {
            oVar = y4.a(a10);
            f4.c(this.f5442c);
            if ((oVar instanceof p) || (oVar instanceof n)) {
                oVar = this.f5440a.b(cVar, oVar);
            }
        }
        return oVar;
    }
}

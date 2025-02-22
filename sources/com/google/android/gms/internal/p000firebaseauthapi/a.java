package com.google.android.gms.internal.p000firebaseauthapi;

import ag.m;
import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import m9.f;
import s9.d;
import s9.m0;
import s9.p0;
import u6.q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a  reason: invalid package */
public final class a extends v {
    @SuppressLint({"ThreadPoolCreation"})
    public a(f fVar) {
        this.f4999a = new c(fVar);
        this.f5000b = Executors.newCachedThreadPool();
    }

    public static p0 b(f fVar, h0 h0Var) {
        q.i(fVar);
        q.i(h0Var);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m0(h0Var));
        List list = h0Var.f4597f.f15222a;
        if (list != null && !list.isEmpty()) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                arrayList.add(new m0((p0) list.get(i8)));
            }
        }
        p0 p0Var = new p0(fVar, arrayList);
        p0Var.E = new d(h0Var.f4600i, h0Var.f4599h);
        p0Var.F = h0Var.f4601j;
        p0Var.G = h0Var.f4602k;
        p0Var.I(m.B(h0Var.f4603l));
        return p0Var;
    }
}

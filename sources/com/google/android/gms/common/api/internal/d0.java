package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import t6.b;
import u6.j;

public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f4235b;

    public d0(e0 e0Var, b bVar) {
        this.f4235b = e0Var;
        this.f4234a = bVar;
    }

    public final void run() {
        j jVar;
        e0 e0Var = this.f4235b;
        b0 b0Var = (b0) e0Var.f4258f.f4249j.get(e0Var.f4254b);
        if (b0Var != null) {
            b bVar = this.f4234a;
            if (bVar.f15379b == 0) {
                e0Var.f4257e = true;
                a.e eVar = e0Var.f4253a;
                if (!eVar.m()) {
                    try {
                        eVar.n((j) null, eVar.a());
                    } catch (SecurityException e10) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                        eVar.b("Failed to get service from broker.");
                        b0Var.q(new b(10), (RuntimeException) null);
                    }
                } else if (e0Var.f4257e && (jVar = e0Var.f4255c) != null) {
                    eVar.n(jVar, e0Var.f4256d);
                }
            } else {
                b0Var.q(bVar, (RuntimeException) null);
            }
        }
    }
}

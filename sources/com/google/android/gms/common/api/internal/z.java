package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

public final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f4344a;

    public z(a0 a0Var) {
        this.f4344a = a0Var;
    }

    public final void run() {
        a.e eVar = this.f4344a.f4211a.f4218b;
        eVar.b(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}

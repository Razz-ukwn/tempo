package com.google.android.gms.internal.measurement;

import c7.b;
import u6.q;

public final class n1 extends s1 {
    public final /* synthetic */ Object B;
    public final /* synthetic */ y1 C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5413e = "Error with data collection. Data lost.";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(y1 y1Var, Object obj) {
        super(y1Var, false);
        this.C = y1Var;
        this.B = obj;
    }

    public final void a() {
        r0 r0Var = this.C.f5600h;
        q.i(r0Var);
        r0Var.logHealthData(5, this.f5413e, new b(this.B), new b((Object) null), new b((Object) null));
    }
}

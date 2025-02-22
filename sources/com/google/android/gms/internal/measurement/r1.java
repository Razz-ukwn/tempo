package com.google.android.gms.internal.measurement;

import c7.b;
import u6.q;

public final class r1 extends s1 {
    public final /* synthetic */ String B = "_ln";
    public final /* synthetic */ Object C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ y1 E;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5496e = "fcm";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1(y1 y1Var, String str) {
        super(y1Var, true);
        this.E = y1Var;
        this.C = str;
        this.D = true;
    }

    public final void a() {
        r0 r0Var = this.E.f5600h;
        q.i(r0Var);
        r0Var.setUserProperty(this.f5496e, this.B, new b(this.C), this.D, this.f5510a);
    }
}

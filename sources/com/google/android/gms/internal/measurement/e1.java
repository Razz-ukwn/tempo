package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class e1 extends s1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ n0 C;
    public final /* synthetic */ y1 D;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5253e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(y1 y1Var, String str, String str2, n0 n0Var) {
        super(y1Var, true);
        this.D = y1Var;
        this.f5253e = str;
        this.B = str2;
        this.C = n0Var;
    }

    public final void a() {
        r0 r0Var = this.D.f5600h;
        q.i(r0Var);
        r0Var.getConditionalUserProperties(this.f5253e, this.B, this.C);
    }

    public final void b() {
        this.C.q((Bundle) null);
    }
}

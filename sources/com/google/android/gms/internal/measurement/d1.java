package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class d1 extends s1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ Bundle C;
    public final /* synthetic */ y1 D;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5244e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(y1 y1Var, String str, String str2, Bundle bundle) {
        super(y1Var, true);
        this.D = y1Var;
        this.f5244e = str;
        this.B = str2;
        this.C = bundle;
    }

    public final void a() {
        r0 r0Var = this.D.f5600h;
        q.i(r0Var);
        r0Var.clearConditionalUserProperty(this.f5244e, this.B, this.C);
    }
}

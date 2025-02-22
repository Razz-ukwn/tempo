package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class q1 extends s1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ y1 G;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Long f5479e = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q1(y1 y1Var, String str, String str2, Bundle bundle) {
        super(y1Var, true);
        this.G = y1Var;
        this.B = str;
        this.C = str2;
        this.D = bundle;
        this.E = true;
        this.F = true;
    }

    public final void a() {
        Long l10 = this.f5479e;
        long longValue = l10 == null ? this.f5510a : l10.longValue();
        r0 r0Var = this.G.f5600h;
        q.i(r0Var);
        r0Var.logEvent(this.B, this.C, this.D, this.E, this.F, longValue);
    }
}

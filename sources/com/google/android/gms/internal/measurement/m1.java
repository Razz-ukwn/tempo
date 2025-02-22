package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class m1 extends s1 {
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ n0 D;
    public final /* synthetic */ y1 E;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5395e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(y1 y1Var, String str, String str2, boolean z10, n0 n0Var) {
        super(y1Var, true);
        this.E = y1Var;
        this.f5395e = str;
        this.B = str2;
        this.C = z10;
        this.D = n0Var;
    }

    public final void a() {
        r0 r0Var = this.E.f5600h;
        q.i(r0Var);
        r0Var.getUserProperties(this.f5395e, this.B, this.C, this.D);
    }

    public final void b() {
        this.D.q((Bundle) null);
    }
}

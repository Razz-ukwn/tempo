package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class p1 extends s1 {
    public final /* synthetic */ n0 B;
    public final /* synthetic */ y1 C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f5459e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(y1 y1Var, String str, n0 n0Var) {
        super(y1Var, true);
        this.C = y1Var;
        this.f5459e = str;
        this.B = n0Var;
    }

    public final void a() {
        r0 r0Var = this.C.f5600h;
        q.i(r0Var);
        r0Var.getMaxUserProperties(this.f5459e, this.B);
    }

    public final void b() {
        this.B.q((Bundle) null);
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class h1 extends s1 {
    public final /* synthetic */ y1 B;
    public final /* synthetic */ Object C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5301e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(y1 y1Var, Object obj, int i8) {
        super(y1Var, true);
        this.f5301e = i8;
        this.B = y1Var;
        this.C = obj;
    }

    public final void a() {
        switch (this.f5301e) {
            case 0:
                r0 r0Var = this.B.f5600h;
                q.i(r0Var);
                r0Var.endAdUnitExposure((String) this.C, this.f5511b);
                return;
            default:
                r0 r0Var2 = this.B.f5600h;
                q.i(r0Var2);
                r0Var2.getCurrentScreenClass((n0) this.C);
                return;
        }
    }

    public final void b() {
        switch (this.f5301e) {
            case 1:
                ((n0) this.C).q((Bundle) null);
                return;
            default:
                return;
        }
    }
}

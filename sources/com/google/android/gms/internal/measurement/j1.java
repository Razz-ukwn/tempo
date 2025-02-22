package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import u6.q;

public final class j1 extends s1 {
    public final /* synthetic */ y1 B;
    public final /* synthetic */ f0 C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5336e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(y1 y1Var, f0 f0Var, int i8) {
        super(y1Var, true);
        this.f5336e = i8;
        this.B = y1Var;
        this.C = f0Var;
    }

    public final void a() {
        switch (this.f5336e) {
            case 0:
                r0 r0Var = this.B.f5600h;
                q.i(r0Var);
                r0Var.getGmpAppId((n0) this.C);
                return;
            default:
                r0 r0Var2 = this.B.f5600h;
                q.i(r0Var2);
                r0Var2.registerOnMeasurementEventListener((t1) this.C);
                return;
        }
    }

    public final void b() {
        switch (this.f5336e) {
            case 0:
                ((n0) this.C).q((Bundle) null);
                return;
            default:
                return;
        }
    }
}

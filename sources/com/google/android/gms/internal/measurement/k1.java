package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import c7.b;
import u6.q;

public final class k1 extends s1 {
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5347e = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(x1 x1Var, Activity activity) {
        super(x1Var.f5579a, true);
        this.C = x1Var;
        this.B = activity;
    }

    public final void a() {
        switch (this.f5347e) {
            case 0:
                r0 r0Var = ((y1) this.C).f5600h;
                q.i(r0Var);
                r0Var.getCachedAppInstanceId((n0) this.B);
                return;
            default:
                r0 r0Var2 = ((x1) this.C).f5579a.f5600h;
                q.i(r0Var2);
                r0Var2.onActivityResumed(new b((Activity) this.B), this.f5511b);
                return;
        }
    }

    public final void b() {
        switch (this.f5347e) {
            case 0:
                ((n0) this.B).q((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k1(y1 y1Var, n0 n0Var) {
        super(y1Var, true);
        this.C = y1Var;
        this.B = n0Var;
    }
}

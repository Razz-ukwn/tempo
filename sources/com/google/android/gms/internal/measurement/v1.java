package com.google.android.gms.internal.measurement;

import android.app.Activity;
import c7.b;
import u6.q;

public final class v1 extends s1 {
    public final /* synthetic */ Activity B;
    public final /* synthetic */ x1 C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5553e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, Activity activity, int i8) {
        super(x1Var.f5579a, true);
        this.f5553e = i8;
        if (i8 != 1) {
            this.C = x1Var;
            this.B = activity;
            return;
        }
        this.C = x1Var;
        this.B = activity;
        super(x1Var.f5579a, true);
    }

    public final void a() {
        switch (this.f5553e) {
            case 0:
                r0 r0Var = this.C.f5579a.f5600h;
                q.i(r0Var);
                r0Var.onActivityStarted(new b(this.B), this.f5511b);
                return;
            default:
                r0 r0Var2 = this.C.f5579a.f5600h;
                q.i(r0Var2);
                r0Var2.onActivityDestroyed(new b(this.B), this.f5511b);
                return;
        }
    }
}

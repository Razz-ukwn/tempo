package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import c7.b;
import u6.q;

public final class c1 extends s1 {
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5172e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(y1 y1Var, Object obj, int i8) {
        super(y1Var, true);
        this.f5172e = i8;
        this.B = y1Var;
        this.C = obj;
    }

    public final void a() {
        switch (this.f5172e) {
            case 0:
                r0 r0Var = ((y1) this.B).f5600h;
                q.i(r0Var);
                r0Var.setConditionalUserProperty((Bundle) this.C, this.f5510a);
                return;
            case 1:
                r0 r0Var2 = ((y1) this.B).f5600h;
                q.i(r0Var2);
                r0Var2.beginAdUnitExposure((String) this.C, this.f5511b);
                return;
            case 2:
                r0 r0Var3 = ((y1) this.B).f5600h;
                q.i(r0Var3);
                r0Var3.getCurrentScreenName((n0) this.C);
                return;
            default:
                r0 r0Var4 = ((x1) this.B).f5579a.f5600h;
                q.i(r0Var4);
                r0Var4.onActivityStopped(new b((Activity) this.C), this.f5511b);
                return;
        }
    }

    public final void b() {
        switch (this.f5172e) {
            case 2:
                ((n0) this.C).q((Bundle) null);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(x1 x1Var, Activity activity) {
        super(x1Var.f5579a, true);
        this.f5172e = 3;
        this.B = x1Var;
        this.C = activity;
    }
}

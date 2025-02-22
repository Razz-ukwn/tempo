package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import c7.b;
import u6.q;

public final class u1 extends s1 {
    public final /* synthetic */ Activity B;
    public final /* synthetic */ x1 C;
    public final /* synthetic */ Object D;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5541e = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(x1 x1Var, Activity activity, n0 n0Var) {
        super(x1Var.f5579a, true);
        this.C = x1Var;
        this.B = activity;
        this.D = n0Var;
    }

    public final void a() {
        Bundle bundle;
        switch (this.f5541e) {
            case 0:
                if (((Bundle) this.D) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.D).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.D).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                r0 r0Var = this.C.f5579a.f5600h;
                q.i(r0Var);
                r0Var.onActivityCreated(new b(this.B), bundle, this.f5511b);
                return;
            default:
                r0 r0Var2 = this.C.f5579a.f5600h;
                q.i(r0Var2);
                r0Var2.onActivitySaveInstanceState(new b(this.B), (n0) this.D, this.f5511b);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(x1 x1Var, Bundle bundle, Activity activity) {
        super(x1Var.f5579a, true);
        this.C = x1Var;
        this.D = bundle;
        this.B = activity;
    }
}

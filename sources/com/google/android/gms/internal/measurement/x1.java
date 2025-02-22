package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class x1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y1 f5579a;

    public x1(y1 y1Var) {
        this.f5579a = y1Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f5579a.b(new u1(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f5579a.b(new v1(this, activity, 1));
    }

    public final void onActivityPaused(Activity activity) {
        this.f5579a.b(new l1(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f5579a.b(new k1(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        n0 n0Var = new n0();
        this.f5579a.b(new u1(this, activity, n0Var));
        Bundle b10 = n0Var.b(50);
        if (b10 != null) {
            bundle.putAll(b10);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f5579a.b(new v1(this, activity, 0));
    }

    public final void onActivityStopped(Activity activity) {
        this.f5579a.b(new c1(this, activity));
    }
}

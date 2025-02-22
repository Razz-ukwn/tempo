package com.google.android.gms.common.api.internal;

import android.app.job.JobParameters;
import android.os.Bundle;
import q7.b6;
import q7.c;
import q7.c6;
import q7.c7;
import q7.h4;
import q7.s;
import q7.s2;
import q7.t6;

public final class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4266b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4267c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f4268d;

    public /* synthetic */ g1(int i8, Object obj, Object obj2, Object obj3) {
        this.f4265a = i8;
        this.f4268d = obj;
        this.f4266b = obj2;
        this.f4267c = obj3;
    }

    public final void run() {
        int i8 = this.f4265a;
        Object obj = this.f4267c;
        Object obj2 = this.f4266b;
        Object obj3 = this.f4268d;
        switch (i8) {
            case 0:
                h1 h1Var = (h1) obj3;
                if (h1Var.f4271b > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
                    Bundle bundle = h1Var.f4272c;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) obj) : null);
                }
                if (h1Var.f4271b >= 2) {
                    ((LifecycleCallback) obj2).onStart();
                }
                if (h1Var.f4271b >= 3) {
                    ((LifecycleCallback) obj2).onResume();
                }
                if (h1Var.f4271b >= 4) {
                    ((LifecycleCallback) obj2).onStop();
                }
                if (h1Var.f4271b >= 5) {
                    ((LifecycleCallback) obj2).onDestroy();
                    return;
                }
                return;
            case 1:
                h4 h4Var = (h4) obj3;
                h4Var.f13101a.b();
                c cVar = (c) obj2;
                Object w10 = cVar.f12928c.w();
                t6 t6Var = h4Var.f13101a;
                if (w10 == null) {
                    t6Var.n(cVar, (c7) obj);
                    return;
                } else {
                    t6Var.q(cVar, (c7) obj);
                    return;
                }
            case 2:
                h4 h4Var2 = (h4) obj3;
                h4Var2.f13101a.b();
                h4Var2.f13101a.j((s) obj2, (String) obj);
                return;
            default:
                c6 c6Var = (c6) obj2;
                c6Var.getClass();
                ((s2) obj).J.b("AppMeasurementJobService processed last upload request.");
                ((b6) c6Var.f12947a).c((JobParameters) obj3);
                return;
        }
    }

    public /* synthetic */ g1(c6 c6Var, s2 s2Var, JobParameters jobParameters) {
        this.f4265a = 3;
        this.f4266b = c6Var;
        this.f4267c = s2Var;
        this.f4268d = jobParameters;
    }
}

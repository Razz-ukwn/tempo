package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.measurement.a1;
import q7.b6;
import q7.c6;
import q7.s2;
import q7.t6;
import q7.x3;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements b6 {

    /* renamed from: a  reason: collision with root package name */
    public c6 f5663a;

    public final boolean a(int i8) {
        throw new UnsupportedOperationException();
    }

    public final void b(Intent intent) {
    }

    @TargetApi(24)
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final c6 d() {
        if (this.f5663a == null) {
            this.f5663a = new c6(this);
        }
        return this.f5663a;
    }

    public final void onCreate() {
        super.onCreate();
        s2 s2Var = x3.t(d().f12947a, (a1) null, (Long) null).E;
        x3.l(s2Var);
        s2Var.J.b("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        s2 s2Var = x3.t(d().f12947a, (a1) null, (Long) null).E;
        x3.l(s2Var);
        s2Var.J.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d().a(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        c6 d10 = d();
        s2 s2Var = x3.t(d10.f12947a, (a1) null, (Long) null).E;
        x3.l(s2Var);
        String string = jobParameters.getExtras().getString("action");
        s2Var.J.c(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        g1 g1Var = new g1(d10, s2Var, jobParameters);
        t6 N = t6.N(d10.f12947a);
        N.h().q(new i0(N, g1Var));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}

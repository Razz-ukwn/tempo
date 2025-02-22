package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d6.j;
import d6.s;
import d6.w;
import j6.f;
import j6.n;
import n6.a;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4146a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i8 = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        j.a a10 = s.a();
        a10.b(string);
        a10.c(a.b(i8));
        if (string2 != null) {
            a10.f7346b = Base64.decode(string2, 0);
        }
        n nVar = w.a().f7371d;
        j a11 = a10.a();
        i3.n nVar2 = new i3.n(this, jobParameters);
        nVar.getClass();
        nVar.f9839e.execute(new f(nVar, a11, i10, nVar2));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

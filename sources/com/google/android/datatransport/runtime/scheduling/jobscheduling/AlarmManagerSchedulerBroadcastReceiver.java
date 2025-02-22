package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import d6.j;
import d6.s;
import d6.w;
import j6.f;
import j6.n;
import n6.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4145a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i8 = intent.getExtras().getInt("attemptNumber");
        w.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f7346b = Base64.decode(queryParameter2, 0);
        }
        n nVar = w.a().f7371d;
        j a11 = a10.a();
        j6.a aVar = new j6.a();
        nVar.getClass();
        nVar.f9839e.execute(new f(nVar, a11, i8, aVar));
    }
}

package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.measurement.a1;
import q7.a6;
import q7.b6;
import q7.c6;
import q7.h4;
import q7.s2;
import q7.t6;
import q7.x3;
import w2.a;

public final class AppMeasurementService extends Service implements b6 {

    /* renamed from: a  reason: collision with root package name */
    public c6 f5665a;

    public final boolean a(int i8) {
        return stopSelfResult(i8);
    }

    public final void b(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f16469a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.f16469a;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                    return;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final c6 d() {
        if (this.f5665a == null) {
            this.f5665a = new c6(this);
        }
        return this.f5665a;
    }

    public final IBinder onBind(Intent intent) {
        c6 d10 = d();
        if (intent == null) {
            d10.c().B.b("onBind called with null intent");
        } else {
            d10.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new h4(t6.N(d10.f12947a));
            }
            d10.c().E.c(action, "onBind received unknown action");
        }
        return null;
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

    public final int onStartCommand(Intent intent, int i8, int i10) {
        c6 d10 = d();
        s2 s2Var = x3.t(d10.f12947a, (a1) null, (Long) null).E;
        x3.l(s2Var);
        if (intent == null) {
            s2Var.E.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        s2Var.J.d(Integer.valueOf(i10), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a6 a6Var = new a6(d10, i10, s2Var, intent);
        t6 N = t6.N(d10.f12947a);
        N.h().q(new i0(N, a6Var));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}

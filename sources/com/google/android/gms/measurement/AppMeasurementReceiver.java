package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.a1;
import q7.k3;
import q7.l3;
import q7.s2;
import q7.x3;
import w2.a;

public final class AppMeasurementReceiver extends a implements k3 {

    /* renamed from: c  reason: collision with root package name */
    public l3 f5664c;

    public final void onReceive(Context context, Intent intent) {
        if (this.f5664c == null) {
            this.f5664c = new l3(this);
        }
        l3 l3Var = this.f5664c;
        l3Var.getClass();
        s2 s2Var = x3.t(context, (a1) null, (Long) null).E;
        x3.l(s2Var);
        if (intent == null) {
            s2Var.E.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        s2Var.J.c(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            s2Var.J.b("Starting wakeful intent.");
            ((AppMeasurementReceiver) l3Var.f13161a).getClass();
            SparseArray<PowerManager.WakeLock> sparseArray = a.f16469a;
            synchronized (sparseArray) {
                int i8 = a.f16470b;
                int i10 = i8 + 1;
                a.f16470b = i10;
                if (i10 <= 0) {
                    a.f16470b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i8);
                ComponentName startService = context.startService(className);
                if (startService != null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000);
                    sparseArray.put(i8, newWakeLock);
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            s2Var.E.b("Install Referrer Broadcasts are deprecated");
        }
    }
}

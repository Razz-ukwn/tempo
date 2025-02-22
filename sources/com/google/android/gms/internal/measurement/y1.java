package com.google.android.gms.internal.measurement;

import ag.m;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import b1.b;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p7.a;
import q7.s3;
import u6.q;

public final class y1 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile y1 f5592i;

    /* renamed from: a  reason: collision with root package name */
    public final String f5593a = "FA";

    /* renamed from: b  reason: collision with root package name */
    public final m f5594b = m.D;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f5595c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5596d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5597e;

    /* renamed from: f  reason: collision with root package name */
    public int f5598f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5599g;

    /* renamed from: h  reason: collision with root package name */
    public volatile r0 f5600h;

    public y1(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f5595c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f5596d = new a(this);
        this.f5597e = new ArrayList();
        try {
            if (b.q(context, s3.a(context)) != null) {
                boolean z10 = false;
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, y1.class.getClassLoader());
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
                if (!z10) {
                    this.f5599g = true;
                    Log.w(this.f5593a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        b(new g1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f5593a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new x1(this));
        }
    }

    public static y1 c(Context context, Bundle bundle) {
        q.i(context);
        if (f5592i == null) {
            synchronized (y1.class) {
                if (f5592i == null) {
                    f5592i = new y1(context, bundle);
                }
            }
        }
        return f5592i;
    }

    public final void a(Exception exc, boolean z10, boolean z11) {
        this.f5599g |= z10;
        String str = this.f5593a;
        if (z10) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            b(new n1(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void b(s1 s1Var) {
        this.f5595c.execute(s1Var);
    }
}

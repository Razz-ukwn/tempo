package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    public static final b f4212e = new b();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f4213a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f4214b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4215c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4216d = false;

    public interface a {
        void a(boolean z10);
    }

    public static void a(Application application) {
        b bVar = f4212e;
        synchronized (bVar) {
            if (!bVar.f4216d) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f4216d = true;
            }
        }
    }

    public final void b(boolean z10) {
        synchronized (f4212e) {
            Iterator it = this.f4215c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z10);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4213a.compareAndSet(true, false);
        this.f4214b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4213a.compareAndSet(true, false);
        this.f4214b.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f4213a.compareAndSet(false, true)) {
            this.f4214b.set(true);
            b(true);
        }
    }
}

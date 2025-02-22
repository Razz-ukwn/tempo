package s1;

import android.app.Application;
import s1.f;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f14478a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.a f14479b;

    public d(Application application, f.a aVar) {
        this.f14478a = application;
        this.f14479b = aVar;
    }

    public final void run() {
        this.f14478a.unregisterActivityLifecycleCallbacks(this.f14479b);
    }
}

package x9;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.u;
import cb.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final u f16993a;

    /* renamed from: b  reason: collision with root package name */
    public final TimeUnit f16994b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16995c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public CountDownLatch f16996d;

    public c(u uVar, TimeUnit timeUnit) {
        this.f16993a = uVar;
        this.f16994b = timeUnit;
    }

    public final void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f16996d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public final void c(Bundle bundle) {
        synchronized (this.f16995c) {
            d dVar = d.f3892c;
            dVar.j0("Logging event _ae to Firebase Analytics with params " + bundle);
            this.f16996d = new CountDownLatch(1);
            this.f16993a.c(bundle);
            dVar.j0("Awaiting app exception callback from Analytics...");
            try {
                if (this.f16996d.await((long) 500, this.f16994b)) {
                    dVar.j0("App exception callback received from Analytics listener.");
                } else {
                    dVar.k0("Timeout exceeded while awaiting app exception callback from Analytics listener.", (Exception) null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", (Throwable) null);
            }
            this.f16996d = null;
        }
    }
}

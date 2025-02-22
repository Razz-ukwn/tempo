package o6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<a> f12197a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12198b;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f12199c = new CountDownLatch(1);

    /* renamed from: d  reason: collision with root package name */
    public boolean f12200d = false;

    public c(a aVar, long j10) {
        this.f12197a = new WeakReference<>(aVar);
        this.f12198b = j10;
        start();
    }

    public final void run() {
        a aVar;
        WeakReference<a> weakReference = this.f12197a;
        try {
            if (!this.f12199c.await(this.f12198b, TimeUnit.MILLISECONDS) && (aVar = weakReference.get()) != null) {
                aVar.b();
                this.f12200d = true;
            }
        } catch (InterruptedException unused) {
            a aVar2 = weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f12200d = true;
            }
        }
    }
}

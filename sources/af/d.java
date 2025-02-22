package af;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import se.a;
import te.b;
import we.c;

public class d extends a.b {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f352a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f353b;

    public d(ThreadFactory threadFactory) {
        boolean z10 = h.f366a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (h.f366a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            h.f369d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f352a = newScheduledThreadPool;
    }

    public final void a() {
        if (!this.f353b) {
            this.f353b = true;
            this.f352a.shutdownNow();
        }
    }

    public final b b(a.C0278a aVar, TimeUnit timeUnit) {
        return this.f353b ? c.f16708a : c(aVar, timeUnit, (te.a) null);
    }

    public final g c(Runnable runnable, TimeUnit timeUnit, te.a aVar) {
        cf.a.c(runnable);
        g gVar = new g(runnable, aVar);
        if (aVar != null && !aVar.c(gVar)) {
            return gVar;
        }
        try {
            gVar.b(this.f352a.submit(gVar));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.d(gVar);
            }
            cf.a.b(e10);
        }
        return gVar;
    }
}

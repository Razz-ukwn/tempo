package af;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import se.a;
import te.b;
import we.c;
import ze.b;

public final class i extends se.a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f370c = new e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f371b;

    public static final class a extends a.b {

        /* renamed from: a  reason: collision with root package name */
        public final ScheduledExecutorService f372a;

        /* renamed from: b  reason: collision with root package name */
        public final te.a f373b = new te.a();

        /* renamed from: c  reason: collision with root package name */
        public volatile boolean f374c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f372a = scheduledExecutorService;
        }

        public final void a() {
            if (!this.f374c) {
                this.f374c = true;
                this.f373b.a();
            }
        }

        public final b b(a.C0278a aVar, TimeUnit timeUnit) {
            boolean z10 = this.f374c;
            c cVar = c.f16708a;
            if (z10) {
                return cVar;
            }
            g gVar = new g(aVar, this.f373b);
            this.f373b.c(gVar);
            try {
                gVar.b(this.f372a.submit(gVar));
                return gVar;
            } catch (RejectedExecutionException e10) {
                a();
                cf.a.b(e10);
                return cVar;
            }
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
    }

    public i() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f371b = atomicReference;
        boolean z10 = h.f366a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f370c);
        if (h.f366a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            h.f369d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    public final a.b a() {
        return new a(this.f371b.get());
    }

    public final b c(b.a aVar, TimeUnit timeUnit) {
        f fVar = new f(aVar);
        try {
            fVar.b(this.f371b.get().submit(fVar));
            return fVar;
        } catch (RejectedExecutionException e10) {
            cf.a.b(e10);
            return c.f16708a;
        }
    }
}

package af;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import se.a;

public final class b extends se.a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f332c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f333d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f334e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: f  reason: collision with root package name */
    public static final TimeUnit f335f = TimeUnit.SECONDS;

    /* renamed from: g  reason: collision with root package name */
    public static final c f336g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f337h = Boolean.getBoolean("rx2.io-scheduled-release");

    /* renamed from: i  reason: collision with root package name */
    public static final a f338i;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f339b;

    public static final class a implements Runnable {
        public final ThreadFactory B;

        /* renamed from: a  reason: collision with root package name */
        public final long f340a;

        /* renamed from: b  reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f341b;

        /* renamed from: c  reason: collision with root package name */
        public final te.a f342c;

        /* renamed from: d  reason: collision with root package name */
        public final ScheduledExecutorService f343d;

        /* renamed from: e  reason: collision with root package name */
        public final ScheduledFuture f344e;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            ScheduledExecutorService scheduledExecutorService;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0;
            this.f340a = nanos;
            this.f341b = new ConcurrentLinkedQueue<>();
            this.f342c = new te.a();
            this.B = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, b.f333d);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f343d = scheduledExecutorService;
            this.f344e = scheduledFuture;
        }

        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f341b;
            if (!concurrentLinkedQueue.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<c> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f349c > nanoTime) {
                        return;
                    }
                    if (concurrentLinkedQueue.remove(next)) {
                        this.f342c.d(next);
                    }
                }
            }
        }
    }

    /* renamed from: af.b$b  reason: collision with other inner class name */
    public static final class C0008b extends a.b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final te.a f345a;

        /* renamed from: b  reason: collision with root package name */
        public final a f346b;

        /* renamed from: c  reason: collision with root package name */
        public final c f347c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicBoolean f348d = new AtomicBoolean();

        public C0008b(a aVar) {
            c cVar;
            c cVar2;
            this.f346b = aVar;
            this.f345a = new te.a();
            if (aVar.f342c.f15626b) {
                cVar = b.f336g;
            } else {
                while (true) {
                    if (aVar.f341b.isEmpty()) {
                        cVar2 = new c(aVar.B);
                        aVar.f342c.c(cVar2);
                        break;
                    }
                    cVar2 = aVar.f341b.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f347c = cVar;
        }

        public final void a() {
            if (this.f348d.compareAndSet(false, true)) {
                this.f345a.a();
                boolean z10 = b.f337h;
                c cVar = this.f347c;
                if (z10) {
                    cVar.c(this, TimeUnit.NANOSECONDS, (te.a) null);
                    return;
                }
                a aVar = this.f346b;
                aVar.getClass();
                cVar.f349c = System.nanoTime() + aVar.f340a;
                aVar.f341b.offer(cVar);
            }
        }

        public final te.b b(a.C0278a aVar, TimeUnit timeUnit) {
            return this.f345a.f15626b ? we.c.f16708a : this.f347c.c(aVar, timeUnit, this.f345a);
        }

        public final void run() {
            a aVar = this.f346b;
            aVar.getClass();
            long nanoTime = System.nanoTime() + aVar.f340a;
            c cVar = this.f347c;
            cVar.f349c = nanoTime;
            aVar.f341b.offer(cVar);
        }
    }

    public static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        public long f349c = 0;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new e("RxCachedThreadSchedulerShutdown"));
        f336g = cVar;
        cVar.a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        e eVar = new e("RxCachedThreadScheduler", max, false);
        f332c = eVar;
        f333d = new e("RxCachedWorkerPoolEvictor", max, false);
        a aVar = new a(0, (TimeUnit) null, eVar);
        f338i = aVar;
        aVar.f342c.a();
        ScheduledFuture scheduledFuture = aVar.f344e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f343d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public b() {
        boolean z10;
        a aVar = f338i;
        this.f339b = new AtomicReference<>(aVar);
        a aVar2 = new a(f334e, f335f, f332c);
        while (true) {
            AtomicReference<a> atomicReference = this.f339b;
            if (!atomicReference.compareAndSet(aVar, aVar2)) {
                if (atomicReference.get() != aVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            aVar2.f342c.a();
            ScheduledFuture scheduledFuture = aVar2.f344e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar2.f343d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public final a.b a() {
        return new C0008b(this.f339b.get());
    }
}

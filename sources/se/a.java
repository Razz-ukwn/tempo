package se;

import af.d;
import java.util.concurrent.TimeUnit;
import ze.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14937a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: se.a$a  reason: collision with other inner class name */
    public static final class C0278a implements te.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f14938a;

        /* renamed from: b  reason: collision with root package name */
        public final b f14939b;

        /* renamed from: c  reason: collision with root package name */
        public Thread f14940c;

        public C0278a(b.a aVar, b bVar) {
            this.f14938a = aVar;
            this.f14939b = bVar;
        }

        public final void a() {
            if (this.f14940c == Thread.currentThread()) {
                b bVar = this.f14939b;
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    if (!dVar.f353b) {
                        dVar.f353b = true;
                        dVar.f352a.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f14939b.a();
        }

        public final void run() {
            this.f14940c = Thread.currentThread();
            try {
                this.f14938a.run();
            } finally {
                a();
                this.f14940c = null;
            }
        }
    }

    public static abstract class b implements te.b {
        public abstract te.b b(C0278a aVar, TimeUnit timeUnit);
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    public abstract b a();

    public te.b b(b.a aVar) {
        return c(aVar, TimeUnit.NANOSECONDS);
    }

    public te.b c(b.a aVar, TimeUnit timeUnit) {
        b a10 = a();
        C0278a aVar2 = new C0278a(aVar, a10);
        a10.b(aVar2, timeUnit);
        return aVar2;
    }
}

package af;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import se.a;
import ze.b;

public final class j extends se.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f375b = 0;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f376a;

        /* renamed from: b  reason: collision with root package name */
        public final c f377b;

        /* renamed from: c  reason: collision with root package name */
        public final long f378c;

        public a(a.C0278a aVar, c cVar, long j10) {
            this.f376a = aVar;
            this.f377b = cVar;
            this.f378c = j10;
        }

        public final void run() {
            if (!this.f377b.f386d) {
                c cVar = this.f377b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar.getClass();
                long convert = !se.a.f14937a ? timeUnit.convert(System.currentTimeMillis(), timeUnit) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
                long j10 = this.f378c;
                if (j10 > convert) {
                    try {
                        Thread.sleep(j10 - convert);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        cf.a.b(e10);
                        return;
                    }
                }
                if (!this.f377b.f386d) {
                    this.f376a.run();
                }
            }
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f379a;

        /* renamed from: b  reason: collision with root package name */
        public final long f380b;

        /* renamed from: c  reason: collision with root package name */
        public final int f381c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f382d;

        public b(a aVar, Long l10, int i8) {
            this.f379a = aVar;
            this.f380b = l10.longValue();
            this.f381c = i8;
        }

        public final int compareTo(Object obj) {
            b bVar = (b) obj;
            int i8 = (this.f380b > bVar.f380b ? 1 : (this.f380b == bVar.f380b ? 0 : -1));
            int i10 = 1;
            int i11 = i8 < 0 ? -1 : i8 > 0 ? 1 : 0;
            if (i11 != 0) {
                return i11;
            }
            int i12 = this.f381c;
            int i13 = bVar.f381c;
            if (i12 < i13) {
                i10 = -1;
            } else if (i12 <= i13) {
                i10 = 0;
            }
            return i10;
        }
    }

    public static final class c extends a.b {

        /* renamed from: a  reason: collision with root package name */
        public final PriorityBlockingQueue<b> f383a = new PriorityBlockingQueue<>();

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f384b = new AtomicInteger();

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f385c = new AtomicInteger();

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f386d;

        public final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final b f387a;

            public a(b bVar) {
                this.f387a = bVar;
            }

            public final void run() {
                this.f387a.f382d = true;
                c.this.f383a.remove(this.f387a);
            }
        }

        public final void a() {
            this.f386d = true;
        }

        public final te.b b(a.C0278a aVar, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(0) + (!se.a.f14937a ? timeUnit2.convert(System.currentTimeMillis(), timeUnit2) : timeUnit2.convert(System.nanoTime(), TimeUnit.NANOSECONDS));
            a aVar2 = new a(aVar, this, millis);
            boolean z10 = this.f386d;
            we.c cVar = we.c.f16708a;
            if (z10) {
                return cVar;
            }
            b bVar = new b(aVar2, Long.valueOf(millis), this.f385c.incrementAndGet());
            this.f383a.add(bVar);
            if (this.f384b.getAndIncrement() != 0) {
                return new te.c(new a(bVar));
            }
            int i8 = 1;
            while (!this.f386d) {
                b poll = this.f383a.poll();
                if (poll == null) {
                    i8 = this.f384b.addAndGet(-i8);
                    if (i8 == 0) {
                        return cVar;
                    }
                } else if (!poll.f382d) {
                    poll.f379a.run();
                }
            }
            this.f383a.clear();
            return cVar;
        }
    }

    static {
        new j();
    }

    public final a.b a() {
        return new c();
    }

    public final te.b b(b.a aVar) {
        aVar.run();
        return we.c.f16708a;
    }

    public final te.b c(b.a aVar, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(0);
            aVar.run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            cf.a.b(e10);
        }
        return we.c.f16708a;
    }
}

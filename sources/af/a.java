package af;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import se.a;
import we.d;
import ze.b;

public final class a extends se.a {

    /* renamed from: c  reason: collision with root package name */
    public static final b f320c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f321d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f322e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f323f;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<b> f324b;

    /* renamed from: af.a$a  reason: collision with other inner class name */
    public static final class C0007a extends a.b {

        /* renamed from: a  reason: collision with root package name */
        public final te.a f325a;

        /* renamed from: b  reason: collision with root package name */
        public final d f326b;

        /* renamed from: c  reason: collision with root package name */
        public final c f327c;

        /* renamed from: d  reason: collision with root package name */
        public volatile boolean f328d;

        public C0007a(c cVar) {
            this.f327c = cVar;
            d dVar = new d();
            te.a aVar = new te.a();
            this.f325a = aVar;
            d dVar2 = new d();
            this.f326b = dVar2;
            dVar2.c(dVar);
            dVar2.c(aVar);
        }

        public final void a() {
            if (!this.f328d) {
                this.f328d = true;
                this.f326b.a();
            }
        }

        public final te.b b(a.C0278a aVar, TimeUnit timeUnit) {
            return this.f328d ? we.c.f16708a : this.f327c.c(aVar, timeUnit, this.f325a);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f329a;

        /* renamed from: b  reason: collision with root package name */
        public final c[] f330b;

        /* renamed from: c  reason: collision with root package name */
        public long f331c;

        public b(int i8, ThreadFactory threadFactory) {
            this.f329a = i8;
            this.f330b = new c[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                this.f330b[i10] = new c(threadFactory);
            }
        }
    }

    public static final class c extends d {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f322e = availableProcessors;
        c cVar = new c(new e("RxComputationShutdown"));
        f323f = cVar;
        cVar.a();
        e eVar = new e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f321d = eVar;
        b bVar = new b(0, eVar);
        f320c = bVar;
        for (c a10 : bVar.f330b) {
            a10.a();
        }
    }

    public a() {
        int i8;
        boolean z10;
        b bVar = f320c;
        this.f324b = new AtomicReference<>(bVar);
        b bVar2 = new b(f322e, f321d);
        while (true) {
            AtomicReference<b> atomicReference = this.f324b;
            if (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            for (c a10 : bVar2.f330b) {
                a10.a();
            }
        }
    }

    public final a.b a() {
        c cVar;
        b bVar = this.f324b.get();
        int i8 = bVar.f329a;
        if (i8 == 0) {
            cVar = f323f;
        } else {
            long j10 = bVar.f331c;
            bVar.f331c = 1 + j10;
            cVar = bVar.f330b[(int) (j10 % ((long) i8))];
        }
        return new C0007a(cVar);
    }

    public final te.b c(b.a aVar, TimeUnit timeUnit) {
        c cVar;
        b bVar = this.f324b.get();
        int i8 = bVar.f329a;
        if (i8 == 0) {
            cVar = f323f;
        } else {
            long j10 = bVar.f331c;
            bVar.f331c = 1 + j10;
            cVar = bVar.f330b[(int) (j10 % ((long) i8))];
        }
        cVar.getClass();
        f fVar = new f(aVar);
        try {
            fVar.b(cVar.f352a.submit(fVar));
            return fVar;
        } catch (RejectedExecutionException e10) {
            cf.a.b(e10);
            return we.c.f16708a;
        }
    }
}

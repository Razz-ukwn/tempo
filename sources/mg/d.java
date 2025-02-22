package mg;

import ff.m;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import sf.j;

public final class d {

    /* renamed from: h  reason: collision with root package name */
    public static final b f11491h = new b();

    /* renamed from: i  reason: collision with root package name */
    public static final d f11492i;

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f11493j;

    /* renamed from: a  reason: collision with root package name */
    public final a f11494a;

    /* renamed from: b  reason: collision with root package name */
    public int f11495b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11496c;

    /* renamed from: d  reason: collision with root package name */
    public long f11497d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f11498e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11499f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final e f11500g = new e(this);

    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        long c();

        void execute(Runnable runnable);
    }

    public static final class b {
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f11501a;

        public c(kg.a aVar) {
            this.f11501a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }

        public final void a(d dVar, long j10) {
            j.f(dVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                dVar.wait(j11, (int) j12);
            }
        }

        public final void b(d dVar) {
            j.f(dVar, "taskRunner");
            dVar.notify();
        }

        public final long c() {
            return System.nanoTime();
        }

        public final void execute(Runnable runnable) {
            j.f(runnable, "runnable");
            this.f11501a.execute(runnable);
        }
    }

    static {
        String k10 = j.k(" TaskRunner", kg.b.f10480g);
        j.f(k10, "name");
        f11492i = new d(new c(new kg.a(k10, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        j.e(logger, "getLogger(TaskRunner::class.java.name)");
        f11493j = logger;
    }

    public d(c cVar) {
        this.f11494a = cVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = kg.b.f10474a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f11480a);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                m mVar = m.f8717a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                m mVar2 = m.f8717a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j10) {
        byte[] bArr = kg.b.f10474a;
        c cVar = aVar.f11482c;
        j.c(cVar);
        if (cVar.f11488d == aVar) {
            boolean z10 = cVar.f11490f;
            cVar.f11490f = false;
            cVar.f11488d = null;
            this.f11498e.remove(cVar);
            if (j10 != -1 && !z10 && !cVar.f11487c) {
                cVar.d(aVar, j10, true);
            }
            if (!cVar.f11489e.isEmpty()) {
                this.f11499f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final mg.a c() {
        /*
            r17 = this;
            r1 = r17
            byte[] r0 = kg.b.f10474a
        L_0x0004:
            java.util.ArrayList r0 = r1.f11499f
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            mg.d$a r2 = r1.f11494a
            long r4 = r2.c()
            java.util.Iterator r6 = r0.iterator()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r3
        L_0x001e:
            boolean r10 = r6.hasNext()
            r11 = 1
            r12 = 0
            if (r10 == 0) goto L_0x0050
            java.lang.Object r10 = r6.next()
            mg.c r10 = (mg.c) r10
            java.util.ArrayList r10 = r10.f11489e
            java.lang.Object r10 = r10.get(r12)
            mg.a r10 = (mg.a) r10
            long r13 = r10.f11483d
            long r13 = r13 - r4
            r15 = r4
            r3 = 0
            long r13 = java.lang.Math.max(r3, r13)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0048
            long r3 = java.lang.Math.min(r13, r7)
            r7 = r3
            goto L_0x004d
        L_0x0048:
            if (r9 == 0) goto L_0x004c
            r3 = r11
            goto L_0x0052
        L_0x004c:
            r9 = r10
        L_0x004d:
            r4 = r15
            r3 = 0
            goto L_0x001e
        L_0x0050:
            r15 = r4
            r3 = r12
        L_0x0052:
            if (r9 == 0) goto L_0x0081
            byte[] r4 = kg.b.f10474a
            r4 = -1
            r9.f11483d = r4
            mg.c r4 = r9.f11482c
            sf.j.c(r4)
            java.util.ArrayList r5 = r4.f11489e
            r5.remove(r9)
            r0.remove(r4)
            r4.f11488d = r9
            java.util.ArrayList r5 = r1.f11498e
            r5.add(r4)
            if (r3 != 0) goto L_0x007b
            boolean r3 = r1.f11496c
            if (r3 != 0) goto L_0x0080
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r11
            if (r0 == 0) goto L_0x0080
        L_0x007b:
            mg.e r0 = r1.f11500g
            r2.execute(r0)
        L_0x0080:
            return r9
        L_0x0081:
            boolean r0 = r1.f11496c
            if (r0 == 0) goto L_0x0091
            long r3 = r1.f11497d
            long r3 = r3 - r15
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            r2.b(r1)
        L_0x008f:
            r0 = 0
            return r0
        L_0x0091:
            r1.f11496c = r11
            long r4 = r15 + r7
            r1.f11497d = r4
            r2.a(r1, r7)     // Catch:{ InterruptedException -> 0x009d }
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            goto L_0x00a4
        L_0x009d:
            r17.d()     // Catch:{ all -> 0x009b }
        L_0x00a0:
            r1.f11496c = r12
            goto L_0x0004
        L_0x00a4:
            r1.f11496c = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.d.c():mg.a");
    }

    public final void d() {
        ArrayList arrayList = this.f11498e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i8 = size - 1;
                ((c) arrayList.get(size)).b();
                if (i8 < 0) {
                    break;
                }
                size = i8;
            }
        }
        ArrayList arrayList2 = this.f11499f;
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i10 = size2 - 1;
                c cVar = (c) arrayList2.get(size2);
                cVar.b();
                if (cVar.f11489e.isEmpty()) {
                    arrayList2.remove(size2);
                }
                if (i10 >= 0) {
                    size2 = i10;
                } else {
                    return;
                }
            }
        }
    }

    public final void e(c cVar) {
        j.f(cVar, "taskQueue");
        byte[] bArr = kg.b.f10474a;
        if (cVar.f11488d == null) {
            boolean z10 = !cVar.f11489e.isEmpty();
            ArrayList arrayList = this.f11499f;
            if (z10) {
                j.f(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z11 = this.f11496c;
        a aVar = this.f11494a;
        if (z11) {
            aVar.b(this);
        } else {
            aVar.execute(this.f11500g);
        }
    }

    public final c f() {
        int i8;
        synchronized (this) {
            i8 = this.f11495b;
            this.f11495b = i8 + 1;
        }
        return new c(this, j.k(Integer.valueOf(i8), "Q"));
    }
}

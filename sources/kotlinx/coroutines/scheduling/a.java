package kotlinx.coroutines.scheduling;

import ag.i0;
import androidx.activity.g;
import androidx.activity.result.d;
import ff.m;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.v;
import sf.j;
import uf.c;

public final class a implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater D;
    public static final /* synthetic */ AtomicLongFieldUpdater E;
    public static final /* synthetic */ AtomicIntegerFieldUpdater F;
    public static final v G = new v("NOT_IN_STACK");
    public final d B;
    public final r<C0200a> C;
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f10748a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10749b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10750c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f10751d;

    /* renamed from: e  reason: collision with root package name */
    public final d f10752e;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a  reason: collision with other inner class name */
    public final class C0200a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(C0200a.class, "workerCtl");
        public boolean B;

        /* renamed from: a  reason: collision with root package name */
        public final m f10753a;

        /* renamed from: b  reason: collision with root package name */
        public int f10754b;

        /* renamed from: c  reason: collision with root package name */
        public long f10755c;

        /* renamed from: d  reason: collision with root package name */
        public long f10756d;

        /* renamed from: e  reason: collision with root package name */
        public int f10757e;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        public C0200a() {
            throw null;
        }

        public C0200a(int i8) {
            setDaemon(true);
            this.f10753a = new m();
            this.f10754b = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.G;
            this.f10757e = c.f16031a.b();
            f(i8);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.scheduling.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlinx.coroutines.scheduling.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlinx.coroutines.scheduling.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f10754b
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L_0x0007
                goto L_0x002e
            L_0x0007:
                kotlinx.coroutines.scheduling.a r0 = kotlinx.coroutines.scheduling.a.this
            L_0x0009:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L_0x0019
                r0 = r2
                goto L_0x002a
            L_0x0019:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.a.E
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L_0x0009
                r0 = r1
            L_0x002a:
                if (r0 == 0) goto L_0x0030
                r9.f10754b = r1
            L_0x002e:
                r0 = r1
                goto L_0x0031
            L_0x0030:
                r0 = r2
            L_0x0031:
                r3 = 0
                if (r0 == 0) goto L_0x007a
                if (r10 == 0) goto L_0x006e
                kotlinx.coroutines.scheduling.a r10 = kotlinx.coroutines.scheduling.a.this
                int r10 = r10.f10748a
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r1 = r2
            L_0x0044:
                if (r1 == 0) goto L_0x004d
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 == 0) goto L_0x004d
                goto L_0x0079
            L_0x004d:
                kotlinx.coroutines.scheduling.m r10 = r9.f10753a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f10775b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L_0x0061
                kotlinx.coroutines.scheduling.g r10 = r10.d()
                goto L_0x0062
            L_0x0061:
                r10 = r0
            L_0x0062:
                if (r10 == 0) goto L_0x0065
                goto L_0x0079
            L_0x0065:
                if (r1 != 0) goto L_0x0075
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 == 0) goto L_0x0075
                goto L_0x0079
            L_0x006e:
                kotlinx.coroutines.scheduling.g r10 = r9.e()
                if (r10 == 0) goto L_0x0075
                goto L_0x0079
            L_0x0075:
                kotlinx.coroutines.scheduling.g r10 = r9.i(r2)
            L_0x0079:
                return r10
            L_0x007a:
                if (r10 == 0) goto L_0x009d
                kotlinx.coroutines.scheduling.m r10 = r9.f10753a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.m.f10775b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                if (r0 != 0) goto L_0x008f
                kotlinx.coroutines.scheduling.g r0 = r10.d()
            L_0x008f:
                if (r0 != 0) goto L_0x00a8
                kotlinx.coroutines.scheduling.a r10 = kotlinx.coroutines.scheduling.a.this
                kotlinx.coroutines.scheduling.d r10 = r10.B
                java.lang.Object r10 = r10.d()
                r0 = r10
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
                goto L_0x00a8
            L_0x009d:
                kotlinx.coroutines.scheduling.a r10 = kotlinx.coroutines.scheduling.a.this
                kotlinx.coroutines.scheduling.d r10 = r10.B
                java.lang.Object r10 = r10.d()
                r0 = r10
                kotlinx.coroutines.scheduling.g r0 = (kotlinx.coroutines.scheduling.g) r0
            L_0x00a8:
                if (r0 != 0) goto L_0x00ae
                kotlinx.coroutines.scheduling.g r0 = r9.i(r1)
            L_0x00ae:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.C0200a.a(boolean):kotlinx.coroutines.scheduling.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i8) {
            int i10 = this.f10757e;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.f10757e = i13;
            int i14 = i8 - 1;
            return (i14 & i8) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i8;
        }

        public final g e() {
            int d10 = d(2);
            a aVar = a.this;
            if (d10 == 0) {
                g gVar = (g) aVar.f10752e.d();
                return gVar != null ? gVar : (g) aVar.B.d();
            }
            g gVar2 = (g) aVar.B.d();
            return gVar2 != null ? gVar2 : (g) aVar.f10752e.d();
        }

        public final void f(int i8) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f10751d);
            sb2.append("-worker-");
            sb2.append(i8 == 0 ? "TERMINATED" : String.valueOf(i8));
            setName(sb2.toString());
            this.indexInArray = i8;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i8) {
            int i10 = this.f10754b;
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            if (z10) {
                a.E.addAndGet(a.this, 4398046511104L);
            }
            if (i10 != i8) {
                this.f10754b = i8;
            }
            return z10;
        }

        public final g i(boolean z10) {
            long j10;
            int i8 = (int) (a.this.controlState & 2097151);
            if (i8 < 2) {
                return null;
            }
            int d10 = d(i8);
            a aVar = a.this;
            long j11 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < i8; i10++) {
                d10++;
                if (d10 > i8) {
                    d10 = 1;
                }
                C0200a b10 = aVar.C.b(d10);
                if (!(b10 == null || b10 == this)) {
                    if (z10) {
                        j10 = this.f10753a.e(b10.f10753a);
                    } else {
                        m mVar = this.f10753a;
                        m mVar2 = b10.f10753a;
                        mVar.getClass();
                        g d11 = mVar2.d();
                        if (d11 != null) {
                            mVar.a(d11, false);
                            j10 = -1;
                        } else {
                            j10 = mVar.f(mVar2, false);
                        }
                    }
                    if (j10 == -1) {
                        m mVar3 = this.f10753a;
                        mVar3.getClass();
                        g gVar = (g) m.f10775b.getAndSet(mVar3, (Object) null);
                        return gVar == null ? mVar3.d() : gVar;
                    } else if (j10 > 0) {
                        j11 = Math.min(j11, j10);
                    }
                }
            }
            if (j11 == Long.MAX_VALUE) {
                j11 = 0;
            }
            this.f10756d = j11;
            return null;
        }

        public final void run() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f10754b != 5) {
                    g a10 = a(this.B);
                    if (a10 == null) {
                        this.B = false;
                        if (this.f10756d == 0) {
                            if (this.nextParkedWorker != a.G) {
                                this.workerCtl = -1;
                                while (true) {
                                    if (!(this.nextParkedWorker != a.G) || this.workerCtl != -1 || a.this.isTerminated() || this.f10754b == 5) {
                                        break;
                                    }
                                    h(3);
                                    Thread.interrupted();
                                    if (this.f10755c == 0) {
                                        this.f10755c = System.nanoTime() + a.this.f10750c;
                                    }
                                    LockSupport.parkNanos(a.this.f10750c);
                                    if (System.nanoTime() - this.f10755c >= 0) {
                                        this.f10755c = 0;
                                        a aVar = a.this;
                                        synchronized (aVar.C) {
                                            if (!aVar.isTerminated()) {
                                                if (((int) (aVar.controlState & 2097151)) > aVar.f10748a) {
                                                    if (D.compareAndSet(this, -1, 1)) {
                                                        int i8 = this.indexInArray;
                                                        f(0);
                                                        aVar.j(this, i8, 0);
                                                        int andDecrement = (int) (a.E.getAndDecrement(aVar) & 2097151);
                                                        if (andDecrement != i8) {
                                                            C0200a b10 = aVar.C.b(andDecrement);
                                                            j.c(b10);
                                                            C0200a aVar2 = b10;
                                                            aVar.C.c(i8, aVar2);
                                                            aVar2.f(i8);
                                                            aVar.j(aVar2, andDecrement, i8);
                                                        }
                                                        aVar.C.c(andDecrement, (C0200a) null);
                                                        m mVar = m.f8717a;
                                                        this.f10754b = 5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                a.this.e(this);
                            }
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10756d);
                            this.f10756d = 0;
                        }
                    } else {
                        this.f10756d = 0;
                        int b11 = a10.f10764b.b();
                        this.f10755c = 0;
                        if (this.f10754b == 3) {
                            this.f10754b = 2;
                        }
                        a aVar3 = a.this;
                        if (b11 != 0 && h(2) && !aVar3.q() && !aVar3.p(aVar3.controlState)) {
                            aVar3.q();
                        }
                        aVar3.getClass();
                        try {
                            a10.run();
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        if (b11 != 0) {
                            a.E.addAndGet(aVar3, -2097152);
                            if (this.f10754b != 5) {
                                this.f10754b = 4;
                            }
                        }
                    }
                }
            }
            h(5);
            return;
        }
    }

    static {
        Class<a> cls = a.class;
        D = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        E = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        F = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public a(int i8, int i10, long j10, String str) {
        this.f10748a = i8;
        this.f10749b = i10;
        this.f10750c = j10;
        this.f10751d = str;
        boolean z10 = true;
        if (i8 >= 1) {
            if (i10 >= i8) {
                if (i10 <= 2097150) {
                    if (j10 <= 0 ? false : z10) {
                        this.f10752e = new d();
                        this.B = new d();
                        this.parkedWorkersStack = 0;
                        this.C = new r<>(i8 + 1);
                        this.controlState = ((long) i8) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(d.a.a("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(d.a("Max pool size ", i10, " should be greater than or equals to core pool size ", i8).toString());
        }
        throw new IllegalArgumentException(d.a.a("Core pool size ", i8, " should be at least 1").toString());
    }

    public final int c() {
        synchronized (this.C) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j10 = this.controlState;
            int i8 = (int) (j10 & 2097151);
            int i10 = i8 - ((int) ((j10 & 4398044413952L) >> 21));
            boolean z10 = false;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 >= this.f10748a) {
                return 0;
            }
            if (i8 >= this.f10749b) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.C.b(i11) == null) {
                C0200a aVar = new C0200a(i11);
                this.C.c(i11, aVar);
                if (i11 == ((int) (2097151 & E.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (z10) {
                    aVar.start();
                    int i12 = i10 + 1;
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = F
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00a8
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.a.C0200a
            r4 = 0
            if (r3 == 0) goto L_0x0018
            kotlinx.coroutines.scheduling.a$a r0 = (kotlinx.coroutines.scheduling.a.C0200a) r0
            goto L_0x0019
        L_0x0018:
            r0 = r4
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            kotlinx.coroutines.scheduling.a r3 = kotlinx.coroutines.scheduling.a.this
            boolean r3 = sf.j.a(r3, r9)
            if (r3 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r4
        L_0x0025:
            kotlinx.coroutines.internal.r<kotlinx.coroutines.scheduling.a$a> r3 = r9.C
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch:{ all -> 0x00bc }
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L_0x0076
            r3 = r2
        L_0x0033:
            kotlinx.coroutines.internal.r<kotlinx.coroutines.scheduling.a$a> r6 = r9.C
            java.lang.Object r6 = r6.b(r3)
            sf.j.c(r6)
            kotlinx.coroutines.scheduling.a$a r6 = (kotlinx.coroutines.scheduling.a.C0200a) r6
            if (r6 == r0) goto L_0x0071
        L_0x0040:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L_0x004f
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L_0x0040
        L_0x004f:
            kotlinx.coroutines.scheduling.m r6 = r6.f10753a
            kotlinx.coroutines.scheduling.d r7 = r9.B
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.scheduling.m.f10775b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            kotlinx.coroutines.scheduling.g r8 = (kotlinx.coroutines.scheduling.g) r8
            if (r8 == 0) goto L_0x0063
            r7.a(r8)
        L_0x0063:
            kotlinx.coroutines.scheduling.g r8 = r6.d()
            if (r8 != 0) goto L_0x006b
            r8 = r1
            goto L_0x006f
        L_0x006b:
            r7.a(r8)
            r8 = r2
        L_0x006f:
            if (r8 != 0) goto L_0x0063
        L_0x0071:
            if (r3 == r5) goto L_0x0076
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0076:
            kotlinx.coroutines.scheduling.d r1 = r9.B
            r1.b()
            kotlinx.coroutines.scheduling.d r1 = r9.f10752e
            r1.b()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            kotlinx.coroutines.scheduling.g r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00a9
        L_0x0088:
            kotlinx.coroutines.scheduling.d r1 = r9.f10752e
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.g r1 = (kotlinx.coroutines.scheduling.g) r1
            if (r1 != 0) goto L_0x00a9
            kotlinx.coroutines.scheduling.d r1 = r9.B
            java.lang.Object r1 = r1.d()
            kotlinx.coroutines.scheduling.g r1 = (kotlinx.coroutines.scheduling.g) r1
            if (r1 != 0) goto L_0x00a9
            if (r0 == 0) goto L_0x00a2
            r1 = 5
            r0.h(r1)
        L_0x00a2:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        L_0x00a8:
            return
        L_0x00a9:
            r1.run()     // Catch:{ all -> 0x00ad }
            goto L_0x0080
        L_0x00ad:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ba }
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00ba }
            r4.uncaughtException(r3, r1)     // Catch:{ all -> 0x00ba }
            goto L_0x0080
        L_0x00ba:
            r0 = move-exception
            throw r0
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.a.close():void");
    }

    public final void d(Runnable runnable, h hVar, boolean z10) {
        g gVar;
        g gVar2;
        k.f10771e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f10763a = nanoTime;
            gVar.f10764b = hVar;
        } else {
            gVar = new j(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C0200a aVar = null;
        C0200a aVar2 = currentThread instanceof C0200a ? (C0200a) currentThread : null;
        if (aVar2 != null && j.a(a.this, this)) {
            aVar = aVar2;
        }
        boolean z11 = true;
        if (aVar == null || aVar.f10754b == 5 || (gVar.f10764b.b() == 0 && aVar.f10754b == 2)) {
            gVar2 = gVar;
        } else {
            aVar.B = true;
            gVar2 = aVar.f10753a.a(gVar, z10);
        }
        if (gVar2 != null) {
            if (!(gVar2.f10764b.b() == 1 ? this.B.a(gVar2) : this.f10752e.a(gVar2))) {
                throw new RejectedExecutionException(g.a(new StringBuilder(), this.f10751d, " was terminated"));
            }
        }
        if (!z10 || aVar == null) {
            z11 = false;
        }
        if (gVar.f10764b.b() != 0) {
            long addAndGet = E.addAndGet(this, 2097152);
            if (!z11 && !q() && !p(addAndGet)) {
                q();
            }
        } else if (!z11 && !q() && !p(this.controlState)) {
            q();
        }
    }

    public final void e(C0200a aVar) {
        long j10;
        long j11;
        if (aVar.c() == G) {
            do {
                j10 = this.parkedWorkersStack;
                int b10 = aVar.b();
                aVar.g(this.C.b((int) (2097151 & j10)));
                j11 = (long) b10;
            } while (!D.compareAndSet(this, j10, j11 | ((2097152 + j10) & -2097152)));
        }
    }

    public final void execute(Runnable runnable) {
        d(runnable, k.f10772f, false);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(C0200a aVar, int i8, int i10) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i11 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i11 == i8) {
                if (i10 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == G) {
                            i11 = -1;
                            break;
                        } else if (c3 == null) {
                            i11 = 0;
                            break;
                        } else {
                            C0200a aVar2 = (C0200a) c3;
                            int b10 = aVar2.b();
                            if (b10 != 0) {
                                i11 = b10;
                                break;
                            }
                            c3 = aVar2.c();
                        }
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (D.compareAndSet(this, j10, j11 | ((long) i11))) {
                    return;
                }
            }
        }
    }

    public final boolean p(long j10) {
        int i8 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i8 < 0) {
            i8 = 0;
        }
        int i10 = this.f10748a;
        if (i8 < i10) {
            int c3 = c();
            if (c3 == 1 && i10 > 1) {
                c();
            }
            if (c3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        v vVar;
        int i8;
        while (true) {
            long j10 = this.parkedWorkersStack;
            C0200a b10 = this.C.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & -2097152;
                Object c3 = b10.c();
                while (true) {
                    vVar = G;
                    if (c3 == vVar) {
                        i8 = -1;
                        break;
                    } else if (c3 == null) {
                        i8 = 0;
                        break;
                    } else {
                        C0200a aVar = (C0200a) c3;
                        i8 = aVar.b();
                        if (i8 != 0) {
                            break;
                        }
                        c3 = aVar.c();
                    }
                }
                if (i8 >= 0) {
                    if (D.compareAndSet(this, j10, ((long) i8) | j11)) {
                        b10.g(vVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0200a.D.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.C.a();
        int i8 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a10; i14++) {
            C0200a b10 = this.C.b(i14);
            if (b10 != null) {
                int c3 = b10.f10753a.c();
                int c10 = q.g.c(b10.f10754b);
                if (c10 == 0) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c3);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (c10 == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(c3);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (c10 == 2) {
                    i11++;
                } else if (c10 == 3) {
                    i12++;
                    if (c3 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c3);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (c10 == 4) {
                    i13++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f10751d + '@' + i0.d(this) + "[Pool Size {core = " + this.f10748a + ", max = " + this.f10749b + "}, Worker States {CPU = " + i8 + ", blocking = " + i10 + ", parked = " + i11 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f10752e.c() + ", global blocking queue size = " + this.B.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f10748a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }
}

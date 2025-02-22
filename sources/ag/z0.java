package ag;

import ag.n0;
import ff.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jf.f;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;

public abstract class z0 extends a1 implements n0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater C;
    public static final /* synthetic */ AtomicReferenceFieldUpdater D;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    public final class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public final k<m> f513c;

        public a(long j10, l lVar) {
            super(j10);
            this.f513c = lVar;
        }

        public final void run() {
            this.f513c.i(z0.this, m.f8717a);
        }

        public final String toString() {
            return super.toString() + this.f513c;
        }
    }

    public static final class b extends c {

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f515c;

        public b(Runnable runnable, long j10) {
            super(j10);
            this.f515c = runnable;
        }

        public final void run() {
            this.f515c.run();
        }

        public final String toString() {
            return super.toString() + this.f515c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, u0, z {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f516a;

        /* renamed from: b  reason: collision with root package name */
        public int f517b = -1;

        public c(long j10) {
            this.f516a = j10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.internal.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void a() {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.Object r0 = r5._heap     // Catch:{ all -> 0x002f }
                kotlinx.coroutines.internal.v r1 = ag.b1.f395a     // Catch:{ all -> 0x002f }
                if (r0 != r1) goto L_0x0009
                monitor-exit(r5)
                return
            L_0x0009:
                boolean r2 = r0 instanceof ag.z0.d     // Catch:{ all -> 0x002f }
                r3 = 0
                if (r2 == 0) goto L_0x0011
                ag.z0$d r0 = (ag.z0.d) r0     // Catch:{ all -> 0x002f }
                goto L_0x0012
            L_0x0011:
                r0 = r3
            L_0x0012:
                if (r0 == 0) goto L_0x002b
                monitor-enter(r0)     // Catch:{ all -> 0x002f }
                java.lang.Object r2 = r5._heap     // Catch:{ all -> 0x0028 }
                boolean r4 = r2 instanceof kotlinx.coroutines.internal.y     // Catch:{ all -> 0x0028 }
                if (r4 == 0) goto L_0x001e
                r3 = r2
                kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3     // Catch:{ all -> 0x0028 }
            L_0x001e:
                if (r3 != 0) goto L_0x0021
                goto L_0x0026
            L_0x0021:
                int r2 = r5.f517b     // Catch:{ all -> 0x0028 }
                r0.c(r2)     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                goto L_0x002b
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1     // Catch:{ all -> 0x002f }
            L_0x002b:
                r5._heap = r1     // Catch:{ all -> 0x002f }
                monitor-exit(r5)
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ag.z0.c.a():void");
        }

        public final void b(d dVar) {
            if (this._heap != b1.f395a) {
                this._heap = dVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final synchronized int c(long j10, d dVar, z0 z0Var) {
            if (this._heap == b1.f395a) {
                return 2;
            }
            synchronized (dVar) {
                try {
                    T[] tArr = dVar.f10747a;
                    c cVar = (c) (tArr != null ? tArr[0] : null);
                    if (z0.R0(z0Var)) {
                        return 1;
                    }
                    if (cVar == null) {
                        dVar.f518b = j10;
                    } else {
                        long j11 = cVar.f516a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f518b > 0) {
                            dVar.f518b = j10;
                        }
                    }
                    long j12 = this.f516a;
                    long j13 = dVar.f518b;
                    if (j12 - j13 < 0) {
                        this.f516a = j13;
                    }
                    dVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int compareTo(Object obj) {
            int i8 = ((this.f516a - ((c) obj).f516a) > 0 ? 1 : ((this.f516a - ((c) obj).f516a) == 0 ? 0 : -1));
            if (i8 > 0) {
                return 1;
            }
            return i8 < 0 ? -1 : 0;
        }

        public final void setIndex(int i8) {
            this.f517b = i8;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f516a + ']';
        }
    }

    public static final class d extends y<c> {

        /* renamed from: b  reason: collision with root package name */
        public long f518b;

        public d(long j10) {
            this.f518b = j10;
        }
    }

    static {
        Class<z0> cls = z0.class;
        Class<Object> cls2 = Object.class;
        C = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        D = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean R0(z0 z0Var) {
        return z0Var._isCompleted;
    }

    public final void F0(f fVar, Runnable runnable) {
        S0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d A[LOOP:2: B:42:0x006d->B:45:0x0078, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x007f A[EDGE_INSN: B:99:0x007f->B:48:0x007f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N0() {
        /*
            r11 = this;
            boolean r0 = r11.O0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r11._delayed
            ag.z0$d r0 = (ag.z0.d) r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0050
            boolean r6 = r0.b()
            if (r6 != 0) goto L_0x0050
            long r6 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            T[] r8 = r0.f10747a     // Catch:{ all -> 0x004d }
            if (r8 == 0) goto L_0x0024
            r8 = r8[r5]     // Catch:{ all -> 0x004d }
            goto L_0x0025
        L_0x0024:
            r8 = r4
        L_0x0025:
            if (r8 != 0) goto L_0x002a
            monitor-exit(r0)
            r8 = r4
            goto L_0x0048
        L_0x002a:
            ag.z0$c r8 = (ag.z0.c) r8     // Catch:{ all -> 0x004d }
            long r9 = r8.f516a     // Catch:{ all -> 0x004d }
            long r9 = r6 - r9
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0036
            r9 = r3
            goto L_0x0037
        L_0x0036:
            r9 = r5
        L_0x0037:
            if (r9 == 0) goto L_0x003e
            boolean r8 = r11.T0(r8)     // Catch:{ all -> 0x004d }
            goto L_0x003f
        L_0x003e:
            r8 = r5
        L_0x003f:
            if (r8 == 0) goto L_0x0046
            kotlinx.coroutines.internal.z r8 = r0.c(r5)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            monitor-exit(r0)
        L_0x0048:
            ag.z0$c r8 = (ag.z0.c) r8
            if (r8 != 0) goto L_0x001c
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0050:
            java.lang.Object r0 = r11._queue
            if (r0 != 0) goto L_0x0055
            goto L_0x007f
        L_0x0055:
            boolean r6 = r0 instanceof kotlinx.coroutines.internal.k
            if (r6 == 0) goto L_0x007b
            r6 = r0
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.k) r6
            java.lang.Object r7 = r6.f()
            kotlinx.coroutines.internal.v r8 = kotlinx.coroutines.internal.k.f10722g
            if (r7 == r8) goto L_0x0067
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L_0x0097
        L_0x0067:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = C
            kotlinx.coroutines.internal.k r6 = r6.e()
        L_0x006d:
            boolean r8 = r7.compareAndSet(r11, r0, r6)
            if (r8 == 0) goto L_0x0074
            goto L_0x0050
        L_0x0074:
            java.lang.Object r8 = r7.get(r11)
            if (r8 == r0) goto L_0x006d
            goto L_0x0050
        L_0x007b:
            kotlinx.coroutines.internal.v r6 = ag.b1.f396b
            if (r0 != r6) goto L_0x0081
        L_0x007f:
            r7 = r4
            goto L_0x0097
        L_0x0081:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = C
        L_0x0083:
            boolean r7 = r6.compareAndSet(r11, r0, r4)
            if (r7 == 0) goto L_0x008b
            r6 = r3
            goto L_0x0092
        L_0x008b:
            java.lang.Object r7 = r6.get(r11)
            if (r7 == r0) goto L_0x0083
            r6 = r5
        L_0x0092:
            if (r6 == 0) goto L_0x0050
            r7 = r0
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L_0x0097:
            if (r7 == 0) goto L_0x009d
            r7.run()
            return r1
        L_0x009d:
            kotlinx.coroutines.internal.a<ag.q0<?>> r0 = r11.f512e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00b1
        L_0x00a7:
            int r8 = r0.f10698b
            int r0 = r0.f10699c
            if (r8 != r0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r3 == 0) goto L_0x00b3
        L_0x00b1:
            r8 = r6
            goto L_0x00b4
        L_0x00b3:
            r8 = r1
        L_0x00b4:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
            goto L_0x00f4
        L_0x00b9:
            java.lang.Object r0 = r11._queue
            if (r0 == 0) goto L_0x00cf
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.k
            if (r3 == 0) goto L_0x00ca
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.k) r0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x00cf
            goto L_0x00f4
        L_0x00ca:
            kotlinx.coroutines.internal.v r3 = ag.b1.f396b
            if (r0 != r3) goto L_0x00f4
            goto L_0x00f3
        L_0x00cf:
            java.lang.Object r0 = r11._delayed
            ag.z0$d r0 = (ag.z0.d) r0
            if (r0 == 0) goto L_0x00f3
            monitor-enter(r0)
            T[] r3 = r0.f10747a     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00dc
            r4 = r3[r5]     // Catch:{ all -> 0x00f0 }
        L_0x00dc:
            monitor-exit(r0)
            ag.z0$c r4 = (ag.z0.c) r4
            if (r4 != 0) goto L_0x00e2
            goto L_0x00f3
        L_0x00e2:
            long r3 = r4.f516a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            r1 = r3
            goto L_0x00f4
        L_0x00f0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f3:
            r1 = r6
        L_0x00f4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.z0.N0():long");
    }

    public void S0(Runnable runnable) {
        if (T0(runnable)) {
            Thread P0 = P0();
            if (Thread.currentThread() != P0) {
                LockSupport.unpark(P0);
                return;
            }
            return;
        }
        j0.E.S0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[LOOP:2: B:22:0x0039->B:25:0x0044, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._queue
            int r1 = r6._isCompleted
            r2 = 0
            if (r1 == 0) goto L_0x0008
            return r2
        L_0x0008:
            r1 = 1
            if (r0 != 0) goto L_0x001f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = C
        L_0x000d:
            r0 = 0
            boolean r0 = r3.compareAndSet(r6, r0, r7)
            if (r0 == 0) goto L_0x0016
            r2 = r1
            goto L_0x001c
        L_0x0016:
            java.lang.Object r0 = r3.get(r6)
            if (r0 == 0) goto L_0x000d
        L_0x001c:
            if (r2 == 0) goto L_0x0000
            return r1
        L_0x001f:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.k
            if (r3 == 0) goto L_0x0048
            r3 = r0
            kotlinx.coroutines.internal.k r3 = (kotlinx.coroutines.internal.k) r3
            int r4 = r3.a(r7)
            if (r4 == 0) goto L_0x0047
            if (r4 == r1) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0032
            goto L_0x0000
        L_0x0032:
            return r2
        L_0x0033:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = C
            kotlinx.coroutines.internal.k r3 = r3.e()
        L_0x0039:
            boolean r1 = r2.compareAndSet(r6, r0, r3)
            if (r1 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            java.lang.Object r1 = r2.get(r6)
            if (r1 == r0) goto L_0x0039
            goto L_0x0000
        L_0x0047:
            return r1
        L_0x0048:
            kotlinx.coroutines.internal.v r3 = ag.b1.f396b
            if (r0 != r3) goto L_0x004d
            return r2
        L_0x004d:
            kotlinx.coroutines.internal.k r3 = new kotlinx.coroutines.internal.k
            r4 = 8
            r3.<init>(r4, r1)
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = C
        L_0x005f:
            boolean r5 = r4.compareAndSet(r6, r0, r3)
            if (r5 == 0) goto L_0x0067
            r2 = r1
            goto L_0x006d
        L_0x0067:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L_0x005f
        L_0x006d:
            if (r2 == 0) goto L_0x0000
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.z0.T0(java.lang.Runnable):boolean");
    }

    public final boolean U0() {
        kotlinx.coroutines.internal.a<q0<?>> aVar = this.f512e;
        if (!(aVar == null || aVar.f10698b == aVar.f10699c)) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof k) {
                return ((k) obj).d();
            }
            if (obj != b1.f396b) {
                return false;
            }
        }
        return true;
    }

    public final void V0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[LOOP:0: B:6:0x0015->B:9:0x0020, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W0(long r6, ag.z0.c r8) {
        /*
            r5 = this;
            int r0 = r5._isCompleted
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = r2
            goto L_0x002d
        L_0x0008:
            java.lang.Object r0 = r5._delayed
            ag.z0$d r0 = (ag.z0.d) r0
            if (r0 != 0) goto L_0x0029
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = D
            ag.z0$d r4 = new ag.z0$d
            r4.<init>(r6)
        L_0x0015:
            boolean r0 = r3.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            java.lang.Object r0 = r3.get(r5)
            if (r0 == 0) goto L_0x0015
        L_0x0022:
            java.lang.Object r0 = r5._delayed
            sf.j.c(r0)
            ag.z0$d r0 = (ag.z0.d) r0
        L_0x0029:
            int r0 = r8.c(r6, r0, r5)
        L_0x002d:
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x0041
            r6 = 2
            if (r0 != r6) goto L_0x0035
            goto L_0x006d
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0041:
            r5.Q0(r6, r8)
            goto L_0x006d
        L_0x0045:
            java.lang.Object r6 = r5._delayed
            ag.z0$d r6 = (ag.z0.d) r6
            r7 = 0
            if (r6 == 0) goto L_0x005a
            monitor-enter(r6)
            T[] r0 = r6.f10747a     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            r1 = r0[r7]     // Catch:{ all -> 0x0057 }
        L_0x0053:
            monitor-exit(r6)
            ag.z0$c r1 = (ag.z0.c) r1
            goto L_0x005a
        L_0x0057:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x005a:
            if (r1 != r8) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = r7
        L_0x005e:
            if (r2 == 0) goto L_0x006d
            java.lang.Thread r6 = r5.P0()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r7 == r6) goto L_0x006d
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.z0.W0(long, ag.z0$c):void");
    }

    public final void f0(long j10, l lVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, lVar);
            W0(nanoTime, aVar);
            lVar.v(new v0(aVar));
        }
    }

    public u0 m0(long j10, Runnable runnable, f fVar) {
        return n0.a.a(j10, runnable, fVar);
    }

    public void shutdown() {
        c cVar;
        ThreadLocal<y0> threadLocal = i2.f422a;
        i2.f422a.set((Object) null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            v vVar = b1.f396b;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, vVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof k) {
                ((k) obj).b();
                break;
            } else if (obj == vVar) {
                break;
            } else {
                k kVar = new k(8, true);
                kVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, kVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (N0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (cVar = (c) dVar.d()) != null) {
                Q0(nanoTime, cVar);
            } else {
                return;
            }
        }
    }
}

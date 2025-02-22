package kotlinx.coroutines.sync;

import androidx.fragment.app.q;
import ff.m;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rf.l;
import sf.k;

public final class g implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10791c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10792d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10793e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10794f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10795g;
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f10796a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10797b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    public static final class a extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f10798a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super(1);
            this.f10798a = gVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f10798a.a();
            return m.f8717a;
        }
    }

    static {
        Class<g> cls = g.class;
        Class<Object> cls2 = Object.class;
        f10791c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f10792d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        f10793e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        f10794f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        f10795g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public g(int i8, int i10) {
        this.f10796a = i8;
        boolean z10 = true;
        if (i8 > 0) {
            if ((i10 < 0 || i10 > i8) ? false : z10) {
                i iVar = new i(0, (i) null, 2);
                this.head = iVar;
                this.tail = iVar;
                this._availablePermits = i8 - i10;
                this.f10797b = new a(this);
                return;
            }
            throw new IllegalArgumentException(q.a("The number of acquired permits should be in 0..", i8).toString());
        }
        throw new IllegalArgumentException(q.a("Semaphore should have at least 1 permit, but had ", i8).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX WARNING: type inference failed for: r8v13, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x007d, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r15 = this;
        L_0x0000:
            int r0 = r15._availablePermits
            int r1 = r15.f10796a
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x000a
            r1 = r3
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            if (r1 == 0) goto L_0x0122
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = f10795g
            boolean r1 = r4.compareAndSet(r15, r0, r1)
            if (r1 == 0) goto L_0x0000
            if (r0 < 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.Object r0 = r15.head
            kotlinx.coroutines.sync.i r0 = (kotlinx.coroutines.sync.i) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f10792d
            long r4 = r1.getAndIncrement(r15)
            int r1 = kotlinx.coroutines.sync.h.f10804f
            long r6 = (long) r1
            long r6 = r4 / r6
        L_0x0029:
            r1 = r0
        L_0x002a:
            long r8 = r1.f10736c
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r9 = 0
            kotlinx.coroutines.internal.v r10 = b1.b.B
            if (r8 < 0) goto L_0x0039
            boolean r8 = r1.b()
            if (r8 == 0) goto L_0x0040
        L_0x0039:
            java.lang.Object r8 = kotlinx.coroutines.internal.d.a(r1)
            if (r8 != r10) goto L_0x00ed
            r1 = r10
        L_0x0040:
            if (r1 != r10) goto L_0x0044
            r8 = r3
            goto L_0x0045
        L_0x0044:
            r8 = r2
        L_0x0045:
            if (r8 != 0) goto L_0x008a
            kotlinx.coroutines.internal.t r8 = d2.f1.y(r1)
        L_0x004b:
            java.lang.Object r10 = r15.head
            kotlinx.coroutines.internal.t r10 = (kotlinx.coroutines.internal.t) r10
            long r11 = r10.f10736c
            long r13 = r8.f10736c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x0058
            goto L_0x007c
        L_0x0058:
            boolean r11 = r8.g()
            if (r11 != 0) goto L_0x0060
            r8 = r2
            goto L_0x007d
        L_0x0060:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f10791c
        L_0x0062:
            boolean r12 = r11.compareAndSet(r15, r10, r8)
            if (r12 == 0) goto L_0x006a
            r11 = r3
            goto L_0x0071
        L_0x006a:
            java.lang.Object r12 = r11.get(r15)
            if (r12 == r10) goto L_0x0062
            r11 = r2
        L_0x0071:
            if (r11 == 0) goto L_0x0080
            boolean r8 = r10.e()
            if (r8 == 0) goto L_0x007c
            r10.d()
        L_0x007c:
            r8 = r3
        L_0x007d:
            if (r8 == 0) goto L_0x0029
            goto L_0x008a
        L_0x0080:
            boolean r10 = r8.e()
            if (r10 == 0) goto L_0x004b
            r8.d()
            goto L_0x004b
        L_0x008a:
            kotlinx.coroutines.internal.t r0 = d2.f1.y(r1)
            kotlinx.coroutines.sync.i r0 = (kotlinx.coroutines.sync.i) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.d.f10707b
            r1.lazySet(r0, r9)
            long r8 = r0.f10736c
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x009c
            goto L_0x00ea
        L_0x009c:
            int r1 = kotlinx.coroutines.sync.h.f10804f
            long r6 = (long) r1
            long r4 = r4 % r6
            int r1 = (int) r4
            kotlinx.coroutines.internal.v r4 = kotlinx.coroutines.sync.h.f10800b
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.f10805e
            java.lang.Object r4 = r5.getAndSet(r1, r4)
            if (r4 != 0) goto L_0x00d4
            int r4 = kotlinx.coroutines.sync.h.f10799a
            r5 = r2
        L_0x00ae:
            if (r5 >= r4) goto L_0x00be
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r0.f10805e
            java.lang.Object r6 = r6.get(r1)
            kotlinx.coroutines.internal.v r7 = kotlinx.coroutines.sync.h.f10801c
            if (r6 != r7) goto L_0x00bb
            goto L_0x00e9
        L_0x00bb:
            int r5 = r5 + 1
            goto L_0x00ae
        L_0x00be:
            kotlinx.coroutines.internal.v r5 = kotlinx.coroutines.sync.h.f10800b
            kotlinx.coroutines.internal.v r6 = kotlinx.coroutines.sync.h.f10802d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f10805e
        L_0x00c4:
            boolean r4 = r0.compareAndSet(r1, r5, r6)
            if (r4 == 0) goto L_0x00cc
            r2 = r3
            goto L_0x00d2
        L_0x00cc:
            java.lang.Object r4 = r0.get(r1)
            if (r4 == r5) goto L_0x00c4
        L_0x00d2:
            r2 = r2 ^ r3
            goto L_0x00ea
        L_0x00d4:
            kotlinx.coroutines.internal.v r0 = kotlinx.coroutines.sync.h.f10803e
            if (r4 != r0) goto L_0x00d9
            goto L_0x00ea
        L_0x00d9:
            ag.k r4 = (ag.k) r4
            ff.m r0 = ff.m.f8717a
            kotlinx.coroutines.sync.g$a r1 = r15.f10797b
            kotlinx.coroutines.internal.v r0 = r4.a(r0, r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            r4.g()
        L_0x00e9:
            r2 = r3
        L_0x00ea:
            if (r2 == 0) goto L_0x0000
            return
        L_0x00ed:
            kotlinx.coroutines.internal.d r8 = (kotlinx.coroutines.internal.d) r8
            kotlinx.coroutines.internal.t r8 = (kotlinx.coroutines.internal.t) r8
            if (r8 == 0) goto L_0x00f6
            r1 = r8
            goto L_0x002a
        L_0x00f6:
            long r10 = r1.f10736c
            r12 = 1
            long r10 = r10 + r12
            r8 = r1
            kotlinx.coroutines.sync.i r8 = (kotlinx.coroutines.sync.i) r8
            kotlinx.coroutines.sync.i r12 = new kotlinx.coroutines.sync.i
            r12.<init>(r10, r8, r2)
        L_0x0103:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.internal.d.f10706a
            boolean r10 = r8.compareAndSet(r1, r9, r12)
            if (r10 == 0) goto L_0x010d
            r8 = r3
            goto L_0x0114
        L_0x010d:
            java.lang.Object r8 = r8.get(r1)
            if (r8 == 0) goto L_0x0103
            r8 = r2
        L_0x0114:
            if (r8 == 0) goto L_0x002a
            boolean r8 = r1.b()
            if (r8 == 0) goto L_0x011f
            r1.d()
        L_0x011f:
            r1 = r12
            goto L_0x002a
        L_0x0122:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The number of released permits cannot be greater than "
            r0.<init>(r1)
            int r1 = r15.f10796a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.g.a():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlinx.coroutines.sync.i} */
    /* JADX WARNING: type inference failed for: r8v12, types: [kotlinx.coroutines.internal.t] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0077, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e2 A[EDGE_INSN: B:86:0x00e2->B:64:0x00e2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(y3.b.c r16) {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f10795g
            int r1 = r1.getAndDecrement(r15)
            if (r1 <= 0) goto L_0x000c
            ff.m r1 = ff.m.f8717a
            return r1
        L_0x000c:
            jf.d r1 = e9.c.g(r16)
            ag.l r1 = cb.d.J(r1)
        L_0x0014:
            java.lang.Object r2 = r0.tail
            kotlinx.coroutines.sync.i r2 = (kotlinx.coroutines.sync.i) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f10794f
            long r3 = r3.getAndIncrement(r15)
            int r5 = kotlinx.coroutines.sync.h.f10804f
            long r5 = (long) r5
            long r5 = r3 / r5
        L_0x0023:
            r7 = r2
        L_0x0024:
            long r8 = r7.f10736c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            r9 = 0
            kotlinx.coroutines.internal.v r10 = b1.b.B
            if (r8 < 0) goto L_0x0033
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x003a
        L_0x0033:
            java.lang.Object r8 = kotlinx.coroutines.internal.d.a(r7)
            if (r8 != r10) goto L_0x00f3
            r7 = r10
        L_0x003a:
            if (r7 != r10) goto L_0x003e
            r8 = 1
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            if (r8 != 0) goto L_0x0084
            kotlinx.coroutines.internal.t r8 = d2.f1.y(r7)
        L_0x0045:
            java.lang.Object r10 = r0.tail
            kotlinx.coroutines.internal.t r10 = (kotlinx.coroutines.internal.t) r10
            long r13 = r10.f10736c
            long r11 = r8.f10736c
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0052
            goto L_0x0076
        L_0x0052:
            boolean r11 = r8.g()
            if (r11 != 0) goto L_0x005a
            r8 = 0
            goto L_0x0077
        L_0x005a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f10793e
        L_0x005c:
            boolean r12 = r11.compareAndSet(r15, r10, r8)
            if (r12 == 0) goto L_0x0064
            r11 = 1
            goto L_0x006b
        L_0x0064:
            java.lang.Object r12 = r11.get(r15)
            if (r12 == r10) goto L_0x005c
            r11 = 0
        L_0x006b:
            if (r11 == 0) goto L_0x007a
            boolean r8 = r10.e()
            if (r8 == 0) goto L_0x0076
            r10.d()
        L_0x0076:
            r8 = 1
        L_0x0077:
            if (r8 == 0) goto L_0x0023
            goto L_0x0084
        L_0x007a:
            boolean r10 = r8.e()
            if (r10 == 0) goto L_0x0045
            r8.d()
            goto L_0x0045
        L_0x0084:
            kotlinx.coroutines.internal.t r2 = d2.f1.y(r7)
            r10 = r2
            kotlinx.coroutines.sync.i r10 = (kotlinx.coroutines.sync.i) r10
            int r2 = kotlinx.coroutines.sync.h.f10804f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r11 = (int) r3
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r10.f10805e
        L_0x0092:
            boolean r2 = r12.compareAndSet(r11, r9, r1)
            if (r2 == 0) goto L_0x009a
            r2 = 1
            goto L_0x00a1
        L_0x009a:
            java.lang.Object r2 = r12.get(r11)
            if (r2 == 0) goto L_0x0092
            r2 = 0
        L_0x00a1:
            if (r2 == 0) goto L_0x00ac
            kotlinx.coroutines.sync.a r2 = new kotlinx.coroutines.sync.a
            r2.<init>(r10, r11)
            r1.v(r2)
            goto L_0x00cc
        L_0x00ac:
            kotlinx.coroutines.internal.v r2 = kotlinx.coroutines.sync.h.f10800b
            kotlinx.coroutines.internal.v r3 = kotlinx.coroutines.sync.h.f10801c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r10.f10805e
        L_0x00b2:
            boolean r5 = r4.compareAndSet(r11, r2, r3)
            if (r5 == 0) goto L_0x00ba
            r2 = 1
            goto L_0x00c1
        L_0x00ba:
            java.lang.Object r5 = r4.get(r11)
            if (r5 == r2) goto L_0x00b2
            r2 = 0
        L_0x00c1:
            if (r2 == 0) goto L_0x00ce
            ff.m r2 = ff.m.f8717a
            kotlinx.coroutines.sync.g$a r3 = r0.f10797b
            int r4 = r1.f474c
            r1.A(r2, r4, r3)
        L_0x00cc:
            r11 = 1
            goto L_0x00cf
        L_0x00ce:
            r11 = 0
        L_0x00cf:
            if (r11 != 0) goto L_0x00e2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f10795g
            int r2 = r2.getAndDecrement(r15)
            if (r2 <= 0) goto L_0x0014
            ff.m r2 = ff.m.f8717a
            kotlinx.coroutines.sync.g$a r3 = r0.f10797b
            int r4 = r1.f474c
            r1.A(r2, r4, r3)
        L_0x00e2:
            java.lang.Object r1 = r1.s()
            kf.a r2 = kf.a.f10464a
            if (r1 != r2) goto L_0x00eb
            goto L_0x00ed
        L_0x00eb:
            ff.m r1 = ff.m.f8717a
        L_0x00ed:
            if (r1 != r2) goto L_0x00f0
            return r1
        L_0x00f0:
            ff.m r1 = ff.m.f8717a
            return r1
        L_0x00f3:
            kotlinx.coroutines.internal.d r8 = (kotlinx.coroutines.internal.d) r8
            kotlinx.coroutines.internal.t r8 = (kotlinx.coroutines.internal.t) r8
            if (r8 == 0) goto L_0x00fc
            r7 = r8
            goto L_0x0024
        L_0x00fc:
            long r10 = r7.f10736c
            r12 = 1
            long r10 = r10 + r12
            r8 = r7
            kotlinx.coroutines.sync.i r8 = (kotlinx.coroutines.sync.i) r8
            kotlinx.coroutines.sync.i r12 = new kotlinx.coroutines.sync.i
            r13 = 0
            r12.<init>(r10, r8, r13)
        L_0x010a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.internal.d.f10706a
            boolean r10 = r8.compareAndSet(r7, r9, r12)
            if (r10 == 0) goto L_0x0114
            r11 = 1
            goto L_0x011b
        L_0x0114:
            java.lang.Object r8 = r8.get(r7)
            if (r8 == 0) goto L_0x010a
            r11 = r13
        L_0x011b:
            if (r11 == 0) goto L_0x0024
            boolean r8 = r7.b()
            if (r8 == 0) goto L_0x0126
            r7.d()
        L_0x0126:
            r7 = r12
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.g.b(y3.b$c):java.lang.Object");
    }
}

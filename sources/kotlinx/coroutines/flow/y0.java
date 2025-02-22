package kotlinx.coroutines.flow;

import ag.n1;
import dg.b;
import dg.i;
import dg.o;
import ff.m;
import jf.d;
import jf.f;
import lf.c;
import lf.e;

public final class y0<T> extends b<z0> implements k0<T>, f, o<T> {
    private volatile /* synthetic */ Object _state;

    /* renamed from: e  reason: collision with root package name */
    public int f10689e;

    @e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
    public static final class a extends c {
        public /* synthetic */ Object B;
        public final /* synthetic */ y0<T> C;
        public int D;

        /* renamed from: a  reason: collision with root package name */
        public y0 f10690a;

        /* renamed from: b  reason: collision with root package name */
        public g f10691b;

        /* renamed from: c  reason: collision with root package name */
        public z0 f10692c;

        /* renamed from: d  reason: collision with root package name */
        public n1 f10693d;

        /* renamed from: e  reason: collision with root package name */
        public Object f10694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y0<T> y0Var, d<? super a> dVar) {
            super(dVar);
            this.C = y0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return this.C.a((g) null, this);
        }
    }

    public y0(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [jf.f$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6 A[Catch:{ all -> 0x0061 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r19, jf.d<?> r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            boolean r3 = r2 instanceof kotlinx.coroutines.flow.y0.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kotlinx.coroutines.flow.y0$a r3 = (kotlinx.coroutines.flow.y0.a) r3
            int r4 = r3.D
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.D = r4
            goto L_0x001e
        L_0x0019:
            kotlinx.coroutines.flow.y0$a r3 = new kotlinx.coroutines.flow.y0$a
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.B
            kf.a r4 = kf.a.f10464a
            int r5 = r3.D
            r6 = 1
            r7 = 2
            r8 = 3
            r9 = 0
            if (r5 == 0) goto L_0x0064
            if (r5 == r6) goto L_0x0057
            if (r5 == r7) goto L_0x0047
            if (r5 != r8) goto L_0x003f
            java.lang.Object r0 = r3.f10694e
            ag.n1 r5 = r3.f10693d
            kotlinx.coroutines.flow.z0 r10 = r3.f10692c
            kotlinx.coroutines.flow.g r11 = r3.f10691b
            kotlinx.coroutines.flow.y0 r12 = r3.f10690a
            cb.b.J(r2)     // Catch:{ all -> 0x0061 }
            r2 = r4
            goto L_0x0095
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0047:
            java.lang.Object r0 = r3.f10694e
            ag.n1 r5 = r3.f10693d
            kotlinx.coroutines.flow.z0 r10 = r3.f10692c
            kotlinx.coroutines.flow.g r11 = r3.f10691b
            kotlinx.coroutines.flow.y0 r12 = r3.f10690a
            cb.b.J(r2)     // Catch:{ all -> 0x0061 }
            r2 = r4
            goto L_0x00c8
        L_0x0057:
            kotlinx.coroutines.flow.z0 r10 = r3.f10692c
            kotlinx.coroutines.flow.g r0 = r3.f10691b
            kotlinx.coroutines.flow.y0 r12 = r3.f10690a
            cb.b.J(r2)     // Catch:{ all -> 0x0061 }
            goto L_0x0085
        L_0x0061:
            r0 = move-exception
            goto L_0x011e
        L_0x0064:
            cb.b.J(r2)
            dg.c r2 = r18.d()
            kotlinx.coroutines.flow.z0 r2 = (kotlinx.coroutines.flow.z0) r2
            boolean r5 = r0 instanceof kotlinx.coroutines.flow.a1     // Catch:{ all -> 0x0120 }
            if (r5 == 0) goto L_0x0083
            r5 = r0
            kotlinx.coroutines.flow.a1 r5 = (kotlinx.coroutines.flow.a1) r5     // Catch:{ all -> 0x0120 }
            r3.f10690a = r1     // Catch:{ all -> 0x0120 }
            r3.f10691b = r0     // Catch:{ all -> 0x0120 }
            r3.f10692c = r2     // Catch:{ all -> 0x0120 }
            r3.D = r6     // Catch:{ all -> 0x0120 }
            java.lang.Object r5 = r5.a(r3)     // Catch:{ all -> 0x0120 }
            if (r5 != r4) goto L_0x0083
            return r4
        L_0x0083:
            r12 = r1
            r10 = r2
        L_0x0085:
            jf.f r2 = r3.getContext()     // Catch:{ all -> 0x0061 }
            ag.n1$b r5 = ag.n1.b.f447a     // Catch:{ all -> 0x0061 }
            jf.f$b r2 = r2.d(r5)     // Catch:{ all -> 0x0061 }
            r5 = r2
            ag.n1 r5 = (ag.n1) r5     // Catch:{ all -> 0x0061 }
            r11 = r0
            r2 = r4
            r0 = r9
        L_0x0095:
            java.lang.Object r13 = r12._state     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x00a5
            boolean r14 = r5.c()     // Catch:{ all -> 0x0061 }
            if (r14 == 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            java.util.concurrent.CancellationException r0 = r5.F()     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x00a5:
            if (r0 == 0) goto L_0x00ad
            boolean r14 = sf.j.a(r0, r13)     // Catch:{ all -> 0x0061 }
            if (r14 != 0) goto L_0x00c8
        L_0x00ad:
            kotlinx.coroutines.internal.v r0 = m9.b.f11323d     // Catch:{ all -> 0x0061 }
            if (r13 != r0) goto L_0x00b3
            r0 = r9
            goto L_0x00b4
        L_0x00b3:
            r0 = r13
        L_0x00b4:
            r3.f10690a = r12     // Catch:{ all -> 0x0061 }
            r3.f10691b = r11     // Catch:{ all -> 0x0061 }
            r3.f10692c = r10     // Catch:{ all -> 0x0061 }
            r3.f10693d = r5     // Catch:{ all -> 0x0061 }
            r3.f10694e = r13     // Catch:{ all -> 0x0061 }
            r3.D = r7     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r11.m(r0, r3)     // Catch:{ all -> 0x0061 }
            if (r0 != r4) goto L_0x00c7
            return r4
        L_0x00c7:
            r0 = r13
        L_0x00c8:
            r10.getClass()     // Catch:{ all -> 0x0061 }
            kotlinx.coroutines.internal.v r13 = androidx.fragment.app.z0.E     // Catch:{ all -> 0x0061 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.flow.z0.f10696a     // Catch:{ all -> 0x0061 }
            java.lang.Object r14 = r14.getAndSet(r10, r13)     // Catch:{ all -> 0x0061 }
            sf.j.c(r14)     // Catch:{ all -> 0x0061 }
            kotlinx.coroutines.internal.v r15 = androidx.fragment.app.z0.F     // Catch:{ all -> 0x0061 }
            r16 = 0
            if (r14 != r15) goto L_0x00de
            r14 = r6
            goto L_0x00e0
        L_0x00de:
            r14 = r16
        L_0x00e0:
            if (r14 != 0) goto L_0x0095
            r3.f10690a = r12     // Catch:{ all -> 0x0061 }
            r3.f10691b = r11     // Catch:{ all -> 0x0061 }
            r3.f10692c = r10     // Catch:{ all -> 0x0061 }
            r3.f10693d = r5     // Catch:{ all -> 0x0061 }
            r3.f10694e = r0     // Catch:{ all -> 0x0061 }
            r3.D = r8     // Catch:{ all -> 0x0061 }
            ag.l r14 = new ag.l     // Catch:{ all -> 0x0061 }
            jf.d r15 = e9.c.g(r3)     // Catch:{ all -> 0x0061 }
            r14.<init>(r6, r15)     // Catch:{ all -> 0x0061 }
            r14.t()     // Catch:{ all -> 0x0061 }
        L_0x00fa:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = kotlinx.coroutines.flow.z0.f10696a     // Catch:{ all -> 0x0061 }
            boolean r17 = r15.compareAndSet(r10, r13, r14)     // Catch:{ all -> 0x0061 }
            if (r17 == 0) goto L_0x0105
            r16 = r6
            goto L_0x010b
        L_0x0105:
            java.lang.Object r15 = r15.get(r10)     // Catch:{ all -> 0x0061 }
            if (r15 == r13) goto L_0x00fa
        L_0x010b:
            if (r16 != 0) goto L_0x0112
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0061 }
            r14.resumeWith(r13)     // Catch:{ all -> 0x0061 }
        L_0x0112:
            java.lang.Object r13 = r14.s()     // Catch:{ all -> 0x0061 }
            if (r13 != r2) goto L_0x0119
            goto L_0x011b
        L_0x0119:
            ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0061 }
        L_0x011b:
            if (r13 != r4) goto L_0x0095
            return r4
        L_0x011e:
            r2 = r10
            goto L_0x0122
        L_0x0120:
            r0 = move-exception
            r12 = r1
        L_0x0122:
            r12.g(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }

    public final f<T> b(f fVar, int i8, cg.e eVar) {
        return ((((i8 >= 0 && i8 < 2) || i8 == -2) && eVar == cg.e.f4021b) || ((i8 == 0 || i8 == -3) && eVar == cg.e.f4020a)) ? this : new i(i8, fVar, eVar, this);
    }

    public final void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public final dg.c e() {
        return new z0();
    }

    public final dg.c[] f() {
        return new z0[2];
    }

    public final T getValue() {
        T t2 = m9.b.f11323d;
        T t10 = this._state;
        if (t10 == t2) {
            return null;
        }
        return t10;
    }

    public final boolean h(T t2) {
        setValue(t2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r12 = (kotlinx.coroutines.flow.z0[]) r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r12 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r2 = r12.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002d, code lost:
        if (r3 >= r2) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        r4 = r12[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r5 = r4._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        r6 = androidx.fragment.app.z0.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r5 != r6) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        r7 = androidx.fragment.app.z0.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        if (r5 != r7) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r8 = kotlinx.coroutines.flow.z0.f10696a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        if (r8.compareAndSet(r4, r5, r6) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004f, code lost:
        if (r8.get(r4) == r5) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0052, code lost:
        if (r5 == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r6 = kotlinx.coroutines.flow.z0.f10696a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005b, code lost:
        if (r6.compareAndSet(r4, r5, r7) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        if (r6.get(r4) == r5) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0065, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0066, code lost:
        if (r6 == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0068, code lost:
        ((ag.l) r5).resumeWith(ff.m.f8717a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0072, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r12 = r10.f10689e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0075, code lost:
        if (r12 != r11) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0077, code lost:
        r10.f10689e = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x007a, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r11 = r10.f7526a;
        r2 = ff.m.f8717a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0080, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0081, code lost:
        r9 = r12;
        r12 = r11;
        r11 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.Object r0 = r10._state     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r11 == 0) goto L_0x000e
            boolean r11 = sf.j.a(r0, r11)     // Catch:{ all -> 0x008e }
            if (r11 != 0) goto L_0x000e
            monitor-exit(r10)
            return r1
        L_0x000e:
            boolean r11 = sf.j.a(r0, r12)     // Catch:{ all -> 0x008e }
            r0 = 1
            if (r11 == 0) goto L_0x0017
            monitor-exit(r10)
            return r0
        L_0x0017:
            r10._state = r12     // Catch:{ all -> 0x008e }
            int r11 = r10.f10689e     // Catch:{ all -> 0x008e }
            r12 = r11 & 1
            if (r12 != 0) goto L_0x0088
            int r11 = r11 + r0
            r10.f10689e = r11     // Catch:{ all -> 0x008e }
            S[] r12 = r10.f7526a     // Catch:{ all -> 0x008e }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x008e }
            monitor-exit(r10)
        L_0x0027:
            kotlinx.coroutines.flow.z0[] r12 = (kotlinx.coroutines.flow.z0[]) r12
            if (r12 == 0) goto L_0x0072
            int r2 = r12.length
            r3 = r1
        L_0x002d:
            if (r3 >= r2) goto L_0x0072
            r4 = r12[r3]
            if (r4 == 0) goto L_0x006f
        L_0x0033:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L_0x0038
            goto L_0x006f
        L_0x0038:
            kotlinx.coroutines.internal.v r6 = androidx.fragment.app.z0.F
            if (r5 != r6) goto L_0x003d
            goto L_0x006f
        L_0x003d:
            kotlinx.coroutines.internal.v r7 = androidx.fragment.app.z0.E
            if (r5 != r7) goto L_0x0055
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.flow.z0.f10696a
        L_0x0043:
            boolean r7 = r8.compareAndSet(r4, r5, r6)
            if (r7 == 0) goto L_0x004b
            r5 = r0
            goto L_0x0052
        L_0x004b:
            java.lang.Object r7 = r8.get(r4)
            if (r7 == r5) goto L_0x0043
            r5 = r1
        L_0x0052:
            if (r5 == 0) goto L_0x0033
            goto L_0x006f
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.flow.z0.f10696a
        L_0x0057:
            boolean r8 = r6.compareAndSet(r4, r5, r7)
            if (r8 == 0) goto L_0x005f
            r6 = r0
            goto L_0x0066
        L_0x005f:
            java.lang.Object r8 = r6.get(r4)
            if (r8 == r5) goto L_0x0057
            r6 = r1
        L_0x0066:
            if (r6 == 0) goto L_0x0033
            ag.l r5 = (ag.l) r5
            ff.m r4 = ff.m.f8717a
            r5.resumeWith(r4)
        L_0x006f:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0072:
            monitor-enter(r10)
            int r12 = r10.f10689e     // Catch:{ all -> 0x0085 }
            if (r12 != r11) goto L_0x007c
            int r11 = r11 + r0
            r10.f10689e = r11     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)
            return r0
        L_0x007c:
            S[] r11 = r10.f7526a     // Catch:{ all -> 0x0085 }
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)
            r9 = r12
            r12 = r11
            r11 = r9
            goto L_0x0027
        L_0x0085:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x0088:
            int r11 = r11 + 2
            r10.f10689e = r11     // Catch:{ all -> 0x008e }
            monitor-exit(r10)
            return r0
        L_0x008e:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.y0.i(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object m(T t2, d<? super m> dVar) {
        setValue(t2);
        return m.f8717a;
    }

    public final void setValue(T t2) {
        if (t2 == null) {
            t2 = m9.b.f11323d;
        }
        i((Object) null, t2);
    }
}

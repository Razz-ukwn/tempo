package f3;

import ag.g0;
import ag.n1;
import ag.q1;
import ag.u;
import ff.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;
import rf.r;
import sf.k;

@e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
public final class e1 extends i implements p<l2<y0<Object>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8139a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8140b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f1<Object, Object> f8141c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t0 f8142d;

    public static final class a implements g<y0<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l2 f8143a;

        public a(l2 l2Var) {
            this.f8143a = l2Var;
        }

        public final Object m(y0<Object> y0Var, d<? super m> dVar) {
            Object t2 = this.f8143a.t(y0Var, dVar);
            return t2 == kf.a.f10464a ? t2 : m.f8717a;
        }
    }

    @e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {159}, m = "invokeSuspend")
    public static final class b extends i implements p<l2<y0<Object>>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8144a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8145b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f8146c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f f8147d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ t0 f8148e;

        @e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {222}, m = "invokeSuspend")
        public static final class a extends i implements r<n0, y0<Object>, s, d<? super m>, Object> {
            public final /* synthetic */ t0 B;

            /* renamed from: a  reason: collision with root package name */
            public int f8149a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f8150b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f8151c;

            /* renamed from: d  reason: collision with root package name */
            public /* synthetic */ s f8152d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ l2<y0<Object>> f8153e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(l2 l2Var, d dVar, t0 t0Var) {
                super(4, dVar);
                this.B = t0Var;
                this.f8153e = l2Var;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: f3.y0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: f3.y0$c} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: f3.y0$c} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: f3.y0$b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: f3.y0$b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: f3.y0$b} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: f3.y0$b} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    kf.a r0 = kf.a.f10464a
                    int r1 = r11.f8149a
                    r2 = 1
                    if (r1 == 0) goto L_0x0016
                    if (r1 != r2) goto L_0x000e
                    cb.b.J(r12)
                    goto L_0x0092
                L_0x000e:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x0016:
                    cb.b.J(r12)
                    java.lang.Object r12 = r11.f8150b
                    java.lang.Object r1 = r11.f8151c
                    f3.s r3 = r11.f8152d
                    f3.y0 r1 = (f3.y0) r1
                    r10 = r12
                    f3.n0 r10 = (f3.n0) r10
                    f3.s r12 = f3.s.f8468b
                    f3.t0 r4 = r11.B
                    if (r3 == r12) goto L_0x007e
                    boolean r12 = r1 instanceof f3.y0.b
                    if (r12 == 0) goto L_0x0055
                    f3.y0$b r1 = (f3.y0.b) r1
                    f3.n0 r12 = r1.f8554e
                    r4.b(r12)
                    int r7 = r1.f8552c
                    int r8 = r1.f8553d
                    java.lang.String r12 = "loadType"
                    f3.o0 r5 = r1.f8550a
                    sf.j.f(r5, r12)
                    java.lang.String r12 = "pages"
                    java.util.List<f3.s2<T>> r6 = r1.f8551b
                    sf.j.f(r6, r12)
                    java.lang.String r12 = "sourceLoadStates"
                    f3.n0 r9 = r1.f8554e
                    sf.j.f(r9, r12)
                    f3.y0$b r1 = new f3.y0$b
                    r4 = r1
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    goto L_0x0087
                L_0x0055:
                    boolean r12 = r1 instanceof f3.y0.a
                    if (r12 == 0) goto L_0x0064
                    r12 = r1
                    f3.y0$a r12 = (f3.y0.a) r12
                    f3.o0 r12 = r12.f8545a
                    f3.m0$c r3 = f3.m0.c.f8367c
                    r4.c(r12, r3)
                    goto L_0x0087
                L_0x0064:
                    boolean r12 = r1 instanceof f3.y0.c
                    if (r12 == 0) goto L_0x0078
                    f3.y0$c r1 = (f3.y0.c) r1
                    f3.n0 r12 = r1.f8556a
                    r4.b(r12)
                    f3.y0$c r12 = new f3.y0$c
                    f3.n0 r1 = r1.f8556a
                    r12.<init>(r1, r10)
                    r1 = r12
                    goto L_0x0087
                L_0x0078:
                    ff.e r12 = new ff.e
                    r12.<init>()
                    throw r12
                L_0x007e:
                    f3.y0$c r1 = new f3.y0$c
                    f3.n0 r12 = r4.d()
                    r1.<init>(r12, r10)
                L_0x0087:
                    r11.f8149a = r2
                    f3.l2<f3.y0<java.lang.Object>> r12 = r11.f8153e
                    java.lang.Object r12 = r12.t(r1, r11)
                    if (r12 != r0) goto L_0x0092
                    return r0
                L_0x0092:
                    ff.m r12 = ff.m.f8717a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: f3.e1.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
                a aVar = new a(this.f8153e, (d) obj4, this.B);
                aVar.f8150b = obj;
                aVar.f8151c = obj2;
                aVar.f8152d = (s) obj3;
                return aVar.invokeSuspend(m.f8717a);
            }
        }

        @e(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
        /* renamed from: f3.e1$b$b  reason: collision with other inner class name */
        public static final class C0136b extends i implements p<g0, d<? super m>, Object> {
            public final /* synthetic */ int B;

            /* renamed from: a  reason: collision with root package name */
            public int f8154a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ l2<y0<Object>> f8155b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ f f8156c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f8157d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ u2 f8158e;

            /* renamed from: f3.e1$b$b$a */
            public static final class a implements g<Object> {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ u2 f8159a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ int f8160b;

                @e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1", f = "PageFetcher.kt", l = {135, 138}, m = "emit")
                /* renamed from: f3.e1$b$b$a$a  reason: collision with other inner class name */
                public static final class C0137a extends lf.c {

                    /* renamed from: a  reason: collision with root package name */
                    public /* synthetic */ Object f8161a;

                    /* renamed from: b  reason: collision with root package name */
                    public int f8162b;

                    /* renamed from: c  reason: collision with root package name */
                    public final /* synthetic */ a f8163c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0137a(a aVar, d dVar) {
                        super(dVar);
                        this.f8163c = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f8161a = obj;
                        this.f8162b |= Integer.MIN_VALUE;
                        return this.f8163c.m((Object) null, this);
                    }
                }

                public a(u2 u2Var, int i8) {
                    this.f8159a = u2Var;
                    this.f8160b = i8;
                }

                /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object m(java.lang.Object r6, jf.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof f3.e1.b.C0136b.a.C0137a
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        f3.e1$b$b$a$a r0 = (f3.e1.b.C0136b.a.C0137a) r0
                        int r1 = r0.f8162b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8162b = r1
                        goto L_0x0018
                    L_0x0013:
                        f3.e1$b$b$a$a r0 = new f3.e1$b$b$a$a
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.f8161a
                        kf.a r1 = kf.a.f10464a
                        int r2 = r0.f8162b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L_0x0036
                        if (r2 == r4) goto L_0x0032
                        if (r2 != r3) goto L_0x002a
                        cb.b.J(r7)
                        goto L_0x004f
                    L_0x002a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x0032:
                        cb.b.J(r7)
                        goto L_0x0046
                    L_0x0036:
                        cb.b.J(r7)
                        r0.f8162b = r4
                        f3.u2 r7 = r5.f8159a
                        int r2 = r5.f8160b
                        java.lang.Object r6 = r7.a(r2, r6, r0)
                        if (r6 != r1) goto L_0x0046
                        return r1
                    L_0x0046:
                        r0.f8162b = r3
                        java.lang.Object r6 = e9.c.q(r0)
                        if (r6 != r1) goto L_0x004f
                        return r1
                    L_0x004f:
                        ff.m r6 = ff.m.f8717a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: f3.e1.b.C0136b.a.m(java.lang.Object, jf.d):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0136b(f fVar, AtomicInteger atomicInteger, l2 l2Var, u2 u2Var, int i8, d dVar) {
                super(2, dVar);
                this.f8156c = fVar;
                this.f8157d = atomicInteger;
                this.f8158e = u2Var;
                this.B = i8;
                this.f8155b = l2Var;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0136b(this.f8156c, this.f8157d, this.f8155b, this.f8158e, this.B, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0136b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            public final Object invokeSuspend(Object obj) {
                kf.a aVar = kf.a.f10464a;
                int i8 = this.f8154a;
                l2<y0<Object>> l2Var = this.f8155b;
                AtomicInteger atomicInteger = this.f8157d;
                if (i8 == 0) {
                    cb.b.J(obj);
                    f fVar = this.f8156c;
                    a aVar2 = new a(this.f8158e, this.B);
                    this.f8154a = 1;
                    if (fVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i8 == 1) {
                    try {
                        cb.b.J(obj);
                    } catch (Throwable th) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            l2Var.k((Throwable) null);
                        }
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    l2Var.k((Throwable) null);
                }
                return m.f8717a;
            }
        }

        public static final class c extends k implements rf.a<m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ u f8164a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(q1 q1Var) {
                super(0);
                this.f8164a = q1Var;
            }

            public final Object d() {
                this.f8164a.e((CancellationException) null);
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, f fVar2, d dVar, t0 t0Var) {
            super(2, dVar);
            this.f8146c = fVar;
            this.f8147d = fVar2;
            this.f8148e = t0Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f8146c, this.f8147d, dVar, this.f8148e);
            bVar.f8145b = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((l2) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8144a;
            if (i8 == 0) {
                cb.b.J(obj);
                l2 l2Var = (l2) this.f8145b;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                u2 u2Var = new u2(new a(l2Var, (d) null, this.f8148e));
                q1 q1Var = new q1((n1) null);
                int i10 = 0;
                f[] fVarArr = {this.f8146c, this.f8147d};
                int i11 = 0;
                int i12 = 0;
                while (i11 < 2) {
                    C0136b bVar = r4;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    int i13 = i10;
                    C0136b bVar2 = new C0136b(fVarArr[i11], atomicInteger, l2Var, u2Var, i12, (d) null);
                    cb.b.D(l2Var, q1Var, i13, bVar, 2);
                    i11++;
                    i10 = i13;
                    i12++;
                    atomicInteger = atomicInteger2;
                }
                c cVar = new c(q1Var);
                this.f8144a = 1;
                if (l2Var.m0(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                cb.b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(i2<Object, Object> i2Var, f1<Object, Object> f1Var, t0 t0Var, d<? super e1> dVar) {
        super(2, dVar);
        this.f8141c = f1Var;
        this.f8142d = t0Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e1 e1Var = new e1((i2<Object, Object>) null, this.f8141c, this.f8142d, dVar);
        e1Var.f8140b = obj;
        return e1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((l2) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        int i8 = this.f8139a;
        if (i8 == 0) {
            cb.b.J(obj);
            l2 l2Var = (l2) this.f8140b;
            throw null;
        } else if (i8 == 1) {
            cb.b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

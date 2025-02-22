package dg;

import ag.g0;
import ag.n1;
import cb.b;
import d2.f1;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import rf.q;
import sf.v;

public final class j<T, R> extends h<T, R> {

    /* renamed from: e  reason: collision with root package name */
    public final q<g<? super R>, T, d<? super m>, Object> f7544e;

    @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f7545a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f7546b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j<T, R> f7547c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ g<R> f7548d;

        /* renamed from: dg.j$a$a  reason: collision with other inner class name */
        public static final class C0122a<T> implements g {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ v<n1> f7549a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g0 f7550b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ j<T, R> f7551c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ g<R> f7552d;

            @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: dg.j$a$a$a  reason: collision with other inner class name */
            public static final class C0123a extends i implements p<g0, d<? super m>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public int f7553a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ j<T, R> f7554b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ g<R> f7555c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ T f7556d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0123a(j<T, R> jVar, g<? super R> gVar, T t2, d<? super C0123a> dVar) {
                    super(2, dVar);
                    this.f7554b = jVar;
                    this.f7555c = gVar;
                    this.f7556d = t2;
                }

                public final d<m> create(Object obj, d<?> dVar) {
                    return new C0123a(this.f7554b, this.f7555c, this.f7556d, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0123a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
                }

                public final Object invokeSuspend(Object obj) {
                    kf.a aVar = kf.a.f10464a;
                    int i8 = this.f7553a;
                    if (i8 == 0) {
                        cb.b.J(obj);
                        q<g<? super R>, T, d<? super m>, Object> qVar = this.f7554b.f7544e;
                        this.f7553a = 1;
                        if (qVar.e(this.f7555c, this.f7556d, this) == aVar) {
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

            @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: dg.j$a$a$b */
            public static final class b extends c {
                public int B;

                /* renamed from: a  reason: collision with root package name */
                public C0122a f7557a;

                /* renamed from: b  reason: collision with root package name */
                public Object f7558b;

                /* renamed from: c  reason: collision with root package name */
                public n1 f7559c;

                /* renamed from: d  reason: collision with root package name */
                public /* synthetic */ Object f7560d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ C0122a<T> f7561e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(C0122a<? super T> aVar, d<? super b> dVar) {
                    super(dVar);
                    this.f7561e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f7560d = obj;
                    this.B |= Integer.MIN_VALUE;
                    return this.f7561e.m(null, this);
                }
            }

            public C0122a(v<n1> vVar, g0 g0Var, j<T, R> jVar, g<? super R> gVar) {
                this.f7549a = vVar;
                this.f7550b = g0Var;
                this.f7551c = jVar;
                this.f7552d = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(T r7, jf.d<? super ff.m> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof dg.j.a.C0122a.b
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    dg.j$a$a$b r0 = (dg.j.a.C0122a.b) r0
                    int r1 = r0.B
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.B = r1
                    goto L_0x0018
                L_0x0013:
                    dg.j$a$a$b r0 = new dg.j$a$a$b
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f7560d
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.B
                    r3 = 1
                    if (r2 == 0) goto L_0x0033
                    if (r2 != r3) goto L_0x002b
                    java.lang.Object r7 = r0.f7558b
                    dg.j$a$a r0 = r0.f7557a
                    cb.b.J(r8)
                    goto L_0x0056
                L_0x002b:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0033:
                    cb.b.J(r8)
                    sf.v<ag.n1> r8 = r6.f7549a
                    T r8 = r8.f14957a
                    ag.n1 r8 = (ag.n1) r8
                    if (r8 == 0) goto L_0x0055
                    dg.k r2 = new dg.k
                    r2.<init>()
                    r8.e(r2)
                    r0.f7557a = r6
                    r0.f7558b = r7
                    r0.f7559c = r8
                    r0.B = r3
                    java.lang.Object r8 = r8.e0(r0)
                    if (r8 != r1) goto L_0x0055
                    return r1
                L_0x0055:
                    r0 = r6
                L_0x0056:
                    sf.v<ag.n1> r8 = r0.f7549a
                    dg.j$a$a$a r1 = new dg.j$a$a$a
                    kotlinx.coroutines.flow.g<R> r2 = r0.f7552d
                    dg.j<T, R> r4 = r0.f7551c
                    r5 = 0
                    r1.<init>(r4, r2, r7, r5)
                    ag.g0 r7 = r0.f7550b
                    r0 = 4
                    ag.f2 r7 = cb.b.D(r7, r5, r0, r1, r3)
                    r8.f14957a = r7
                    ff.m r7 = ff.m.f8717a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: dg.j.a.C0122a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j<T, R> jVar, g<? super R> gVar, d<? super a> dVar) {
            super(2, dVar);
            this.f7547c = jVar;
            this.f7548d = gVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f7547c, this.f7548d, dVar);
            aVar.f7546b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f7545a;
            if (i8 == 0) {
                b.J(obj);
                v vVar = new v();
                j<T, R> jVar = this.f7547c;
                f<S> fVar = jVar.f7543d;
                C0122a aVar2 = new C0122a(vVar, (g0) this.f7546b, jVar, this.f7548d);
                this.f7545a = 1;
                if (fVar.a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                b.J(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8717a;
        }
    }

    public j(q<? super g<? super R>, ? super T, ? super d<? super m>, ? extends Object> qVar, f<? extends T> fVar, jf.f fVar2, int i8, cg.e eVar) {
        super(i8, fVar2, eVar, fVar);
        this.f7544e = qVar;
    }

    public final f<R> f(jf.f fVar, int i8, cg.e eVar) {
        return new j(this.f7544e, this.f7543d, fVar, i8, eVar);
    }

    public final Object k(g<? super R> gVar, d<? super m> dVar) {
        Object v3 = f1.v(new a(this, gVar, (d<? super a>) null), dVar);
        return v3 == kf.a.f10464a ? v3 : m.f8717a;
    }
}

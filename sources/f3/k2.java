package f3;

import ag.g0;
import cb.b;
import cg.f;
import cg.h;
import d2.f1;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.n0;
import lf.e;
import lf.i;
import rf.p;

public final class k2 {

    @e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends i implements p<g<? super T>, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8306a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8307b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p<l2<T>, d<? super m>, Object> f8308c;

        @e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {64, 65}, m = "invokeSuspend")
        /* renamed from: f3.k2$a$a  reason: collision with other inner class name */
        public static final class C0143a extends i implements p<g0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public h f8309a;

            /* renamed from: b  reason: collision with root package name */
            public int f8310b;

            /* renamed from: c  reason: collision with root package name */
            public /* synthetic */ Object f8311c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ g<T> f8312d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ p<l2<T>, d<? super m>, Object> f8313e;

            @e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {52}, m = "invokeSuspend")
            /* renamed from: f3.k2$a$a$a  reason: collision with other inner class name */
            public static final class C0144a extends i implements p<g0, d<? super m>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public int f8314a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ f<T> f8315b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ p<l2<T>, d<? super m>, Object> f8316c;

                @e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {57}, m = "invokeSuspend")
                /* renamed from: f3.k2$a$a$a$a  reason: collision with other inner class name */
                public static final class C0145a extends i implements p<g0, d<? super m>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    public int f8317a;

                    /* renamed from: b  reason: collision with root package name */
                    public /* synthetic */ Object f8318b;

                    /* renamed from: c  reason: collision with root package name */
                    public final /* synthetic */ f<T> f8319c;

                    /* renamed from: d  reason: collision with root package name */
                    public final /* synthetic */ p<l2<T>, d<? super m>, Object> f8320d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0145a(f<T> fVar, p<? super l2<T>, ? super d<? super m>, ? extends Object> pVar, d<? super C0145a> dVar) {
                        super(2, dVar);
                        this.f8319c = fVar;
                        this.f8320d = pVar;
                    }

                    public final d<m> create(Object obj, d<?> dVar) {
                        C0145a aVar = new C0145a(this.f8319c, this.f8320d, dVar);
                        aVar.f8318b = obj;
                        return aVar;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        return ((C0145a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        kf.a aVar = kf.a.f10464a;
                        int i8 = this.f8317a;
                        if (i8 == 0) {
                            b.J(obj);
                            o2 o2Var = new o2((g0) this.f8318b, this.f8319c);
                            this.f8317a = 1;
                            if (this.f8320d.invoke(o2Var, this) == aVar) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0144a(f<T> fVar, p<? super l2<T>, ? super d<? super m>, ? extends Object> pVar, d<? super C0144a> dVar) {
                    super(2, dVar);
                    this.f8315b = fVar;
                    this.f8316c = pVar;
                }

                public final d<m> create(Object obj, d<?> dVar) {
                    return new C0144a(this.f8315b, this.f8316c, dVar);
                }

                public final Object invoke(Object obj, Object obj2) {
                    return ((C0144a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
                }

                public final Object invokeSuspend(Object obj) {
                    kf.a aVar = kf.a.f10464a;
                    int i8 = this.f8314a;
                    f<T> fVar = this.f8315b;
                    if (i8 == 0) {
                        b.J(obj);
                        C0145a aVar2 = new C0145a(fVar, this.f8316c, (d<? super C0145a>) null);
                        this.f8314a = 1;
                        if (f1.v(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else if (i8 == 1) {
                        try {
                            b.J(obj);
                        } catch (Throwable th) {
                            fVar.k(th);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar.k((Throwable) null);
                    return m.f8717a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0143a(g<? super T> gVar, p<? super l2<T>, ? super d<? super m>, ? extends Object> pVar, d<? super C0143a> dVar) {
                super(2, dVar);
                this.f8312d = gVar;
                this.f8313e = pVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                C0143a aVar = new C0143a(this.f8312d, this.f8313e, dVar);
                aVar.f8311c = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0143a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    kf.a r0 = kf.a.f10464a
                    int r1 = r9.f8310b
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x002d
                    if (r1 == r3) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    cg.h r1 = r9.f8309a
                    java.lang.Object r5 = r9.f8311c
                    ag.n1 r5 = (ag.n1) r5
                    cb.b.J(r10)
                    goto L_0x004c
                L_0x0017:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L_0x001f:
                    cg.h r1 = r9.f8309a
                    java.lang.Object r5 = r9.f8311c
                    ag.n1 r5 = (ag.n1) r5
                    cb.b.J(r10)
                    r6 = r5
                    r5 = r1
                    r1 = r0
                    r0 = r9
                    goto L_0x0060
                L_0x002d:
                    cb.b.J(r10)
                    java.lang.Object r10 = r9.f8311c
                    ag.g0 r10 = (ag.g0) r10
                    r1 = 6
                    r5 = 0
                    cg.a r1 = cb.d.d(r5, r4, r1)
                    f3.k2$a$a$a r6 = new f3.k2$a$a$a
                    rf.p<f3.l2<T>, jf.d<? super ff.m>, java.lang.Object> r7 = r9.f8313e
                    r6.<init>(r1, r7, r4)
                    r7 = 3
                    ag.f2 r5 = cb.b.D(r10, r4, r5, r6, r7)
                    cg.a$a r10 = new cg.a$a
                    r10.<init>(r1)
                    r1 = r10
                L_0x004c:
                    r10 = r9
                L_0x004d:
                    r10.f8311c = r5
                    r10.f8309a = r1
                    r10.f8310b = r3
                    java.lang.Object r6 = r1.a(r10)
                    if (r6 != r0) goto L_0x005a
                    return r0
                L_0x005a:
                    r8 = r0
                    r0 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r1
                    r1 = r8
                L_0x0060:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L_0x0080
                    java.lang.Object r10 = r5.next()
                    r0.f8311c = r6
                    r0.f8309a = r5
                    r0.f8310b = r2
                    kotlinx.coroutines.flow.g<T> r7 = r0.f8312d
                    java.lang.Object r10 = r7.m(r10, r0)
                    if (r10 != r1) goto L_0x007b
                    return r1
                L_0x007b:
                    r10 = r0
                    r0 = r1
                    r1 = r5
                    r5 = r6
                    goto L_0x004d
                L_0x0080:
                    r6.e(r4)
                    ff.m r10 = ff.m.f8717a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: f3.k2.a.C0143a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p<? super l2<T>, ? super d<? super m>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f8308c = pVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f8308c, dVar);
            aVar.f8307b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8306a;
            if (i8 == 0) {
                b.J(obj);
                C0143a aVar2 = new C0143a((g) this.f8307b, this.f8308c, (d<? super C0143a>) null);
                this.f8306a = 1;
                if (f1.v(aVar2, this) == aVar) {
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

    public static final <T> kotlinx.coroutines.flow.f<T> a(p<? super l2<T>, ? super d<? super m>, ? extends Object> pVar) {
        return cb.d.o(new n0(new a(pVar, (d<? super a>) null)), -2);
    }
}

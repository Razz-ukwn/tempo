package f3;

import ag.g0;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.l;
import rf.p;
import sf.k;
import sf.r;

@e(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {467}, m = "invokeSuspend")
public final class c2 extends i implements l<d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2<Object> f8101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x1<Object> f8102c;

    @e(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", l = {151, 193}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public t1 f8103a;

        /* renamed from: b  reason: collision with root package name */
        public r f8104b;

        /* renamed from: c  reason: collision with root package name */
        public int f8105c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ y0<Object> f8106d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e2<Object> f8107e;

        /* renamed from: f3.c2$a$a  reason: collision with other inner class name */
        public static final class C0133a extends k implements rf.a<m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e2<Object> f8108a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ t1<Object> f8109b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ r f8110c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0133a(e2<Object> e2Var, t1<Object> t1Var, r rVar) {
                super(0);
                this.f8108a = e2Var;
                this.f8109b = t1Var;
                this.f8110c = rVar;
            }

            public final Object d() {
                this.f8108a.f8167c = this.f8109b;
                this.f8110c.f14953a = true;
                return m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(y0<Object> y0Var, e2<Object> e2Var, d<? super a> dVar) {
            super(2, dVar);
            this.f8106d = y0Var;
            this.f8107e = e2Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f8106d, this.f8107e, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:122:0x02f9  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x030c  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x0329 A[LOOP:2: B:131:0x0323->B:133:0x0329, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x027d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                kf.a r7 = kf.a.f10464a
                int r0 = r6.f8105c
                r8 = 2
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0027
                if (r0 == r1) goto L_0x001c
                if (r0 != r8) goto L_0x0014
                cb.b.J(r17)
                goto L_0x00d7
            L_0x0014:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001c:
                sf.r r0 = r6.f8104b
                f3.t1 r1 = r6.f8103a
                cb.b.J(r17)
                r10 = r0
                r0 = r17
                goto L_0x0069
            L_0x0027:
                cb.b.J(r17)
                f3.y0<java.lang.Object> r0 = r6.f8106d
                boolean r3 = r0 instanceof f3.y0.b
                if (r3 == 0) goto L_0x00c4
                f3.y0$b r0 = (f3.y0.b) r0
                f3.o0 r0 = r0.f8550a
                f3.o0 r3 = f3.o0.f8397a
                if (r0 != r3) goto L_0x00c4
                f3.e2<java.lang.Object> r0 = r6.f8107e
                r0.f8172h = r2
                f3.t1 r9 = new f3.t1
                f3.y0<java.lang.Object> r0 = r6.f8106d
                f3.y0$b r0 = (f3.y0.b) r0
                r9.<init>(r0)
                sf.r r10 = new sf.r
                r10.<init>()
                f3.e2<java.lang.Object> r0 = r6.f8107e
                f3.t1<T> r2 = r0.f8167c
                int r3 = r0.f8173i
                f3.c2$a$a r4 = new f3.c2$a$a
                f3.e2<java.lang.Object> r5 = r6.f8107e
                r4.<init>(r5, r9, r10)
                r6.f8103a = r9
                r6.f8104b = r10
                r6.f8105c = r1
                r1 = r2
                r2 = r9
                r5 = r16
                java.lang.Object r0 = r0.c(r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0068
                return r7
            L_0x0068:
                r1 = r9
            L_0x0069:
                java.lang.Integer r0 = (java.lang.Integer) r0
                boolean r2 = r10.f14953a
                if (r2 == 0) goto L_0x00b8
                f3.e2<java.lang.Object> r2 = r6.f8107e
                f3.y0<java.lang.Object> r3 = r6.f8106d
                f3.y0$b r3 = (f3.y0.b) r3
                f3.n0 r4 = r3.f8554e
                f3.n0 r3 = r3.f8555f
                r2.a(r4, r3)
                if (r0 != 0) goto L_0x009b
                f3.e2<java.lang.Object> r0 = r6.f8107e
                f3.t2 r0 = r0.f8168d
                if (r0 != 0) goto L_0x0086
                goto L_0x0311
            L_0x0086:
                int r2 = r1.f8496b
                f3.v2$b r3 = new f3.v2$b
                int r2 = r2 / r8
                int r4 = r1.h()
                int r1 = r1.i()
                r3.<init>(r2, r2, r4, r1)
                r0.a(r3)
                goto L_0x0311
            L_0x009b:
                f3.e2<java.lang.Object> r2 = r6.f8107e
                int r3 = r0.intValue()
                r2.f8173i = r3
                f3.e2<java.lang.Object> r2 = r6.f8107e
                f3.t2 r2 = r2.f8168d
                if (r2 != 0) goto L_0x00ab
                goto L_0x0311
            L_0x00ab:
                int r0 = r0.intValue()
                f3.v2$a r0 = r1.f(r0)
                r2.a(r0)
                goto L_0x0311
            L_0x00b8:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Missing call to onListPresentable after new list was presented. If you are seeing this exception, it is generally an indication of an issue with Paging. Please file a bug so we can fix it at: https://issuetracker.google.com/issues/new?component=413106"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00c4:
                f3.e2<java.lang.Object> r0 = r6.f8107e
                f3.d r0 = (f3.d) r0
                f3.f<java.lang.Object> r0 = r0.m
                boolean r0 = r0.f8181e
                if (r0 == 0) goto L_0x00d7
                r6.f8105c = r8
                java.lang.Object r0 = e9.c.q(r16)
                if (r0 != r7) goto L_0x00d7
                return r7
            L_0x00d7:
                f3.e2<java.lang.Object> r0 = r6.f8107e
                f3.t1<T> r3 = r0.f8167c
                f3.y0<java.lang.Object> r4 = r6.f8106d
                f3.d2 r0 = r0.f8174j
                r3.getClass()
                java.lang.String r5 = "pageEvent"
                sf.j.f(r4, r5)
                java.lang.String r5 = "callback"
                sf.j.f(r0, r5)
                boolean r5 = r4 instanceof f3.y0.b
                f3.o0 r7 = f3.o0.f8399c
                f3.o0 r9 = f3.o0.f8398b
                java.lang.String r10 = "source"
                if (r5 == 0) goto L_0x01c4
                f3.y0$b r4 = (f3.y0.b) r4
                java.util.List<f3.s2<T>> r5 = r4.f8551b
                r11 = r5
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
                r12 = r2
            L_0x0102:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x0116
                java.lang.Object r13 = r11.next()
                f3.s2 r13 = (f3.s2) r13
                java.util.List<T> r13 = r13.f8483b
                int r13 = r13.size()
                int r12 = r12 + r13
                goto L_0x0102
            L_0x0116:
                int r11 = r3.a()
                f3.o0 r13 = r4.f8550a
                int r13 = r13.ordinal()
                if (r13 == 0) goto L_0x01be
                java.util.ArrayList r14 = r3.f8495a
                if (r13 == r1) goto L_0x0175
                if (r13 == r8) goto L_0x012a
                goto L_0x01b0
            L_0x012a:
                int r8 = r3.f8498d
                int r8 = java.lang.Math.min(r8, r12)
                int r13 = r3.f8497c
                int r15 = r3.f8496b
                int r13 = r13 + r15
                int r15 = r12 - r8
                int r1 = r13 + r8
                int r2 = r14.size()
                java.util.Collection r5 = (java.util.Collection) r5
                r14.addAll(r2, r5)
                int r2 = r3.f8496b
                int r2 = r2 + r12
                r3.f8496b = r2
                int r2 = r4.f8553d
                r3.f8498d = r2
                f3.e2<java.lang.Object> r2 = r0.f8124a
                f3.y r2 = r2.f8165a
                r2.c(r13, r8)
                r0.a(r1, r15)
                int r1 = r3.a()
                int r1 = r1 - r11
                int r1 = r1 - r15
                if (r1 <= 0) goto L_0x0166
                int r2 = r3.a()
                int r2 = r2 - r1
                r0.a(r2, r1)
                goto L_0x01b0
            L_0x0166:
                if (r1 >= 0) goto L_0x01b0
                int r2 = r3.a()
                int r1 = -r1
                f3.e2<java.lang.Object> r3 = r0.f8124a
                f3.y r3 = r3.f8165a
                r3.b(r2, r1)
                goto L_0x01b0
            L_0x0175:
                int r1 = r3.f8497c
                int r1 = java.lang.Math.min(r1, r12)
                int r2 = r3.f8497c
                int r2 = r2 - r1
                int r8 = r12 - r1
                java.util.Collection r5 = (java.util.Collection) r5
                r13 = 0
                r14.addAll(r13, r5)
                int r5 = r3.f8496b
                int r5 = r5 + r12
                r3.f8496b = r5
                int r5 = r4.f8552c
                r3.f8497c = r5
                f3.e2<java.lang.Object> r5 = r0.f8124a
                f3.y r5 = r5.f8165a
                r5.c(r2, r1)
                r1 = 0
                r0.a(r1, r8)
                int r2 = r3.a()
                int r2 = r2 - r11
                int r2 = r2 - r8
                if (r2 <= 0) goto L_0x01a6
                r0.a(r1, r2)
                goto L_0x01b0
            L_0x01a6:
                if (r2 >= 0) goto L_0x01b0
                int r2 = -r2
                f3.e2<java.lang.Object> r3 = r0.f8124a
                f3.y r3 = r3.f8165a
                r3.b(r1, r2)
            L_0x01b0:
                f3.n0 r1 = r4.f8554e
                f3.n0 r2 = r4.f8555f
                sf.j.f(r1, r10)
                f3.e2<java.lang.Object> r0 = r0.f8124a
                r0.a(r1, r2)
                goto L_0x026c
            L_0x01be:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L_0x01c4:
                boolean r1 = r4 instanceof f3.y0.a
                if (r1 == 0) goto L_0x025a
                f3.y0$a r4 = (f3.y0.a) r4
                int r1 = r3.a()
                f3.o0 r2 = r4.f8545a
                int r5 = r4.f8547c
                int r8 = r4.f8546b
                int r4 = r4.f8548d
                if (r2 != r9) goto L_0x0214
                int r2 = r3.f8497c
                wf.f r10 = new wf.f
                r10.<init>(r8, r5)
                int r5 = r3.g(r10)
                int r8 = r3.f8496b
                int r8 = r8 - r5
                r3.f8496b = r8
                r3.f8497c = r4
                int r3 = r3.a()
                int r3 = r3 - r1
                if (r3 <= 0) goto L_0x01f6
                r1 = 0
                r0.a(r1, r3)
                goto L_0x0201
            L_0x01f6:
                r1 = 0
                if (r3 >= 0) goto L_0x0201
                int r5 = -r3
                f3.e2<java.lang.Object> r8 = r0.f8124a
                f3.y r8 = r8.f8165a
                r8.b(r1, r5)
            L_0x0201:
                int r2 = r2 + r3
                int r2 = java.lang.Math.max(r1, r2)
                int r4 = r4 - r2
                if (r4 <= 0) goto L_0x0210
                f3.e2<java.lang.Object> r1 = r0.f8124a
                f3.y r1 = r1.f8165a
                r1.c(r2, r4)
            L_0x0210:
                r0.b(r9)
                goto L_0x026c
            L_0x0214:
                int r2 = r3.f8498d
                wf.f r10 = new wf.f
                r10.<init>(r8, r5)
                int r5 = r3.g(r10)
                int r8 = r3.f8496b
                int r8 = r8 - r5
                r3.f8496b = r8
                r3.f8498d = r4
                int r5 = r3.a()
                int r5 = r5 - r1
                if (r5 <= 0) goto L_0x0231
                r0.a(r1, r5)
                goto L_0x023c
            L_0x0231:
                if (r5 >= 0) goto L_0x023c
                int r1 = r1 + r5
                int r8 = -r5
                f3.e2<java.lang.Object> r10 = r0.f8124a
                f3.y r10 = r10.f8165a
                r10.b(r1, r8)
            L_0x023c:
                if (r5 >= 0) goto L_0x0244
                int r1 = -r5
                int r1 = java.lang.Math.min(r2, r1)
                goto L_0x0245
            L_0x0244:
                r1 = 0
            L_0x0245:
                int r2 = r2 - r1
                int r1 = r4 - r2
                if (r1 <= 0) goto L_0x0256
                int r2 = r3.a()
                int r2 = r2 - r4
                f3.e2<java.lang.Object> r3 = r0.f8124a
                f3.y r3 = r3.f8165a
                r3.c(r2, r1)
            L_0x0256:
                r0.b(r7)
                goto L_0x026c
            L_0x025a:
                boolean r1 = r4 instanceof f3.y0.c
                if (r1 == 0) goto L_0x026c
                f3.y0$c r4 = (f3.y0.c) r4
                f3.n0 r1 = r4.f8556a
                f3.n0 r2 = r4.f8557b
                sf.j.f(r1, r10)
                f3.e2<java.lang.Object> r0 = r0.f8124a
                r0.a(r1, r2)
            L_0x026c:
                f3.y0<java.lang.Object> r0 = r6.f8106d
                boolean r0 = r0 instanceof f3.y0.a
                if (r0 == 0) goto L_0x0277
                f3.e2<java.lang.Object> r0 = r6.f8107e
                r1 = 0
                r0.f8172h = r1
            L_0x0277:
                f3.y0<java.lang.Object> r0 = r6.f8106d
                boolean r1 = r0 instanceof f3.y0.b
                if (r1 == 0) goto L_0x0311
                f3.e2<java.lang.Object> r1 = r6.f8107e
                f3.s0 r1 = r1.f8169e
                f3.n0 r1 = r1.f8476f
                f3.m0 r2 = r1.f8383b
                boolean r2 = r2.f8363a
                f3.m0 r1 = r1.f8384c
                boolean r1 = r1.f8363a
                f3.y0$b r0 = (f3.y0.b) r0
                f3.o0 r3 = r0.f8550a
                if (r3 != r9) goto L_0x0293
                if (r2 != 0) goto L_0x0298
            L_0x0293:
                if (r3 != r7) goto L_0x029a
                if (r1 != 0) goto L_0x0298
                goto L_0x029a
            L_0x0298:
                r1 = 0
                goto L_0x029b
            L_0x029a:
                r1 = 1
            L_0x029b:
                java.util.List<f3.s2<T>> r0 = r0.f8551b
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r2 = r0 instanceof java.util.Collection
                if (r2 == 0) goto L_0x02ad
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x02ad
                goto L_0x02c7
            L_0x02ad:
                java.util.Iterator r0 = r0.iterator()
            L_0x02b1:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x02c7
                java.lang.Object r2 = r0.next()
                f3.s2 r2 = (f3.s2) r2
                java.util.List<T> r2 = r2.f8483b
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L_0x02b1
                r13 = 0
                goto L_0x02c8
            L_0x02c7:
                r13 = 1
            L_0x02c8:
                if (r1 != 0) goto L_0x02d0
                f3.e2<java.lang.Object> r0 = r6.f8107e
                r1 = 0
                r0.f8172h = r1
                goto L_0x0311
            L_0x02d0:
                f3.e2<java.lang.Object> r0 = r6.f8107e
                boolean r0 = r0.f8172h
                if (r0 != 0) goto L_0x02d8
                if (r13 == 0) goto L_0x0311
            L_0x02d8:
                if (r13 != 0) goto L_0x02f6
                f3.e2<java.lang.Object> r0 = r6.f8107e
                int r0 = r0.f8173i
                f3.e2<java.lang.Object> r1 = r6.f8107e
                f3.t1<T> r2 = r1.f8167c
                int r2 = r2.f8497c
                if (r0 < r2) goto L_0x02f6
                int r0 = r1.f8173i
                f3.e2<java.lang.Object> r1 = r6.f8107e
                f3.t1<T> r1 = r1.f8167c
                int r2 = r1.f8497c
                int r1 = r1.f8496b
                int r2 = r2 + r1
                if (r0 <= r2) goto L_0x02f4
                goto L_0x02f6
            L_0x02f4:
                r1 = 0
                goto L_0x02f7
            L_0x02f6:
                r1 = 1
            L_0x02f7:
                if (r1 == 0) goto L_0x030c
                f3.e2<java.lang.Object> r0 = r6.f8107e
                f3.t2 r1 = r0.f8168d
                if (r1 != 0) goto L_0x0300
                goto L_0x0311
            L_0x0300:
                f3.t1<T> r2 = r0.f8167c
                int r0 = r0.f8173i
                f3.v2$a r0 = r2.f(r0)
                r1.a(r0)
                goto L_0x0311
            L_0x030c:
                f3.e2<java.lang.Object> r0 = r6.f8107e
                r1 = 0
                r0.f8172h = r1
            L_0x0311:
                f3.y0<java.lang.Object> r0 = r6.f8106d
                boolean r1 = r0 instanceof f3.y0.b
                if (r1 != 0) goto L_0x031b
                boolean r0 = r0 instanceof f3.y0.a
                if (r0 == 0) goto L_0x0333
            L_0x031b:
                f3.e2<java.lang.Object> r0 = r6.f8107e
                java.util.concurrent.CopyOnWriteArrayList<rf.a<ff.m>> r0 = r0.f8170f
                java.util.Iterator r0 = r0.iterator()
            L_0x0323:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0333
                java.lang.Object r1 = r0.next()
                rf.a r1 = (rf.a) r1
                r1.d()
                goto L_0x0323
            L_0x0333:
                ff.m r0 = ff.m.f8717a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.c2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements g<y0<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e2 f8111a;

        public b(e2 e2Var) {
            this.f8111a = e2Var;
        }

        public final Object m(y0<Object> y0Var, d<? super m> dVar) {
            e2 e2Var = this.f8111a;
            Object M = cb.b.M(e2Var.f8166b, new a(y0Var, e2Var, (d<? super a>) null), dVar);
            return M == kf.a.f10464a ? M : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c2(e2<Object> e2Var, x1<Object> x1Var, d<? super c2> dVar) {
        super(1, dVar);
        this.f8101b = e2Var;
        this.f8102c = x1Var;
    }

    public final d<m> create(d<?> dVar) {
        return new c2(this.f8101b, this.f8102c, dVar);
    }

    public final Object invoke(Object obj) {
        return ((c2) create((d) obj)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8100a;
        if (i8 == 0) {
            cb.b.J(obj);
            x1<Object> x1Var = this.f8102c;
            t2 t2Var = x1Var.f8544b;
            e2<Object> e2Var = this.f8101b;
            e2Var.f8168d = t2Var;
            f<y0<T>> fVar = x1Var.f8543a;
            b bVar = new b(e2Var);
            this.f8100a = 1;
            if (fVar.a(bVar, this) == aVar) {
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

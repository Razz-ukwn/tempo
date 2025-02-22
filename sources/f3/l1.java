package f3;

import ag.g0;
import cg.f;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {608, 163, 619}, m = "invokeSuspend")
public final class l1 extends i implements p<l2<y0<Object>>, d<? super m>, Object> {
    public final /* synthetic */ f1<Object, Object> B;

    /* renamed from: a  reason: collision with root package name */
    public Object f8331a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8332b;

    /* renamed from: c  reason: collision with root package name */
    public kotlinx.coroutines.sync.d f8333c;

    /* renamed from: d  reason: collision with root package name */
    public int f8334d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f8335e;

    @e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    public static final class a extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8336a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f1<Object, Object> f8337b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ l2<y0<Object>> f8338c;

        /* renamed from: f3.l1$a$a  reason: collision with other inner class name */
        public static final class C0147a implements g<y0<Object>> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l2 f8339a;

            @e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {136}, m = "emit")
            /* renamed from: f3.l1$a$a$a  reason: collision with other inner class name */
            public static final class C0148a extends lf.c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f8340a;

                /* renamed from: b  reason: collision with root package name */
                public int f8341b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ C0147a f8342c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0148a(C0147a aVar, d dVar) {
                    super(dVar);
                    this.f8342c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f8340a = obj;
                    this.f8341b |= Integer.MIN_VALUE;
                    return this.f8342c.m((y0<Object>) null, this);
                }
            }

            public C0147a(l2 l2Var) {
                this.f8339a = l2Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(f3.y0<java.lang.Object> r5, jf.d<? super ff.m> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof f3.l1.a.C0147a.C0148a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f3.l1$a$a$a r0 = (f3.l1.a.C0147a.C0148a) r0
                    int r1 = r0.f8341b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f8341b = r1
                    goto L_0x0018
                L_0x0013:
                    f3.l1$a$a$a r0 = new f3.l1$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f8340a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f8341b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r6)     // Catch:{ l -> 0x003f }
                    goto L_0x003f
                L_0x0027:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x002f:
                    cb.b.J(r6)
                    f3.y0 r5 = (f3.y0) r5
                    f3.l2 r6 = r4.f8339a     // Catch:{ l -> 0x003f }
                    r0.f8341b = r3     // Catch:{ l -> 0x003f }
                    java.lang.Object r5 = r6.t(r5, r0)     // Catch:{ l -> 0x003f }
                    if (r5 != r1) goto L_0x003f
                    return r1
                L_0x003f:
                    ff.m r5 = ff.m.f8717a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: f3.l1.a.C0147a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f1<Object, Object> f1Var, l2<y0<Object>> l2Var, d<? super a> dVar) {
            super(2, dVar);
            this.f8337b = f1Var;
            this.f8338c = l2Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f8337b, this.f8338c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8336a;
            if (i8 == 0) {
                cb.b.J(obj);
                kotlinx.coroutines.flow.c v3 = cb.d.v(this.f8337b.f8205k);
                C0147a aVar2 = new C0147a(this.f8338c);
                this.f8336a = 1;
                if (v3.a(aVar2, this) == aVar) {
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

    @e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    public static final class b extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8343a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f1<Object, Object> f8344b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<m> f8345c;

        public static final class a implements g<m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f8346a;

            public a(f fVar) {
                this.f8346a = fVar;
            }

            public final Object m(m mVar, d<? super m> dVar) {
                Object o10 = this.f8346a.o(mVar);
                return o10 == kf.a.f10464a ? o10 : m.f8717a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f1 f1Var, d dVar, f fVar) {
            super(2, dVar);
            this.f8344b = f1Var;
            this.f8345c = fVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f8344b, dVar, this.f8345c);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8343a;
            if (i8 == 0) {
                cb.b.J(obj);
                kotlinx.coroutines.flow.f<m> fVar = this.f8344b.f8198d;
                a aVar2 = new a(this.f8345c);
                this.f8343a = 1;
                if (fVar.a(aVar2, this) == aVar) {
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

    @e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {602}, m = "invokeSuspend")
    public static final class c extends i implements p<g0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8347a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8348b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f<m> f8349c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f1<Object, Object> f8350d;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8351a;

            static {
                int[] iArr = new int[o0.values().length];
                iArr[0] = 1;
                f8351a = iArr;
            }
        }

        public static final class b implements g<m> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f1 f8352a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g0 f8353b;

            @e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1", f = "PageFetcherSnapshot.kt", l = {142, 164, 157, 181, 169, 195, 213, 157, 224, 169, 235, 247, 157, 258, 169, 269}, m = "emit")
            public static final class a extends lf.c {
                public Object B;
                public Object C;
                public Object D;
                public Object E;
                public f1 F;

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f8354a;

                /* renamed from: b  reason: collision with root package name */
                public int f8355b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ b f8356c;

                /* renamed from: d  reason: collision with root package name */
                public b f8357d;

                /* renamed from: e  reason: collision with root package name */
                public Object f8358e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar, d dVar) {
                    super(dVar);
                    this.f8356c = bVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f8354a = obj;
                    this.f8355b |= Integer.MIN_VALUE;
                    return this.f8356c.m((m) null, this);
                }
            }

            public b(f1 f1Var, g0 g0Var) {
                this.f8352a = f1Var;
                this.f8353b = g0Var;
            }

            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e2, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e3, code lost:
                r8 = r2;
                r6 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
                r13 = (f3.v2) r7.f8459b.f8456k.get(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ee, code lost:
                r6.a((java.lang.Object) null);
                r6 = r2;
                r2 = r13;
                r13 = r12;
                r12 = r8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:105:0x02f5, code lost:
                r0.f8357d = r10;
                r0.f8358e = r9;
                r0.B = r12;
                r0.C = null;
                r0.D = null;
                r0.E = null;
                r0.F = null;
                r0.f8355b = 10;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:106:0x030b, code lost:
                if (f3.f1.c(r13, r6, r2, r0) != r1) goto L_0x030e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:107:0x030d, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:108:0x030e, code lost:
                r6 = r9;
                r7 = r10;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:109:0x0310, code lost:
                if (r12 != r3) goto L_0x0347;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:110:0x0312, code lost:
                r2 = r7.f8352a.f8206l;
                r12 = r2.f8458a;
                r0.f8357d = r7;
                r0.f8358e = r6;
                r0.B = r2;
                r0.C = r12;
                r0.f8355b = 11;
                r13 = r12.b(r0);
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:111:0x0328, code lost:
                if (r13 != r1) goto L_0x032b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:112:0x032a, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
                r13 = r2.f8459b.f8457l.a(r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:115:0x0333, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:116:0x0338, code lost:
                if ((r13 instanceof f3.m0.a) != false) goto L_0x0347;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:117:0x033a, code lost:
                f3.f1.d(r7.f8352a, r7.f8353b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:118:0x0342, code lost:
                r13 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:119:0x0343, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:120:0x0346, code lost:
                throw r13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:121:0x0347, code lost:
                r8 = r7;
                r7 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:122:0x0349, code lost:
                r6 = f3.o0.f8399c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:123:0x034f, code lost:
                if ((r7.f8384c instanceof f3.m0.a) != false) goto L_0x0353;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:124:0x0353, code lost:
                r2 = r8.f8352a.f8206l;
                r12 = r2.f8458a;
                r0.f8357d = r8;
                r0.f8358e = r6;
                r0.B = r2;
                r0.C = r12;
                r0.f8355b = 12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:125:0x0369, code lost:
                if (r12.b(r0) != r1) goto L_0x036c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:126:0x036b, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:127:0x036c, code lost:
                r7 = r8;
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:128:0x036d, code lost:
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
                r13 = r2.f8459b;
                r2 = r7.f8352a;
                r0.f8357d = r7;
                r0.f8358e = r6;
                r0.B = r12;
                r0.C = null;
                r0.f8355b = 13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:130:0x0381, code lost:
                if (r2.j(r13, r6, r0) != r1) goto L_0x0384;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:131:0x0383, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:132:0x0384, code lost:
                r2 = r6;
                r8 = r7;
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:133:0x0386, code lost:
                r13 = ff.m.f8717a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:134:0x0388, code lost:
                r12.a((java.lang.Object) null);
                r12 = r8.f8352a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:135:0x0395, code lost:
                if (f3.l1.c.a.f8351a[r2.ordinal()] != 1) goto L_0x039c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:136:0x0397, code lost:
                r13 = r12;
                r12 = r2;
                r4 = r12;
                r2 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:137:0x039c, code lost:
                r6 = r8.f8352a.f8206l;
                r4 = r6.f8458a;
                r0.f8357d = r8;
                r0.f8358e = r2;
                r0.B = r6;
                r0.C = r4;
                r0.D = r2;
                r0.E = r12;
                r0.f8355b = 14;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b6, code lost:
                if (r4.b(r0) != r1) goto L_0x03b9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b8, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b9, code lost:
                r7 = r2;
                r4 = r4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
                r13 = (f3.v2) r6.f8459b.f8456k.get(r7);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:143:0x03c4, code lost:
                r4.a((java.lang.Object) null);
                r4 = r2;
                r2 = r13;
                r13 = r12;
                r12 = r7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:144:0x03cb, code lost:
                r0.f8357d = r8;
                r0.f8358e = r12;
                r0.B = null;
                r0.C = null;
                r0.D = null;
                r0.E = null;
                r0.f8355b = 15;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:145:0x03df, code lost:
                if (f3.f1.c(r13, r4, r2, r0) != r1) goto L_0x03e2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:146:0x03e1, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:147:0x03e2, code lost:
                r2 = r8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e3, code lost:
                if (r12 != r3) goto L_0x041b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:149:0x03e5, code lost:
                r12 = r2.f8352a.f8206l;
                r13 = r12.f8458a;
                r0.f8357d = r2;
                r0.f8358e = r12;
                r0.B = r13;
                r0.f8355b = 16;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:150:0x03f9, code lost:
                if (r13.b(r0) != r1) goto L_0x03fc;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:151:0x03fb, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:152:0x03fc, code lost:
                r1 = r12;
                r12 = r13;
                r0 = r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
                r13 = r1.f8459b.f8457l.a(r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:155:0x0407, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:156:0x040c, code lost:
                if ((r13 instanceof f3.m0.a) != false) goto L_0x041b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:157:0x040e, code lost:
                f3.f1.d(r0.f8352a, r0.f8353b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:158:0x0416, code lost:
                r13 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:159:0x0417, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:160:0x041a, code lost:
                throw r13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:162:0x041d, code lost:
                return ff.m.f8717a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:163:0x041e, code lost:
                r12 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:164:0x041f, code lost:
                r4.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:165:0x0422, code lost:
                throw r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:169:0x0428, code lost:
                r12 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:170:0x0429, code lost:
                r6.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:171:0x042c, code lost:
                throw r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:175:0x0432, code lost:
                r12 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:176:0x0433, code lost:
                r6.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:177:0x0436, code lost:
                throw r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:178:0x0437, code lost:
                r13 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:179:0x0438, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:180:0x043b, code lost:
                throw r13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0175, code lost:
                r13 = ff.m.f8717a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0177, code lost:
                r12.a((java.lang.Object) null);
                r9 = r6;
                r10 = r7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
                r13 = r2.f8459b;
                r2 = r13.f8457l.d();
                r13 = r13.a(r6.f8352a.f8203i.f8259a.f8264c);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bf, code lost:
                r12.a((java.lang.Object) null);
                r12 = r6.f8352a.f8200f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c6, code lost:
                if (r12 != null) goto L_0x01c9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c9, code lost:
                r12.a(r13);
                r12 = ff.m.f8717a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d2, code lost:
                if ((r2.f8382a instanceof f3.m0.a) != false) goto L_0x01d8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d4, code lost:
                r7 = r2;
                r8 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d8, code lost:
                r9 = r2;
                r2 = r3;
                r10 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x01db, code lost:
                r12 = r10.f8352a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e5, code lost:
                if (f3.l1.c.a.f8351a[r2.ordinal()] != 1) goto L_0x01ec;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x01e7, code lost:
                r13 = r12;
                r12 = r2;
                r6 = r12;
                r2 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ec, code lost:
                r7 = r10.f8352a.f8206l;
                r6 = r7.f8458a;
                r0.f8357d = r10;
                r0.f8358e = r9;
                r0.B = r2;
                r0.C = r7;
                r0.D = r6;
                r0.E = r2;
                r0.F = r12;
                r0.f8355b = 4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x0207, code lost:
                if (r6.b(r0) != r1) goto L_0x020a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x0209, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x020a, code lost:
                r8 = r2;
                r6 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
                r13 = (f3.v2) r7.f8459b.f8456k.get(r8);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x0215, code lost:
                r6.a((java.lang.Object) null);
                r6 = r2;
                r2 = r13;
                r13 = r12;
                r12 = r8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:67:0x021c, code lost:
                r0.f8357d = r10;
                r0.f8358e = r9;
                r0.B = r12;
                r0.C = null;
                r0.D = null;
                r0.E = null;
                r0.F = null;
                r0.f8355b = 5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x0231, code lost:
                if (f3.f1.c(r13, r6, r2, r0) != r1) goto L_0x0234;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x0233, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:70:0x0234, code lost:
                r6 = r9;
                r7 = r10;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x0236, code lost:
                if (r12 != r3) goto L_0x026c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:72:0x0238, code lost:
                r2 = r7.f8352a.f8206l;
                r12 = r2.f8458a;
                r0.f8357d = r7;
                r0.f8358e = r6;
                r0.B = r2;
                r0.C = r12;
                r0.f8355b = 6;
                r13 = r12.b(r0);
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:73:0x024d, code lost:
                if (r13 != r1) goto L_0x0250;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:74:0x024f, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
                r13 = r2.f8459b.f8457l.a(r3);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:77:0x0258, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:78:0x025d, code lost:
                if ((r13 instanceof f3.m0.a) != false) goto L_0x026c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:79:0x025f, code lost:
                f3.f1.d(r7.f8352a, r7.f8353b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:80:0x0267, code lost:
                r13 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:81:0x0268, code lost:
                r12.a((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:82:0x026b, code lost:
                throw r13;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:83:0x026c, code lost:
                r8 = r7;
                r7 = r6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:84:0x026e, code lost:
                r6 = f3.o0.f8398b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:85:0x0274, code lost:
                if ((r7.f8383b instanceof f3.m0.a) != false) goto L_0x0278;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:86:0x0278, code lost:
                r2 = r8.f8352a.f8206l;
                r12 = r2.f8458a;
                r0.f8357d = r8;
                r0.f8358e = r7;
                r0.B = r6;
                r0.C = r2;
                r0.D = r12;
                r0.f8355b = 7;
                r13 = r12.b(r0);
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:87:0x028f, code lost:
                if (r13 != r1) goto L_0x0292;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:88:0x0291, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:89:0x0292, code lost:
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
                r13 = r2.f8459b;
                r2 = r8.f8352a;
                r0.f8357d = r8;
                r0.f8358e = r7;
                r0.B = r6;
                r0.C = r12;
                r0.D = null;
                r0.f8355b = 8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:91:0x02a8, code lost:
                if (r2.j(r13, r6, r0) != r1) goto L_0x02ab;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:92:0x02aa, code lost:
                return r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ab, code lost:
                r2 = r6;
                r9 = r7;
                r10 = r8;
                r12 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ae, code lost:
                r13 = ff.m.f8717a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b0, code lost:
                r12.a((java.lang.Object) null);
                r12 = r10.f8352a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bd, code lost:
                if (f3.l1.c.a.f8351a[r2.ordinal()] != 1) goto L_0x02c4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:97:0x02bf, code lost:
                r13 = r12;
                r12 = r2;
                r6 = r12;
                r2 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c4, code lost:
                r7 = r10.f8352a.f8206l;
                r6 = r7.f8458a;
                r0.f8357d = r10;
                r0.f8358e = r9;
                r0.B = r2;
                r0.C = r7;
                r0.D = r6;
                r0.E = r2;
                r0.F = r12;
                r0.f8355b = 9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e0, code lost:
                if (r6.b(r0) != r1) goto L_0x02e3;
             */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0062  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00c6  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00db  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00f2  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0105  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0116  */
            /* JADX WARNING: Removed duplicated region for block: B:29:0x0133  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0145  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x0182  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0190  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(ff.m r12, jf.d<? super ff.m> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof f3.l1.c.b.a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    f3.l1$c$b$a r0 = (f3.l1.c.b.a) r0
                    int r1 = r0.f8355b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f8355b = r1
                    goto L_0x0018
                L_0x0013:
                    f3.l1$c$b$a r0 = new f3.l1$c$b$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f8354a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f8355b
                    f3.o0 r3 = f3.o0.f8397a
                    r4 = 1
                    r5 = 0
                    switch(r2) {
                        case 0: goto L_0x0190;
                        case 1: goto L_0x0182;
                        case 2: goto L_0x0145;
                        case 3: goto L_0x0133;
                        case 4: goto L_0x0116;
                        case 5: goto L_0x0105;
                        case 6: goto L_0x00f2;
                        case 7: goto L_0x00db;
                        case 8: goto L_0x00c6;
                        case 9: goto L_0x00a9;
                        case 10: goto L_0x0098;
                        case 11: goto L_0x0085;
                        case 12: goto L_0x0072;
                        case 13: goto L_0x0062;
                        case 14: goto L_0x0047;
                        case 15: goto L_0x003c;
                        case 16: goto L_0x002d;
                        default: goto L_0x0025;
                    }
                L_0x0025:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x002d:
                    java.lang.Object r12 = r0.B
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r1 = r0.f8358e
                    f3.q1$a r1 = (f3.q1.a) r1
                    f3.l1$c$b r0 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x03ff
                L_0x003c:
                    java.lang.Object r12 = r0.f8358e
                    f3.o0 r12 = (f3.o0) r12
                    f3.l1$c$b r2 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x03e3
                L_0x0047:
                    java.lang.Object r12 = r0.E
                    f3.f1 r12 = (f3.f1) r12
                    java.lang.Object r2 = r0.D
                    f3.o0 r2 = (f3.o0) r2
                    java.lang.Object r4 = r0.C
                    kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
                    java.lang.Object r6 = r0.B
                    f3.q1$a r6 = (f3.q1.a) r6
                    java.lang.Object r7 = r0.f8358e
                    f3.o0 r7 = (f3.o0) r7
                    f3.l1$c$b r8 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x03ba
                L_0x0062:
                    java.lang.Object r12 = r0.B
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.f8358e
                    f3.o0 r2 = (f3.o0) r2
                    f3.l1$c$b r6 = r0.f8357d
                    cb.b.J(r13)     // Catch:{ all -> 0x0423 }
                    r8 = r6
                    goto L_0x0386
                L_0x0072:
                    java.lang.Object r12 = r0.C
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.B
                    f3.q1$a r2 = (f3.q1.a) r2
                    java.lang.Object r6 = r0.f8358e
                    f3.o0 r6 = (f3.o0) r6
                    f3.l1$c$b r7 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x036d
                L_0x0085:
                    java.lang.Object r12 = r0.C
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.B
                    f3.q1$a r2 = (f3.q1.a) r2
                    java.lang.Object r6 = r0.f8358e
                    f3.n0 r6 = (f3.n0) r6
                    f3.l1$c$b r7 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x032b
                L_0x0098:
                    java.lang.Object r12 = r0.B
                    f3.o0 r12 = (f3.o0) r12
                    java.lang.Object r2 = r0.f8358e
                    f3.n0 r2 = (f3.n0) r2
                    f3.l1$c$b r6 = r0.f8357d
                    cb.b.J(r13)
                    r7 = r6
                    r6 = r2
                    goto L_0x0310
                L_0x00a9:
                    f3.f1 r12 = r0.F
                    java.lang.Object r2 = r0.E
                    f3.o0 r2 = (f3.o0) r2
                    java.lang.Object r6 = r0.D
                    kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.c) r6
                    java.lang.Object r7 = r0.C
                    f3.q1$a r7 = (f3.q1.a) r7
                    java.lang.Object r8 = r0.B
                    f3.o0 r8 = (f3.o0) r8
                    java.lang.Object r9 = r0.f8358e
                    f3.n0 r9 = (f3.n0) r9
                    f3.l1$c$b r10 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x02e4
                L_0x00c6:
                    java.lang.Object r12 = r0.C
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.B
                    f3.o0 r2 = (f3.o0) r2
                    java.lang.Object r6 = r0.f8358e
                    f3.n0 r6 = (f3.n0) r6
                    f3.l1$c$b r7 = r0.f8357d
                    cb.b.J(r13)     // Catch:{ all -> 0x042d }
                    r9 = r6
                    r10 = r7
                    goto L_0x02ae
                L_0x00db:
                    java.lang.Object r12 = r0.D
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.C
                    f3.q1$a r2 = (f3.q1.a) r2
                    java.lang.Object r6 = r0.B
                    f3.o0 r6 = (f3.o0) r6
                    java.lang.Object r7 = r0.f8358e
                    f3.n0 r7 = (f3.n0) r7
                    f3.l1$c$b r8 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x0292
                L_0x00f2:
                    java.lang.Object r12 = r0.C
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.B
                    f3.q1$a r2 = (f3.q1.a) r2
                    java.lang.Object r6 = r0.f8358e
                    f3.n0 r6 = (f3.n0) r6
                    f3.l1$c$b r7 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x0250
                L_0x0105:
                    java.lang.Object r12 = r0.B
                    f3.o0 r12 = (f3.o0) r12
                    java.lang.Object r2 = r0.f8358e
                    f3.n0 r2 = (f3.n0) r2
                    f3.l1$c$b r6 = r0.f8357d
                    cb.b.J(r13)
                    r7 = r6
                    r6 = r2
                    goto L_0x0236
                L_0x0116:
                    f3.f1 r12 = r0.F
                    java.lang.Object r2 = r0.E
                    f3.o0 r2 = (f3.o0) r2
                    java.lang.Object r6 = r0.D
                    kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.c) r6
                    java.lang.Object r7 = r0.C
                    f3.q1$a r7 = (f3.q1.a) r7
                    java.lang.Object r8 = r0.B
                    f3.o0 r8 = (f3.o0) r8
                    java.lang.Object r9 = r0.f8358e
                    f3.n0 r9 = (f3.n0) r9
                    f3.l1$c$b r10 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x020b
                L_0x0133:
                    java.lang.Object r12 = r0.C
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.B
                    f3.o0 r2 = (f3.o0) r2
                    java.lang.Object r6 = r0.f8358e
                    f3.n0 r6 = (f3.n0) r6
                    f3.l1$c$b r7 = r0.f8357d
                    cb.b.J(r13)     // Catch:{ all -> 0x017d }
                    goto L_0x0175
                L_0x0145:
                    java.lang.Object r12 = r0.D
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.C
                    f3.q1$a r2 = (f3.q1.a) r2
                    java.lang.Object r6 = r0.B
                    f3.o0 r6 = (f3.o0) r6
                    java.lang.Object r7 = r0.f8358e
                    f3.n0 r7 = (f3.n0) r7
                    f3.l1$c$b r8 = r0.f8357d
                    cb.b.J(r13)
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x017d }
                    f3.f1 r2 = r8.f8352a     // Catch:{ all -> 0x017d }
                    r0.f8357d = r8     // Catch:{ all -> 0x017d }
                    r0.f8358e = r7     // Catch:{ all -> 0x017d }
                    r0.B = r6     // Catch:{ all -> 0x017d }
                    r0.C = r12     // Catch:{ all -> 0x017d }
                    r0.D = r5     // Catch:{ all -> 0x017d }
                    r9 = 3
                    r0.f8355b = r9     // Catch:{ all -> 0x017d }
                    java.lang.Object r13 = r2.j(r13, r6, r0)     // Catch:{ all -> 0x017d }
                    if (r13 != r1) goto L_0x0172
                    return r1
                L_0x0172:
                    r2 = r6
                    r6 = r7
                    r7 = r8
                L_0x0175:
                    ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x017d }
                    r12.a(r5)
                    r9 = r6
                    r10 = r7
                    goto L_0x01db
                L_0x017d:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x0182:
                    java.lang.Object r12 = r0.B
                    kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.c) r12
                    java.lang.Object r2 = r0.f8358e
                    f3.q1$a r2 = (f3.q1.a) r2
                    f3.l1$c$b r6 = r0.f8357d
                    cb.b.J(r13)
                    goto L_0x01ab
                L_0x0190:
                    cb.b.J(r13)
                    ff.m r12 = (ff.m) r12
                    f3.f1 r12 = r11.f8352a
                    f3.q1$a<Key, Value> r2 = r12.f8206l
                    kotlinx.coroutines.sync.d r12 = r2.f8458a
                    r0.f8357d = r11
                    r0.f8358e = r2
                    r0.B = r12
                    r0.f8355b = r4
                    java.lang.Object r13 = r12.b(r0)
                    if (r13 != r1) goto L_0x01aa
                    return r1
                L_0x01aa:
                    r6 = r11
                L_0x01ab:
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x0437 }
                    f3.t0 r2 = r13.f8457l     // Catch:{ all -> 0x0437 }
                    f3.n0 r2 = r2.d()     // Catch:{ all -> 0x0437 }
                    f3.f1 r7 = r6.f8352a     // Catch:{ all -> 0x0437 }
                    f3.h0 r7 = r7.f8203i     // Catch:{ all -> 0x0437 }
                    f3.h0$b r7 = r7.f8259a     // Catch:{ all -> 0x0437 }
                    f3.v2$a r7 = r7.f8264c     // Catch:{ all -> 0x0437 }
                    f3.g2 r13 = r13.a(r7)     // Catch:{ all -> 0x0437 }
                    r12.a(r5)
                    f3.f1 r12 = r6.f8352a
                    f3.j2<Key, Value> r12 = r12.f8200f
                    if (r12 != 0) goto L_0x01c9
                    goto L_0x01ce
                L_0x01c9:
                    r12.a(r13)
                    ff.m r12 = ff.m.f8717a
                L_0x01ce:
                    f3.m0 r12 = r2.f8382a
                    boolean r12 = r12 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x01d8
                    r7 = r2
                    r8 = r6
                    goto L_0x026e
                L_0x01d8:
                    r9 = r2
                    r2 = r3
                    r10 = r6
                L_0x01db:
                    f3.f1 r12 = r10.f8352a
                    int[] r13 = f3.l1.c.a.f8351a
                    int r6 = r2.ordinal()
                    r13 = r13[r6]
                    if (r13 != r4) goto L_0x01ec
                    r13 = r12
                    r12 = r2
                    r6 = r12
                    r2 = r5
                    goto L_0x021c
                L_0x01ec:
                    f3.f1 r13 = r10.f8352a
                    f3.q1$a<Key, Value> r7 = r13.f8206l
                    kotlinx.coroutines.sync.d r6 = r7.f8458a
                    r0.f8357d = r10
                    r0.f8358e = r9
                    r0.B = r2
                    r0.C = r7
                    r0.D = r6
                    r0.E = r2
                    r0.F = r12
                    r13 = 4
                    r0.f8355b = r13
                    java.lang.Object r13 = r6.b(r0)
                    if (r13 != r1) goto L_0x020a
                    return r1
                L_0x020a:
                    r8 = r2
                L_0x020b:
                    f3.q1<Key, Value> r13 = r7.f8459b     // Catch:{ all -> 0x0432 }
                    java.util.LinkedHashMap r13 = r13.f8456k     // Catch:{ all -> 0x0432 }
                    java.lang.Object r13 = r13.get(r8)     // Catch:{ all -> 0x0432 }
                    f3.v2 r13 = (f3.v2) r13     // Catch:{ all -> 0x0432 }
                    r6.a(r5)
                    r6 = r2
                    r2 = r13
                    r13 = r12
                    r12 = r8
                L_0x021c:
                    r0.f8357d = r10
                    r0.f8358e = r9
                    r0.B = r12
                    r0.C = r5
                    r0.D = r5
                    r0.E = r5
                    r0.F = r5
                    r7 = 5
                    r0.f8355b = r7
                    java.lang.Object r13 = f3.f1.c(r13, r6, r2, r0)
                    if (r13 != r1) goto L_0x0234
                    return r1
                L_0x0234:
                    r6 = r9
                    r7 = r10
                L_0x0236:
                    if (r12 != r3) goto L_0x026c
                    f3.f1 r12 = r7.f8352a
                    f3.q1$a<Key, Value> r2 = r12.f8206l
                    kotlinx.coroutines.sync.d r12 = r2.f8458a
                    r0.f8357d = r7
                    r0.f8358e = r6
                    r0.B = r2
                    r0.C = r12
                    r13 = 6
                    r0.f8355b = r13
                    java.lang.Object r13 = r12.b(r0)
                    if (r13 != r1) goto L_0x0250
                    return r1
                L_0x0250:
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x0267 }
                    f3.t0 r13 = r13.f8457l     // Catch:{ all -> 0x0267 }
                    f3.m0 r13 = r13.a(r3)     // Catch:{ all -> 0x0267 }
                    r12.a(r5)
                    boolean r12 = r13 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x026c
                    f3.f1 r12 = r7.f8352a
                    ag.g0 r13 = r7.f8353b
                    f3.f1.d(r12, r13)
                    goto L_0x026c
                L_0x0267:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x026c:
                    r8 = r7
                    r7 = r6
                L_0x026e:
                    f3.o0 r6 = f3.o0.f8398b
                    f3.m0 r12 = r7.f8383b
                    boolean r12 = r12 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x0278
                    goto L_0x0349
                L_0x0278:
                    f3.f1 r12 = r8.f8352a
                    f3.q1$a<Key, Value> r2 = r12.f8206l
                    kotlinx.coroutines.sync.d r12 = r2.f8458a
                    r0.f8357d = r8
                    r0.f8358e = r7
                    r0.B = r6
                    r0.C = r2
                    r0.D = r12
                    r13 = 7
                    r0.f8355b = r13
                    java.lang.Object r13 = r12.b(r0)
                    if (r13 != r1) goto L_0x0292
                    return r1
                L_0x0292:
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x042d }
                    f3.f1 r2 = r8.f8352a     // Catch:{ all -> 0x042d }
                    r0.f8357d = r8     // Catch:{ all -> 0x042d }
                    r0.f8358e = r7     // Catch:{ all -> 0x042d }
                    r0.B = r6     // Catch:{ all -> 0x042d }
                    r0.C = r12     // Catch:{ all -> 0x042d }
                    r0.D = r5     // Catch:{ all -> 0x042d }
                    r9 = 8
                    r0.f8355b = r9     // Catch:{ all -> 0x042d }
                    java.lang.Object r13 = r2.j(r13, r6, r0)     // Catch:{ all -> 0x042d }
                    if (r13 != r1) goto L_0x02ab
                    return r1
                L_0x02ab:
                    r2 = r6
                    r9 = r7
                    r10 = r8
                L_0x02ae:
                    ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x042d }
                    r12.a(r5)
                    f3.f1 r12 = r10.f8352a
                    int[] r13 = f3.l1.c.a.f8351a
                    int r6 = r2.ordinal()
                    r13 = r13[r6]
                    if (r13 != r4) goto L_0x02c4
                    r13 = r12
                    r12 = r2
                    r6 = r12
                    r2 = r5
                    goto L_0x02f5
                L_0x02c4:
                    f3.f1 r13 = r10.f8352a
                    f3.q1$a<Key, Value> r7 = r13.f8206l
                    kotlinx.coroutines.sync.d r6 = r7.f8458a
                    r0.f8357d = r10
                    r0.f8358e = r9
                    r0.B = r2
                    r0.C = r7
                    r0.D = r6
                    r0.E = r2
                    r0.F = r12
                    r13 = 9
                    r0.f8355b = r13
                    java.lang.Object r13 = r6.b(r0)
                    if (r13 != r1) goto L_0x02e3
                    return r1
                L_0x02e3:
                    r8 = r2
                L_0x02e4:
                    f3.q1<Key, Value> r13 = r7.f8459b     // Catch:{ all -> 0x0428 }
                    java.util.LinkedHashMap r13 = r13.f8456k     // Catch:{ all -> 0x0428 }
                    java.lang.Object r13 = r13.get(r8)     // Catch:{ all -> 0x0428 }
                    f3.v2 r13 = (f3.v2) r13     // Catch:{ all -> 0x0428 }
                    r6.a(r5)
                    r6 = r2
                    r2 = r13
                    r13 = r12
                    r12 = r8
                L_0x02f5:
                    r0.f8357d = r10
                    r0.f8358e = r9
                    r0.B = r12
                    r0.C = r5
                    r0.D = r5
                    r0.E = r5
                    r0.F = r5
                    r7 = 10
                    r0.f8355b = r7
                    java.lang.Object r13 = f3.f1.c(r13, r6, r2, r0)
                    if (r13 != r1) goto L_0x030e
                    return r1
                L_0x030e:
                    r6 = r9
                    r7 = r10
                L_0x0310:
                    if (r12 != r3) goto L_0x0347
                    f3.f1 r12 = r7.f8352a
                    f3.q1$a<Key, Value> r2 = r12.f8206l
                    kotlinx.coroutines.sync.d r12 = r2.f8458a
                    r0.f8357d = r7
                    r0.f8358e = r6
                    r0.B = r2
                    r0.C = r12
                    r13 = 11
                    r0.f8355b = r13
                    java.lang.Object r13 = r12.b(r0)
                    if (r13 != r1) goto L_0x032b
                    return r1
                L_0x032b:
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x0342 }
                    f3.t0 r13 = r13.f8457l     // Catch:{ all -> 0x0342 }
                    f3.m0 r13 = r13.a(r3)     // Catch:{ all -> 0x0342 }
                    r12.a(r5)
                    boolean r12 = r13 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x0347
                    f3.f1 r12 = r7.f8352a
                    ag.g0 r13 = r7.f8353b
                    f3.f1.d(r12, r13)
                    goto L_0x0347
                L_0x0342:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x0347:
                    r8 = r7
                    r7 = r6
                L_0x0349:
                    f3.o0 r6 = f3.o0.f8399c
                    f3.m0 r12 = r7.f8384c
                    boolean r12 = r12 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x0353
                    goto L_0x041b
                L_0x0353:
                    f3.f1 r12 = r8.f8352a
                    f3.q1$a<Key, Value> r2 = r12.f8206l
                    kotlinx.coroutines.sync.d r12 = r2.f8458a
                    r0.f8357d = r8
                    r0.f8358e = r6
                    r0.B = r2
                    r0.C = r12
                    r13 = 12
                    r0.f8355b = r13
                    java.lang.Object r13 = r12.b(r0)
                    if (r13 != r1) goto L_0x036c
                    return r1
                L_0x036c:
                    r7 = r8
                L_0x036d:
                    f3.q1<Key, Value> r13 = r2.f8459b     // Catch:{ all -> 0x0423 }
                    f3.f1 r2 = r7.f8352a     // Catch:{ all -> 0x0423 }
                    r0.f8357d = r7     // Catch:{ all -> 0x0423 }
                    r0.f8358e = r6     // Catch:{ all -> 0x0423 }
                    r0.B = r12     // Catch:{ all -> 0x0423 }
                    r0.C = r5     // Catch:{ all -> 0x0423 }
                    r8 = 13
                    r0.f8355b = r8     // Catch:{ all -> 0x0423 }
                    java.lang.Object r13 = r2.j(r13, r6, r0)     // Catch:{ all -> 0x0423 }
                    if (r13 != r1) goto L_0x0384
                    return r1
                L_0x0384:
                    r2 = r6
                    r8 = r7
                L_0x0386:
                    ff.m r13 = ff.m.f8717a     // Catch:{ all -> 0x0423 }
                    r12.a(r5)
                    f3.f1 r12 = r8.f8352a
                    int[] r13 = f3.l1.c.a.f8351a
                    int r6 = r2.ordinal()
                    r13 = r13[r6]
                    if (r13 != r4) goto L_0x039c
                    r13 = r12
                    r12 = r2
                    r4 = r12
                    r2 = r5
                    goto L_0x03cb
                L_0x039c:
                    f3.f1 r13 = r8.f8352a
                    f3.q1$a<Key, Value> r6 = r13.f8206l
                    kotlinx.coroutines.sync.d r4 = r6.f8458a
                    r0.f8357d = r8
                    r0.f8358e = r2
                    r0.B = r6
                    r0.C = r4
                    r0.D = r2
                    r0.E = r12
                    r13 = 14
                    r0.f8355b = r13
                    java.lang.Object r13 = r4.b(r0)
                    if (r13 != r1) goto L_0x03b9
                    return r1
                L_0x03b9:
                    r7 = r2
                L_0x03ba:
                    f3.q1<Key, Value> r13 = r6.f8459b     // Catch:{ all -> 0x041e }
                    java.util.LinkedHashMap r13 = r13.f8456k     // Catch:{ all -> 0x041e }
                    java.lang.Object r13 = r13.get(r7)     // Catch:{ all -> 0x041e }
                    f3.v2 r13 = (f3.v2) r13     // Catch:{ all -> 0x041e }
                    r4.a(r5)
                    r4 = r2
                    r2 = r13
                    r13 = r12
                    r12 = r7
                L_0x03cb:
                    r0.f8357d = r8
                    r0.f8358e = r12
                    r0.B = r5
                    r0.C = r5
                    r0.D = r5
                    r0.E = r5
                    r6 = 15
                    r0.f8355b = r6
                    java.lang.Object r13 = f3.f1.c(r13, r4, r2, r0)
                    if (r13 != r1) goto L_0x03e2
                    return r1
                L_0x03e2:
                    r2 = r8
                L_0x03e3:
                    if (r12 != r3) goto L_0x041b
                    f3.f1 r12 = r2.f8352a
                    f3.q1$a<Key, Value> r12 = r12.f8206l
                    kotlinx.coroutines.sync.d r13 = r12.f8458a
                    r0.f8357d = r2
                    r0.f8358e = r12
                    r0.B = r13
                    r4 = 16
                    r0.f8355b = r4
                    java.lang.Object r0 = r13.b(r0)
                    if (r0 != r1) goto L_0x03fc
                    return r1
                L_0x03fc:
                    r1 = r12
                    r12 = r13
                    r0 = r2
                L_0x03ff:
                    f3.q1<Key, Value> r13 = r1.f8459b     // Catch:{ all -> 0x0416 }
                    f3.t0 r13 = r13.f8457l     // Catch:{ all -> 0x0416 }
                    f3.m0 r13 = r13.a(r3)     // Catch:{ all -> 0x0416 }
                    r12.a(r5)
                    boolean r12 = r13 instanceof f3.m0.a
                    if (r12 != 0) goto L_0x041b
                    f3.f1 r12 = r0.f8352a
                    ag.g0 r13 = r0.f8353b
                    f3.f1.d(r12, r13)
                    goto L_0x041b
                L_0x0416:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x041b:
                    ff.m r12 = ff.m.f8717a
                    return r12
                L_0x041e:
                    r12 = move-exception
                    r4.a(r5)
                    throw r12
                L_0x0423:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x0428:
                    r12 = move-exception
                    r6.a(r5)
                    throw r12
                L_0x042d:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                L_0x0432:
                    r12 = move-exception
                    r6.a(r5)
                    throw r12
                L_0x0437:
                    r13 = move-exception
                    r12.a(r5)
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: f3.l1.c.b.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f1 f1Var, d dVar, f fVar) {
            super(2, dVar);
            this.f8349c = fVar;
            this.f8350d = f1Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            c cVar = new c(this.f8350d, dVar, this.f8349c);
            cVar.f8348b = obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            kf.a aVar = kf.a.f10464a;
            int i8 = this.f8347a;
            if (i8 == 0) {
                cb.b.J(obj);
                kotlinx.coroutines.flow.c v3 = cb.d.v(this.f8349c);
                b bVar = new b(this.f8350d, (g0) this.f8348b);
                this.f8347a = 1;
                if (v3.a(bVar, this) == aVar) {
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
    public l1(f1<Object, Object> f1Var, d<? super l1> dVar) {
        super(2, dVar);
        this.B = f1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        l1 l1Var = new l1(this.B, dVar);
        l1Var.f8335e = obj;
        return l1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((l2) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: f3.l2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r10.f8334d
            f3.o0 r2 = f3.o0.f8397a
            r3 = 3
            r4 = 2
            r5 = 1
            f3.f1<java.lang.Object, java.lang.Object> r6 = r10.B
            r7 = 0
            if (r1 == 0) goto L_0x0048
            if (r1 == r5) goto L_0x0036
            if (r1 == r4) goto L_0x002d
            if (r1 != r3) goto L_0x0025
            java.lang.Object r0 = r10.f8332b
            kotlinx.coroutines.sync.c r0 = (kotlinx.coroutines.sync.c) r0
            java.lang.Object r1 = r10.f8331a
            f3.q1$a r1 = (f3.q1.a) r1
            java.lang.Object r3 = r10.f8335e
            f3.l2 r3 = (f3.l2) r3
            cb.b.J(r11)
            goto L_0x00d3
        L_0x0025:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x002d:
            java.lang.Object r1 = r10.f8335e
            f3.l2 r1 = (f3.l2) r1
            cb.b.J(r11)
            goto L_0x00bd
        L_0x0036:
            kotlinx.coroutines.sync.d r1 = r10.f8333c
            java.lang.Object r5 = r10.f8332b
            f3.q1$a r5 = (f3.q1.a) r5
            java.lang.Object r8 = r10.f8331a
            f3.j2 r8 = (f3.j2) r8
            java.lang.Object r9 = r10.f8335e
            f3.l2 r9 = (f3.l2) r9
            cb.b.J(r11)
            goto L_0x0099
        L_0x0048:
            cb.b.J(r11)
            java.lang.Object r11 = r10.f8335e
            r9 = r11
            f3.l2 r9 = (f3.l2) r9
            java.util.concurrent.atomic.AtomicBoolean r11 = r6.f8204j
            r1 = 0
            boolean r11 = r11.compareAndSet(r1, r5)
            if (r11 == 0) goto L_0x00ed
            f3.l1$a r11 = new f3.l1$a
            r11.<init>(r6, r9, r7)
            cb.b.D(r9, r7, r1, r11, r3)
            r11 = 6
            cg.a r11 = cb.d.d(r1, r7, r11)
            f3.l1$b r8 = new f3.l1$b
            r8.<init>(r6, r7, r11)
            cb.b.D(r9, r7, r1, r8, r3)
            f3.l1$c r8 = new f3.l1$c
            r8.<init>(r6, r7, r11)
            cb.b.D(r9, r7, r1, r8, r3)
            boolean r11 = r6.f8199e
            if (r11 == 0) goto L_0x00ab
            f3.j2<Key, Value> r8 = r6.f8200f
            if (r8 != 0) goto L_0x007f
            goto L_0x00ab
        L_0x007f:
            f3.g2<Key, Value> r11 = r6.f8201g
            if (r11 != 0) goto L_0x00a8
            f3.q1$a<Key, Value> r11 = r6.f8206l
            kotlinx.coroutines.sync.d r1 = r11.f8458a
            r10.f8335e = r9
            r10.f8331a = r8
            r10.f8332b = r11
            r10.f8333c = r1
            r10.f8334d = r5
            java.lang.Object r5 = r1.b(r10)
            if (r5 != r0) goto L_0x0098
            return r0
        L_0x0098:
            r5 = r11
        L_0x0099:
            f3.q1<Key, Value> r11 = r5.f8459b     // Catch:{ all -> 0x00a3 }
            f3.g2 r11 = r11.a(r7)     // Catch:{ all -> 0x00a3 }
            r1.a(r7)
            goto L_0x00a8
        L_0x00a3:
            r11 = move-exception
            r1.a(r7)
            throw r11
        L_0x00a8:
            r8.c(r2, r11)
        L_0x00ab:
            r10.f8335e = r9
            r10.f8331a = r7
            r10.f8332b = r7
            r10.f8333c = r7
            r10.f8334d = r4
            java.lang.Object r11 = r6.f(r10)
            if (r11 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r1 = r9
        L_0x00bd:
            f3.q1$a<Key, Value> r11 = r6.f8206l
            kotlinx.coroutines.sync.d r4 = r11.f8458a
            r10.f8335e = r1
            r10.f8331a = r11
            r10.f8332b = r4
            r10.f8334d = r3
            java.lang.Object r3 = r4.b(r10)
            if (r3 != r0) goto L_0x00d0
            return r0
        L_0x00d0:
            r3 = r1
            r0 = r4
            r1 = r11
        L_0x00d3:
            f3.q1<Key, Value> r11 = r1.f8459b     // Catch:{ all -> 0x00e8 }
            f3.t0 r11 = r11.f8457l     // Catch:{ all -> 0x00e8 }
            f3.m0 r11 = r11.a(r2)     // Catch:{ all -> 0x00e8 }
            r0.a(r7)
            boolean r11 = r11 instanceof f3.m0.a
            if (r11 != 0) goto L_0x00e5
            f3.f1.d(r6, r3)
        L_0x00e5:
            ff.m r11 = ff.m.f8717a
            return r11
        L_0x00e8:
            r11 = move-exception
            r0.a(r7)
            throw r11
        L_0x00ed:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package f3;

import ag.g0;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.p0;
import lf.c;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1", f = "PageFetcherSnapshot.kt", l = {222}, m = "invokeSuspend")
public final class n1 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f1<Object, Object> f8386b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o0 f8387c;

    @e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$2", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<v2, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f1<Object, Object> f8388a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f1<Object, Object> f1Var, d<? super a> dVar) {
            super(2, dVar);
            this.f8388a = f1Var;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f8388a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((v2) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            this.f8388a.f8202h.d();
            return m.f8717a;
        }
    }

    public static final class b implements f<v2> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8389a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f1 f8390b;

        public static final class a implements g<v2> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f8391a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ f1 f8392b;

            @e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
            /* renamed from: f3.n1$b$a$a  reason: collision with other inner class name */
            public static final class C0149a extends c {

                /* renamed from: a  reason: collision with root package name */
                public /* synthetic */ Object f8393a;

                /* renamed from: b  reason: collision with root package name */
                public int f8394b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ a f8395c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0149a(a aVar, d dVar) {
                    super(dVar);
                    this.f8395c = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f8393a = obj;
                    this.f8394b |= Integer.MIN_VALUE;
                    return this.f8395c.m((Object) null, this);
                }
            }

            public a(g gVar, f1 f1Var) {
                this.f8391a = gVar;
                this.f8392b = f1Var;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object m(java.lang.Object r6, jf.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof f3.n1.b.a.C0149a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    f3.n1$b$a$a r0 = (f3.n1.b.a.C0149a) r0
                    int r1 = r0.f8394b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f8394b = r1
                    goto L_0x0018
                L_0x0013:
                    f3.n1$b$a$a r0 = new f3.n1$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f8393a
                    kf.a r1 = kf.a.f10464a
                    int r2 = r0.f8394b
                    r3 = 1
                    if (r2 == 0) goto L_0x002f
                    if (r2 != r3) goto L_0x0027
                    cb.b.J(r7)
                    goto L_0x0058
                L_0x0027:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x002f:
                    cb.b.J(r7)
                    r7 = r6
                    f3.v2 r7 = (f3.v2) r7
                    int r2 = r7.f8519a
                    int r2 = r2 * -1
                    f3.f1 r4 = r5.f8392b
                    f3.w1 r4 = r4.f8197c
                    int r4 = r4.f8534e
                    if (r2 > r4) goto L_0x004a
                    int r7 = r7.f8520b
                    int r7 = r7 * -1
                    if (r7 <= r4) goto L_0x0048
                    goto L_0x004a
                L_0x0048:
                    r7 = 0
                    goto L_0x004b
                L_0x004a:
                    r7 = r3
                L_0x004b:
                    if (r7 == 0) goto L_0x0058
                    r0.f8394b = r3
                    kotlinx.coroutines.flow.g r7 = r5.f8391a
                    java.lang.Object r6 = r7.m(r6, r0)
                    if (r6 != r1) goto L_0x0058
                    return r1
                L_0x0058:
                    ff.m r6 = ff.m.f8717a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: f3.n1.b.a.m(java.lang.Object, jf.d):java.lang.Object");
            }
        }

        public b(p0 p0Var, f1 f1Var) {
            this.f8389a = p0Var;
            this.f8390b = f1Var;
        }

        public final Object a(g gVar, d dVar) {
            Object a10 = this.f8389a.a(new a(gVar, this.f8390b), dVar);
            return a10 == kf.a.f10464a ? a10 : m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(o0 o0Var, f1 f1Var, d dVar) {
        super(2, dVar);
        this.f8386b = f1Var;
        this.f8387c = o0Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new n1(this.f8387c, this.f8386b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8385a;
        if (i8 == 0) {
            cb.b.J(obj);
            f1<Object, Object> f1Var = this.f8386b;
            b bVar = new b(f1Var.f8203i.a(this.f8387c), f1Var);
            a aVar2 = new a(f1Var, (d<? super a>) null);
            this.f8385a = 1;
            if (cb.d.t(bVar, aVar2, this) == aVar) {
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

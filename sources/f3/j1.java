package f3;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.s;
import lf.c;
import lf.e;

public final class j1 implements f<g0> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8285b;

    public static final class a implements g<v2> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8286a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f8287b;

        @e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
        /* renamed from: f3.j1$a$a  reason: collision with other inner class name */
        public static final class C0142a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8288a;

            /* renamed from: b  reason: collision with root package name */
            public int f8289b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8290c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0142a(a aVar, d dVar) {
                super(dVar);
                this.f8290c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8288a = obj;
                this.f8289b |= Integer.MIN_VALUE;
                return this.f8290c.m((Object) null, this);
            }
        }

        public a(g gVar, int i8) {
            this.f8286a = gVar;
            this.f8287b = i8;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f3.j1.a.C0142a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                f3.j1$a$a r0 = (f3.j1.a.C0142a) r0
                int r1 = r0.f8289b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8289b = r1
                goto L_0x0018
            L_0x0013:
                f3.j1$a$a r0 = new f3.j1$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8288a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8289b
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                cb.b.J(r6)
                goto L_0x0046
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                cb.b.J(r6)
                f3.v2 r5 = (f3.v2) r5
                f3.g0 r6 = new f3.g0
                int r2 = r4.f8287b
                r6.<init>(r2, r5)
                r0.f8289b = r3
                kotlinx.coroutines.flow.g r5 = r4.f8286a
                java.lang.Object r5 = r5.m(r6, r0)
                if (r5 != r1) goto L_0x0046
                return r1
            L_0x0046:
                ff.m r5 = ff.m.f8717a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.j1.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public j1(s sVar, int i8) {
        this.f8284a = sVar;
        this.f8285b = i8;
    }

    public final Object a(g gVar, d dVar) {
        Object a10 = this.f8284a.a(new a(gVar, this.f8285b), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

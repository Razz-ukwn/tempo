package f3;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.n0;
import lf.c;
import lf.e;

public final class l implements f<x1<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8321a;

    public static final class a implements g<r0<Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8322a;

        @e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {137}, m = "emit")
        /* renamed from: f3.l$a$a  reason: collision with other inner class name */
        public static final class C0146a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8323a;

            /* renamed from: b  reason: collision with root package name */
            public int f8324b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8325c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0146a(a aVar, d dVar) {
                super(dVar);
                this.f8325c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8323a = obj;
                this.f8324b |= Integer.MIN_VALUE;
                return this.f8325c.m((Object) null, this);
            }
        }

        public a(g gVar) {
            this.f8322a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f3.l.a.C0146a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                f3.l$a$a r0 = (f3.l.a.C0146a) r0
                int r1 = r0.f8324b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8324b = r1
                goto L_0x0018
            L_0x0013:
                f3.l$a$a r0 = new f3.l$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8323a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8324b
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                cb.b.J(r6)
                goto L_0x004f
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                cb.b.J(r6)
                f3.r0 r5 = (f3.r0) r5
                r5.getClass()
                f3.x1 r6 = new f3.x1
                f3.k<T> r2 = r5.f8465c
                kotlinx.coroutines.flow.n0 r2 = r2.f8295e
                f3.x1<T> r5 = r5.f8464b
                f3.t2 r5 = r5.f8544b
                r6.<init>(r2, r5)
                r0.f8324b = r3
                kotlinx.coroutines.flow.g r5 = r4.f8322a
                java.lang.Object r5 = r5.m(r6, r0)
                if (r5 != r1) goto L_0x004f
                return r1
            L_0x004f:
                ff.m r5 = ff.m.f8717a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.l.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public l(n0 n0Var) {
        this.f8321a = n0Var;
    }

    public final Object a(g gVar, d dVar) {
        Object a10 = this.f8321a.a(new a(gVar), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

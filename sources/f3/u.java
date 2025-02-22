package f3;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.k0;
import lf.c;
import lf.e;

public final class u implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8499a;

    public static final class a implements g<ff.g<? extends Integer, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f8500a;

        @e(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {138}, m = "emit")
        /* renamed from: f3.u$a$a  reason: collision with other inner class name */
        public static final class C0151a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8501a;

            /* renamed from: b  reason: collision with root package name */
            public int f8502b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8503c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0151a(a aVar, d dVar) {
                super(dVar);
                this.f8503c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8501a = obj;
                this.f8502b |= Integer.MIN_VALUE;
                return this.f8503c.m((Object) null, this);
            }
        }

        public a(g gVar) {
            this.f8500a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r5, jf.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f3.u.a.C0151a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                f3.u$a$a r0 = (f3.u.a.C0151a) r0
                int r1 = r0.f8502b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8502b = r1
                goto L_0x0018
            L_0x0013:
                f3.u$a$a r0 = new f3.u$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8501a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8502b
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                cb.b.J(r6)
                goto L_0x0044
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                cb.b.J(r6)
                ff.g r5 = (ff.g) r5
                B r5 = r5.f8707b
                if (r5 != 0) goto L_0x0039
                goto L_0x0044
            L_0x0039:
                r0.f8502b = r3
                kotlinx.coroutines.flow.g r6 = r4.f8500a
                java.lang.Object r5 = r6.m(r5, r0)
                if (r5 != r1) goto L_0x0044
                return r1
            L_0x0044:
                ff.m r5 = ff.m.f8717a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.u.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public u(k0 k0Var) {
        this.f8499a = k0Var;
    }

    public final Object a(g gVar, d dVar) {
        Object a10 = this.f8499a.a(new a(gVar), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

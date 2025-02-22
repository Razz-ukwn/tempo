package f3;

import ff.m;
import gf.v;
import jf.d;
import kotlinx.coroutines.flow.w;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import sf.t;

@e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {257}, m = "invokeSuspend")
public final class g extends i implements p<kotlinx.coroutines.flow.g<? super y0<Object>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8231a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8232b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k<Object> f8233c;

    @e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<v<? extends y0<Object>>, d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f8234a;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        public final d<m> create(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f8234a = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((v) obj, (d) obj2)).invokeSuspend(m.f8717a);
        }

        public final Object invokeSuspend(Object obj) {
            cb.b.J(obj);
            return Boolean.valueOf(((v) this.f8234a) != null);
        }
    }

    public static final class b implements kotlinx.coroutines.flow.g<v<? extends y0<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f8235a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.g f8236b;

        @e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {136}, m = "emit")
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8237a;

            /* renamed from: b  reason: collision with root package name */
            public int f8238b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b f8239c;

            /* renamed from: d  reason: collision with root package name */
            public b f8240d;

            /* renamed from: e  reason: collision with root package name */
            public v f8241e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, d dVar) {
                super(dVar);
                this.f8239c = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8237a = obj;
                this.f8238b |= Integer.MIN_VALUE;
                return this.f8239c.m((v<? extends y0<Object>>) null, this);
            }
        }

        public b(t tVar, kotlinx.coroutines.flow.g gVar) {
            this.f8235a = tVar;
            this.f8236b = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(gf.v<? extends f3.y0<java.lang.Object>> r5, jf.d<? super ff.m> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof f3.g.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                f3.g$b$a r0 = (f3.g.b.a) r0
                int r1 = r0.f8238b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8238b = r1
                goto L_0x0018
            L_0x0013:
                f3.g$b$a r0 = new f3.g$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8237a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8238b
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                gf.v r5 = r0.f8241e
                f3.g$b r0 = r0.f8240d
                cb.b.J(r6)
                goto L_0x0055
            L_0x002b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0033:
                cb.b.J(r6)
                gf.v r5 = (gf.v) r5
                sf.j.c(r5)
                sf.t r6 = r4.f8235a
                int r6 = r6.f14955a
                int r2 = r5.f8981a
                if (r2 <= r6) goto L_0x005b
                r0.f8240d = r4
                r0.f8241e = r5
                r0.f8238b = r3
                kotlinx.coroutines.flow.g r6 = r4.f8236b
                T r2 = r5.f8982b
                java.lang.Object r6 = r6.m(r2, r0)
                if (r6 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r0 = r4
            L_0x0055:
                sf.t r6 = r0.f8235a
                int r5 = r5.f8981a
                r6.f14955a = r5
            L_0x005b:
                ff.m r5 = ff.m.f8717a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.g.b.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k<Object> kVar, d<? super g> dVar) {
        super(2, dVar);
        this.f8233c = kVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        g gVar = new g(this.f8233c, dVar);
        gVar.f8232b = obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((kotlinx.coroutines.flow.g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8231a;
        if (i8 == 0) {
            cb.b.J(obj);
            t tVar = new t();
            tVar.f14955a = Integer.MIN_VALUE;
            w wVar = new w(new a((d<? super a>) null), this.f8233c.f8293c);
            b bVar = new b(tVar, (kotlinx.coroutines.flow.g) this.f8232b);
            this.f8231a = 1;
            if (wVar.a(bVar, this) == aVar) {
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

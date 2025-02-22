package kotlinx.coroutines.flow;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.l;
import lf.c;
import m9.b;
import rf.l;
import rf.p;
import sf.v;

public final class e<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f10534a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, Object> f10535b;

    /* renamed from: c  reason: collision with root package name */
    public final p<Object, Object, Boolean> f10536c;

    public static final class a<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e<T> f10537a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v<Object> f10538b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g<T> f10539c;

        @lf.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.e$a$a  reason: collision with other inner class name */
        public static final class C0196a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10540a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a<T> f10541b;

            /* renamed from: c  reason: collision with root package name */
            public int f10542c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0196a(a<? super T> aVar, d<? super C0196a> dVar) {
                super(dVar);
                this.f10541b = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f10540a = obj;
                this.f10542c |= Integer.MIN_VALUE;
                return this.f10541b.m(null, this);
            }
        }

        public a(e<T> eVar, v<Object> vVar, g<? super T> gVar) {
            this.f10537a = eVar;
            this.f10538b = vVar;
            this.f10539c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(T r8, jf.d<? super ff.m> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.e.a.C0196a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                kotlinx.coroutines.flow.e$a$a r0 = (kotlinx.coroutines.flow.e.a.C0196a) r0
                int r1 = r0.f10542c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10542c = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.e$a$a r0 = new kotlinx.coroutines.flow.e$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f10540a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f10542c
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                cb.b.J(r9)
                goto L_0x0061
            L_0x0027:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x002f:
                cb.b.J(r9)
                kotlinx.coroutines.flow.e<T> r9 = r7.f10537a
                rf.l<T, java.lang.Object> r2 = r9.f10535b
                java.lang.Object r2 = r2.invoke(r8)
                sf.v<java.lang.Object> r4 = r7.f10538b
                T r5 = r4.f14957a
                kotlinx.coroutines.internal.v r6 = m9.b.f11323d
                if (r5 == r6) goto L_0x0054
                rf.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r9 = r9.f10536c
                java.lang.Object r9 = r9.invoke(r5, r2)
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                ff.m r8 = ff.m.f8717a
                return r8
            L_0x0054:
                r4.f14957a = r2
                r0.f10542c = r3
                kotlinx.coroutines.flow.g<T> r9 = r7.f10539c
                java.lang.Object r8 = r9.m(r8, r0)
                if (r8 != r1) goto L_0x0061
                return r1
            L_0x0061:
                ff.m r8 = ff.m.f8717a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.e.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public e(f fVar) {
        l.b bVar = l.f10579a;
        l.a aVar = l.f10580b;
        this.f10534a = fVar;
        this.f10535b = bVar;
        this.f10536c = aVar;
    }

    public final Object a(g<? super T> gVar, d<? super m> dVar) {
        v vVar = new v();
        vVar.f14957a = b.f11323d;
        Object a10 = this.f10534a.a(new a(this, vVar, gVar), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

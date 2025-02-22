package f3;

import ag.g0;
import cb.b;
import ff.m;
import gf.v;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.f0;
import kotlinx.coroutines.flow.g;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import sf.t;

@e(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {257}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f<y0<Object>> f8251b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k<Object> f8252c;

    public static final class a implements g<v<? extends y0<Object>>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f8253a;

        @e(c = "androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {135, 136}, m = "emit")
        /* renamed from: f3.h$a$a  reason: collision with other inner class name */
        public static final class C0141a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8254a;

            /* renamed from: b  reason: collision with root package name */
            public int f8255b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8256c;

            /* renamed from: d  reason: collision with root package name */
            public a f8257d;

            /* renamed from: e  reason: collision with root package name */
            public v f8258e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0141a(a aVar, d dVar) {
                super(dVar);
                this.f8256c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8254a = obj;
                this.f8255b |= Integer.MIN_VALUE;
                return this.f8256c.m((v<? extends y0<Object>>) null, this);
            }
        }

        public a(k kVar) {
            this.f8253a = kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(gf.v<? extends f3.y0<java.lang.Object>> r6, jf.d<? super ff.m> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof f3.h.a.C0141a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                f3.h$a$a r0 = (f3.h.a.C0141a) r0
                int r1 = r0.f8255b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8255b = r1
                goto L_0x0018
            L_0x0013:
                f3.h$a$a r0 = new f3.h$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f8254a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8255b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                cb.b.J(r7)
                goto L_0x0063
            L_0x002a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0032:
                gf.v r6 = r0.f8258e
                f3.h$a r2 = r0.f8257d
                cb.b.J(r7)
                goto L_0x0051
            L_0x003a:
                cb.b.J(r7)
                gf.v r6 = (gf.v) r6
                f3.k r7 = r5.f8253a
                kotlinx.coroutines.flow.p0 r7 = r7.f8292b
                r0.f8257d = r5
                r0.f8258e = r6
                r0.f8255b = r4
                java.lang.Object r7 = r7.m(r6, r0)
                if (r7 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r2 = r5
            L_0x0051:
                f3.k r7 = r2.f8253a
                f3.b0<T> r7 = r7.f8291a
                r2 = 0
                r0.f8257d = r2
                r0.f8258e = r2
                r0.f8255b = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L_0x0063
                return r1
            L_0x0063:
                ff.m r6 = ff.m.f8717a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.h.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f<? extends y0<Object>> fVar, k<Object> kVar, d<? super h> dVar) {
        super(2, dVar);
        this.f8251b = fVar;
        this.f8252c = kVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f8251b, this.f8252c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8250a;
        if (i8 == 0) {
            b.J(obj);
            a aVar2 = new a(this.f8252c);
            this.f8250a = 1;
            Object a10 = this.f8251b.a(new f0(new t(), aVar2), this);
            if (a10 != aVar) {
                a10 = m.f8717a;
            }
            if (a10 == aVar) {
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

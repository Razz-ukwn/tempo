package kotlinx.coroutines.flow;

import ff.m;
import jf.d;
import lf.c;
import lf.e;

public final class d0 implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10529a;

    public static final class a<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f10530a;

        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.d0$a$a  reason: collision with other inner class name */
        public static final class C0195a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10531a;

            /* renamed from: b  reason: collision with root package name */
            public int f10532b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f10533c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0195a(a aVar, d dVar) {
                super(dVar);
                this.f10533c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f10531a = obj;
                this.f10532b |= Integer.MIN_VALUE;
                return this.f10533c.m(null, this);
            }
        }

        public a(g gVar) {
            this.f10530a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(T r5, jf.d<? super ff.m> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d0.a.C0195a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                kotlinx.coroutines.flow.d0$a$a r0 = (kotlinx.coroutines.flow.d0.a.C0195a) r0
                int r1 = r0.f10532b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10532b = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.d0$a$a r0 = new kotlinx.coroutines.flow.d0$a$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f10531a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f10532b
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                cb.b.J(r6)
                goto L_0x003f
            L_0x0027:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002f:
                cb.b.J(r6)
                if (r5 == 0) goto L_0x003f
                r0.f10532b = r3
                kotlinx.coroutines.flow.g r6 = r4.f10530a
                java.lang.Object r5 = r6.m(r5, r0)
                if (r5 != r1) goto L_0x003f
                return r1
            L_0x003f:
                ff.m r5 = ff.m.f8717a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d0.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public d0(f fVar) {
        this.f10529a = fVar;
    }

    public final Object a(g gVar, d dVar) {
        Object a10 = this.f10529a.a(new a(gVar), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

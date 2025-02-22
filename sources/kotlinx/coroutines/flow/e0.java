package kotlinx.coroutines.flow;

import ff.m;
import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class e0 implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10544b;

    public static final class a<T> implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f10545a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p f10546b;

        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.e0$a$a  reason: collision with other inner class name */
        public static final class C0197a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f10547a;

            /* renamed from: b  reason: collision with root package name */
            public int f10548b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f10549c;

            /* renamed from: d  reason: collision with root package name */
            public Object f10550d;

            /* renamed from: e  reason: collision with root package name */
            public g f10551e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0197a(a aVar, d dVar) {
                super(dVar);
                this.f10549c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f10547a = obj;
                this.f10548b |= Integer.MIN_VALUE;
                return this.f10549c.m(null, this);
            }
        }

        public a(p pVar, g gVar) {
            this.f10545a = gVar;
            this.f10546b = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(T r6, jf.d<? super ff.m> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.e0.a.C0197a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                kotlinx.coroutines.flow.e0$a$a r0 = (kotlinx.coroutines.flow.e0.a.C0197a) r0
                int r1 = r0.f10548b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f10548b = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.flow.e0$a$a r0 = new kotlinx.coroutines.flow.e0$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f10547a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f10548b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                cb.b.J(r7)
                goto L_0x005e
            L_0x002a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0032:
                kotlinx.coroutines.flow.g r6 = r0.f10551e
                java.lang.Object r2 = r0.f10550d
                cb.b.J(r7)
                goto L_0x0050
            L_0x003a:
                cb.b.J(r7)
                r0.f10550d = r6
                kotlinx.coroutines.flow.g r7 = r5.f10545a
                r0.f10551e = r7
                r0.f10548b = r4
                rf.p r2 = r5.f10546b
                java.lang.Object r2 = r2.invoke(r6, r0)
                if (r2 != r1) goto L_0x004e
                return r1
            L_0x004e:
                r2 = r6
                r6 = r7
            L_0x0050:
                r7 = 0
                r0.f10550d = r7
                r0.f10551e = r7
                r0.f10548b = r3
                java.lang.Object r6 = r6.m(r2, r0)
                if (r6 != r1) goto L_0x005e
                return r1
            L_0x005e:
                ff.m r6 = ff.m.f8717a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.e0.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    public e0(p pVar, p pVar2) {
        this.f10543a = pVar2;
        this.f10544b = pVar;
    }

    public final Object a(g gVar, d dVar) {
        Object a10 = this.f10543a.a(new a(this.f10544b, gVar), dVar);
        return a10 == kf.a.f10464a ? a10 : m.f8717a;
    }
}

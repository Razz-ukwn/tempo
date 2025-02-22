package f3;

import cb.b;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.g;
import lf.c;
import lf.e;
import lf.i;
import rf.p;
import rf.q;
import sf.v;

@e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
public final class d0 extends i implements p<g<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f8112a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f8114c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q<Object, Object, d<Object>, Object> f8115d;

    public static final class a implements g<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f8116a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f8117b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f8118c;

        @e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {139, 142}, m = "emit")
        /* renamed from: f3.d0$a$a  reason: collision with other inner class name */
        public static final class C0134a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8119a;

            /* renamed from: b  reason: collision with root package name */
            public int f8120b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8121c;

            /* renamed from: d  reason: collision with root package name */
            public a f8122d;

            /* renamed from: e  reason: collision with root package name */
            public v f8123e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0134a(a aVar, d dVar) {
                super(dVar);
                this.f8121c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8119a = obj;
                this.f8120b |= Integer.MIN_VALUE;
                return this.f8121c.m((Object) null, this);
            }
        }

        public a(v vVar, q qVar, g gVar) {
            this.f8116a = vVar;
            this.f8117b = qVar;
            this.f8118c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(T r8, jf.d<? super ff.m> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof f3.d0.a.C0134a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                f3.d0$a$a r0 = (f3.d0.a.C0134a) r0
                int r1 = r0.f8120b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8120b = r1
                goto L_0x0018
            L_0x0013:
                f3.d0$a$a r0 = new f3.d0$a$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f8119a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8120b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                cb.b.J(r9)
                goto L_0x006f
            L_0x002a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0032:
                sf.v r8 = r0.f8123e
                f3.d0$a r2 = r0.f8122d
                cb.b.J(r9)
                goto L_0x0059
            L_0x003a:
                cb.b.J(r9)
                sf.v r9 = r7.f8116a
                T r2 = r9.f14957a
                java.lang.Object r5 = f3.f0.f8186a
                if (r2 != r5) goto L_0x0046
                goto L_0x0055
            L_0x0046:
                r0.f8122d = r7
                r0.f8123e = r9
                r0.f8120b = r4
                rf.q r4 = r7.f8117b
                java.lang.Object r8 = r4.e(r2, r8, r0)
                if (r8 != r1) goto L_0x0055
                return r1
            L_0x0055:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x0059:
                r8.f14957a = r9
                kotlinx.coroutines.flow.g r8 = r2.f8118c
                sf.v r9 = r2.f8116a
                T r9 = r9.f14957a
                r2 = 0
                r0.f8122d = r2
                r0.f8123e = r2
                r0.f8120b = r3
                java.lang.Object r8 = r8.m(r9, r0)
                if (r8 != r1) goto L_0x006f
                return r1
            L_0x006f:
                ff.m r8 = ff.m.f8717a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.d0.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(f<Object> fVar, q<Object, Object, ? super d<Object>, ? extends Object> qVar, d<? super d0> dVar) {
        super(2, dVar);
        this.f8114c = fVar;
        this.f8115d = qVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        d0 d0Var = new d0(this.f8114c, this.f8115d, dVar);
        d0Var.f8113b = obj;
        return d0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8112a;
        if (i8 == 0) {
            b.J(obj);
            v vVar = new v();
            vVar.f14957a = f0.f8186a;
            a aVar2 = new a(vVar, this.f8115d, (g) this.f8113b);
            this.f8112a = 1;
            if (this.f8114c.a(aVar2, this) == aVar) {
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

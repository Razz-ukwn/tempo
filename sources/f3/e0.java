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

@e(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {52, 222}, m = "invokeSuspend")
public final class e0 extends i implements p<g<Object>, d<? super m>, Object> {
    public final /* synthetic */ q<Object, Object, d<Object>, Object> B;

    /* renamed from: a  reason: collision with root package name */
    public v f8126a;

    /* renamed from: b  reason: collision with root package name */
    public int f8127b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8128c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f8129d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f<Object> f8130e;

    public static final class a implements g<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f8131a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f8132b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f8133c;

        @e(c = "androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {135, 136}, m = "emit")
        /* renamed from: f3.e0$a$a  reason: collision with other inner class name */
        public static final class C0135a extends c {

            /* renamed from: a  reason: collision with root package name */
            public /* synthetic */ Object f8134a;

            /* renamed from: b  reason: collision with root package name */
            public int f8135b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f8136c;

            /* renamed from: d  reason: collision with root package name */
            public a f8137d;

            /* renamed from: e  reason: collision with root package name */
            public v f8138e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0135a(a aVar, d dVar) {
                super(dVar);
                this.f8136c = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8134a = obj;
                this.f8135b |= Integer.MIN_VALUE;
                return this.f8136c.m((Object) null, this);
            }
        }

        public a(v vVar, q qVar, g gVar) {
            this.f8131a = vVar;
            this.f8132b = qVar;
            this.f8133c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r7, jf.d<? super ff.m> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof f3.e0.a.C0135a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                f3.e0$a$a r0 = (f3.e0.a.C0135a) r0
                int r1 = r0.f8135b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8135b = r1
                goto L_0x0018
            L_0x0013:
                f3.e0$a$a r0 = new f3.e0$a$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f8134a
                kf.a r1 = kf.a.f10464a
                int r2 = r0.f8135b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003a
                if (r2 == r4) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                cb.b.J(r8)
                goto L_0x006a
            L_0x002a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0032:
                sf.v r7 = r0.f8138e
                f3.e0$a r2 = r0.f8137d
                cb.b.J(r8)
                goto L_0x0054
            L_0x003a:
                cb.b.J(r8)
                sf.v r8 = r6.f8131a
                T r2 = r8.f14957a
                r0.f8137d = r6
                r0.f8138e = r8
                r0.f8135b = r4
                rf.q r4 = r6.f8132b
                java.lang.Object r7 = r4.e(r2, r7, r0)
                if (r7 != r1) goto L_0x0050
                return r1
            L_0x0050:
                r2 = r6
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x0054:
                r7.f14957a = r8
                kotlinx.coroutines.flow.g r7 = r2.f8133c
                sf.v r8 = r2.f8131a
                T r8 = r8.f14957a
                r2 = 0
                r0.f8137d = r2
                r0.f8138e = r2
                r0.f8135b = r3
                java.lang.Object r7 = r7.m(r8, r0)
                if (r7 != r1) goto L_0x006a
                return r1
            L_0x006a:
                ff.m r7 = ff.m.f8717a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.e0.a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(Object obj, f<Object> fVar, q<Object, Object, ? super d<Object>, ? extends Object> qVar, d<? super e0> dVar) {
        super(2, dVar);
        this.f8129d = obj;
        this.f8130e = fVar;
        this.B = qVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e0 e0Var = new e0(this.f8129d, this.f8130e, this.B, dVar);
        e0Var.f8128c = obj;
        return e0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        g gVar;
        v vVar;
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f8127b;
        if (i8 == 0) {
            b.J(obj);
            g gVar2 = (g) this.f8128c;
            vVar = new v();
            T t2 = this.f8129d;
            vVar.f14957a = t2;
            this.f8128c = gVar2;
            this.f8126a = vVar;
            this.f8127b = 1;
            if (gVar2.m(t2, this) == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else if (i8 == 1) {
            vVar = this.f8126a;
            gVar = (g) this.f8128c;
            b.J(obj);
        } else if (i8 == 2) {
            b.J(obj);
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar2 = new a(vVar, this.B, gVar);
        this.f8128c = null;
        this.f8126a = null;
        this.f8127b = 2;
        if (this.f8130e.a(aVar2, this) == aVar) {
            return aVar;
        }
        return m.f8717a;
    }
}

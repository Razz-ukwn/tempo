package kotlinx.coroutines.flow;

import gf.v;
import jf.d;
import lf.c;
import lf.e;
import sf.t;

public final class f0<T> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g<v<? extends T>> f10552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f10553b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {65}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10554a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f0<T> f10555b;

        /* renamed from: c  reason: collision with root package name */
        public int f10556c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f0<? super T> f0Var, d<? super a> dVar) {
            super(dVar);
            this.f10555b = f0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10554a = obj;
            this.f10556c |= Integer.MIN_VALUE;
            return this.f10555b.m(null, this);
        }
    }

    public f0(t tVar, g gVar) {
        this.f10552a = gVar;
        this.f10553b = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(T r7, jf.d<? super ff.m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.f0.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.f0$a r0 = (kotlinx.coroutines.flow.f0.a) r0
            int r1 = r0.f10556c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10556c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.f0$a r0 = new kotlinx.coroutines.flow.f0$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f10554a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10556c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            cb.b.J(r8)
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            cb.b.J(r8)
            gf.v r8 = new gf.v
            sf.t r2 = r6.f10553b
            int r4 = r2.f14955a
            int r5 = r4 + 1
            r2.f14955a = r5
            if (r4 < 0) goto L_0x004f
            r8.<init>(r4, r7)
            r0.f10556c = r3
            kotlinx.coroutines.flow.g<gf.v<? extends T>> r7 = r6.f10552a
            java.lang.Object r7 = r7.m(r8, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x004f:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "Index overflow has happened"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f0.m(java.lang.Object, jf.d):java.lang.Object");
    }
}

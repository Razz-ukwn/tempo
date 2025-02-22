package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;

public final class t<T> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ sf.t f10639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10640b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g<T> f10641c;

    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {25}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10642a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t<T> f10643b;

        /* renamed from: c  reason: collision with root package name */
        public int f10644c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(t<? super T> tVar, d<? super a> dVar) {
            super(dVar);
            this.f10643b = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10642a = obj;
            this.f10644c |= Integer.MIN_VALUE;
            return this.f10643b.m(null, this);
        }
    }

    public t(sf.t tVar, int i8, g<? super T> gVar) {
        this.f10639a = tVar;
        this.f10640b = i8;
        this.f10641c = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(T r6, jf.d<? super ff.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.t$a r0 = (kotlinx.coroutines.flow.t.a) r0
            int r1 = r0.f10644c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10644c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.t$a r0 = new kotlinx.coroutines.flow.t$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10642a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10644c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            cb.b.J(r7)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            cb.b.J(r7)
            sf.t r7 = r5.f10639a
            int r2 = r7.f14955a
            int r4 = r5.f10640b
            if (r2 < r4) goto L_0x0048
            r0.f10644c = r3
            kotlinx.coroutines.flow.g<T> r7 = r5.f10641c
            java.lang.Object r6 = r7.m(r6, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            ff.m r6 = ff.m.f8717a
            return r6
        L_0x0048:
            int r2 = r2 + r3
            r7.f14955a = r2
            ff.m r6 = ff.m.f8717a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.t.m(java.lang.Object, jf.d):java.lang.Object");
    }
}

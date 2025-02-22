package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import rf.p;
import sf.v;

public final class a0 implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f10485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f10486b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public a0 f10487a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10488b;

        /* renamed from: c  reason: collision with root package name */
        public int f10489c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a0 f10490d;

        /* renamed from: e  reason: collision with root package name */
        public Object f10491e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, d dVar) {
            super(dVar);
            this.f10490d = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10488b = obj;
            this.f10489c |= Integer.MIN_VALUE;
            return this.f10490d.m((Object) null, this);
        }
    }

    public a0(p pVar, v vVar) {
        this.f10485a = pVar;
        this.f10486b = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(T r5, jf.d<? super ff.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.a0.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.a0$a r0 = (kotlinx.coroutines.flow.a0.a) r0
            int r1 = r0.f10489c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10489c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.a0$a r0 = new kotlinx.coroutines.flow.a0$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10488b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10489c
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f10491e
            kotlinx.coroutines.flow.a0 r0 = r0.f10487a
            cb.b.J(r6)
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            cb.b.J(r6)
            r0.f10487a = r4
            r0.f10491e = r5
            r0.f10489c = r3
            rf.p r6 = r4.f10485a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r4
        L_0x0046:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0053
            sf.v r6 = r0.f10486b
            r6.f14957a = r5
            r3 = 0
        L_0x0053:
            if (r3 == 0) goto L_0x0058
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0058:
            dg.a r5 = new dg.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a0.m(java.lang.Object, jf.d):java.lang.Object");
    }
}

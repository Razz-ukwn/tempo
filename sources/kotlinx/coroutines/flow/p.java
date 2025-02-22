package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import rf.q;

public final class p implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f10606b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10607a;

        /* renamed from: b  reason: collision with root package name */
        public int f10608b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p f10609c;

        /* renamed from: d  reason: collision with root package name */
        public p f10610d;

        /* renamed from: e  reason: collision with root package name */
        public g f10611e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(p pVar, d dVar) {
            super(dVar);
            this.f10609c = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10607a = obj;
            this.f10608b |= Integer.MIN_VALUE;
            return this.f10609c.a((g<Object>) null, this);
        }
    }

    public p(f fVar, q qVar) {
        this.f10605a = fVar;
        this.f10606b = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<java.lang.Object> r6, jf.d<? super ff.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.p$a r0 = (kotlinx.coroutines.flow.p.a) r0
            int r1 = r0.f10608b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10608b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.p$a r0 = new kotlinx.coroutines.flow.p$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10607a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10608b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r7)
            goto L_0x0061
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            kotlinx.coroutines.flow.g r6 = r0.f10611e
            kotlinx.coroutines.flow.p r2 = r0.f10610d
            cb.b.J(r7)
            goto L_0x004d
        L_0x003a:
            cb.b.J(r7)
            r0.f10610d = r5
            r0.f10611e = r6
            r0.f10608b = r4
            kotlinx.coroutines.flow.f r7 = r5.f10605a
            java.io.Serializable r7 = cb.d.r(r0, r7, r6)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x0061
            rf.q r2 = r2.f10606b
            r4 = 0
            r0.f10610d = r4
            r0.f10611e = r4
            r0.f10608b = r3
            java.lang.Object r6 = r2.e(r6, r7, r0)
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            ff.m r6 = ff.m.f8717a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.p.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

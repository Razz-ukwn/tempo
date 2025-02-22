package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class x implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f10678a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f10679b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public x f10680a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10681b;

        /* renamed from: c  reason: collision with root package name */
        public int f10682c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x f10683d;

        /* renamed from: e  reason: collision with root package name */
        public Object f10684e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x xVar, d dVar) {
            super(dVar);
            this.f10683d = xVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10681b = obj;
            this.f10682c |= Integer.MIN_VALUE;
            return this.f10683d.m((Object) null, this);
        }
    }

    public x(p pVar, g gVar) {
        this.f10678a = pVar;
        this.f10679b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.lang.Object r8, jf.d<? super ff.m> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.x.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.x$a r0 = (kotlinx.coroutines.flow.x.a) r0
            int r1 = r0.f10682c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10682c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.x$a r0 = new kotlinx.coroutines.flow.x$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f10681b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10682c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlinx.coroutines.flow.x r8 = r0.f10680a
            cb.b.J(r9)
            goto L_0x006e
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            java.lang.Object r8 = r0.f10684e
            kotlinx.coroutines.flow.x r2 = r0.f10680a
            cb.b.J(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L_0x0055
        L_0x0040:
            cb.b.J(r9)
            r0.f10680a = r7
            r0.f10684e = r8
            r0.f10682c = r4
            rf.p r9 = r7.f10678a
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r9
            r9 = r8
            r8 = r7
        L_0x0055:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x006d
            kotlinx.coroutines.flow.g r2 = r8.f10679b
            r0.f10680a = r8
            r5 = 0
            r0.f10684e = r5
            r0.f10682c = r3
            java.lang.Object r9 = r2.m(r9, r0)
            if (r9 != r1) goto L_0x006e
            return r1
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 == 0) goto L_0x0073
            ff.m r8 = ff.m.f8717a
            return r8
        L_0x0073:
            dg.a r9 = new dg.a
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.m(java.lang.Object, jf.d):java.lang.Object");
    }
}

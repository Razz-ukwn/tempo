package kotlinx.coroutines.flow;

import f3.g;
import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class w implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10666b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {124}, m = "collect")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10667a;

        /* renamed from: b  reason: collision with root package name */
        public int f10668b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ w f10669c;

        /* renamed from: d  reason: collision with root package name */
        public x f10670d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w wVar, d dVar) {
            super(dVar);
            this.f10669c = wVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10667a = obj;
            this.f10668b |= Integer.MIN_VALUE;
            return this.f10669c.a((g<Object>) null, this);
        }
    }

    public w(g.a aVar, b1 b1Var) {
        this.f10665a = b1Var;
        this.f10666b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<java.lang.Object> r6, jf.d<? super ff.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.w.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.w$a r0 = (kotlinx.coroutines.flow.w.a) r0
            int r1 = r0.f10668b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10668b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.w$a r0 = new kotlinx.coroutines.flow.w$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10667a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10668b
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlinx.coroutines.flow.x r6 = r0.f10670d
            cb.b.J(r7)     // Catch:{ a -> 0x0029 }
            goto L_0x0051
        L_0x0029:
            r7 = move-exception
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            cb.b.J(r7)
            kotlinx.coroutines.flow.f r7 = r5.f10665a
            kotlinx.coroutines.flow.x r2 = new kotlinx.coroutines.flow.x
            rf.p r4 = r5.f10666b
            r2.<init>(r4, r6)
            r0.f10670d = r2     // Catch:{ a -> 0x004a }
            r0.f10668b = r3     // Catch:{ a -> 0x004a }
            java.lang.Object r6 = r7.a(r2, r0)     // Catch:{ a -> 0x004a }
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x004a:
            r6 = move-exception
            r7 = r6
            r6 = r2
        L_0x004d:
            kotlinx.coroutines.flow.g<?> r0 = r7.f7525a
            if (r0 != r6) goto L_0x0054
        L_0x0051:
            ff.m r6 = ff.m.f8717a
            return r6
        L_0x0054:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.w.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

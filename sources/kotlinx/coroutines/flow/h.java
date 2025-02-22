package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;

public final class h implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object[] f10560a;

    @e(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {114}, m = "collect")
    public static final class a extends c {
        public int B;
        public int C;

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10561a;

        /* renamed from: b  reason: collision with root package name */
        public int f10562b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h f10563c;

        /* renamed from: d  reason: collision with root package name */
        public h f10564d;

        /* renamed from: e  reason: collision with root package name */
        public g f10565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, d dVar) {
            super(dVar);
            this.f10563c = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10561a = obj;
            this.f10562b |= Integer.MIN_VALUE;
            return this.f10563c.a((g<Object>) null, this);
        }
    }

    public h(Object[] objArr) {
        this.f10560a = objArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<java.lang.Object> r8, jf.d<? super ff.m> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.h$a r0 = (kotlinx.coroutines.flow.h.a) r0
            int r1 = r0.f10562b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10562b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.h$a r0 = new kotlinx.coroutines.flow.h$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f10561a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10562b
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r8 = r0.C
            int r2 = r0.B
            kotlinx.coroutines.flow.g r4 = r0.f10565e
            kotlinx.coroutines.flow.h r5 = r0.f10564d
            cb.b.J(r9)
            r9 = r4
            goto L_0x005a
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            cb.b.J(r9)
            java.lang.Object[] r9 = r7.f10560a
            int r9 = r9.length
            r2 = 0
            r5 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x0043:
            if (r2 >= r8) goto L_0x005c
            java.lang.Object[] r4 = r5.f10560a
            r4 = r4[r2]
            r0.f10564d = r5
            r0.f10565e = r9
            r0.B = r2
            r0.C = r8
            r0.f10562b = r3
            java.lang.Object r4 = r9.m(r4, r0)
            if (r4 != r1) goto L_0x005a
            return r1
        L_0x005a:
            int r2 = r2 + r3
            goto L_0x0043
        L_0x005c:
            ff.m r8 = ff.m.f8717a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

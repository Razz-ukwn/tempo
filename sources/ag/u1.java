package ag;

import ff.m;
import jf.d;
import lf.e;
import lf.h;
import rf.p;
import yf.i;

@e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
public final class u1 extends h implements p<i<? super n1>, d<? super m>, Object> {
    public final /* synthetic */ s1 B;

    /* renamed from: b  reason: collision with root package name */
    public kotlinx.coroutines.internal.h f488b;

    /* renamed from: c  reason: collision with root package name */
    public kotlinx.coroutines.internal.i f489c;

    /* renamed from: d  reason: collision with root package name */
    public int f490d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f491e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1(d dVar, s1 s1Var) {
        super(dVar);
        this.B = s1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        u1 u1Var = new u1(dVar, this.B);
        u1Var.f491e = obj;
        return u1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((i) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r8.f490d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            kotlinx.coroutines.internal.i r1 = r8.f489c
            kotlinx.coroutines.internal.h r3 = r8.f488b
            java.lang.Object r4 = r8.f491e
            yf.i r4 = (yf.i) r4
            cb.b.J(r9)
            r9 = r8
            r5 = r0
            goto L_0x0076
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0022:
            cb.b.J(r9)
            goto L_0x007b
        L_0x0026:
            cb.b.J(r9)
            java.lang.Object r9 = r8.f491e
            yf.i r9 = (yf.i) r9
            ag.s1 r1 = r8.B
            java.lang.Object r1 = r1.S()
            boolean r4 = r1 instanceof ag.q
            if (r4 == 0) goto L_0x0041
            ag.q r1 = (ag.q) r1
            ag.r r1 = r1.f473e
            r8.f490d = r3
            r9.c(r1, r8)
            return r0
        L_0x0041:
            boolean r3 = r1 instanceof ag.h1
            if (r3 == 0) goto L_0x007b
            ag.h1 r1 = (ag.h1) r1
            ag.y1 r1 = r1.i()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r3 = r1.o()
            kotlinx.coroutines.internal.i r3 = (kotlinx.coroutines.internal.i) r3
            r4 = r9
            r5 = r0
            r9 = r8
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x0059:
            boolean r6 = sf.j.a(r1, r3)
            if (r6 != 0) goto L_0x007b
            boolean r6 = r1 instanceof ag.q
            if (r6 == 0) goto L_0x0076
            r6 = r1
            ag.q r6 = (ag.q) r6
            ag.r r6 = r6.f473e
            r9.f491e = r4
            r9.f488b = r3
            r9.f489c = r1
            r9.f490d = r2
            r4.c(r6, r9)
            if (r0 != r5) goto L_0x0076
            return r5
        L_0x0076:
            kotlinx.coroutines.internal.i r1 = r1.p()
            goto L_0x0059
        L_0x007b:
            ff.m r9 = ff.m.f8717a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

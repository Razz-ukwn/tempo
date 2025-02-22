package kotlinx.coroutines.flow;

import dg.r;
import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class o implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f10598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10599b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
    public static final class a extends c {
        public r B;

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10600a;

        /* renamed from: b  reason: collision with root package name */
        public int f10601b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o f10602c;

        /* renamed from: d  reason: collision with root package name */
        public o f10603d;

        /* renamed from: e  reason: collision with root package name */
        public g f10604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar, d dVar) {
            super(dVar);
            this.f10602c = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10600a = obj;
            this.f10601b |= Integer.MIN_VALUE;
            return this.f10602c.a((g<Object>) null, this);
        }
    }

    public o(p pVar, f fVar) {
        this.f10598a = pVar;
        this.f10599b = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<java.lang.Object> r7, jf.d<? super ff.m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.o.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.o$a r0 = (kotlinx.coroutines.flow.o.a) r0
            int r1 = r0.f10601b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10601b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.o$a r0 = new kotlinx.coroutines.flow.o$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f10600a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10601b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r8)
            goto L_0x0073
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            dg.r r7 = r0.B
            kotlinx.coroutines.flow.g r2 = r0.f10604e
            kotlinx.coroutines.flow.o r4 = r0.f10603d
            cb.b.J(r8)     // Catch:{ all -> 0x003c }
            goto L_0x005e
        L_0x003c:
            r8 = move-exception
            goto L_0x007a
        L_0x003e:
            cb.b.J(r8)
            dg.r r8 = new dg.r
            jf.f r2 = r0.getContext()
            r8.<init>(r7, r2)
            rf.p r2 = r6.f10598a     // Catch:{ all -> 0x0076 }
            r0.f10603d = r6     // Catch:{ all -> 0x0076 }
            r0.f10604e = r7     // Catch:{ all -> 0x0076 }
            r0.B = r8     // Catch:{ all -> 0x0076 }
            r0.f10601b = r4     // Catch:{ all -> 0x0076 }
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch:{ all -> 0x0076 }
            if (r2 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x005e:
            r7.releaseIntercepted()
            kotlinx.coroutines.flow.f r7 = r4.f10599b
            r8 = 0
            r0.f10603d = r8
            r0.f10604e = r8
            r0.B = r8
            r0.f10601b = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L_0x0073
            return r1
        L_0x0073:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x0076:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x007a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

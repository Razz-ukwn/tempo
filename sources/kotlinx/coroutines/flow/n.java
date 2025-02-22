package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import rf.q;

public final class n implements f<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f10590a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f10591b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10592a;

        /* renamed from: b  reason: collision with root package name */
        public int f10593b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n f10594c;

        /* renamed from: d  reason: collision with root package name */
        public Object f10595d;

        /* renamed from: e  reason: collision with root package name */
        public g f10596e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, d dVar) {
            super(dVar);
            this.f10594c = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10592a = obj;
            this.f10593b |= Integer.MIN_VALUE;
            return this.f10594c.a((g<Object>) null, this);
        }
    }

    public n(o oVar, q qVar) {
        this.f10590a = oVar;
        this.f10591b = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<java.lang.Object> r9, jf.d<? super ff.m> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.n.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.n$a r0 = (kotlinx.coroutines.flow.n.a) r0
            int r1 = r0.f10593b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10593b = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.n$a r0 = new kotlinx.coroutines.flow.n$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f10592a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10593b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0050
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r9 = r0.f10595d
            dg.r r9 = (dg.r) r9
            cb.b.J(r10)     // Catch:{ all -> 0x0032 }
            goto L_0x007c
        L_0x0032:
            r10 = move-exception
            goto L_0x0086
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.f10595d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            cb.b.J(r10)
            goto L_0x00a0
        L_0x0044:
            kotlinx.coroutines.flow.g r9 = r0.f10596e
            java.lang.Object r2 = r0.f10595d
            kotlinx.coroutines.flow.n r2 = (kotlinx.coroutines.flow.n) r2
            cb.b.J(r10)     // Catch:{ all -> 0x004e }
            goto L_0x0063
        L_0x004e:
            r9 = move-exception
            goto L_0x008c
        L_0x0050:
            cb.b.J(r10)
            kotlinx.coroutines.flow.f r10 = r8.f10590a     // Catch:{ all -> 0x008a }
            r0.f10595d = r8     // Catch:{ all -> 0x008a }
            r0.f10596e = r9     // Catch:{ all -> 0x008a }
            r0.f10593b = r5     // Catch:{ all -> 0x008a }
            java.lang.Object r10 = r10.a(r9, r0)     // Catch:{ all -> 0x008a }
            if (r10 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r8
        L_0x0063:
            dg.r r10 = new dg.r
            jf.f r4 = r0.getContext()
            r10.<init>(r9, r4)
            rf.q r9 = r2.f10591b     // Catch:{ all -> 0x0082 }
            r0.f10595d = r10     // Catch:{ all -> 0x0082 }
            r0.f10596e = r6     // Catch:{ all -> 0x0082 }
            r0.f10593b = r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r9 = r9.e(r10, r6, r0)     // Catch:{ all -> 0x0082 }
            if (r9 != r1) goto L_0x007b
            return r1
        L_0x007b:
            r9 = r10
        L_0x007c:
            r9.releaseIntercepted()
            ff.m r9 = ff.m.f8717a
            return r9
        L_0x0082:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0086:
            r9.releaseIntercepted()
            throw r10
        L_0x008a:
            r9 = move-exception
            r2 = r8
        L_0x008c:
            kotlinx.coroutines.flow.c1 r10 = new kotlinx.coroutines.flow.c1
            r10.<init>(r9)
            rf.q r2 = r2.f10591b
            r0.f10595d = r9
            r0.f10596e = r6
            r0.f10593b = r4
            java.lang.Object r10 = d2.f1.g(r10, r2, r9, r0)
            if (r10 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.n.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

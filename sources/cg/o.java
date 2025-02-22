package cg;

import ff.m;
import jf.d;
import lf.c;
import lf.e;
import rf.l;
import sf.k;

public final class o {

    @e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public q f4033a;

        /* renamed from: b  reason: collision with root package name */
        public rf.a f4034b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f4035c;

        /* renamed from: d  reason: collision with root package name */
        public int f4036d;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4035c = obj;
            this.f4036d |= Integer.MIN_VALUE;
            return o.a((q<?>) null, (rf.a<m>) null, this);
        }
    }

    public static final class b extends k implements l<Throwable, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ag.k<m> f4037a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ag.l lVar) {
            super(1);
            this.f4037a = lVar;
        }

        public final Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            m mVar = m.f8717a;
            this.f4037a.resumeWith(mVar);
            return mVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(cg.q<?> r4, rf.a<ff.m> r5, jf.d<? super ff.m> r6) {
        /*
            boolean r0 = r6 instanceof cg.o.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cg.o$a r0 = (cg.o.a) r0
            int r1 = r0.f4036d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4036d = r1
            goto L_0x0018
        L_0x0013:
            cg.o$a r0 = new cg.o$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f4035c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f4036d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            rf.a r5 = r0.f4034b
            cb.b.J(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0066
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            cb.b.J(r6)
            jf.f r6 = r0.getContext()
            ag.n1$b r2 = ag.n1.b.f447a
            jf.f$b r6 = r6.d(r2)
            if (r6 != r4) goto L_0x0042
            r6 = r3
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0071
            r0.f4033a = r4     // Catch:{ all -> 0x006c }
            r0.f4034b = r5     // Catch:{ all -> 0x006c }
            r0.f4036d = r3     // Catch:{ all -> 0x006c }
            ag.l r6 = new ag.l     // Catch:{ all -> 0x006c }
            jf.d r0 = e9.c.g(r0)     // Catch:{ all -> 0x006c }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x006c }
            r6.t()     // Catch:{ all -> 0x006c }
            cg.o$b r0 = new cg.o$b     // Catch:{ all -> 0x006c }
            r0.<init>(r6)     // Catch:{ all -> 0x006c }
            r4.f(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object r4 = r6.s()     // Catch:{ all -> 0x006c }
            if (r4 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r5.d()
            ff.m r4 = ff.m.f8717a
            return r4
        L_0x006c:
            r4 = move-exception
            r5.d()
            throw r4
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.o.a(cg.q, rf.a, jf.d):java.lang.Object");
    }
}

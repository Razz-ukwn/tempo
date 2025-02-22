package f3;

import ag.g0;
import cg.f;
import cg.w;
import ff.m;
import jf.d;
import sf.j;

public final class o2<T> implements l2<T>, g0, w<T> {

    /* renamed from: a  reason: collision with root package name */
    public final w<T> f8406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f8407b;

    public o2(g0 g0Var, f fVar) {
        j.f(g0Var, "scope");
        j.f(fVar, "channel");
        this.f8406a = fVar;
        this.f8407b = g0Var;
    }

    public final jf.f f0() {
        return this.f8407b.f0();
    }

    public final boolean k(Throwable th) {
        return this.f8406a.k(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m0(f3.e1.b.c r5, jf.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof f3.m2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            f3.m2 r0 = (f3.m2) r0
            int r1 = r0.f8377e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8377e = r1
            goto L_0x0018
        L_0x0013:
            f3.m2 r0 = new f3.m2
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8375c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f8377e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            rf.a r5 = r0.f8373a
            cb.b.J(r6)     // Catch:{ all -> 0x0075 }
            goto L_0x0063
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            cb.b.J(r6)
            jf.f r6 = r4.f0()     // Catch:{ all -> 0x0075 }
            ag.n1$b r2 = ag.n1.b.f447a     // Catch:{ all -> 0x0075 }
            jf.f$b r6 = r6.d(r2)     // Catch:{ all -> 0x0075 }
            if (r6 == 0) goto L_0x0069
            ag.n1 r6 = (ag.n1) r6     // Catch:{ all -> 0x0075 }
            r0.f8373a = r5     // Catch:{ all -> 0x0075 }
            r0.f8374b = r6     // Catch:{ all -> 0x0075 }
            r0.f8377e = r3     // Catch:{ all -> 0x0075 }
            ag.l r2 = new ag.l     // Catch:{ all -> 0x0075 }
            jf.d r0 = e9.c.g(r0)     // Catch:{ all -> 0x0075 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0075 }
            r2.t()     // Catch:{ all -> 0x0075 }
            f3.n2 r0 = new f3.n2     // Catch:{ all -> 0x0075 }
            r0.<init>(r2)     // Catch:{ all -> 0x0075 }
            r6.k0(r0)     // Catch:{ all -> 0x0075 }
            java.lang.Object r6 = r2.s()     // Catch:{ all -> 0x0075 }
            if (r6 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r5.d()
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0069:
            java.lang.String r6 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0075 }
            r0.<init>(r6)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r6 = move-exception
            r5.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.o2.m0(f3.e1$b$c, jf.d):java.lang.Object");
    }

    public final Object t(T t2, d<? super m> dVar) {
        return this.f8406a.t(t2, dVar);
    }
}

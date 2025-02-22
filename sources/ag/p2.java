package ag;

import cb.d;
import ff.g;
import ff.m;
import jf.f;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.x;

public final class p2<T> extends s<T> {

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<g<f, Object>> f472d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p2(jf.d r3, jf.f r4) {
        /*
            r2 = this;
            ag.q2 r0 = ag.q2.f476a
            jf.f$b r1 = r4.d(r0)
            if (r1 != 0) goto L_0x000d
            jf.f r0 = r4.n0(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f472d = r0
            jf.f r3 = r3.getContext()
            jf.e$a r1 = jf.e.a.f10012a
            jf.f$b r3 = r3.d(r1)
            boolean r3 = r3 instanceof ag.c0
            if (r3 != 0) goto L_0x0036
            r3 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.x.c(r4, r3)
            kotlinx.coroutines.internal.x.a(r4, r3)
            ff.g r1 = new ff.g
            r1.<init>(r4, r3)
            r0.set(r1)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.p2.<init>(jf.d, jf.f):void");
    }

    public final boolean D0() {
        ThreadLocal<g<f, Object>> threadLocal = this.f472d;
        if (threadLocal.get() == null) {
            return false;
        }
        threadLocal.set((Object) null);
        return true;
    }

    public final void z0(Object obj) {
        ThreadLocal<g<f, Object>> threadLocal = this.f472d;
        g gVar = threadLocal.get();
        p2<?> p2Var = null;
        if (gVar != null) {
            x.a((f) gVar.f8706a, gVar.f8707b);
            threadLocal.set(p2Var);
        }
        Object b02 = d.b0(obj);
        jf.d<T> dVar = this.f10734c;
        f context = dVar.getContext();
        Object c3 = x.c(context, p2Var);
        if (c3 != x.f10740a) {
            p2Var = a0.c(dVar, context, c3);
        }
        try {
            dVar.resumeWith(b02);
            m mVar = m.f8717a;
        } finally {
            if (p2Var == null || p2Var.D0()) {
                x.a(context, c3);
            }
        }
    }
}

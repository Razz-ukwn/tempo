package ag;

import androidx.fragment.app.z0;
import d2.f1;
import java.util.concurrent.CancellationException;
import jf.d;
import kotlinx.coroutines.scheduling.g;
import sf.j;

public abstract class q0<T> extends g {

    /* renamed from: c  reason: collision with root package name */
    public int f474c;

    public q0(int i8) {
        this.f474c = i8;
    }

    public void c(Object obj, CancellationException cancellationException) {
    }

    public abstract d<T> d();

    public Throwable e(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar != null) {
            return wVar.f504a;
        }
        return null;
    }

    public <T> T f(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                z0.c(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            j.c(th);
            f1.z(d().getContext(), new h0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object j();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r4.D0() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        if (r4.D0() != false) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x005a, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[Catch:{ all -> 0x005a, all -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[SYNTHETIC, Splitter:B:29:0x0071] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            kotlinx.coroutines.scheduling.h r0 = r12.f10764b
            jf.d r1 = r12.d()     // Catch:{ all -> 0x0099 }
            kotlinx.coroutines.internal.f r1 = (kotlinx.coroutines.internal.f) r1     // Catch:{ all -> 0x0099 }
            jf.d<T> r2 = r1.f10710e     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = r1.C     // Catch:{ all -> 0x0099 }
            jf.f r3 = r2.getContext()     // Catch:{ all -> 0x0099 }
            java.lang.Object r1 = kotlinx.coroutines.internal.x.c(r3, r1)     // Catch:{ all -> 0x0099 }
            kotlinx.coroutines.internal.v r4 = kotlinx.coroutines.internal.x.f10740a     // Catch:{ all -> 0x0099 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            ag.p2 r4 = ag.a0.c(r2, r3, r1)     // Catch:{ all -> 0x0099 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            jf.f r6 = r2.getContext()     // Catch:{ all -> 0x005a }
            java.lang.Object r7 = r12.j()     // Catch:{ all -> 0x005a }
            java.lang.Throwable r8 = r12.e(r7)     // Catch:{ all -> 0x005a }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f474c     // Catch:{ all -> 0x005a }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            ag.n1$b r9 = ag.n1.b.f447a     // Catch:{ all -> 0x005a }
            jf.f$b r6 = r6.d(r9)     // Catch:{ all -> 0x005a }
            ag.n1 r6 = (ag.n1) r6     // Catch:{ all -> 0x005a }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x005c
            boolean r9 = r6.c()     // Catch:{ all -> 0x005a }
            if (r9 != 0) goto L_0x005c
            java.util.concurrent.CancellationException r6 = r6.F()     // Catch:{ all -> 0x005a }
            r12.c(r7, r6)     // Catch:{ all -> 0x005a }
            ff.h$a r6 = cb.b.u(r6)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r2 = move-exception
            goto L_0x008d
        L_0x005c:
            if (r8 == 0) goto L_0x0066
            ff.h$a r6 = cb.b.u(r8)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
            goto L_0x006d
        L_0x0066:
            java.lang.Object r6 = r12.f(r7)     // Catch:{ all -> 0x005a }
            r2.resumeWith(r6)     // Catch:{ all -> 0x005a }
        L_0x006d:
            ff.m r2 = ff.m.f8717a     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0077
            boolean r2 = r4.D0()     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x007a
        L_0x0077:
            kotlinx.coroutines.internal.x.a(r3, r1)     // Catch:{ all -> 0x0099 }
        L_0x007a:
            r0.a()     // Catch:{ all -> 0x0080 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x0080 }
            goto L_0x0085
        L_0x0080:
            r0 = move-exception
            ff.h$a r0 = cb.b.u(r0)
        L_0x0085:
            java.lang.Throwable r0 = ff.h.a(r0)
            r12.h(r5, r0)
            goto L_0x00ac
        L_0x008d:
            if (r4 == 0) goto L_0x0095
            boolean r4 = r4.D0()     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0098
        L_0x0095:
            kotlinx.coroutines.internal.x.a(r3, r1)     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r2     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            r0.a()     // Catch:{ all -> 0x00a0 }
            ff.m r0 = ff.m.f8717a     // Catch:{ all -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r0 = move-exception
            ff.h$a r0 = cb.b.u(r0)
        L_0x00a5:
            java.lang.Throwable r0 = ff.h.a(r0)
            r12.h(r1, r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.q0.run():void");
    }
}

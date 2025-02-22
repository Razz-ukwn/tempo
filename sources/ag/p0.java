package ag;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.d;
import jf.f;
import kotlinx.coroutines.internal.s;

public final class p0<T> extends s<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f471d = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public p0(d dVar, f fVar) {
        super(dVar, fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f471d
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            kf.a r0 = kf.a.f10464a
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.S()
            java.lang.Object r0 = ag.v1.m(r0)
            boolean r1 = r0 instanceof ag.w
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            ag.w r0 = (ag.w) r0
            java.lang.Throwable r0 = r0.f504a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.p0.D0():java.lang.Object");
    }

    public final void v(Object obj) {
        z0(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f471d
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            jf.d<T> r0 = r4.f10734c
            jf.d r0 = e9.c.g(r0)
            java.lang.Object r5 = cb.d.b0(r5)
            r1 = 0
            com.google.android.gms.internal.p000firebaseauthapi.g.e(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.p0.z0(java.lang.Object):void");
    }
}

package androidx.compose.ui.platform;

import ag.g0;
import cg.f;
import cg.h;
import cg.s;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
public final class p1 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public s f1388a;

    /* renamed from: b  reason: collision with root package name */
    public h f1389b;

    /* renamed from: c  reason: collision with root package name */
    public int f1390c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f<m> f1391d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(f<m> fVar, d<? super p1> dVar) {
        super(2, dVar);
        this.f1391d = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p1(this.f1391d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r8 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[Catch:{ all -> 0x0077 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r7.f1390c
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            cg.h r1 = r7.f1389b
            cg.s r3 = r7.f1388a
            cb.b.J(r8)     // Catch:{ all -> 0x0079 }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L_0x003b
        L_0x0015:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001d:
            cb.b.J(r8)
            cg.f<ff.m> r3 = r7.f1391d
            cg.h r8 = r3.iterator()     // Catch:{ all -> 0x0079 }
            r1 = r8
            r8 = r7
        L_0x0028:
            r8.f1388a = r3     // Catch:{ all -> 0x0079 }
            r8.f1389b = r1     // Catch:{ all -> 0x0079 }
            r8.f1390c = r2     // Catch:{ all -> 0x0079 }
            java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x0079 }
            if (r4 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L_0x003b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0077 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r8 == 0) goto L_0x0070
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0077 }
            ff.m r8 = (ff.m) r8     // Catch:{ all -> 0x0077 }
            java.lang.Object r8 = b0.m.f2942c     // Catch:{ all -> 0x0077 }
            monitor-enter(r8)     // Catch:{ all -> 0x0077 }
            java.util.concurrent.atomic.AtomicReference<b0.a> r5 = b0.m.f2948i     // Catch:{ all -> 0x006d }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x006d }
            b0.a r5 = (b0.a) r5     // Catch:{ all -> 0x006d }
            java.util.Set<b0.g0> r5 = r5.f2889g     // Catch:{ all -> 0x006d }
            if (r5 == 0) goto L_0x0061
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x006d }
            r5 = r5 ^ r2
            if (r5 != r2) goto L_0x0061
            r5 = r2
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0068
            b0.m.a()     // Catch:{ all -> 0x0077 }
        L_0x0068:
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0028
        L_0x006d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0077 }
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0070:
            r8 = 0
            d2.f1.m(r4, r8)
            ff.m r8 = ff.m.f8717a
            return r8
        L_0x0077:
            r8 = move-exception
            goto L_0x007b
        L_0x0079:
            r8 = move-exception
            r4 = r3
        L_0x007b:
            throw r8     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            d2.f1.m(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

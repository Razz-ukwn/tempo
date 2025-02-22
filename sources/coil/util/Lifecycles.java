package coil.util;

import androidx.lifecycle.j;
import jf.d;
import lf.c;
import lf.e;
import sf.v;

/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
public final class Lifecycles {

    @e(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public j f4049a;

        /* renamed from: b  reason: collision with root package name */
        public v f4050b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f4051c;

        /* renamed from: d  reason: collision with root package name */
        public int f4052d;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4051c = obj;
            this.f4052d |= Integer.MIN_VALUE;
            return Lifecycles.a((j) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.lifecycle.j r5, jf.d<? super ff.m> r6) {
        /*
            boolean r0 = r6 instanceof coil.util.Lifecycles.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.a) r0
            int r1 = r0.f4052d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4052d = r1
            goto L_0x0018
        L_0x0013:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f4051c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f4052d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            sf.v r5 = r0.f4050b
            androidx.lifecycle.j r0 = r0.f4049a
            cb.b.J(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0076
        L_0x002b:
            r6 = move-exception
            goto L_0x0087
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            cb.b.J(r6)
            androidx.lifecycle.j$b r6 = r5.b()
            androidx.lifecycle.j$b r2 = androidx.lifecycle.j.b.f2280d
            int r6 = r6.compareTo(r2)
            if (r6 < 0) goto L_0x0046
            r6 = r3
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 == 0) goto L_0x004c
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x004c:
            sf.v r6 = new sf.v
            r6.<init>()
            r0.f4049a = r5     // Catch:{ all -> 0x0082 }
            r0.f4050b = r6     // Catch:{ all -> 0x0082 }
            r0.f4052d = r3     // Catch:{ all -> 0x0082 }
            ag.l r2 = new ag.l     // Catch:{ all -> 0x0082 }
            jf.d r0 = e9.c.g(r0)     // Catch:{ all -> 0x0082 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0082 }
            r2.t()     // Catch:{ all -> 0x0082 }
            coil.util.-Lifecycles$awaitStarted$2$1 r0 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch:{ all -> 0x0082 }
            r0.<init>(r2)     // Catch:{ all -> 0x0082 }
            r6.f14957a = r0     // Catch:{ all -> 0x0082 }
            r5.a(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r2.s()     // Catch:{ all -> 0x0082 }
            if (r0 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r0 = r5
            r5 = r6
        L_0x0076:
            T r5 = r5.f14957a
            androidx.lifecycle.o r5 = (androidx.lifecycle.o) r5
            if (r5 == 0) goto L_0x007f
            r0.c(r5)
        L_0x007f:
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0082:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x0087:
            T r5 = r5.f14957a
            androidx.lifecycle.o r5 = (androidx.lifecycle.o) r5
            if (r5 == 0) goto L_0x0090
            r0.c(r5)
        L_0x0090:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.j, jf.d):java.lang.Object");
    }
}

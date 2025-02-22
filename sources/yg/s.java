package yg;

import e9.c;
import jf.d;
import lf.e;

public final class s {

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f17497a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Exception f17498b;

        public a(Exception exc, b bVar) {
            this.f17497a = bVar;
            this.f17498b = exc;
        }

        public final void run() {
            c.g(this.f17497a).resumeWith(cb.b.u(this.f17498b));
        }
    }

    @e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    public static final class b extends lf.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17499a;

        /* renamed from: b  reason: collision with root package name */
        public int f17500b;

        public b(d dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17499a = obj;
            this.f17500b |= Integer.MIN_VALUE;
            return s.a((Exception) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, jf.d<?> r5) {
        /*
            boolean r0 = r5 instanceof yg.s.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            yg.s$b r0 = (yg.s.b) r0
            int r1 = r0.f17500b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17500b = r1
            goto L_0x0018
        L_0x0013:
            yg.s$b r0 = new yg.s$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17499a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f17500b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            cb.b.J(r5)
            ff.m r4 = ff.m.f8717a
            return r4
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            cb.b.J(r5)
            r0.getClass()
            r0.f17500b = r3
            kotlinx.coroutines.scheduling.c r5 = ag.s0.f480a
            jf.f r2 = r0.getContext()
            yg.s$a r3 = new yg.s$a
            r3.<init>(r4, r0)
            r5.F0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.s.a(java.lang.Exception, jf.d):java.lang.Object");
    }
}

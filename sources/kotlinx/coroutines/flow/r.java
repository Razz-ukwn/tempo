package kotlinx.coroutines.flow;

import jf.d;
import lf.c;
import lf.e;
import sf.v;

public final class r<T> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g<T> f10625a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v<Throwable> f10626b;

    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public r f10627a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10628b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r<T> f10629c;

        /* renamed from: d  reason: collision with root package name */
        public int f10630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r<? super T> rVar, d<? super a> dVar) {
            super(dVar);
            this.f10629c = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10628b = obj;
            this.f10630d |= Integer.MIN_VALUE;
            return this.f10629c.m(null, this);
        }
    }

    public r(g<? super T> gVar, v<Throwable> vVar) {
        this.f10625a = gVar;
        this.f10626b = vVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(T r5, jf.d<? super ff.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.r.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.r$a r0 = (kotlinx.coroutines.flow.r.a) r0
            int r1 = r0.f10630d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10630d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.r$a r0 = new kotlinx.coroutines.flow.r$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10628b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10630d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlinx.coroutines.flow.r r5 = r0.f10627a
            cb.b.J(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0043
        L_0x0029:
            r6 = move-exception
            goto L_0x0049
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            cb.b.J(r6)
            kotlinx.coroutines.flow.g<T> r6 = r4.f10625a     // Catch:{ all -> 0x0046 }
            r0.f10627a = r4     // Catch:{ all -> 0x0046 }
            r0.f10630d = r3     // Catch:{ all -> 0x0046 }
            java.lang.Object r5 = r6.m(r5, r0)     // Catch:{ all -> 0x0046 }
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x0046:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x0049:
            sf.v<java.lang.Throwable> r5 = r5.f10626b
            r5.f14957a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.r.m(java.lang.Object, jf.d):java.lang.Object");
    }
}

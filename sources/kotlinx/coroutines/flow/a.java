package kotlinx.coroutines.flow;

import dg.r;
import jf.d;
import lf.c;
import lf.e;

public abstract class a<T> implements f<T> {

    @e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a  reason: collision with other inner class name */
    public static final class C0194a extends c {

        /* renamed from: a  reason: collision with root package name */
        public r f10481a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10482b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a<T> f10483c;

        /* renamed from: d  reason: collision with root package name */
        public int f10484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0194a(a<T> aVar, d<? super C0194a> dVar) {
            super(dVar);
            this.f10483c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10482b = obj;
            this.f10484d |= Integer.MIN_VALUE;
            return this.f10483c.a((g) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r6, jf.d<? super ff.m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0194a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0194a) r0
            int r1 = r0.f10484d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10484d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10482b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10484d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            dg.r r6 = r0.f10481a
            cb.b.J(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            r7 = move-exception
            goto L_0x005f
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            cb.b.J(r7)
            dg.r r7 = new dg.r
            jf.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f10481a = r7     // Catch:{ all -> 0x005b }
            r0.f10484d = r3     // Catch:{ all -> 0x005b }
            r6 = r5
            kotlinx.coroutines.flow.n0 r6 = (kotlinx.coroutines.flow.n0) r6     // Catch:{ all -> 0x005b }
            rf.p<kotlinx.coroutines.flow.g<? super T>, jf.d<? super ff.m>, java.lang.Object> r6 = r6.f10597a     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            ff.m r6 = ff.m.f8717a     // Catch:{ all -> 0x005b }
        L_0x0051:
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r6 = r7
        L_0x0055:
            r6.releaseIntercepted()
            ff.m r6 = ff.m.f8717a
            return r6
        L_0x005b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

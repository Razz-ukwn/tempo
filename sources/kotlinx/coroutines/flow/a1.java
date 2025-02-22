package kotlinx.coroutines.flow;

import dg.r;
import ff.m;
import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class a1<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f10492a;

    /* renamed from: b  reason: collision with root package name */
    public final p<g<? super T>, d<? super m>, Object> f10493b;

    @e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public a1 f10494a;

        /* renamed from: b  reason: collision with root package name */
        public r f10495b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f10496c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a1<T> f10497d;

        /* renamed from: e  reason: collision with root package name */
        public int f10498e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a1<T> a1Var, d<? super a> dVar) {
            super(dVar);
            this.f10497d = a1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10496c = obj;
            this.f10498e |= Integer.MIN_VALUE;
            return this.f10497d.a(this);
        }
    }

    public a1(p pVar, g gVar) {
        this.f10492a = gVar;
        this.f10493b = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(jf.d<? super ff.m> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a1.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.a1$a r0 = (kotlinx.coroutines.flow.a1.a) r0
            int r1 = r0.f10498e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10498e = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.a1$a r0 = new kotlinx.coroutines.flow.a1$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f10496c
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10498e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            cb.b.J(r7)
            goto L_0x0071
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0032:
            dg.r r2 = r0.f10495b
            kotlinx.coroutines.flow.a1 r4 = r0.f10494a
            cb.b.J(r7)     // Catch:{ all -> 0x0077 }
            goto L_0x0058
        L_0x003a:
            cb.b.J(r7)
            dg.r r2 = new dg.r
            kotlinx.coroutines.flow.g<T> r7 = r6.f10492a
            jf.f r5 = r0.getContext()
            r2.<init>(r7, r5)
            rf.p<kotlinx.coroutines.flow.g<? super T>, jf.d<? super ff.m>, java.lang.Object> r7 = r6.f10493b     // Catch:{ all -> 0x0077 }
            r0.f10494a = r6     // Catch:{ all -> 0x0077 }
            r0.f10495b = r2     // Catch:{ all -> 0x0077 }
            r0.f10498e = r4     // Catch:{ all -> 0x0077 }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x0077 }
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            r4 = r6
        L_0x0058:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.g<T> r7 = r4.f10492a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.a1
            if (r2 == 0) goto L_0x0074
            kotlinx.coroutines.flow.a1 r7 = (kotlinx.coroutines.flow.a1) r7
            r2 = 0
            r0.f10494a = r2
            r0.f10495b = r2
            r0.f10498e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0071
            return r1
        L_0x0071:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x0074:
            ff.m r7 = ff.m.f8717a
            return r7
        L_0x0077:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a1.a(jf.d):java.lang.Object");
    }

    public final Object m(T t2, d<? super m> dVar) {
        return this.f10492a.m(t2, dVar);
    }
}

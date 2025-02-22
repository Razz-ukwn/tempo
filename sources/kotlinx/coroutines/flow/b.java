package kotlinx.coroutines.flow;

import cg.q;
import ff.m;
import jf.d;
import jf.f;
import lf.c;
import lf.e;
import rf.p;

public final class b<T> extends d<T> {

    /* renamed from: e  reason: collision with root package name */
    public final p<q<? super T>, d<? super m>, Object> f10499e;

    @e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public q f10500a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f10501b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b<T> f10502c;

        /* renamed from: d  reason: collision with root package name */
        public int f10503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, d<? super a> dVar) {
            super(dVar);
            this.f10502c = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10501b = obj;
            this.f10503d |= Integer.MIN_VALUE;
            return this.f10502c.e((q) null, this);
        }
    }

    public b(p<? super q<? super T>, ? super d<? super m>, ? extends Object> pVar, f fVar, int i8, cg.e eVar) {
        super(pVar, fVar, i8, eVar);
        this.f10499e = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(cg.q<? super T> r5, jf.d<? super ff.m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.b$a r0 = (kotlinx.coroutines.flow.b.a) r0
            int r1 = r0.f10503d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10503d = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.b$a r0 = new kotlinx.coroutines.flow.b$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10501b
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10503d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            cg.q r5 = r0.f10500a
            cb.b.J(r6)
            goto L_0x0046
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            cb.b.J(r6)
            r0.f10500a = r5
            r0.f10503d = r3
            rf.p<cg.q<? super T>, jf.d<? super ff.m>, java.lang.Object> r6 = r4.f10528d
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            ff.m r6 = ff.m.f8717a
        L_0x0043:
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            boolean r5 = r5.r()
            if (r5 == 0) goto L_0x004f
            ff.m r5 = ff.m.f8717a
            return r5
        L_0x004f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b.e(cg.q, jf.d):java.lang.Object");
    }

    public final dg.f<T> f(f fVar, int i8, cg.e eVar) {
        return new b(this.f10499e, fVar, i8, eVar);
    }
}

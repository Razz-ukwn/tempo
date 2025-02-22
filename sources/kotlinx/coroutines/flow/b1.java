package kotlinx.coroutines.flow;

import f3.j;
import ff.m;
import jf.d;
import lf.c;
import lf.e;
import rf.p;

public final class b1<T> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final o0<T> f10509a;

    /* renamed from: b  reason: collision with root package name */
    public final p<g<? super T>, d<? super m>, Object> f10510b;

    @e(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {409}, m = "collect")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f10511a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b1<T> f10512b;

        /* renamed from: c  reason: collision with root package name */
        public int f10513c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b1<T> b1Var, d<? super a> dVar) {
            super(dVar);
            this.f10512b = b1Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10511a = obj;
            this.f10513c |= Integer.MIN_VALUE;
            this.f10512b.a((g) null, this);
            return kf.a.f10464a;
        }
    }

    public b1(p0 p0Var, j jVar) {
        this.f10509a = p0Var;
        this.f10510b = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlinx.coroutines.flow.g<? super T> r5, jf.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.b1.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.b1$a r0 = (kotlinx.coroutines.flow.b1.a) r0
            int r1 = r0.f10513c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f10513c = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.b1$a r0 = new kotlinx.coroutines.flow.b1$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f10511a
            kf.a r1 = kf.a.f10464a
            int r2 = r0.f10513c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            cb.b.J(r6)
            goto L_0x0044
        L_0x002f:
            cb.b.J(r6)
            kotlinx.coroutines.flow.a1 r6 = new kotlinx.coroutines.flow.a1
            rf.p<kotlinx.coroutines.flow.g<? super T>, jf.d<? super ff.m>, java.lang.Object> r2 = r4.f10510b
            r6.<init>(r2, r5)
            r0.f10513c = r3
            kotlinx.coroutines.flow.o0<T> r5 = r4.f10509a
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            ab.r r5 = new ab.r
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.b1.a(kotlinx.coroutines.flow.g, jf.d):java.lang.Object");
    }
}

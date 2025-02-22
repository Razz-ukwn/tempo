package f3;

import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", l = {608, 174}, m = "invokeSuspend")
public final class m1 extends i implements p<g<? super y0<Object>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public kotlinx.coroutines.sync.d f8368a;

    /* renamed from: b  reason: collision with root package name */
    public g f8369b;

    /* renamed from: c  reason: collision with root package name */
    public int f8370c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f8371d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f1<Object, Object> f8372e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1(f1<Object, Object> f1Var, d<? super m1> dVar) {
        super(2, dVar);
        this.f8372e = f1Var;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        m1 m1Var = new m1(this.f8372e, dVar);
        m1Var.f8371d = obj;
        return m1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r5.f8370c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            cb.b.J(r6)
            goto L_0x0062
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            kotlinx.coroutines.flow.g r1 = r5.f8369b
            kotlinx.coroutines.sync.d r3 = r5.f8368a
            java.lang.Object r4 = r5.f8371d
            f3.q1$a r4 = (f3.q1.a) r4
            cb.b.J(r6)
            goto L_0x0042
        L_0x0024:
            cb.b.J(r6)
            java.lang.Object r6 = r5.f8371d
            r1 = r6
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
            f3.f1<java.lang.Object, java.lang.Object> r6 = r5.f8372e
            f3.q1$a<Key, Value> r4 = r6.f8206l
            kotlinx.coroutines.sync.d r6 = r4.f8458a
            r5.f8371d = r4
            r5.f8368a = r6
            r5.f8369b = r1
            r5.f8370c = r3
            java.lang.Object r3 = r6.b(r5)
            if (r3 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r3 = r6
        L_0x0042:
            r6 = 0
            f3.q1<Key, Value> r4 = r4.f8459b     // Catch:{ all -> 0x0065 }
            f3.t0 r4 = r4.f8457l     // Catch:{ all -> 0x0065 }
            f3.n0 r4 = r4.d()     // Catch:{ all -> 0x0065 }
            r3.a(r6)
            f3.y0$c r3 = new f3.y0$c
            r3.<init>(r4, r6)
            r5.f8371d = r6
            r5.f8368a = r6
            r5.f8369b = r6
            r5.f8370c = r2
            java.lang.Object r6 = r1.m(r3, r5)
            if (r6 != r0) goto L_0x0062
            return r0
        L_0x0062:
            ff.m r6 = ff.m.f8717a
            return r6
        L_0x0065:
            r0 = move-exception
            r3.a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package f3;

import ff.m;
import gf.v;
import java.util.Iterator;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = {63, 68}, m = "invokeSuspend")
public final class j extends i implements p<g<? super v<? extends y0<Object>>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f8279a;

    /* renamed from: b  reason: collision with root package name */
    public int f8280b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f8281c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k<Object> f8282d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(k<Object> kVar, d<? super j> dVar) {
        super(2, dVar);
        this.f8282d = kVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        j jVar = new j(this.f8282d, dVar);
        jVar.f8281c = obj;
        return jVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((g) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f10464a
            int r1 = r6.f8280b
            f3.k<java.lang.Object> r2 = r6.f8282d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.util.Iterator r1 = r6.f8279a
            java.lang.Object r2 = r6.f8281c
            kotlinx.coroutines.flow.g r2 = (kotlinx.coroutines.flow.g) r2
            cb.b.J(r7)
            goto L_0x004e
        L_0x0018:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0020:
            java.lang.Object r1 = r6.f8281c
            kotlinx.coroutines.flow.g r1 = (kotlinx.coroutines.flow.g) r1
            cb.b.J(r7)
            goto L_0x003f
        L_0x0028:
            cb.b.J(r7)
            java.lang.Object r7 = r6.f8281c
            kotlinx.coroutines.flow.g r7 = (kotlinx.coroutines.flow.g) r7
            f3.b0<T> r1 = r2.f8291a
            r6.f8281c = r7
            r6.f8280b = r4
            java.io.Serializable r1 = r1.a(r6)
            if (r1 != r0) goto L_0x003c
            return r0
        L_0x003c:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x003f:
            java.util.List r7 = (java.util.List) r7
            ag.f2 r2 = r2.f8294d
            r2.start()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r1
            r1 = r7
        L_0x004e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0067
            java.lang.Object r7 = r1.next()
            gf.v r7 = (gf.v) r7
            r6.f8281c = r2
            r6.f8279a = r1
            r6.f8280b = r3
            java.lang.Object r7 = r2.m(r7, r6)
            if (r7 != r0) goto L_0x004e
            return r0
        L_0x0067:
            ff.m r7 = ff.m.f8717a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

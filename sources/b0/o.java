package b0;

import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class o extends k implements l<k, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l<k, Object> f2955a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(l<? super k, Object> lVar) {
        super(1);
        this.f2955a = lVar;
    }

    public final Object invoke(Object obj) {
        k kVar = (k) obj;
        j.f(kVar, "invalid");
        h hVar = (h) this.f2955a.invoke(kVar);
        synchronized (m.f2942c) {
            m.f2943d = m.f2943d.e(hVar.d());
            m mVar = m.f8717a;
        }
        return hVar;
    }
}

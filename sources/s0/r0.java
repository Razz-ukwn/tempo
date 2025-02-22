package s0;

import d0.g;
import rf.l;
import sf.j;
import sf.k;
import u.d;

public final class r0 extends k implements l<g.b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d<g.b> f14427a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(d<g.b> dVar) {
        super(1);
        this.f14427a = dVar;
    }

    public final Object invoke(Object obj) {
        g.b bVar = (g.b) obj;
        j.f(bVar, "it");
        this.f14427a.b(bVar);
        return Boolean.TRUE;
    }
}

package b0;

import b0.w;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class z extends k implements l<Object, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f2990a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(1);
        this.f2990a = wVar;
    }

    public final Object invoke(Object obj) {
        j.f(obj, "state");
        w wVar = this.f2990a;
        if (!wVar.f2971h) {
            synchronized (wVar.f2969f) {
                w.a aVar = wVar.f2972i;
                j.c(aVar);
                aVar.c(obj);
                m mVar = m.f8717a;
            }
        }
        return m.f8717a;
    }
}

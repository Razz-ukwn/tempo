package b0;

import ff.m;
import java.util.Set;
import rf.p;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p<Set<? extends Object>, h, m> f2909a;

    public g(p<? super Set<? extends Object>, ? super h, m> pVar) {
        this.f2909a = pVar;
    }

    public final void a() {
        p<Set<? extends Object>, h, m> pVar = this.f2909a;
        synchronized (m.f2942c) {
            m.f2946g.remove(pVar);
            m mVar = m.f8717a;
        }
    }
}

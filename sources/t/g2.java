package t;

import ff.m;
import rf.l;
import sf.j;
import sf.k;
import u.c;

public final class g2 extends k implements l<Object, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f15059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c<Object> f15060b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g2(m0 m0Var, c<Object> cVar) {
        super(1);
        this.f15059a = m0Var;
        this.f15060b = cVar;
    }

    public final Object invoke(Object obj) {
        j.f(obj, "value");
        this.f15059a.r(obj);
        c<Object> cVar = this.f15060b;
        if (cVar != null) {
            cVar.add(obj);
        }
        return m.f8717a;
    }
}

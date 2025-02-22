package t;

import ff.m;
import rf.p;
import sf.k;
import t.e0;

public final class y extends k implements p<h, Integer, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1<Object> f15279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15280b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(g1<Object> g1Var, Object obj) {
        super(2);
        this.f15279a = g1Var;
        this.f15280b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
            e0.b bVar = e0.f15020a;
            this.f15279a.getClass();
            throw null;
        }
        hVar.j();
        return m.f8717a;
    }
}

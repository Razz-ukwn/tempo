package t;

import cb.d;
import rf.a;
import sf.j;
import t.e0;
import t.h;

public final class s0<T> extends u1<T> {

    /* renamed from: b  reason: collision with root package name */
    public final s2<T> f15228b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s0(s2<T> s2Var, a<? extends T> aVar) {
        super(aVar);
        j.f(s2Var, "policy");
        j.f(aVar, "defaultFactory");
        this.f15228b = s2Var;
    }

    public final y2 a(Object obj, h hVar) {
        hVar.c(-84026900);
        e0.b bVar = e0.f15020a;
        hVar.c(-492369756);
        Object d10 = hVar.d();
        if (d10 == h.a.f15061a) {
            d10 = d.R(obj, this.f15228b);
            hVar.n(d10);
        }
        hVar.o();
        j1 j1Var = (j1) d10;
        j1Var.setValue(obj);
        hVar.o();
        return j1Var;
    }
}

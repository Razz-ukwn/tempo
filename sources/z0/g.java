package z0;

import rf.l;
import sf.j;
import sf.k;

public final class g extends k implements l<x, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f17594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar) {
        super(1);
        this.f17594a = iVar;
    }

    public final Object invoke(Object obj) {
        x xVar = (x) obj;
        j.f(xVar, "it");
        int i8 = xVar.f17615c;
        int i10 = xVar.f17616d;
        Object obj2 = xVar.f17617e;
        p pVar = xVar.f17614b;
        j.f(pVar, "fontWeight");
        return this.f17594a.a(new x((f) null, pVar, i8, i10, obj2)).getValue();
    }
}

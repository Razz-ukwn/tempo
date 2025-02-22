package yf;

import cb.d;
import java.util.ArrayList;
import java.util.List;
import rf.l;
import sf.j;
import yf.e;

public class o extends l {
    public static final Object p0(e eVar) {
        e.a aVar = new e.a(eVar);
        if (!aVar.hasNext()) {
            return null;
        }
        return aVar.next();
    }

    public static final e q0(g gVar, l lVar) {
        j.f(lVar, "transform");
        q qVar = new q(gVar, lVar);
        n nVar = n.f17392a;
        j.f(nVar, "predicate");
        return new e(qVar, nVar);
    }

    public static final <T> List<T> r0(g<? extends T> gVar) {
        j.f(gVar, "<this>");
        return d.W(s0(gVar));
    }

    public static final ArrayList s0(g gVar) {
        j.f(gVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object add : gVar) {
            arrayList.add(add);
        }
        return arrayList;
    }
}

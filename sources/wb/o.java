package wb;

import java.util.ArrayList;
import java.util.List;
import ub.x;
import ub.y;

public final class o implements y {

    /* renamed from: a  reason: collision with root package name */
    public final n f16677a;

    public o(n nVar) {
        this.f16677a = nVar;
    }

    public final List<x> a(List<x> list) {
        ArrayList arrayList = new ArrayList();
        for (x next : list) {
            if (this.f16677a.a(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}

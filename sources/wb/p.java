package wb;

import java.util.ArrayList;
import java.util.List;
import ub.x;
import ub.y;

public final class p implements y {

    /* renamed from: a  reason: collision with root package name */
    public final y[] f16678a;

    public p(y[] yVarArr) {
        this.f16678a = yVarArr;
    }

    public final List<x> a(List<x> list) {
        List<x> list2 = null;
        for (y a10 : this.f16678a) {
            list2 = a10.a(list);
            if (!list2.isEmpty()) {
                break;
            }
        }
        return list2 == null ? new ArrayList() : list2;
    }
}

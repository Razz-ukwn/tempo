package wb;

import java.util.List;
import ub.x;
import ub.y;

public final class m implements y {

    /* renamed from: a  reason: collision with root package name */
    public final y[] f16676a;

    public m(y[] yVarArr) {
        this.f16676a = yVarArr;
    }

    public final List<x> a(List<x> list) {
        for (y a10 : this.f16676a) {
            list = a10.a(list);
        }
        return list;
    }
}

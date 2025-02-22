package p0;

import d0.g;
import rf.l;

public final class b extends g.c implements a {
    public l<? super c, Boolean> G;
    public l<? super c, Boolean> H = null;

    public b(l lVar) {
        this.G = lVar;
    }

    public final boolean h(c cVar) {
        l<? super c, Boolean> lVar = this.H;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }

    public final boolean i(c cVar) {
        l<? super c, Boolean> lVar = this.G;
        if (lVar != null) {
            return lVar.invoke(cVar).booleanValue();
        }
        return false;
    }
}

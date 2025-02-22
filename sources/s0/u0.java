package s0;

import d0.g;

public final class u0 {
    public static final g.c a(h hVar, int i8) {
        g.c cVar = hVar.s().f7181e;
        if (cVar != null && (cVar.f7179c & i8) != 0) {
            while (cVar != null) {
                int i10 = cVar.f7178b;
                if ((i10 & 2) != 0) {
                    break;
                } else if ((i10 & i8) != 0) {
                    return cVar;
                } else {
                    cVar = cVar.f7181e;
                }
            }
        }
        return null;
    }
}

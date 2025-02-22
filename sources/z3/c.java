package z3;

import gf.k;
import java.util.Iterator;
import sf.j;
import wg.g0;
import wg.l;
import wg.m;
import wg.u;
import wg.z;

public final class c extends m {
    public c(u uVar) {
        super(uVar);
    }

    public final g0 k(z zVar) {
        z b10 = zVar.b();
        l lVar = this.f16787b;
        if (b10 != null) {
            k kVar = new k();
            while (b10 != null && !f(b10)) {
                kVar.addFirst(b10);
                b10 = b10.b();
            }
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                z zVar2 = (z) it.next();
                j.f(zVar2, "dir");
                lVar.c(zVar2);
            }
        }
        return lVar.k(zVar);
    }
}

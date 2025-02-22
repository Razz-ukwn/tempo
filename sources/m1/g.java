package m1;

import java.util.Iterator;

public class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f11146e = 2;
        } else {
            this.f11146e = 3;
        }
    }

    public final void d(int i8) {
        if (!this.f11151j) {
            this.f11151j = true;
            this.f11148g = i8;
            Iterator it = this.f11152k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}

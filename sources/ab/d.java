package ab;

import hb.a;
import hb.b;

public final class d extends a0<Number> {
    public final Object a(a aVar) {
        if (aVar.k0() != 9) {
            return Double.valueOf(aVar.R());
        }
        aVar.d0();
        return null;
    }

    public final void b(b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.z();
            return;
        }
        i.a(number.doubleValue());
        bVar.Q(number);
    }
}

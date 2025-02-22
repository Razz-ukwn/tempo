package ab;

import hb.a;
import hb.b;

public final class e extends a0<Number> {
    public final Object a(a aVar) {
        if (aVar.k0() != 9) {
            return Float.valueOf((float) aVar.R());
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
        i.a((double) number.floatValue());
        bVar.Q(number);
    }
}

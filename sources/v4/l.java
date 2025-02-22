package v4;

import java.util.ArrayDeque;
import l5.i;
import v4.m;

public final class l extends i<m.a<Object>, Object> {
    public l() {
        super(500);
    }

    public final void c(Object obj, Object obj2) {
        m.a aVar = (m.a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = m.a.f16184d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}

package dg;

import cg.e;
import kotlinx.coroutines.flow.p0;
import kotlinx.coroutines.flow.x0;
import sf.j;

public final class w extends p0<Integer> implements x0<Integer> {
    public w(int i8) {
        super(1, Integer.MAX_VALUE, e.f4021b);
        h(Integer.valueOf(i8));
    }

    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.D;
            j.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.E + ((long) ((int) ((q() + ((long) this.G)) - this.E)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}

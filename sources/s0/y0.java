package s0;

import java.util.Comparator;
import sf.j;

public final class y0 implements Comparator<a0> {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f14469a = new y0();

    public final int compare(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        a0 a0Var2 = (a0) obj2;
        j.f(a0Var, "a");
        j.f(a0Var2, "b");
        int h3 = j.h(a0Var2.E, a0Var.E);
        return h3 != 0 ? h3 : j.h(a0Var.hashCode(), a0Var2.hashCode());
    }
}

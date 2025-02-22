package s0;

import java.util.Comparator;

public final class j implements Comparator<a0> {
    public final int compare(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        a0 a0Var2 = (a0) obj2;
        sf.j.f(a0Var, "l1");
        sf.j.f(a0Var2, "l2");
        int h3 = sf.j.h(a0Var.E, a0Var2.E);
        return h3 != 0 ? h3 : sf.j.h(a0Var.hashCode(), a0Var2.hashCode());
    }
}

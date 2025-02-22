package gf;

import java.util.Iterator;
import java.util.Set;
import sf.j;

public abstract class i<E> extends a<E> implements Set<E> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        j.f(set, "other");
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }
}

package p001if;

import java.util.Comparator;
import sf.j;

/* renamed from: if.b  reason: invalid package */
public final class b implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9664a = new b();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        j.f(comparable, "a");
        j.f(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return c.f9665a;
    }
}

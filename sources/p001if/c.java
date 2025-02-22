package p001if;

import java.util.Comparator;
import sf.j;

/* renamed from: if.c  reason: invalid package */
public final class c implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9665a = new c();

    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        j.f(comparable, "a");
        j.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return b.f9664a;
    }
}

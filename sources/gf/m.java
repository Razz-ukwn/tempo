package gf;

import cb.d;
import java.util.Collection;
import sf.j;

public class m extends d {
    public static final int n0(Iterable iterable) {
        j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}

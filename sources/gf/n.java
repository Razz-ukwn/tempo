package gf;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import sf.j;

public class n extends m {
    public static final <T> void o0(List<T> list, Comparator<? super T> comparator) {
        j.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

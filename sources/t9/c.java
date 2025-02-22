package t9;

import java.util.Set;
import qa.a;
import qa.b;

public interface c {
    <T> T a(Class<T> cls) {
        return g(u.a(cls));
    }

    <T> Set<T> b(u<T> uVar) {
        return f(uVar).get();
    }

    <T> b<T> c(u<T> uVar);

    <T> a<T> d(u<T> uVar);

    <T> b<T> e(Class<T> cls) {
        return c(u.a(cls));
    }

    <T> b<Set<T>> f(u<T> uVar);

    <T> T g(u<T> uVar) {
        b<T> c3 = c(uVar);
        if (c3 == null) {
            return null;
        }
        return c3.get();
    }
}

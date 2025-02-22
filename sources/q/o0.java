package q;

import q.p;
import sf.j;

public interface o0<V extends p> {
    void a();

    V b(long j10, V v3, V v10, V v11);

    V c(long j10, V v3, V v10, V v11);

    long d(V v3, V v10, V v11);

    V e(V v3, V v10, V v11) {
        j.f(v3, "initialValue");
        j.f(v10, "targetValue");
        return c(d(v3, v10, v11), v3, v10, v11);
    }
}

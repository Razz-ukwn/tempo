package h4;

import gf.t;
import java.util.Map;
import sf.j;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final o f9219b = new o(t.f8979a);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f9220a;

    public o(Map<Class<?>, ? extends Object> map) {
        this.f9220a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            if (j.a(this.f9220a, ((o) obj).f9220a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9220a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f9220a + ')';
    }
}

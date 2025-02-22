package t;

import sf.j;

public final class a3<T> implements y2<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f14987a;

    public a3(T t2) {
        this.f14987a = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        return j.a(this.f14987a, ((a3) obj).f14987a);
    }

    public final T getValue() {
        return this.f14987a;
    }

    public final int hashCode() {
        T t2 = this.f14987a;
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f14987a + ')';
    }
}

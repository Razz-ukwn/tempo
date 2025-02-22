package ff;

import java.io.Serializable;
import sf.j;

public final class g<A, B> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final A f8706a;

    /* renamed from: b  reason: collision with root package name */
    public final B f8707b;

    public g(A a10, B b10) {
        this.f8706a = a10;
        this.f8707b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return j.a(this.f8706a, gVar.f8706a) && j.a(this.f8707b, gVar.f8707b);
    }

    public final int hashCode() {
        int i8 = 0;
        A a10 = this.f8706a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8707b;
        if (b10 != null) {
            i8 = b10.hashCode();
        }
        return hashCode + i8;
    }

    public final String toString() {
        return "(" + this.f8706a + ", " + this.f8707b + ')';
    }
}

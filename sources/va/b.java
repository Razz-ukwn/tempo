package va;

import java.util.Arrays;
import u6.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16352a;

    public b(String str) {
        this.f16352a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return o.a(this.f16352a, ((b) obj).f16352a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16352a});
    }

    public final String toString() {
        o.a aVar = new o.a(this);
        aVar.a(this.f16352a, "token");
        return aVar.toString();
    }
}

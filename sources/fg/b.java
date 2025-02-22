package fg;

import java.util.concurrent.TimeUnit;
import sf.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f8740a = 100000;

    /* renamed from: b  reason: collision with root package name */
    public final TimeUnit f8741b;

    public b(TimeUnit timeUnit) {
        j.f(timeUnit, "timeUnit");
        this.f8741b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8740a == bVar.f8740a && this.f8741b == bVar.f8741b;
    }

    public final int hashCode() {
        return this.f8741b.hashCode() + (Long.hashCode(this.f8740a) * 31);
    }

    public final String toString() {
        return "Emitter(duration=" + this.f8740a + ", timeUnit=" + this.f8741b + ')';
    }
}

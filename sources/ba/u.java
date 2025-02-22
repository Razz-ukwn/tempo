package ba;

import androidx.activity.g;
import ba.b0;

public final class u extends b0.e.d.C0050d {

    /* renamed from: a  reason: collision with root package name */
    public final String f3582a;

    public u(String str) {
        this.f3582a = str;
    }

    public final String a() {
        return this.f3582a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.C0050d) {
            return this.f3582a.equals(((b0.e.d.C0050d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3582a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return g.a(new StringBuilder("Log{content="), this.f3582a, "}");
    }
}

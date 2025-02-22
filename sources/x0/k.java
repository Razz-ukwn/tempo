package x0;

import s0.b0;
import sf.j;

public final class k extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f16910a;

    public k(String str) {
        j.f(str, "verbatim");
        this.f16910a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return j.a(this.f16910a, ((k) obj).f16910a);
    }

    public final int hashCode() {
        return this.f16910a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f16910a, ')');
    }
}

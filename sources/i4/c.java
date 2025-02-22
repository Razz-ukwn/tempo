package i4;

import sf.j;
import x3.i;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f9569a;

    public c(e eVar) {
        this.f9569a = eVar;
    }

    public final Object c(i iVar) {
        return this.f9569a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (j.a(this.f9569a, ((c) obj).f9569a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9569a.hashCode();
    }
}

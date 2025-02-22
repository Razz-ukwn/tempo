package b1;

import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f2997a;

    public c(a aVar) {
        this.f2997a = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return j.a(this.f2997a.a(), ((c) obj).f2997a.a());
    }

    public final int hashCode() {
        return this.f2997a.a().hashCode();
    }

    public final String toString() {
        return this.f2997a.a();
    }
}

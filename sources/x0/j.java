package x0;

import s0.b0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f16909a;

    public j(String str) {
        sf.j.f(str, "url");
        this.f16909a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return sf.j.a(this.f16909a, ((j) obj).f16909a);
    }

    public final int hashCode() {
        return this.f16909a.hashCode();
    }

    public final String toString() {
        return b0.a(new StringBuilder("UrlAnnotation(url="), this.f16909a, ')');
    }
}

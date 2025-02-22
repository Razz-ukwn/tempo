package sf;

public final class o implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f14952a;

    public o(Class cls) {
        j.f(cls, "jClass");
        this.f14952a = cls;
    }

    public final Class<?> a() {
        return this.f14952a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (j.a(this.f14952a, ((o) obj).f14952a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14952a.hashCode();
    }

    public final String toString() {
        return this.f14952a.toString() + " (Kotlin reflection is not available)";
    }
}

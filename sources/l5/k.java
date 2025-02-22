package l5;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f11004a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f11005b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f11006c;

    public k() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f11004a.equals(kVar.f11004a) && this.f11005b.equals(kVar.f11005b) && l.b(this.f11006c, kVar.f11006c);
    }

    public final int hashCode() {
        int hashCode = (this.f11005b.hashCode() + (this.f11004a.hashCode() * 31)) * 31;
        Class<?> cls = this.f11006c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f11004a + ", second=" + this.f11005b + '}';
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f11004a = cls;
        this.f11005b = cls2;
        this.f11006c = cls3;
    }
}

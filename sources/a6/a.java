package a6;

public final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f114a = null;

    /* renamed from: b  reason: collision with root package name */
    public final T f115b;

    /* renamed from: c  reason: collision with root package name */
    public final d f116c;

    public a(Object obj, d dVar) {
        if (obj != null) {
            this.f115b = obj;
            this.f116c = dVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final Integer a() {
        return this.f114a;
    }

    public final T b() {
        return this.f115b;
    }

    public final d c() {
        return this.f116c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f114a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f115b.equals(cVar.b()) && this.f116c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f114a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f115b.hashCode()) * 1000003) ^ this.f116c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f114a + ", payload=" + this.f115b + ", priority=" + this.f116c + "}";
    }
}

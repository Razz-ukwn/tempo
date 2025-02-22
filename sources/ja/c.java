package ja;

import java.util.Collections;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f9895a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f9896b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f9895a = str;
        this.f9896b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9895a.equals(cVar.f9895a) && this.f9896b.equals(cVar.f9896b);
    }

    public final int hashCode() {
        return this.f9896b.hashCode() + (this.f9895a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9895a + ", properties=" + this.f9896b.values() + "}";
    }
}

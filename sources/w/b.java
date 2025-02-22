package w;

import java.util.Map;
import sf.j;
import tf.a;

public class b<K, V> implements Map.Entry<K, V>, a {

    /* renamed from: a  reason: collision with root package name */
    public final K f16433a;

    /* renamed from: b  reason: collision with root package name */
    public final V f16434b;

    public b(K k10, V v3) {
        this.f16433a = k10;
        this.f16434b = v3;
    }

    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && j.a(entry.getKey(), this.f16433a) && j.a(entry.getValue(), getValue());
    }

    public final K getKey() {
        return this.f16433a;
    }

    public V getValue() {
        return this.f16434b;
    }

    public final int hashCode() {
        int i8 = 0;
        K k10 = this.f16433a;
        int hashCode = k10 != null ? k10.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i8 = value.hashCode();
        }
        return i8 ^ hashCode;
    }

    public V setValue(V v3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16433a);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}

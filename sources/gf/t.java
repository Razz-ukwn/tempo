package gf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import sf.j;
import tf.a;

public final class t implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final t f8979a = new t();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        j.f((Void) obj, "value");
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return u.f8980a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return u.f8980a;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return s.f8978a;
    }
}

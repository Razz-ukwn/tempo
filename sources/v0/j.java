package v0;

import cb.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tf.a;

public final class j implements x, Iterable<Map.Entry<? extends w<?>, ? extends Object>>, a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f16061a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f16062b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16063c;

    public final <T> void a(w<T> wVar, T t2) {
        sf.j.f(wVar, "key");
        this.f16061a.put(wVar, t2);
    }

    public final <T> boolean b(w<T> wVar) {
        sf.j.f(wVar, "key");
        return this.f16061a.containsKey(wVar);
    }

    public final <T> T c(w<T> wVar) {
        sf.j.f(wVar, "key");
        T t2 = this.f16061a.get(wVar);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return sf.j.a(this.f16061a, jVar.f16061a) && this.f16062b == jVar.f16062b && this.f16063c == jVar.f16063c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f16062b);
        return Boolean.hashCode(this.f16063c) + ((hashCode + (this.f16061a.hashCode() * 31)) * 31);
    }

    public final Iterator<Map.Entry<w<?>, Object>> iterator() {
        return this.f16061a.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f16062b) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f16063c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f16061a.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(((w) entry.getKey()).f16115a);
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return d.g0(this) + "{ " + sb2 + " }";
    }
}

package h4;

import ff.g;
import gf.t;
import gf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import sf.j;

public final class m implements Iterable<g<? extends String, ? extends b>>, tf.a {

    /* renamed from: b  reason: collision with root package name */
    public static final m f9209b = new m();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f9210a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f9211a;

        public a(m mVar) {
            this.f9211a = y.Y(mVar.f9210a);
        }
    }

    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                bVar.getClass();
                if (j.a((Object) null, (Object) null)) {
                    bVar.getClass();
                    if (j.a((Object) null, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Entry(value=null, memoryCacheKey=null)";
        }
    }

    public m(Map<String, b> map) {
        this.f9210a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            if (j.a(this.f9210a, ((m) obj).f9210a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9210a.hashCode();
    }

    public final Iterator<g<String, b>> iterator() {
        Map<String, b> map = this.f9210a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new g((String) next.getKey(), (b) next.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f9210a + ')';
    }

    public m() {
        this(t.f8979a);
    }
}

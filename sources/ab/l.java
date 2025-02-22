package ab;

import java.util.ArrayList;
import java.util.Iterator;

public final class l extends n implements Iterable<n> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f273a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f273a.equals(this.f273a));
    }

    public final int hashCode() {
        return this.f273a.hashCode();
    }

    public final Iterator<n> iterator() {
        return this.f273a.iterator();
    }
}

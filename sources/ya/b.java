package ya;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final String f17322a;

    /* renamed from: b  reason: collision with root package name */
    public final c f17323b;

    public b(Set<d> set, c cVar) {
        this.f17322a = b(set);
        this.f17323b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f17323b;
        synchronized (cVar.f17325a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f17325a);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f17322a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (cVar.f17325a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar.f17325a);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}

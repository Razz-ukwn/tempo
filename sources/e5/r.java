package e5;

import i5.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import l5.l;

public final class r implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g<?>> f7845a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = l.d(this.f7845a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    public final void e() {
        Iterator it = l.d(this.f7845a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).e();
        }
    }

    public final void h() {
        Iterator it = l.d(this.f7845a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).h();
        }
    }
}

package e5;

import h5.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import l5.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Set<d> f7823a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f7824b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f7825c;

    public final boolean a(d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f7823a.remove(dVar);
        if (!this.f7824b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public final void b() {
        Iterator it = l.d(this.f7823a).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.i() && !dVar.g()) {
                dVar.clear();
                if (!this.f7825c) {
                    dVar.h();
                } else {
                    this.f7824b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f7823a.size() + ", isPaused=" + this.f7825c + "}";
    }
}

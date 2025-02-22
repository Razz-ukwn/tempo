package e5;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import l5.l;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f7805a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f7806b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7807c;

    public final void a(i iVar) {
        this.f7805a.add(iVar);
        if (this.f7807c) {
            iVar.e();
        } else if (this.f7806b) {
            iVar.a();
        } else {
            iVar.h();
        }
    }

    public final void b(i iVar) {
        this.f7805a.remove(iVar);
    }

    public final void c() {
        this.f7807c = true;
        Iterator it = l.d(this.f7805a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    public final void d() {
        this.f7806b = true;
        Iterator it = l.d(this.f7805a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    public final void e() {
        this.f7806b = false;
        Iterator it = l.d(this.f7805a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).h();
        }
    }
}

package r0;

import androidx.fragment.app.z;
import sf.j;

public final class a extends z {

    /* renamed from: b  reason: collision with root package name */
    public g<?> f13758b;

    public a(g<?> gVar) {
        j.f(gVar, "element");
        this.f13758b = gVar;
    }

    public final boolean j(c<?> cVar) {
        j.f(cVar, "key");
        return cVar == this.f13758b.getKey();
    }

    public final Object k(h hVar) {
        if (hVar == this.f13758b.getKey()) {
            return this.f13758b.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

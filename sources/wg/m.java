package wg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import sf.j;
import sf.w;
import xf.b;

public abstract class m extends l {

    /* renamed from: b  reason: collision with root package name */
    public final l f16787b;

    public m(u uVar) {
        j.f(uVar, "delegate");
        this.f16787b = uVar;
    }

    public final g0 a(z zVar) {
        return this.f16787b.a(zVar);
    }

    public final void b(z zVar, z zVar2) {
        j.f(zVar, "source");
        j.f(zVar2, "target");
        this.f16787b.b(zVar, zVar2);
    }

    public final void c(z zVar) {
        this.f16787b.c(zVar);
    }

    public final void d(z zVar) {
        j.f(zVar, "path");
        this.f16787b.d(zVar);
    }

    public final List<z> g(z zVar) {
        j.f(zVar, "dir");
        ArrayList arrayList = new ArrayList();
        for (z zVar2 : this.f16787b.g(zVar)) {
            j.f(zVar2, "path");
            arrayList.add(zVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public final k i(z zVar) {
        j.f(zVar, "path");
        k i8 = this.f16787b.i(zVar);
        if (i8 == null) {
            return null;
        }
        z zVar2 = i8.f16775c;
        if (zVar2 == null) {
            return i8;
        }
        boolean z10 = i8.f16773a;
        boolean z11 = i8.f16774b;
        Long l10 = i8.f16776d;
        Long l11 = i8.f16777e;
        Long l12 = i8.f16778f;
        Long l13 = i8.f16779g;
        Map<b<?>, Object> map = i8.f16780h;
        j.f(map, "extras");
        return new k(z10, z11, zVar2, l10, l11, l12, l13, map);
    }

    public final j j(z zVar) {
        j.f(zVar, "file");
        return this.f16787b.j(zVar);
    }

    public final i0 l(z zVar) {
        j.f(zVar, "file");
        return this.f16787b.l(zVar);
    }

    public final String toString() {
        return w.a(getClass()).b() + '(' + this.f16787b + ')';
    }
}

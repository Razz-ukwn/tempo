package xg;

import ff.g;
import ff.j;
import gf.m;
import gf.o;
import gf.q;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import wg.e;
import wg.g0;
import wg.i;
import wg.i0;
import wg.k;
import wg.l;
import wg.z;
import zf.n;

public final class d extends l {
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final z f17077c = z.a.a("/", false);

    /* renamed from: b  reason: collision with root package name */
    public final j f17078b;

    public static final class a {
        public static final boolean a(z zVar) {
            z zVar2 = d.f17077c;
            zVar.getClass();
            i iVar = k.f17098a;
            i iVar2 = zVar.f16809a;
            int k10 = i.k(iVar2, iVar);
            if (k10 == -1) {
                k10 = i.k(iVar2, k.f17099b);
            }
            if (k10 != -1) {
                iVar2 = i.o(iVar2, k10 + 1, 0, 2);
            } else if (zVar.e() != null && iVar2.d() == 2) {
                iVar2 = i.f16760d;
            }
            return !zf.j.r0(iVar2.q(), ".class", true);
        }
    }

    static {
        new a();
        String str = z.f16808b;
    }

    public d(ClassLoader classLoader) {
        this.f17078b = b7.a.x(new e(classLoader));
    }

    public static String m(z zVar) {
        z zVar2;
        z zVar3 = f17077c;
        zVar3.getClass();
        sf.j.f(zVar, "child");
        boolean z10 = true;
        z b10 = k.b(zVar3, zVar, true);
        int a10 = k.a(b10);
        z zVar4 = null;
        i iVar = b10.f16809a;
        z zVar5 = a10 == -1 ? null : new z(iVar.n(0, a10));
        int a11 = k.a(zVar3);
        i iVar2 = zVar3.f16809a;
        if (a11 != -1) {
            zVar4 = new z(iVar2.n(0, a11));
        }
        if (sf.j.a(zVar5, zVar4)) {
            ArrayList a12 = b10.a();
            ArrayList a13 = zVar3.a();
            int min = Math.min(a12.size(), a13.size());
            int i8 = 0;
            while (i8 < min && sf.j.a(a12.get(i8), a13.get(i8))) {
                i8++;
            }
            if (i8 == min && iVar.d() == iVar2.d()) {
                String str = z.f16808b;
                zVar2 = z.a.a(".", false);
            } else {
                if (a13.subList(i8, a13.size()).indexOf(k.f17102e) != -1) {
                    z10 = false;
                }
                if (z10) {
                    e eVar = new e();
                    i c3 = k.c(zVar3);
                    if (c3 == null && (c3 = k.c(b10)) == null) {
                        c3 = k.f(z.f16808b);
                    }
                    int size = a13.size();
                    for (int i10 = i8; i10 < size; i10++) {
                        eVar.f0(k.f17102e);
                        eVar.f0(c3);
                    }
                    int size2 = a12.size();
                    while (i8 < size2) {
                        eVar.f0((i) a12.get(i8));
                        eVar.f0(c3);
                        i8++;
                    }
                    zVar2 = k.d(eVar, false);
                } else {
                    throw new IllegalArgumentException(("Impossible relative path to resolve: " + b10 + " and " + zVar3).toString());
                }
            }
            return zVar2.toString();
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b10 + " and " + zVar3).toString());
    }

    public final g0 a(z zVar) {
        throw new IOException(this + " is read-only");
    }

    public final void b(z zVar, z zVar2) {
        sf.j.f(zVar, "source");
        sf.j.f(zVar2, "target");
        throw new IOException(this + " is read-only");
    }

    public final void c(z zVar) {
        throw new IOException(this + " is read-only");
    }

    public final void d(z zVar) {
        sf.j.f(zVar, "path");
        throw new IOException(this + " is read-only");
    }

    public final List<z> g(z zVar) {
        sf.j.f(zVar, "dir");
        String m = m(zVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (g gVar : (List) this.f17078b.getValue()) {
            l lVar = (l) gVar.f8706a;
            z zVar2 = (z) gVar.f8707b;
            try {
                ArrayList arrayList = new ArrayList();
                for (Object next : lVar.g(zVar2.c(m))) {
                    if (a.a((z) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.n0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z zVar3 = (z) it.next();
                    sf.j.f(zVar3, "<this>");
                    String zVar4 = zVar2.toString();
                    z zVar5 = f17077c;
                    String replace = n.O0(zVar4, zVar3.toString()).replace('\\', '/');
                    sf.j.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
                    arrayList2.add(zVar5.c(replace));
                }
                o.p0(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return q.O0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    public final k i(z zVar) {
        sf.j.f(zVar, "path");
        if (!a.a(zVar)) {
            return null;
        }
        String m = m(zVar);
        for (g gVar : (List) this.f17078b.getValue()) {
            k i8 = ((l) gVar.f8706a).i(((z) gVar.f8707b).c(m));
            if (i8 != null) {
                return i8;
            }
        }
        return null;
    }

    public final wg.j j(z zVar) {
        sf.j.f(zVar, "file");
        if (a.a(zVar)) {
            String m = m(zVar);
            for (g gVar : (List) this.f17078b.getValue()) {
                try {
                    return ((l) gVar.f8706a).j(((z) gVar.f8707b).c(m));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + zVar);
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    public final g0 k(z zVar) {
        sf.j.f(zVar, "file");
        throw new IOException(this + " is read-only");
    }

    public final i0 l(z zVar) {
        sf.j.f(zVar, "file");
        if (a.a(zVar)) {
            String m = m(zVar);
            for (g gVar : (List) this.f17078b.getValue()) {
                try {
                    return ((l) gVar.f8706a).l(((z) gVar.f8707b).c(m));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + zVar);
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }
}

package o0;

import java.util.Map;
import q0.h;
import s0.n1;
import sf.j;
import u.d;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final d<h> f12061a = new d<>(new h[16]);

    public boolean a(Map<n, o> map, h hVar, e eVar, boolean z10) {
        j.f(map, "changes");
        j.f(hVar, "parentCoordinates");
        d<h> dVar = this.f12061a;
        int i8 = dVar.f15640c;
        if (i8 <= 0) {
            return false;
        }
        T[] tArr = dVar.f15638a;
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((h) tArr[i10]).a(map, hVar, eVar, z10) || z11;
            i10++;
        } while (i10 < i8);
        return z11;
    }

    public void b(e eVar) {
        d<h> dVar = this.f12061a;
        for (int i8 = dVar.f15640c - 1; -1 < i8; i8--) {
            if (((h) dVar.f15638a[i8]).f12054c.f15640c == 0) {
                dVar.k(i8);
            }
        }
    }

    public void c() {
        d<h> dVar = this.f12061a;
        int i8 = dVar.f15640c;
        if (i8 > 0) {
            T[] tArr = dVar.f15638a;
            int i10 = 0;
            do {
                ((h) tArr[i10]).c();
                i10++;
            } while (i10 < i8);
        }
    }

    public boolean d(e eVar) {
        d<h> dVar = this.f12061a;
        int i8 = dVar.f15640c;
        boolean z10 = false;
        if (i8 > 0) {
            T[] tArr = dVar.f15638a;
            int i10 = 0;
            boolean z11 = false;
            do {
                z11 = ((h) tArr[i10]).d(eVar) || z11;
                i10++;
            } while (i10 < i8);
            z10 = z11;
        }
        b(eVar);
        return z10;
    }

    public boolean e(Map<n, o> map, h hVar, e eVar, boolean z10) {
        j.f(map, "changes");
        j.f(hVar, "parentCoordinates");
        d<h> dVar = this.f12061a;
        int i8 = dVar.f15640c;
        if (i8 <= 0) {
            return false;
        }
        T[] tArr = dVar.f15638a;
        int i10 = 0;
        boolean z11 = false;
        do {
            z11 = ((h) tArr[i10]).e(map, hVar, eVar, z10) || z11;
            i10++;
        } while (i10 < i8);
        return z11;
    }

    public final void f() {
        int i8 = 0;
        while (true) {
            d<h> dVar = this.f12061a;
            if (i8 < dVar.f15640c) {
                h hVar = (h) dVar.f15638a[i8];
                if (!n1.a(hVar.f12053b)) {
                    dVar.k(i8);
                    hVar.c();
                } else {
                    i8++;
                    hVar.f();
                }
            } else {
                return;
            }
        }
    }
}

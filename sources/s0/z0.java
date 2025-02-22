package s0;

import d0.g;
import u.d;

public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final d<a0> f14471a = new d<>(new a0[16]);

    public static void a(a0 a0Var) {
        f0 f0Var = a0Var.W;
        if (f0Var.f14337b == 5 && !f0Var.f14339d && !f0Var.f14338c && a0Var.M) {
            g.c cVar = a0Var.V.f14404e;
            if ((cVar.f7179c & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.f7178b & 256) != 0 && (cVar instanceof p)) {
                        p pVar = (p) cVar;
                        pVar.f(i.d(pVar, 256));
                    }
                    if ((cVar.f7179c & 256) == 0) {
                        break;
                    }
                    cVar = cVar.f7181e;
                }
            }
        }
        int i8 = 0;
        a0Var.f14313b0 = false;
        d<a0> s10 = a0Var.s();
        int i10 = s10.f15640c;
        if (i10 > 0) {
            T[] tArr = s10.f15638a;
            do {
                a((a0) tArr[i8]);
                i8++;
            } while (i8 < i10);
        }
    }
}

package t;

import androidx.activity.f;
import b7.a;
import ff.m;
import sf.k;
import sf.t;

public final class q extends k implements rf.q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f15207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f15208b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(t tVar, b bVar) {
        super(3);
        this.f15207a = tVar;
        this.f15208b = bVar;
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        int i8;
        c cVar = (c) obj;
        p2 p2Var = (p2) obj2;
        f.e(cVar, "applier", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
        int c3 = p2Var.c(this.f15208b);
        boolean z10 = true;
        e0.f(p2Var.f15203r < c3);
        i.L(p2Var, cVar, c3);
        int i10 = p2Var.f15203r;
        int i11 = p2Var.f15204s;
        while (i11 >= 0 && !p2Var.s(i11)) {
            i11 = p2Var.z(i11);
        }
        int i12 = i11 + 1;
        int i13 = 0;
        while (i12 < i10) {
            if (p2Var.p(i10, i12)) {
                if (p2Var.s(i12)) {
                    i13 = 0;
                }
                i12++;
            } else {
                i13 += p2Var.s(i12) ? 1 : a.j(p2Var.f15188b, p2Var.n(i12));
                i12 += p2Var.o(i12);
            }
        }
        while (true) {
            i8 = p2Var.f15203r;
            if (i8 >= c3) {
                break;
            } else if (p2Var.p(c3, i8)) {
                int i14 = p2Var.f15203r;
                if (i14 < p2Var.f15193g && a.g(p2Var.f15188b, p2Var.n(i14))) {
                    cVar.b(p2Var.y(p2Var.f15203r));
                    i13 = 0;
                }
                p2Var.I();
            } else {
                i13 += p2Var.F();
            }
        }
        if (i8 != c3) {
            z10 = false;
        }
        e0.f(z10);
        this.f15207a.f14955a = i13;
        return m.f8717a;
    }
}

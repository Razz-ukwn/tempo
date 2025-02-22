package t;

import androidx.activity.f;
import ff.m;
import java.util.List;
import rf.q;
import sf.j;
import sf.k;
import t.h;
import t.p2;

public final class u extends k implements q<c<?>, p2, i2, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h1 f15235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f15236b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i1 f15237c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i1 f15238d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(h1 h1Var, i iVar, i1 i1Var, i1 i1Var2) {
        super(3);
        this.f15235a = h1Var;
        this.f15236b = iVar;
        this.f15237c = i1Var;
        this.f15238d = i1Var2;
    }

    /* JADX INFO: finally extract failed */
    public final Object e(Object obj, Object obj2, Object obj3) {
        p2 p2Var = (p2) obj2;
        f.e((c) obj, "<anonymous parameter 0>", p2Var, "slots", (i2) obj3, "<anonymous parameter 2>");
        h1 h1Var = this.f15235a;
        if (h1Var == null && (h1Var = this.f15236b.f15066b.h(this.f15237c)) == null) {
            e0.c("Could not resolve state for movable content");
            throw null;
        }
        n2 n2Var = h1Var.f15063a;
        j.f(n2Var, "table");
        e0.f(p2Var.m <= 0 && p2Var.o(p2Var.f15203r + 1) == 1);
        int i8 = p2Var.f15203r;
        int i10 = p2Var.f15194h;
        int i11 = p2Var.f15195i;
        p2Var.a(1);
        p2Var.I();
        p2Var.e();
        p2 e10 = n2Var.e();
        try {
            List a10 = p2.a.a(e10, 2, p2Var, false, true);
            e10.f();
            p2Var.j();
            p2Var.i();
            p2Var.f15203r = i8;
            p2Var.f15194h = i10;
            p2Var.f15195i = i11;
            if (!a10.isEmpty()) {
                m0 m0Var = this.f15238d.f15121c;
                j.d(m0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                i0 i0Var = (i0) m0Var;
                int size = a10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    b bVar = (b) a10.get(i12);
                    j.f(bVar, "anchor");
                    int c3 = p2Var.c(bVar);
                    int H = p2Var.H(p2Var.f15188b, p2Var.n(c3));
                    int i13 = 0 + H;
                    Object obj4 = !(H <= i13 && i13 < p2Var.g(p2Var.f15188b, p2Var.n(c3 + 1))) ? h.a.f15061a : p2Var.f15189c[p2Var.h(i13)];
                    y1 y1Var = obj4 instanceof y1 ? (y1) obj4 : null;
                    if (y1Var != null) {
                        y1Var.f15284b = i0Var;
                    }
                }
            }
            return m.f8717a;
        } catch (Throwable th) {
            e10.f();
            throw th;
        }
    }
}

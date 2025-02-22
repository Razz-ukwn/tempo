package md;

import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import jf.d;
import jf.f;
import jf.g;
import kotlinx.coroutines.flow.y0;
import rf.p;
import sf.j;
import sf.k;
import t.b3;
import t.c1;
import t.e0;
import t.h;
import t.j1;
import t.r0;
import t.t0;
import t.u2;
import t.v2;

public final class h0 extends k implements p<h, Integer, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11403a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(MeasuringBottomSheet measuringBottomSheet) {
        super(2);
        this.f11403a = measuringBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
            e0.b bVar = e0.f15020a;
            int i8 = MeasuringBottomSheet.f6988h1;
            y0 y0Var = this.f11403a.B0().f7012h;
            j.f(y0Var, "<this>");
            hVar.c(-1439883919);
            g gVar = g.f10014a;
            Object value = y0Var.getValue();
            hVar.c(-606625098);
            v2 v2Var = new v2(gVar, y0Var, (d<? super v2>) null);
            hVar.c(-1703169085);
            hVar.c(-492369756);
            Object d10 = hVar.d();
            h.a.C0280a aVar = h.a.f15061a;
            if (d10 == aVar) {
                d10 = cb.d.R(value, b3.f14997a);
                hVar.n(d10);
            }
            hVar.o();
            j1 j1Var = (j1) d10;
            u2 u2Var = new u2(v2Var, j1Var, (d<? super u2>) null);
            r0 r0Var = t0.f15231a;
            hVar.c(590241125);
            f l10 = hVar.l();
            hVar.c(511388516);
            boolean p10 = hVar.p(y0Var) | hVar.p(gVar);
            Object d11 = hVar.d();
            if (p10 || d11 == aVar) {
                hVar.n(new c1(l10, u2Var));
            }
            hVar.o();
            hVar.o();
            hVar.o();
            hVar.o();
            hVar.o();
            b.a(((Number) j1Var.getValue()).floatValue(), hVar, 0);
        } else {
            hVar.j();
        }
        return m.f8717a;
    }
}

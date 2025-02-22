package od;

import cb.d;
import com.quickkonnect.silencio.ui.measure.result.ResultBottomSheet;
import ff.m;
import md.b;
import rf.p;
import sf.k;
import t.b3;
import t.e0;
import t.h;
import t.j1;

public final class j extends k implements p<h, Integer, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResultBottomSheet f12302a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(ResultBottomSheet resultBottomSheet) {
        super(2);
        this.f12302a = resultBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        h hVar = (h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.h()) {
            e0.b bVar = e0.f15020a;
            hVar.c(-492369756);
            Object d10 = hVar.d();
            if (d10 == h.a.f15061a) {
                int i8 = ResultBottomSheet.U0;
                Double avgDb = this.f12302a.u0().f12303a.getAvgDb();
                d10 = d.R(Float.valueOf(avgDb != null ? (float) avgDb.doubleValue() : 0.0f), b3.f14997a);
                hVar.n(d10);
            }
            hVar.o();
            b.a(((Number) ((j1) d10).getValue()).floatValue(), hVar, 0);
        } else {
            hVar.j();
        }
        return m.f8717a;
    }
}

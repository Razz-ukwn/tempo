package md;

import cb.d;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import f.a;
import ff.m;
import java.util.ArrayList;
import java.util.List;
import nc.i0;
import rf.l;
import s5.f;
import s5.g;
import sf.j;
import sf.k;

public final class h extends k implements l<List<Float>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11402a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        j.e(list, "it");
        int i8 = 0;
        for (Object next : list) {
            int i10 = i8 + 1;
            if (i8 >= 0) {
                arrayList.add(new f((float) i8, ((Number) next).floatValue()));
                i8 = i10;
            } else {
                d.i0();
                throw null;
            }
        }
        s5.h hVar = new s5.h(arrayList);
        hVar.A = z5.f.c(1.75f);
        hVar.J = false;
        MeasuringBottomSheet measuringBottomSheet = this.f11402a;
        int color = measuringBottomSheet.e0().getColor(R.color.bluish_purple);
        if (hVar.f14706a == null) {
            hVar.f14706a = new ArrayList();
        }
        hVar.f14706a.clear();
        hVar.f14706a.add(Integer.valueOf(color));
        hVar.B = true;
        hVar.f14741y = a.a(measuringBottomSheet.e0(), R.drawable.measuring_chart_gradient);
        hVar.f14715j = false;
        g gVar = new g(hVar);
        i0 i0Var = measuringBottomSheet.Q0;
        j.c(i0Var);
        i0Var.f11709f.setData(gVar);
        i0 i0Var2 = measuringBottomSheet.Q0;
        j.c(i0Var2);
        i0Var2.f11709f.invalidate();
        return m.f8717a;
    }
}

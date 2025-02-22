package md;

import android.widget.TextView;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import nc.i0;
import q4.a;
import rf.l;
import sf.j;
import sf.k;

public final class a0 extends k implements l<Double, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11383a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11383a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        Double d10 = (Double) obj;
        try {
            i0 i0Var = this.f11383a.Q0;
            j.c(i0Var);
            TextView textView = i0Var.f11712i;
            j.e(d10, "it");
            textView.setText(String.valueOf(a.f(d10.doubleValue())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return m.f8717a;
    }
}

package md;

import android.widget.TextView;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import nc.i0;
import q4.a;
import rf.l;
import sf.j;
import sf.k;

public final class b0 extends k implements l<Float, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11388a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11388a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        Float f10 = (Float) obj;
        try {
            i0 i0Var = this.f11388a.Q0;
            j.c(i0Var);
            TextView textView = i0Var.f11714k;
            j.e(f10, "it");
            textView.setText(String.valueOf(a.g(f10.floatValue())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return m.f8717a;
    }
}

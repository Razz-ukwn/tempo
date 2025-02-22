package md;

import android.view.View;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class g0 extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11401a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        try {
            ag.m.c(this.f11401a).n(new a(R.id.action_measuringBottomSheet_to_infoBottomSheet));
        } catch (Exception unused) {
        }
        return m.f8717a;
    }
}

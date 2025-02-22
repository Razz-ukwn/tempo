package od;

import android.view.View;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.result.ResultBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.d;

public final class g extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResultBottomSheet f12299a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ResultBottomSheet resultBottomSheet) {
        super(1);
        this.f12299a = resultBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        ResultBottomSheet resultBottomSheet = this.f12299a;
        String string = resultBottomSheet.e0().getString(R.string.alert_title);
        j.e(string, "requireContext().getString(R.string.alert_title)");
        String string2 = resultBottomSheet.e0().getString(R.string.cancel_recording_popup);
        j.e(string2, "requireContext().getStri…g.cancel_recording_popup)");
        d.d(resultBottomSheet, string, string2, "Yes", "Continue Measurement", true, new e(resultBottomSheet), f.f12298a);
        return m.f8717a;
    }
}

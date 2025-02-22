package md;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import java.util.Arrays;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class u extends k implements l<g<StopRecordingResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11429a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11429a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        MeasuringBottomSheet measuringBottomSheet = this.f11429a;
        if (z10) {
            b bVar = measuringBottomSheet.V0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = measuringBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(measuringBottomSheet, string, str, "OK", (String) null, false, s.f11425a, t.f11427a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = measuringBottomSheet.V0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = measuringBottomSheet.V0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    try {
                        b3.m c3 = ag.m.c(measuringBottomSheet);
                        String format = String.format("%,.2f", Arrays.copyOf(new Object[]{Float.valueOf(measuringBottomSheet.R0)}, 1));
                        j.e(format, "format(format, *args)");
                        c3.n(new u0(format, measuringBottomSheet.X0, measuringBottomSheet.Z0, measuringBottomSheet.f6989a1));
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

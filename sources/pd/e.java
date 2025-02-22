package pd;

import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.menu.MeasurementModel;
import com.quickkonnect.silencio.models.response.menu.MeasurementResponse;
import com.quickkonnect.silencio.ui.menu.history.HistoryFragment;
import ff.m;
import java.util.Arrays;
import nc.a1;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class e extends k implements l<g<MeasurementResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f12593a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(HistoryFragment historyFragment) {
        super(1);
        this.f12593a = historyFragment;
    }

    public final Object invoke(Object obj) {
        Double avgMin;
        Double hours;
        Double totalCount;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        HistoryFragment historyFragment = this.f12593a;
        if (z10) {
            String str = gVar.f17949b;
            if (str != null) {
                String string = historyFragment.e0().getString(R.string.alert_title);
                j.e(string, "getString(R.string.alert_title)");
                d.d(historyFragment, string, str, "OK", (String) null, false, c.f12591a, d.f12592a);
            }
        } else if (!(gVar instanceof g.c)) {
            if (gVar instanceof g.d) {
                MeasurementResponse measurementResponse = (MeasurementResponse) gVar.f17948a;
                Integer num = null;
                MeasurementModel data = measurementResponse != null ? measurementResponse.getData() : null;
                a1 a1Var = historyFragment.A0;
                j.c(a1Var);
                if (!(data == null || (totalCount = data.getTotalCount()) == null)) {
                    num = Integer.valueOf((int) totalCount.doubleValue());
                }
                a1Var.X.setText(String.valueOf(num));
                if (!(data == null || (hours = data.getHours()) == null)) {
                    double doubleValue = hours.doubleValue();
                    double d10 = (double) 3600;
                    double d11 = ((doubleValue % d10) / ((double) 60)) + ((double) (((int) (doubleValue / d10)) * 60));
                    a1 a1Var2 = historyFragment.A0;
                    j.c(a1Var2);
                    a1Var2.V.setText(String.valueOf((int) d11));
                }
                if (!(data == null || (avgMin = data.getAvgMin()) == null)) {
                    double doubleValue2 = avgMin.doubleValue();
                    double d12 = (double) 60;
                    a1 a1Var3 = historyFragment.A0;
                    j.c(a1Var3);
                    String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((doubleValue2 % ((double) 3600)) / d12)), Integer.valueOf((int) (doubleValue2 % d12))}, 2));
                    j.e(format, "format(format, *args)");
                    a1Var3.W.setText(format);
                }
            } else {
                boolean z11 = gVar instanceof g.b;
            }
        }
        return m.f8717a;
    }
}

package md;

import androidx.appcompat.app.b;
import bh.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import java.io.File;
import jf.f;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class o extends k implements l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11417a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11417a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        MeasuringBottomSheet measuringBottomSheet = this.f11417a;
        if (z10) {
            b bVar = measuringBottomSheet.V0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = measuringBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(measuringBottomSheet, string, str, "OK", (String) null, false, new m(measuringBottomSheet), n.f11415a);
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
                    MeasuringViewModel B0 = measuringBottomSheet.B0();
                    B0.getClass();
                    boolean z11 = false;
                    cb.b.D(gc.b.o(B0), (f.b) null, 0, new y0(B0, (jf.d<? super y0>) null), 3);
                    try {
                        if (measuringBottomSheet.W0.length() > 0) {
                            z11 = true;
                        }
                        if (z11) {
                            new File(measuringBottomSheet.W0).delete();
                        }
                    } catch (Exception e10) {
                        a.f3654a.c(e10);
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

package md;

import androidx.appcompat.app.b;
import bh.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import java.util.Collection;
import java.util.List;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class r extends k implements l<g<StopRecordingResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11423a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(MeasuringBottomSheet measuringBottomSheet) {
        super(1);
        this.f11423a = measuringBottomSheet;
    }

    public final Object invoke(Object obj) {
        StopRecordingRequestModel stopRecordingRequestModel;
        float[] fArr;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        MeasuringBottomSheet measuringBottomSheet = this.f11423a;
        if (z10) {
            b bVar = measuringBottomSheet.V0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = measuringBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(measuringBottomSheet, string, str, "OK", (String) null, false, new p(measuringBottomSheet), q.f11421a);
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
                        StopRecordingResponseModel stopRecordingResponseModel = (StopRecordingResponseModel) gVar.f17948a;
                        if (!(stopRecordingResponseModel == null || stopRecordingResponseModel.getData() == null || (stopRecordingRequestModel = measuringBottomSheet.B0().f7029z) == null)) {
                            if (measuringBottomSheet.X0) {
                                measuringBottomSheet.B0().h(measuringBottomSheet.R0);
                            } else if (measuringBottomSheet.Z0) {
                                measuringBottomSheet.B0().h(measuringBottomSheet.R0);
                            } else if (measuringBottomSheet.f6989a1) {
                                measuringBottomSheet.B0().h(measuringBottomSheet.R0);
                            } else {
                                try {
                                    b3.m c3 = ag.m.c(measuringBottomSheet);
                                    float f10 = measuringBottomSheet.R0;
                                    String str2 = measuringBottomSheet.W0;
                                    List d10 = measuringBottomSheet.B0().f7013i.d();
                                    int i8 = 0;
                                    if (d10 != null) {
                                        Collection<Number> collection = d10;
                                        fArr = new float[collection.size()];
                                        for (Number floatValue : collection) {
                                            fArr[i8] = floatValue.floatValue();
                                            i8++;
                                        }
                                    } else {
                                        fArr = new float[0];
                                    }
                                    j.f(str2, "screenShot");
                                    c3.n(new v0(stopRecordingRequestModel, f10, str2, fArr));
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                    } catch (Exception e11) {
                        a.f3654a.c(e11);
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

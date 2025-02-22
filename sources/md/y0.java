package md;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import com.quickkonnect.silencio.models.request.measure.StopRecordingRequestModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import gf.q;
import java.util.Date;
import java.util.List;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;
import zf.o;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$stopMeasuring$1", f = "MeasuringViewModel.kt", l = {301}, m = "invokeSuspend")
public final class y0 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11455a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringViewModel f11456b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(MeasuringViewModel measuringViewModel, d<? super y0> dVar) {
        super(2, dVar);
        this.f11456b = measuringViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new y0(this.f11456b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f11455a;
        MeasuringViewModel measuringViewModel = this.f11456b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(measuringViewModel);
            v<g<StopRecordingResponseModel>> vVar = measuringViewModel.f7023t;
            if (g10) {
                f.c(vVar);
                String str = (String) measuringViewModel.f7018o.getValue();
                Integer p02 = zf.i.p0(o.a1(2, str));
                int i10 = 0;
                int intValue = (p02 != null ? p02.intValue() : 0) * 60;
                Integer p03 = zf.i.p0(o.b1(str));
                if (p03 != null) {
                    i10 = p03.intValue();
                }
                String str2 = (String) measuringViewModel.f7028y.getValue();
                double d10 = (double) (intValue + i10);
                Date date = measuringViewModel.f7017n;
                Double d11 = null;
                Long l10 = date != null ? new Long(date.getTime()) : null;
                StartLocation startLocation = (StartLocation) measuringViewModel.f7027x.getValue();
                v<List<Float>> vVar2 = measuringViewModel.f7013i;
                List d12 = vVar2.d();
                Double d13 = d12 != null ? new Double((double) q.F0(d12)) : null;
                List d14 = vVar2.d();
                if (d14 != null) {
                    d11 = new Double((double) q.E0(d14));
                }
                StopRecordingRequestModel stopRecordingRequestModel = new StopRecordingRequestModel(str2, new Double(d10), startLocation, d13, d11, (Double) measuringViewModel.f7014j.d(), l10, q.K0(measuringViewModel.C, 1200));
                measuringViewModel.f7029z = stopRecordingRequestModel;
                mc.b bVar = measuringViewModel.f7011g;
                this.f11455a = 1;
                obj = bVar.f11380a.a(stopRecordingRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(measuringViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                measuringViewModel.f7023t.k(new g.a(measuringViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        measuringViewModel.f7023t.k(measuringViewModel.f((b0) obj));
        return m.f8717a;
    }
}

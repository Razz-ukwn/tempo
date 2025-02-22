package md;

import ag.g0;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.MeasureStartRecordingRequestModel;
import com.quickkonnect.silencio.models.request.measure.StartLocation;
import com.quickkonnect.silencio.models.response.measure.StartRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import java.util.List;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$startMeasuring$1", f = "MeasuringViewModel.kt", l = {253}, m = "invokeSuspend")
public final class x0 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11449a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringViewModel f11450b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<String> f11451c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(MeasuringViewModel measuringViewModel, List<String> list, d<? super x0> dVar) {
        super(2, dVar);
        this.f11450b = measuringViewModel;
        this.f11451c = list;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new x0(this.f11450b, this.f11451c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f11449a;
        MeasuringViewModel measuringViewModel = this.f11450b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(measuringViewModel);
            v<g<StartRecordingResponseModel>> vVar = measuringViewModel.f7022s;
            if (g10) {
                measuringViewModel.f7026w.setValue(new StartLocation("Point", this.f11451c, (Float) null, 4, (sf.e) null));
                vVar.k(new g.c());
                mc.b bVar = measuringViewModel.f7011g;
                MeasureStartRecordingRequestModel measureStartRecordingRequestModel = new MeasureStartRecordingRequestModel(new StartLocation("Point", this.f11451c, (Float) null, 4, (sf.e) null));
                this.f11449a = 1;
                obj = bVar.f11380a.b(measureStartRecordingRequestModel, this);
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
                measuringViewModel.f7022s.k(new g.a(measuringViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        measuringViewModel.f7022s.k(measuringViewModel.f((b0) obj));
        return m.f8717a;
    }
}

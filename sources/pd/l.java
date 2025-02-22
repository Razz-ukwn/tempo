package pd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.menu.MeasurementResponse;
import com.quickkonnect.silencio.ui.menu.history.HistoryViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import mc.c;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.menu.history.HistoryViewModel$submitMeasurement$1", f = "HistoryViewModel.kt", l = {45}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12605a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HistoryViewModel f12606b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(HistoryViewModel historyViewModel, d<? super l> dVar) {
        super(2, dVar);
        this.f12606b = historyViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f12606b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12605a;
        HistoryViewModel historyViewModel = this.f12606b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(historyViewModel);
            v<g<MeasurementResponse>> vVar = historyViewModel.f7075h;
            if (g10) {
                f.c(vVar);
                c cVar = historyViewModel.f7074g;
                this.f12605a = 1;
                obj = cVar.f11381a.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(historyViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception unused) {
                historyViewModel.f7075h.k(new g.a(historyViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        historyViewModel.f7075h.k(historyViewModel.f((b0) obj));
        return m.f8717a;
    }
}

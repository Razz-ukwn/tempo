package md;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel$uploadScreenShot$1", f = "MeasuringViewModel.kt", l = {324}, m = "invokeSuspend")
public final class z0 extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringViewModel f11461b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11462c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(MeasuringViewModel measuringViewModel, String str, d<? super z0> dVar) {
        super(2, dVar);
        this.f11461b = measuringViewModel;
        this.f11462c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new z0(this.f11461b, this.f11462c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f11460a;
        MeasuringViewModel measuringViewModel = this.f11461b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(measuringViewModel);
            v<g<BaseResponse>> vVar = measuringViewModel.f7024u;
            if (g10) {
                f.c(vVar);
                String str = this.f11462c;
                this.f11460a = 1;
                obj = measuringViewModel.f7011g.a((String) measuringViewModel.f7028y.getValue(), str, this);
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
                measuringViewModel.f7024u.k(new g.a(measuringViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        measuringViewModel.f7024u.k(measuringViewModel.f((b0) obj));
        return m.f8717a;
    }
}

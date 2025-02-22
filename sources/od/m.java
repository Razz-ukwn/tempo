package od;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.result.ResultViewModel;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.measure.result.ResultViewModel$submitSurvey$1", f = "ResultViewModel.kt", l = {32}, m = "invokeSuspend")
public final class m extends i implements p<g0, d<? super ff.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12307a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResultViewModel f12308b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinRequestModel f12309c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(ResultViewModel resultViewModel, ClaimCoinRequestModel claimCoinRequestModel, d<? super m> dVar) {
        super(2, dVar);
        this.f12308b = resultViewModel;
        this.f12309c = claimCoinRequestModel;
    }

    public final d<ff.m> create(Object obj, d<?> dVar) {
        return new m(this.f12308b, this.f12309c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((g0) obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f12307a;
        ResultViewModel resultViewModel = this.f12308b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(resultViewModel);
            v<g<StopRecordingResponseModel>> vVar = resultViewModel.f7065h;
            if (g10) {
                f.c(vVar);
                mc.b bVar = resultViewModel.f7064g;
                ClaimCoinRequestModel claimCoinRequestModel = this.f12309c;
                this.f12307a = 1;
                obj = bVar.f11380a.d(claimCoinRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(resultViewModel.f17942e.getString(R.string.no_internet)));
                return ff.m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                resultViewModel.f7065h.k(new g.a(resultViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        resultViewModel.f7065h.k(resultViewModel.f((b0) obj));
        return ff.m.f8717a;
    }
}

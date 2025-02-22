package kd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.outdoor.ClaimCoinSourceOutdoorViewModel$submitSurvey$1", f = "ClaimCoinSourceOutdoorViewModel.kt", l = {62}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10420a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceOutdoorViewModel f10421b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinRequestModel f10422c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ClaimCoinSourceOutdoorViewModel claimCoinSourceOutdoorViewModel, ClaimCoinRequestModel claimCoinRequestModel, d<? super h> dVar) {
        super(2, dVar);
        this.f10421b = claimCoinSourceOutdoorViewModel;
        this.f10422c = claimCoinRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f10421b, this.f10422c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f10420a;
        ClaimCoinSourceOutdoorViewModel claimCoinSourceOutdoorViewModel = this.f10421b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(claimCoinSourceOutdoorViewModel);
            v<g<StopRecordingResponseModel>> vVar = claimCoinSourceOutdoorViewModel.f6973k;
            if (g10) {
                f.c(vVar);
                mc.b bVar = claimCoinSourceOutdoorViewModel.f6969g;
                ClaimCoinRequestModel claimCoinRequestModel = this.f10422c;
                this.f10420a = 1;
                obj = bVar.f11380a.d(claimCoinRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(claimCoinSourceOutdoorViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                claimCoinSourceOutdoorViewModel.f6973k.k(new g.a(claimCoinSourceOutdoorViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        claimCoinSourceOutdoorViewModel.f6973k.k(claimCoinSourceOutdoorViewModel.f((b0) obj));
        return m.f8717a;
    }
}

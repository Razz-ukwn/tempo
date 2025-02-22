package jd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.measure.ClaimCoinRequestModel;
import com.quickkonnect.silencio.models.response.measure.StopRecordingResponseModel;
import com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.measure.claimcoin.source.indoor.ClaimCoinSourceIndoorViewModel$submitSurvey$1", f = "ClaimCoinSourceIndoorViewModel.kt", l = {62}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9985a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinSourceIndoorViewModel f9986b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ClaimCoinRequestModel f9987c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel, ClaimCoinRequestModel claimCoinRequestModel, d<? super h> dVar) {
        super(2, dVar);
        this.f9986b = claimCoinSourceIndoorViewModel;
        this.f9987c = claimCoinRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f9986b, this.f9987c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f9985a;
        ClaimCoinSourceIndoorViewModel claimCoinSourceIndoorViewModel = this.f9986b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(claimCoinSourceIndoorViewModel);
            v<g<StopRecordingResponseModel>> vVar = claimCoinSourceIndoorViewModel.f6953k;
            if (g10) {
                f.c(vVar);
                mc.b bVar = claimCoinSourceIndoorViewModel.f6949g;
                ClaimCoinRequestModel claimCoinRequestModel = this.f9987c;
                this.f9985a = 1;
                obj = bVar.f11380a.d(claimCoinRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(claimCoinSourceIndoorViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                claimCoinSourceIndoorViewModel.f6953k.k(new g.a(claimCoinSourceIndoorViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        claimCoinSourceIndoorViewModel.f6953k.k(claimCoinSourceIndoorViewModel.f((b0) obj));
        return m.f8717a;
    }
}

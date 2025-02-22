package ad;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$getCode$1", f = "RegisterEmailOtpVerficationViewModel.kt", l = {69}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerficationViewModel f295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailRequestModel f296c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(RegisterEmailOtpVerficationViewModel registerEmailOtpVerficationViewModel, EmailRequestModel emailRequestModel, d<? super b> dVar) {
        super(2, dVar);
        this.f295b = registerEmailOtpVerficationViewModel;
        this.f296c = emailRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f295b, this.f296c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f294a;
        RegisterEmailOtpVerficationViewModel registerEmailOtpVerficationViewModel = this.f295b;
        if (i8 == 0) {
            cb.b.J(obj);
            boolean g10 = zd.a.g(registerEmailOtpVerficationViewModel);
            v<g<BaseResponse>> vVar = registerEmailOtpVerficationViewModel.f6823k;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = registerEmailOtpVerficationViewModel.f6819g;
                EmailRequestModel emailRequestModel = this.f296c;
                this.f294a = 1;
                obj = aVar2.f11379a.r(emailRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(registerEmailOtpVerficationViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                cb.b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                registerEmailOtpVerficationViewModel.f6823k.k(new g.a(registerEmailOtpVerficationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        registerEmailOtpVerficationViewModel.f6823k.k(registerEmailOtpVerficationViewModel.f((b0) obj));
        return m.f8717a;
    }
}

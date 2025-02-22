package ad;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel$verifyCode$1", f = "RegisterEmailOtpVerficationViewModel.kt", l = {46}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerficationViewModel f298b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailRequestModel f299c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(RegisterEmailOtpVerficationViewModel registerEmailOtpVerficationViewModel, EmailRequestModel emailRequestModel, d<? super c> dVar) {
        super(2, dVar);
        this.f298b = registerEmailOtpVerficationViewModel;
        this.f299c = emailRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f298b, this.f299c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f297a;
        RegisterEmailOtpVerficationViewModel registerEmailOtpVerficationViewModel = this.f298b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(registerEmailOtpVerficationViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = registerEmailOtpVerficationViewModel.f6822j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = registerEmailOtpVerficationViewModel.f6819g;
                EmailRequestModel copy$default = EmailRequestModel.copy$default(this.f299c, (String) null, (String) null, (String) null, (String) registerEmailOtpVerficationViewModel.f6820h.getValue(), 7, (Object) null);
                this.f297a = 1;
                obj = aVar2.f11379a.h(copy$default, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(registerEmailOtpVerficationViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                registerEmailOtpVerficationViewModel.f6822j.k(new g.a(registerEmailOtpVerficationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        registerEmailOtpVerficationViewModel.f6822j.k(registerEmailOtpVerficationViewModel.f((b0) obj));
        return m.f8717a;
    }
}

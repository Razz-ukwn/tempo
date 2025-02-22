package zc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel$verifyCode$1", f = "RegisterOtpVerficationViewModel.kt", l = {45}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterOtpVerficationViewModel f17926b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VerifyNumberRequestModel f17927c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(RegisterOtpVerficationViewModel registerOtpVerficationViewModel, VerifyNumberRequestModel verifyNumberRequestModel, d<? super c> dVar) {
        super(2, dVar);
        this.f17926b = registerOtpVerficationViewModel;
        this.f17927c = verifyNumberRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f17926b, this.f17927c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17925a;
        RegisterOtpVerficationViewModel registerOtpVerficationViewModel = this.f17926b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(registerOtpVerficationViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = registerOtpVerficationViewModel.f6804j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = registerOtpVerficationViewModel.f6801g;
                VerifyNumberRequestModel copy$default = VerifyNumberRequestModel.copy$default(this.f17927c, (String) null, (String) null, (String) null, (String) registerOtpVerficationViewModel.f6802h.getValue(), (String) null, (String) null, 55, (Object) null);
                this.f17925a = 1;
                obj = aVar2.f11379a.b(copy$default, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(registerOtpVerficationViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                registerOtpVerficationViewModel.f6804j.k(new g.a(registerOtpVerficationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        registerOtpVerficationViewModel.f6804j.k(registerOtpVerficationViewModel.f((b0) obj));
        return m.f8717a;
    }
}

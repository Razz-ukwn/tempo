package zc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel$getCode$1", f = "RegisterOtpVerficationViewModel.kt", l = {68}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterOtpVerficationViewModel f17923b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VerifyNumberRequestModel f17924c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(RegisterOtpVerficationViewModel registerOtpVerficationViewModel, VerifyNumberRequestModel verifyNumberRequestModel, d<? super b> dVar) {
        super(2, dVar);
        this.f17923b = registerOtpVerficationViewModel;
        this.f17924c = verifyNumberRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f17923b, this.f17924c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17922a;
        RegisterOtpVerficationViewModel registerOtpVerficationViewModel = this.f17923b;
        if (i8 == 0) {
            cb.b.J(obj);
            boolean g10 = zd.a.g(registerOtpVerficationViewModel);
            v<g<BaseResponse>> vVar = registerOtpVerficationViewModel.f6805k;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = registerOtpVerficationViewModel.f6801g;
                VerifyNumberRequestModel verifyNumberRequestModel = this.f17924c;
                this.f17922a = 1;
                obj = aVar2.f11379a.v(verifyNumberRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(registerOtpVerficationViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                cb.b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                registerOtpVerficationViewModel.f6805k.k(new g.a(registerOtpVerficationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        registerOtpVerficationViewModel.f6805k.k(registerOtpVerficationViewModel.f((b0) obj));
        return m.f8717a;
    }
}

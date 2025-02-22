package wc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel$getCode$1", f = "ForgotPasswordEmailViewModel.kt", l = {42}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16699a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailViewModel f16700b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16701c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ForgotPasswordEmailViewModel forgotPasswordEmailViewModel, String str, d<? super l> dVar) {
        super(2, dVar);
        this.f16700b = forgotPasswordEmailViewModel;
        this.f16701c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f16700b, this.f16701c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f16699a;
        ForgotPasswordEmailViewModel forgotPasswordEmailViewModel = this.f16700b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(forgotPasswordEmailViewModel);
            v<g<BaseResponse>> vVar = forgotPasswordEmailViewModel.f6778j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = forgotPasswordEmailViewModel.f6775g;
                EmailRequestModel emailRequestModel = new EmailRequestModel((String) forgotPasswordEmailViewModel.f6776h.getValue(), this.f16701c, (String) null, (String) null, 12, (sf.e) null);
                this.f16699a = 1;
                obj = aVar2.f11379a.q(emailRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(forgotPasswordEmailViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                forgotPasswordEmailViewModel.f6778j.k(new g.a(forgotPasswordEmailViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        forgotPasswordEmailViewModel.f6778j.k(forgotPasswordEmailViewModel.f((b0) obj));
        return m.f8717a;
    }
}

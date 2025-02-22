package vc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel$getCode$1", f = "ForgotPasswordViewModel.kt", l = {40}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordViewModel f16414b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16415c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f16416d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ForgotPasswordViewModel forgotPasswordViewModel, String str, String str2, d<? super l> dVar) {
        super(2, dVar);
        this.f16414b = forgotPasswordViewModel;
        this.f16415c = str;
        this.f16416d = str2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f16414b, this.f16415c, this.f16416d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f16413a;
        ForgotPasswordViewModel forgotPasswordViewModel = this.f16414b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(forgotPasswordViewModel);
            v<g<BaseResponse>> vVar = forgotPasswordViewModel.f6762j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = forgotPasswordViewModel.f6759g;
                VerifyNumberRequestModel verifyNumberRequestModel = new VerifyNumberRequestModel(this.f16415c, (String) forgotPasswordViewModel.f6760h.getValue(), (String) null, (String) null, this.f16416d, (String) null, 44, (sf.e) null);
                this.f16413a = 1;
                obj = aVar2.f11379a.c(verifyNumberRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(forgotPasswordViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                forgotPasswordViewModel.f6762j.k(new g.a(forgotPasswordViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        forgotPasswordViewModel.f6762j.k(forgotPasswordViewModel.f((b0) obj));
        return m.f8717a;
    }
}

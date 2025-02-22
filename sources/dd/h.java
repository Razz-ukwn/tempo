package dd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.ResetPasswordRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordViewModel$resetPassowrd$1", f = "ResetPasswordViewModel.kt", l = {41}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordViewModel f7518b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordRequestModel f7519c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ResetPasswordViewModel resetPasswordViewModel, ResetPasswordRequestModel resetPasswordRequestModel, d<? super h> dVar) {
        super(2, dVar);
        this.f7518b = resetPasswordViewModel;
        this.f7519c = resetPasswordRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f7518b, this.f7519c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f7517a;
        ResetPasswordViewModel resetPasswordViewModel = this.f7518b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(resetPasswordViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = resetPasswordViewModel.f6880k;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = resetPasswordViewModel.f6876g;
                ResetPasswordRequestModel resetPasswordRequestModel = this.f7519c;
                this.f7517a = 1;
                obj = aVar2.f11379a.e(resetPasswordRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(resetPasswordViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                resetPasswordViewModel.f6880k.k(new g.a(resetPasswordViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        resetPasswordViewModel.f6880k.k(resetPasswordViewModel.f((b0) obj));
        return m.f8717a;
    }
}

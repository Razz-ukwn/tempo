package xc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.LoginWithGoogleRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.login.LoginViewModel$loginWithGoogle$1", f = "LoginViewModel.kt", l = {79}, m = "invokeSuspend")
public final class o extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f17056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LoginWithGoogleRequestModel f17057c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(LoginViewModel loginViewModel, LoginWithGoogleRequestModel loginWithGoogleRequestModel, d<? super o> dVar) {
        super(2, dVar);
        this.f17056b = loginViewModel;
        this.f17057c = loginWithGoogleRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new o(this.f17056b, this.f17057c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17055a;
        LoginViewModel loginViewModel = this.f17056b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(loginViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = loginViewModel.m;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = loginViewModel.f6791g;
                LoginWithGoogleRequestModel loginWithGoogleRequestModel = this.f17057c;
                this.f17055a = 1;
                obj = aVar2.f11379a.o(loginWithGoogleRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(loginViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                loginViewModel.m.k(new g.a(loginViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        loginViewModel.m.k(loginViewModel.f((b0) obj));
        return m.f8717a;
    }
}

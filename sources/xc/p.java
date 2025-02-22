package xc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.LoginWithPhoneRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.login.LoginViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import yg.b0;
import zd.g;
import zd.h;
import zf.n;

@e(c = "com.quickkonnect.silencio.ui.auth.login.LoginViewModel$loginWithPhone$1", f = "LoginViewModel.kt", l = {52}, m = "invokeSuspend")
public final class p extends i implements rf.p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f17059b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(LoginViewModel loginViewModel, d<? super p> dVar) {
        super(2, dVar);
        this.f17059b = loginViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f17059b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f17058a;
        LoginViewModel loginViewModel = this.f17059b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(loginViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = loginViewModel.f6796l;
            if (g10) {
                f.c(vVar);
                String a10 = h.a("FIRE_BASE_TOKEN");
                mc.a aVar2 = loginViewModel.f6791g;
                LoginWithPhoneRequestModel loginWithPhoneRequestModel = new LoginWithPhoneRequestModel(n.Z0((String) loginViewModel.f6793i.getValue()).toString(), (String) loginViewModel.f6794j.getValue(), a10, (String) null, 8, (sf.e) null);
                this.f17058a = 1;
                obj = aVar2.f11379a.d(loginWithPhoneRequestModel, this);
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
                loginViewModel.f6796l.k(new g.a(loginViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        loginViewModel.f6796l.k(loginViewModel.f((b0) obj));
        return m.f8717a;
    }
}

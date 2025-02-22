package rc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.y0;
import lf.e;
import rf.p;
import sf.j;
import yg.b0;
import zd.g;
import zd.h;

@e(c = "com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordViewModel$signUpWithPhone$1", f = "ChoosePasswordViewModel.kt", l = {48, 56}, m = "invokeSuspend")
public final class i extends lf.i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChoosePasswordViewModel f14205b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RegisterUserRequestModel f14206c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ChoosePasswordViewModel choosePasswordViewModel, RegisterUserRequestModel registerUserRequestModel, d<? super i> dVar) {
        super(2, dVar);
        this.f14205b = choosePasswordViewModel;
        this.f14206c = registerUserRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f14205b, this.f14206c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Object obj2;
        Object obj3;
        a aVar = a.f10464a;
        int i8 = this.f14204a;
        ChoosePasswordViewModel choosePasswordViewModel = this.f14205b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(choosePasswordViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = choosePasswordViewModel.f6701l;
            if (g10) {
                f.c(vVar);
                String a10 = h.a("FIRE_BASE_TOKEN");
                boolean a11 = j.a(this.f14206c.getRegistrationType(), "phone");
                y0 y0Var = choosePasswordViewModel.f6699j;
                y0 y0Var2 = choosePasswordViewModel.f6698i;
                mc.a aVar2 = choosePasswordViewModel.f6696g;
                if (a11) {
                    RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(this.f14206c, (String) null, (String) null, (String) null, (String) null, (String) null, (String) y0Var2.getValue(), (String) y0Var.getValue(), (String) null, (String) null, (String) null, (String) null, a10, (String) null, 6047, (Object) null);
                    this.f14204a = 1;
                    obj3 = aVar2.f11379a.f(copy$default, this);
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    RegisterUserRequestModel copy$default2 = RegisterUserRequestModel.copy$default(this.f14206c, (String) null, (String) null, (String) null, (String) null, (String) null, (String) y0Var2.getValue(), (String) y0Var.getValue(), (String) null, (String) null, (String) null, (String) null, a10, (String) null, 6047, (Object) null);
                    this.f14204a = 2;
                    obj2 = aVar2.f11379a.f(copy$default2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    b0Var = (b0) obj2;
                    choosePasswordViewModel.f6701l.k(choosePasswordViewModel.f(b0Var));
                    return m.f8717a;
                }
            } else {
                vVar.k(new g.a(choosePasswordViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            b.J(obj);
            obj3 = obj;
        } else if (i8 == 2) {
            try {
                b.J(obj);
                obj2 = obj;
                b0Var = (b0) obj2;
                choosePasswordViewModel.f6701l.k(choosePasswordViewModel.f(b0Var));
            } catch (Exception e10) {
                e10.printStackTrace();
                choosePasswordViewModel.f6701l.k(new g.a(choosePasswordViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0Var = (b0) obj3;
        choosePasswordViewModel.f6701l.k(choosePasswordViewModel.f(b0Var));
        return m.f8717a;
    }
}

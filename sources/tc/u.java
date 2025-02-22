package tc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel$registerWithGoogle$1", f = "CreateAccountViewModel.kt", l = {119}, m = "invokeSuspend")
public final class u extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateAccountViewModel f15603b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RegisterWithGoogleRequestModel f15604c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(CreateAccountViewModel createAccountViewModel, RegisterWithGoogleRequestModel registerWithGoogleRequestModel, d<? super u> dVar) {
        super(2, dVar);
        this.f15603b = createAccountViewModel;
        this.f15604c = registerWithGoogleRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u(this.f15603b, this.f15604c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f15602a;
        CreateAccountViewModel createAccountViewModel = this.f15603b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(createAccountViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = createAccountViewModel.f6734p;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = createAccountViewModel.f6726g;
                RegisterWithGoogleRequestModel registerWithGoogleRequestModel = this.f15604c;
                this.f15602a = 1;
                obj = aVar2.f11379a.s(registerWithGoogleRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(createAccountViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                createAccountViewModel.f6734p.k(new g.a(createAccountViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        createAccountViewModel.f6734p.k(createAccountViewModel.f((b0) obj));
        return m.f8717a;
    }
}

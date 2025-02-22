package ed;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyEmailRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import ff.m;
import jf.d;
import kf.a;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel$verifyCode$1", f = "VerificationViewModel.kt", l = {49, 53}, m = "invokeSuspend")
public final class q extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7973a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerificationViewModel f7974b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7975c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ VerifyNumberRequestModel f7976d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(VerificationViewModel verificationViewModel, String str, VerifyNumberRequestModel verifyNumberRequestModel, d<? super q> dVar) {
        super(2, dVar);
        this.f7974b = verificationViewModel;
        this.f7975c = str;
        this.f7976d = verifyNumberRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new q(this.f7974b, this.f7975c, this.f7976d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        Object obj2;
        Object obj3;
        a aVar = a.f10464a;
        int i8 = this.f7973a;
        VerificationViewModel verificationViewModel = this.f7974b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(verificationViewModel);
            v<g<LoginWithPhoneResponseModel>> vVar = verificationViewModel.f6894j;
            if (g10) {
                f.c(vVar);
                boolean a10 = j.a(this.f7975c, "phone");
                y0 y0Var = verificationViewModel.f6892h;
                mc.a aVar2 = verificationViewModel.f6891g;
                if (a10) {
                    VerifyNumberRequestModel copy$default = VerifyNumberRequestModel.copy$default(this.f7976d, (String) null, (String) null, (String) null, (String) y0Var.getValue(), (String) null, (String) null, 55, (Object) null);
                    this.f7973a = 1;
                    obj3 = aVar2.f11379a.l(copy$default, this);
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    VerifyEmailRequestModel verifyEmailRequestModel = new VerifyEmailRequestModel(this.f7976d.getEmail(), (String) y0Var.getValue());
                    this.f7973a = 2;
                    obj2 = aVar2.f11379a.u(verifyEmailRequestModel, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    b0Var = (b0) obj2;
                    verificationViewModel.f6894j.k(verificationViewModel.f(b0Var));
                    return m.f8717a;
                }
            } else {
                vVar.k(new g.a(verificationViewModel.f17942e.getString(R.string.no_internet)));
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
                verificationViewModel.f6894j.k(verificationViewModel.f(b0Var));
            } catch (Exception e10) {
                e10.printStackTrace();
                verificationViewModel.f6894j.k(new g.a(verificationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0Var = (b0) obj3;
        verificationViewModel.f6894j.k(verificationViewModel.f(b0Var));
        return m.f8717a;
    }
}

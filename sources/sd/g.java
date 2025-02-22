package sd;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.ChangePasswordRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel$changePassword$1", f = "ChangePasswordViewModel.kt", l = {48}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordViewModel f14931b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordRequestModel f14932c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ChangePasswordViewModel changePasswordViewModel, ChangePasswordRequestModel changePasswordRequestModel, d<? super g> dVar) {
        super(2, dVar);
        this.f14931b = changePasswordViewModel;
        this.f14932c = changePasswordRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f14931b, this.f14932c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f14930a;
        ChangePasswordViewModel changePasswordViewModel = this.f14931b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(changePasswordViewModel);
            v<zd.g<LoginWithPhoneResponseModel>> vVar = changePasswordViewModel.m;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = changePasswordViewModel.f7102g;
                ChangePasswordRequestModel changePasswordRequestModel = this.f14932c;
                this.f14930a = 1;
                obj = aVar2.f11379a.n(changePasswordRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(changePasswordViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                changePasswordViewModel.m.k(new g.a(changePasswordViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        changePasswordViewModel.m.k(changePasswordViewModel.f((b0) obj));
        return m.f8717a;
    }
}

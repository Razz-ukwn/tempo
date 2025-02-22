package cd;

import android.view.View;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class o extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3988a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(RegisterBottomSheet registerBottomSheet) {
        super(1);
        this.f3988a = registerBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        RegisterBottomSheet registerBottomSheet = this.f3988a;
        b3.m c3 = ag.m.c(registerBottomSheet);
        int i8 = RegisterBottomSheet.X0;
        RegisterUserRequestModel registerUserRequestModel = registerBottomSheet.u0().f3989a;
        j.f(registerUserRequestModel, "registerUser");
        c3.n(new r(registerUserRequestModel));
        return m.f8717a;
    }
}

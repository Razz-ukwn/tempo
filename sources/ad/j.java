package ad;

import androidx.appcompat.app.b;
import bh.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import ff.m;
import rf.l;
import sf.k;
import zd.d;
import zd.g;

public final class j extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerificationBottomSheet f309a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet) {
        super(1);
        this.f309a = registerEmailOtpVerificationBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = this.f309a;
        if (z10) {
            b bVar = registerEmailOtpVerificationBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = registerEmailOtpVerificationBottomSheet.e0().getString(R.string.alert_title);
                    sf.j.e(string, "getString(R.string.alert_title)");
                    d.d(registerEmailOtpVerificationBottomSheet, string, str, "OK", (String) null, false, h.f307a, i.f308a);
                }
            } else {
                sf.j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = registerEmailOtpVerificationBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    sf.j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = registerEmailOtpVerificationBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    a.f3654a.b("====> success", new Object[0]);
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        b3.m c3 = ag.m.c(registerEmailOtpVerificationBottomSheet);
                        RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(((o) registerEmailOtpVerificationBottomSheet.S0.getValue()).f315a, data.getId(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "email", (String) null, (String) null, (String) null, 7678, (Object) null);
                        sf.j.f(copy$default, "registerUser");
                        c3.n(new p(copy$default));
                    }
                } else {
                    sf.j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

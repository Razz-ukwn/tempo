package zc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterOtpVerificationBottomSheet f17933a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet) {
        super(1);
        this.f17933a = registerOtpVerificationBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = this.f17933a;
        if (z10) {
            b bVar = registerOtpVerificationBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = registerOtpVerificationBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(registerOtpVerificationBottomSheet, string, str, "OK", (String) null, false, e.f17931a, f.f17932a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = registerOtpVerificationBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = registerOtpVerificationBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        b3.m c3 = ag.m.c(registerOtpVerificationBottomSheet);
                        RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(registerOtpVerificationBottomSheet.u0().f17937a, data.getId(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "phone", (String) null, (String) null, (String) null, 7678, (Object) null);
                        j.f(copy$default, "registerUser");
                        c3.n(new l(copy$default));
                    }
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

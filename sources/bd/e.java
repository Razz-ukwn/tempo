package bd;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.phonenumber.PhoneNumberBottomSheet;
import ff.m;
import nc.j0;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;
import zf.n;

public final class e extends k implements l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PhoneNumberBottomSheet f3633a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(PhoneNumberBottomSheet phoneNumberBottomSheet) {
        super(1);
        this.f3633a = phoneNumberBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        PhoneNumberBottomSheet phoneNumberBottomSheet = this.f3633a;
        if (z10) {
            b bVar = phoneNumberBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = phoneNumberBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(phoneNumberBottomSheet, string, str, "OK", (String) null, false, c.f3631a, d.f3632a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = phoneNumberBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = phoneNumberBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    b3.m c3 = ag.m.c(phoneNumberBottomSheet);
                    RegisterUserRequestModel registerUserRequestModel = ((f) phoneNumberBottomSheet.S0.getValue()).f3634a;
                    j0 j0Var = phoneNumberBottomSheet.Q0;
                    j.c(j0Var);
                    RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(registerUserRequestModel, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, j0Var.V.getSelectedCountryCodeWithPlus(), n.Z0((String) phoneNumberBottomSheet.u0().f6846h.getValue()).toString(), (String) null, (String) null, (String) null, (String) null, 7807, (Object) null);
                    j.f(copy$default, "registerUser");
                    c3.n(new g(copy$default));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

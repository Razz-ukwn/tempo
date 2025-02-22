package xc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import ff.m;
import jf.f;
import q6.a;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class l extends k implements rf.l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoginBottomSheet f17052a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(LoginBottomSheet loginBottomSheet) {
        super(1);
        this.f17052a = loginBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        LoginBottomSheet loginBottomSheet = this.f17052a;
        if (z10) {
            a aVar = loginBottomSheet.S0;
            if (aVar != null) {
                aVar.e();
                b bVar = loginBottomSheet.V0;
                if (bVar != null) {
                    bVar.dismiss();
                    String str = gVar.f17949b;
                    if (str != null) {
                        String string = loginBottomSheet.e0().getString(R.string.alert_title);
                        j.e(string, "getString(R.string.alert_title)");
                        d.d(loginBottomSheet, string, str, "OK", (String) null, false, i.f17046a, j.f17047a);
                    }
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else {
                j.l("mGoogleSignInClient");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = loginBottomSheet.V0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = loginBottomSheet.V0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        cb.b.D(cb.d.I(loginBottomSheet), (f.b) null, 0, new k(loginBottomSheet, data, (jf.d<? super k>) null), 3);
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

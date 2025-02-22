package cd;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import jf.f;
import q6.a;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3976a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(RegisterBottomSheet registerBottomSheet) {
        super(1);
        this.f3976a = registerBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        RegisterBottomSheet registerBottomSheet = this.f3976a;
        if (z10) {
            a aVar = registerBottomSheet.T0;
            if (aVar != null) {
                aVar.e();
                b bVar = registerBottomSheet.V0;
                if (bVar != null) {
                    bVar.dismiss();
                    String str = gVar.f17949b;
                    if (str != null) {
                        String string = registerBottomSheet.e0().getString(R.string.alert_title);
                        j.e(string, "getString(R.string.alert_title)");
                        d.d(registerBottomSheet, string, str, "OK", (String) null, false, d.f3970a, e.f3971a);
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
                b bVar2 = registerBottomSheet.V0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = registerBottomSheet.V0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        cb.b.D(cb.d.I(registerBottomSheet), (f.b) null, 0, new f(registerBottomSheet, data, (jf.d<? super f>) null), 3);
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

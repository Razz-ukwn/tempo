package sd;

import android.widget.Toast;
import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet;
import ff.m;
import jf.f;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class e extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordBottomSheet f14929a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ChangePasswordBottomSheet changePasswordBottomSheet) {
        super(1);
        this.f14929a = changePasswordBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        String message;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ChangePasswordBottomSheet changePasswordBottomSheet = this.f14929a;
        if (z10) {
            b bVar = changePasswordBottomSheet.S0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = changePasswordBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(changePasswordBottomSheet, string, str, "OK", (String) null, false, b.f14923a, c.f14924a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = changePasswordBottomSheet.S0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = changePasswordBottomSheet.S0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (message = loginWithPhoneResponseModel.getMessage()) == null)) {
                        Toast.makeText(changePasswordBottomSheet.e0(), message, 1).show();
                    }
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel2 = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel2 == null || (data = loginWithPhoneResponseModel2.getData()) == null)) {
                        cb.b.D(cb.d.I(changePasswordBottomSheet), (f.b) null, 0, new d(changePasswordBottomSheet, data, (jf.d<? super d>) null), 3);
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

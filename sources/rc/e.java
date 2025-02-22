package rc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet;
import ff.m;
import jf.f;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class e extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChoosePasswordBottomSheet f14200a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ChoosePasswordBottomSheet choosePasswordBottomSheet) {
        super(1);
        this.f14200a = choosePasswordBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ChoosePasswordBottomSheet choosePasswordBottomSheet = this.f14200a;
        if (z10) {
            b bVar = choosePasswordBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = choosePasswordBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(choosePasswordBottomSheet, string, str, "OK", (String) null, false, b.f14194a, c.f14195a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = choosePasswordBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = choosePasswordBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        cb.b.D(cb.d.I(choosePasswordBottomSheet), (f.b) null, 0, new d(choosePasswordBottomSheet, data, (jf.d<? super d>) null), 3);
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

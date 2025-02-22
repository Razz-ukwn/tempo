package ed;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class h extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VerificationBottomSheet f7959a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(VerificationBottomSheet verificationBottomSheet) {
        super(1);
        this.f7959a = verificationBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        VerificationBottomSheet verificationBottomSheet = this.f7959a;
        if (z10) {
            b bVar = verificationBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = verificationBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(verificationBottomSheet, string, str, "OK", (String) null, false, f.f7957a, g.f7958a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = verificationBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = verificationBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        b3.m c3 = ag.m.c(verificationBottomSheet);
                        String id2 = data.getId();
                        if (id2 == null) {
                            id2 = "";
                        }
                        c3.n(new n(id2));
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

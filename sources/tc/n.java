package tc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import ff.m;
import jf.f;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class n extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15590a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(CreateAccountBottomSheet createAccountBottomSheet) {
        super(1);
        this.f15590a = createAccountBottomSheet;
    }

    public final Object invoke(Object obj) {
        UserModel data;
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        CreateAccountBottomSheet createAccountBottomSheet = this.f15590a;
        if (z10) {
            b bVar = createAccountBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = createAccountBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(createAccountBottomSheet, string, str, "OK", (String) null, false, k.f15584a, l.f15585a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = createAccountBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = createAccountBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    LoginWithPhoneResponseModel loginWithPhoneResponseModel = (LoginWithPhoneResponseModel) gVar.f17948a;
                    if (!(loginWithPhoneResponseModel == null || (data = loginWithPhoneResponseModel.getData()) == null)) {
                        cb.b.D(cb.d.I(createAccountBottomSheet), (f.b) null, 0, new m(createAccountBottomSheet, data, (jf.d<? super m>) null), 3);
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

package tc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel;
import com.quickkonnect.silencio.models.response.auth.NickNameResponse;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountViewModel;
import ff.m;
import jf.f;
import rf.l;
import sf.e;
import sf.k;
import zd.d;
import zd.g;

public final class j extends k implements l<g<NickNameResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15583a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(CreateAccountBottomSheet createAccountBottomSheet) {
        super(1);
        this.f15583a = createAccountBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        CreateAccountBottomSheet createAccountBottomSheet = this.f15583a;
        if (z10) {
            b bVar = createAccountBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = createAccountBottomSheet.e0().getString(R.string.alert_title);
                    sf.j.e(string, "getString(R.string.alert_title)");
                    d.d(createAccountBottomSheet, string, str, "OK", (String) null, false, h.f15581a, i.f15582a);
                }
            } else {
                sf.j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = createAccountBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    sf.j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = createAccountBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    if (createAccountBottomSheet.u0().f15593c) {
                        CreateAccountViewModel v02 = createAccountBottomSheet.v0();
                        RegisterWithGoogleRequestModel registerWithGoogleRequestModel = new RegisterWithGoogleRequestModel((String) createAccountBottomSheet.v0().f6728i.getValue(), (String) createAccountBottomSheet.v0().f6729j.getValue(), "google", createAccountBottomSheet.u0().f15592b, (String) createAccountBottomSheet.v0().f6730k.getValue(), createAccountBottomSheet.u0().f15591a.getReferreId(), createAccountBottomSheet.u0().f15591a.getDeviceToken(), (String) null, 128, (e) null);
                        v02.getClass();
                        cb.b.D(gc.b.o(v02), (f.b) null, 0, new u(v02, registerWithGoogleRequestModel, (jf.d<? super u>) null), 3);
                    } else {
                        b3.m c3 = ag.m.c(createAccountBottomSheet);
                        RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(createAccountBottomSheet.u0().f15591a, (String) null, (String) createAccountBottomSheet.v0().f6728i.getValue(), (String) createAccountBottomSheet.v0().f6729j.getValue(), (String) createAccountBottomSheet.v0().f6730k.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8177, (Object) null);
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

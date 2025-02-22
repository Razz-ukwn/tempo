package vc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import ff.m;
import nc.x;
import rf.l;
import sf.e;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordBottomSheet f16406a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ForgotPasswordBottomSheet forgotPasswordBottomSheet) {
        super(1);
        this.f16406a = forgotPasswordBottomSheet;
    }

    public final Object invoke(Object obj) {
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        ForgotPasswordBottomSheet forgotPasswordBottomSheet = this.f16406a;
        if (z10) {
            b bVar = forgotPasswordBottomSheet.T0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = forgotPasswordBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(forgotPasswordBottomSheet, string, str, "OK", (String) null, false, e.f16404a, f.f16405a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = forgotPasswordBottomSheet.T0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = forgotPasswordBottomSheet.T0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    b3.m c3 = ag.m.c(forgotPasswordBottomSheet);
                    x xVar = forgotPasswordBottomSheet.Q0;
                    j.c(xVar);
                    c3.n(new j(new VerifyNumberRequestModel(xVar.U.getSelectedCountryCodeWithPlus(), (String) forgotPasswordBottomSheet.v0().f6760h.getValue(), (String) null, (String) null, (String) null, (String) null, 60, (e) null)));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

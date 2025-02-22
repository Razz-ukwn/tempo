package wc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import ff.m;
import rf.l;
import sf.e;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailBottomSheet f16692a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet) {
        super(1);
        this.f16692a = forgotPasswordEmailBottomSheet;
    }

    public final Object invoke(Object obj) {
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = this.f16692a;
        if (z10) {
            b bVar = forgotPasswordEmailBottomSheet.T0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = forgotPasswordEmailBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(forgotPasswordEmailBottomSheet, string, str, "OK", (String) null, false, e.f16690a, f.f16691a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = forgotPasswordEmailBottomSheet.T0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = forgotPasswordEmailBottomSheet.T0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    ag.m.c(forgotPasswordEmailBottomSheet).n(new j(new VerifyNumberRequestModel((String) null, (String) null, (String) forgotPasswordEmailBottomSheet.v0().f6776h.getValue(), (String) null, (String) null, (String) null, 59, (e) null)));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

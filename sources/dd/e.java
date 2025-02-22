package dd;

import androidx.appcompat.app.b;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.auth.LoginWithPhoneResponseModel;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class e extends k implements l<g<LoginWithPhoneResponseModel>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordBottomSheet f7515a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ResetPasswordBottomSheet resetPasswordBottomSheet) {
        super(1);
        this.f7515a = resetPasswordBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        ResetPasswordBottomSheet resetPasswordBottomSheet = this.f7515a;
        if (z10) {
            b bVar = resetPasswordBottomSheet.T0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = resetPasswordBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(resetPasswordBottomSheet, string, str, "OK", (String) null, false, c.f7513a, d.f7514a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = resetPasswordBottomSheet.T0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = resetPasswordBottomSheet.T0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    ag.m.c(resetPasswordBottomSheet).n(new a(R.id.action_resetPasswordBottomSheet_to_loginBottomSheet));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

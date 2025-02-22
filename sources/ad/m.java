package ad;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class m extends k implements l<g<BaseResponse>, ff.m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerificationBottomSheet f312a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet) {
        super(1);
        this.f312a = registerEmailOtpVerificationBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = this.f312a;
        if (z10) {
            b bVar = registerEmailOtpVerificationBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = registerEmailOtpVerificationBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(registerEmailOtpVerificationBottomSheet, string, str, "OK", (String) null, false, k.f310a, l.f311a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = registerEmailOtpVerificationBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = registerEmailOtpVerificationBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return ff.m.f8717a;
    }
}

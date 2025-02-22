package zc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import ff.m;
import rf.l;
import sf.k;
import zd.d;
import zd.g;

public final class j extends k implements l<g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterOtpVerificationBottomSheet f17936a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet) {
        super(1);
        this.f17936a = registerOtpVerificationBottomSheet;
    }

    public final Object invoke(Object obj) {
        g gVar = (g) obj;
        boolean z10 = gVar instanceof g.a;
        RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = this.f17936a;
        if (z10) {
            b bVar = registerOtpVerificationBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = registerOtpVerificationBottomSheet.e0().getString(R.string.alert_title);
                    sf.j.e(string, "getString(R.string.alert_title)");
                    d.d(registerOtpVerificationBottomSheet, string, str, "OK", (String) null, false, h.f17934a, i.f17935a);
                }
            } else {
                sf.j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = registerOtpVerificationBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    sf.j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = registerOtpVerificationBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                } else {
                    sf.j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

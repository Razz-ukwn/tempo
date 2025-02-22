package sc;

import androidx.appcompat.app.b;
import bh.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.auth.VerifyInviteCodeResponse;
import com.quickkonnect.silencio.models.response.auth.VerifyInviteCodeResponseModel;
import com.quickkonnect.silencio.ui.auth.code.CodeBottomSheet;
import ff.m;
import rf.l;
import sf.e;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class f extends k implements l<g<VerifyInviteCodeResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CodeBottomSheet f14913a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(CodeBottomSheet codeBottomSheet) {
        super(1);
        this.f14913a = codeBottomSheet;
    }

    public final Object invoke(Object obj) {
        VerifyInviteCodeResponseModel data;
        String id2;
        g gVar = (g) obj;
        if (!(gVar instanceof g.b)) {
            boolean z10 = gVar instanceof g.a;
            CodeBottomSheet codeBottomSheet = this.f14913a;
            if (z10) {
                b bVar = codeBottomSheet.T0;
                if (bVar != null) {
                    bVar.dismiss();
                    String str = gVar.f17949b;
                    if (str != null) {
                        String string = codeBottomSheet.e0().getString(R.string.alert_title);
                        j.e(string, "getString(R.string.alert_title)");
                        d.d(codeBottomSheet, string, str, "OK", (String) null, false, d.f14911a, e.f14912a);
                    }
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.c) {
                b bVar2 = codeBottomSheet.T0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = codeBottomSheet.T0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    a.f3654a.b(String.valueOf(gVar.f17948a), new Object[0]);
                    VerifyInviteCodeResponse verifyInviteCodeResponse = (VerifyInviteCodeResponse) gVar.f17948a;
                    if (!(verifyInviteCodeResponse == null || (data = verifyInviteCodeResponse.getData()) == null || (id2 = data.getId()) == null)) {
                        ag.m.c(codeBottomSheet).n(new g(new RegisterUserRequestModel((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, id2, (String) null, (String) null, 7167, (e) null)));
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

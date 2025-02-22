package uc;

import androidx.appcompat.app.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.RegisterUserRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;
import zd.d;
import zd.g;

public final class g extends k implements l<zd.g<BaseResponse>, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EmailBottomSheet f16013a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(EmailBottomSheet emailBottomSheet) {
        super(1);
        this.f16013a = emailBottomSheet;
    }

    public final Object invoke(Object obj) {
        zd.g gVar = (zd.g) obj;
        boolean z10 = gVar instanceof g.a;
        EmailBottomSheet emailBottomSheet = this.f16013a;
        if (z10) {
            b bVar = emailBottomSheet.U0;
            if (bVar != null) {
                bVar.dismiss();
                String str = gVar.f17949b;
                if (str != null) {
                    String string = emailBottomSheet.e0().getString(R.string.alert_title);
                    j.e(string, "getString(R.string.alert_title)");
                    d.d(emailBottomSheet, string, str, "OK", (String) null, false, e.f16011a, f.f16012a);
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (!(gVar instanceof g.b)) {
            if (gVar instanceof g.c) {
                b bVar2 = emailBottomSheet.U0;
                if (bVar2 != null) {
                    bVar2.show();
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            } else if (gVar instanceof g.d) {
                b bVar3 = emailBottomSheet.U0;
                if (bVar3 != null) {
                    bVar3.dismiss();
                    b3.m c3 = ag.m.c(emailBottomSheet);
                    RegisterUserRequestModel copy$default = RegisterUserRequestModel.copy$default(((i) emailBottomSheet.S0.getValue()).f16016a, (String) null, (String) null, (String) null, (String) null, (String) emailBottomSheet.v0().f6744h.getValue(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8175, (Object) null);
                    j.f(copy$default, "registerUser");
                    c3.n(new j(copy$default));
                } else {
                    j.l("loadingAlert");
                    throw null;
                }
            }
        }
        return m.f8717a;
    }
}

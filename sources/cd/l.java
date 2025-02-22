package cd;

import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import ff.m;
import rf.a;
import sf.j;
import sf.k;

public final class l extends k implements a<m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(RegisterBottomSheet registerBottomSheet) {
        super(0);
        this.f3983a = registerBottomSheet;
    }

    public final Object d() {
        RegisterBottomSheet registerBottomSheet = this.f3983a;
        q6.a aVar = registerBottomSheet.T0;
        if (aVar != null) {
            aVar.e();
            registerBottomSheet.v0().f6867l.setValue(Boolean.FALSE);
            return m.f8717a;
        }
        j.l("mGoogleSignInClient");
        throw null;
    }
}

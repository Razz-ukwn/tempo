package cd;

import com.quickkonnect.silencio.ui.auth.register.RegisterBottomSheet;
import rf.a;
import sf.j;
import sf.k;

public final class m extends k implements a<ff.m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterBottomSheet f3984a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(RegisterBottomSheet registerBottomSheet) {
        super(0);
        this.f3984a = registerBottomSheet;
    }

    public final Object d() {
        RegisterBottomSheet registerBottomSheet = this.f3984a;
        q6.a aVar = registerBottomSheet.T0;
        if (aVar != null) {
            aVar.e();
            registerBottomSheet.v0().f6867l.setValue(Boolean.FALSE);
            return ff.m.f8717a;
        }
        j.l("mGoogleSignInClient");
        throw null;
    }
}

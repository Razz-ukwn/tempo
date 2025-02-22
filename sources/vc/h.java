package vc;

import android.view.View;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class h extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordBottomSheet f16407a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ForgotPasswordBottomSheet forgotPasswordBottomSheet) {
        super(1);
        this.f16407a = forgotPasswordBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        ag.m.c(this.f16407a).n(new a(R.id.action_forgotPasswordBottomSheet_to_forgotPasswordEmailBottomSheet));
        return m.f8717a;
    }
}

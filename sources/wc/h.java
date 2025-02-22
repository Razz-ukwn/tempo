package wc;

import android.view.View;
import b3.a;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class h extends k implements l<View, m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailBottomSheet f16693a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet) {
        super(1);
        this.f16693a = forgotPasswordEmailBottomSheet;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        ag.m.c(this.f16693a).n(new a(R.id.action_forgotPasswordEmailBottomSheet_to_forgotPasswordBottomSheet));
        return m.f8717a;
    }
}

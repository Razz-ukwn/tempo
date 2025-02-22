package sd;

import cb.b;
import ff.m;
import jf.d;
import lf.e;
import rf.q;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel$isValid$2", f = "ChangePasswordViewModel.kt", l = {}, m = "invokeSuspend")
public final class i extends lf.i implements q<Boolean, String, d<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f14935a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f14936b;

    public i(d<? super i> dVar) {
        super(3, dVar);
    }

    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i iVar = new i((d) obj3);
        iVar.f14935a = booleanValue;
        iVar.f14936b = (String) obj2;
        return iVar.invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b.J(obj);
        boolean z10 = this.f14935a;
        String str = this.f14936b;
        boolean z11 = false;
        if (z10) {
            if (str.length() > 0) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}

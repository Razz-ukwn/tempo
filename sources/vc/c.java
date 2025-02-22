package vc;

import ag.g0;
import android.app.Application;
import cb.b;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import ff.h;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet$initializeRecaptchaClient$1", f = "ForgotPasswordBottomSheet.kt", l = {153}, m = "invokeSuspend")
public final class c extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordBottomSheet f16400b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ForgotPasswordBottomSheet forgotPasswordBottomSheet, d<? super c> dVar) {
        super(2, dVar);
        this.f16400b = forgotPasswordBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f16400b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f16399a;
        ForgotPasswordBottomSheet forgotPasswordBottomSheet = this.f16400b;
        if (i8 == 0) {
            b.J(obj);
            Recaptcha recaptcha = Recaptcha.INSTANCE;
            Application application = forgotPasswordBottomSheet.d0().getApplication();
            j.e(application, "requireActivity().application");
            this.f16399a = 1;
            obj2 = Recaptcha.m14getClientBWLJW6A$default(recaptcha, application, "6LcxF9QmAAAAADUgDsxq6WUGVZwj-yPMmE7nK96A", 0, this, 4, (Object) null);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
            obj2 = ((h) obj).f8708a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!(obj2 instanceof h.a)) {
            forgotPasswordBottomSheet.S0 = (RecaptchaClient) obj2;
        }
        if (h.a(obj2) != null) {
            ForgotPasswordBottomSheet.u0(forgotPasswordBottomSheet);
        }
        return m.f8717a;
    }
}

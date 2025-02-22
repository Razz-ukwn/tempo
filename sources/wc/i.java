package wc;

import ag.g0;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel;
import ff.h;
import ff.m;
import jf.d;
import jf.f;
import kf.a;
import lf.e;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet$setOnClicks$3$1", f = "ForgotPasswordEmailBottomSheet.kt", l = {79}, m = "invokeSuspend")
public final class i extends lf.i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16694a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailBottomSheet f16695b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet, d<? super i> dVar) {
        super(2, dVar);
        this.f16695b = forgotPasswordEmailBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f16695b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f16694a;
        ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = this.f16695b;
        if (i8 == 0) {
            b.J(obj);
            androidx.appcompat.app.b bVar = forgotPasswordEmailBottomSheet.T0;
            if (bVar != null) {
                bVar.show();
                RecaptchaClient recaptchaClient = forgotPasswordEmailBottomSheet.S0;
                if (recaptchaClient != null) {
                    RecaptchaAction custom = RecaptchaAction.Companion.custom("ForgotPassword");
                    this.f16694a = 1;
                    obj2 = recaptchaClient.m17executegIAlus(custom, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    j.l("recaptchaClient");
                    throw null;
                }
            } else {
                j.l("loadingAlert");
                throw null;
            }
        } else if (i8 == 1) {
            b.J(obj);
            obj2 = ((h) obj).f8708a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!(obj2 instanceof h.a)) {
            String str = (String) obj2;
            int i10 = ForgotPasswordEmailBottomSheet.V0;
            ForgotPasswordEmailViewModel v02 = forgotPasswordEmailBottomSheet.v0();
            v02.getClass();
            j.f(str, "token");
            b.D(gc.b.o(v02), (f.b) null, 0, new l(v02, str, (d<? super l>) null), 3);
        }
        Throwable a10 = h.a(obj2);
        if (a10 != null) {
            androidx.appcompat.app.b bVar2 = forgotPasswordEmailBottomSheet.T0;
            if (bVar2 != null) {
                bVar2.dismiss();
                bh.a.f3654a.c(a10);
                ForgotPasswordEmailBottomSheet.u0(forgotPasswordEmailBottomSheet);
            } else {
                j.l("loadingAlert");
                throw null;
            }
        }
        return m.f8717a;
    }
}

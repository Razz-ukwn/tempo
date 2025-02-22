package ad;

import ag.g0;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import ff.h;
import ff.m;
import jf.d;
import jf.f;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet$setOnClicks$3$1", f = "RegisterEmailOtpVerificationBottomSheet.kt", l = {122}, m = "invokeSuspend")
public final class n extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerificationBottomSheet f314b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet, d<? super n> dVar) {
        super(2, dVar);
        this.f314b = registerEmailOtpVerificationBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new n(this.f314b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f313a;
        RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = this.f314b;
        if (i8 == 0) {
            b.J(obj);
            androidx.appcompat.app.b bVar = registerEmailOtpVerificationBottomSheet.U0;
            if (bVar != null) {
                bVar.show();
                RecaptchaClient recaptchaClient = registerEmailOtpVerificationBottomSheet.V0;
                if (recaptchaClient != null) {
                    RecaptchaAction custom = RecaptchaAction.Companion.custom("EmailCode");
                    this.f313a = 1;
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
            int i10 = RegisterEmailOtpVerificationBottomSheet.W0;
            RegisterEmailOtpVerficationViewModel v02 = registerEmailOtpVerificationBottomSheet.v0();
            EmailRequestModel emailRequestModel = new EmailRequestModel(((o) registerEmailOtpVerificationBottomSheet.S0.getValue()).f315a.getEmail(), (String) obj2, (String) null, (String) null, 12, (sf.e) null);
            v02.getClass();
            b.D(gc.b.o(v02), (f.b) null, 0, new b(v02, emailRequestModel, (d<? super b>) null), 3);
        }
        Throwable a10 = h.a(obj2);
        if (a10 != null) {
            androidx.appcompat.app.b bVar2 = registerEmailOtpVerificationBottomSheet.U0;
            if (bVar2 != null) {
                bVar2.dismiss();
                bh.a.f3654a.c(a10);
                RegisterEmailOtpVerificationBottomSheet.u0(registerEmailOtpVerificationBottomSheet);
            } else {
                j.l("loadingAlert");
                throw null;
            }
        }
        return m.f8717a;
    }
}

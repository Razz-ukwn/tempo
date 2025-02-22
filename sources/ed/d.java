package ed;

import ag.g0;
import android.app.Application;
import cb.b;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import ff.h;
import ff.m;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet$initializeRecaptchaClient$1", f = "VerificationBottomSheet.kt", l = {69}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerificationBottomSheet f7953b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(VerificationBottomSheet verificationBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f7953b = verificationBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f7953b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f7952a;
        VerificationBottomSheet verificationBottomSheet = this.f7953b;
        if (i8 == 0) {
            b.J(obj);
            Recaptcha recaptcha = Recaptcha.INSTANCE;
            Application application = verificationBottomSheet.d0().getApplication();
            j.e(application, "requireActivity().application");
            this.f7952a = 1;
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
            verificationBottomSheet.V0 = (RecaptchaClient) obj2;
        }
        if (h.a(obj2) != null) {
            VerificationBottomSheet.u0(verificationBottomSheet);
        }
        return m.f8717a;
    }
}

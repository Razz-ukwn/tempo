package ed;

import ag.g0;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import ff.h;
import ff.m;
import jf.d;
import jf.f;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet$setOnClicks$3$1", f = "VerificationBottomSheet.kt", l = {130}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7963a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerificationBottomSheet f7964b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(VerificationBottomSheet verificationBottomSheet, d<? super l> dVar) {
        super(2, dVar);
        this.f7964b = verificationBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f7964b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f7963a;
        VerificationBottomSheet verificationBottomSheet = this.f7964b;
        if (i8 == 0) {
            b.J(obj);
            androidx.appcompat.app.b bVar = verificationBottomSheet.U0;
            if (bVar != null) {
                bVar.show();
                RecaptchaClient recaptchaClient = verificationBottomSheet.V0;
                if (recaptchaClient != null) {
                    RecaptchaAction custom = RecaptchaAction.Companion.custom("EmailCode");
                    this.f7963a = 1;
                    Object r22 = recaptchaClient.m17executegIAlus(custom, this);
                    if (r22 == aVar) {
                        return aVar;
                    }
                    obj2 = r22;
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
            int i10 = VerificationBottomSheet.W0;
            VerificationViewModel w02 = verificationBottomSheet.w0();
            VerifyNumberRequestModel copy$default = VerifyNumberRequestModel.copy$default(verificationBottomSheet.v0().f7965a, (String) null, (String) null, (String) null, (String) null, (String) obj2, (String) null, 47, (Object) null);
            String str = verificationBottomSheet.v0().f7966b;
            w02.getClass();
            j.f(copy$default, "verifyNumberRequestModel");
            j.f(str, "registrationType");
            b.D(gc.b.o(w02), (f.b) null, 0, new p(w02, str, copy$default, (d<? super p>) null), 3);
        }
        Throwable a10 = h.a(obj2);
        if (a10 != null) {
            androidx.appcompat.app.b bVar2 = verificationBottomSheet.U0;
            if (bVar2 != null) {
                bVar2.dismiss();
                bh.a.f3654a.c(a10);
                VerificationBottomSheet.u0(verificationBottomSheet);
            } else {
                j.l("loadingAlert");
                throw null;
            }
        }
        return m.f8717a;
    }
}

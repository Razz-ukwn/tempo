package uc;

import ag.g0;
import cb.b;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;
import ff.h;
import ff.m;
import jf.d;
import jf.f;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.email.EmailBottomSheet$setOnClicks$2$1", f = "EmailBottomSheet.kt", l = {117}, m = "invokeSuspend")
public final class h extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmailBottomSheet f16015b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(EmailBottomSheet emailBottomSheet, d<? super h> dVar) {
        super(2, dVar);
        this.f16015b = emailBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f16015b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.f10464a;
        int i8 = this.f16014a;
        EmailBottomSheet emailBottomSheet = this.f16015b;
        if (i8 == 0) {
            b.J(obj);
            androidx.appcompat.app.b bVar = emailBottomSheet.U0;
            if (bVar != null) {
                bVar.show();
                if (emailBottomSheet.V0 == null) {
                    androidx.appcompat.app.b bVar2 = emailBottomSheet.U0;
                    if (bVar2 != null) {
                        bVar2.dismiss();
                        b.D(cb.d.I(emailBottomSheet), (f.b) null, 0, new c(emailBottomSheet, (d<? super c>) null), 3);
                    } else {
                        j.l("loadingAlert");
                        throw null;
                    }
                }
                RecaptchaClient recaptchaClient = emailBottomSheet.V0;
                if (recaptchaClient != null) {
                    RecaptchaAction custom = RecaptchaAction.Companion.custom("EmailCode");
                    this.f16014a = 1;
                    obj2 = recaptchaClient.m17executegIAlus(custom, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                return m.f8717a;
            }
            j.l("loadingAlert");
            throw null;
        } else if (i8 == 1) {
            b.J(obj);
            obj2 = ((ff.h) obj).f8708a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!(obj2 instanceof h.a)) {
            String str = (String) obj2;
            int i10 = EmailBottomSheet.W0;
            EmailViewModel v02 = emailBottomSheet.v0();
            v02.getClass();
            j.f(str, "captcha");
            b.D(gc.b.o(v02), (f.b) null, 0, new l(v02, str, (d<? super l>) null), 3);
        }
        Throwable a10 = ff.h.a(obj2);
        if (a10 != null) {
            androidx.appcompat.app.b bVar3 = emailBottomSheet.U0;
            if (bVar3 != null) {
                bVar3.dismiss();
                bh.a.f3654a.c(a10);
                EmailBottomSheet.u0(emailBottomSheet);
            } else {
                j.l("loadingAlert");
                throw null;
            }
        }
        return m.f8717a;
    }
}

package uc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.ui.auth.email.EmailViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.email.EmailViewModel$verifyEmail$1", f = "EmailViewModel.kt", l = {42}, m = "invokeSuspend")
public final class l extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmailViewModel f16020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16021c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(EmailViewModel emailViewModel, String str, d<? super l> dVar) {
        super(2, dVar);
        this.f16020b = emailViewModel;
        this.f16021c = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f16020b, this.f16021c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f16019a;
        EmailViewModel emailViewModel = this.f16020b;
        if (i8 == 0) {
            b.J(obj);
            emailViewModel.f6746j.k(new g.c());
            if (zd.a.g(emailViewModel)) {
                mc.a aVar2 = emailViewModel.f6743g;
                EmailRequestModel emailRequestModel = new EmailRequestModel((String) emailViewModel.f6744h.getValue(), this.f16021c, (String) null, (String) null, 12, (sf.e) null);
                this.f16019a = 1;
                obj = aVar2.f11379a.r(emailRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                emailViewModel.f6746j.k(new g.a(emailViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                emailViewModel.f6746j.k(new g.a(emailViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        emailViewModel.f6746j.k(emailViewModel.f((b0) obj));
        return m.f8717a;
    }
}

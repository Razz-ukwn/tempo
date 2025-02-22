package ed;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.EmailRequestModel;
import com.quickkonnect.silencio.models.request.auth.VerifyNumberRequestModel;
import com.quickkonnect.silencio.models.response.BaseResponse;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import sf.j;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel$getCode$1", f = "VerificationViewModel.kt", l = {81, 83}, m = "invokeSuspend")
public final class p extends i implements rf.p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7969a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerificationViewModel f7970b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7971c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ VerifyNumberRequestModel f7972d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(VerificationViewModel verificationViewModel, String str, VerifyNumberRequestModel verifyNumberRequestModel, d<? super p> dVar) {
        super(2, dVar);
        this.f7970b = verificationViewModel;
        this.f7971c = str;
        this.f7972d = verifyNumberRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f7970b, this.f7971c, this.f7972d, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        a aVar = a.f10464a;
        int i8 = this.f7969a;
        VerificationViewModel verificationViewModel = this.f7970b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(verificationViewModel);
            v<g<BaseResponse>> vVar = verificationViewModel.f6895k;
            if (g10) {
                f.c(vVar);
                boolean a10 = j.a(this.f7971c, "phone");
                mc.a aVar2 = verificationViewModel.f6891g;
                VerifyNumberRequestModel verifyNumberRequestModel = this.f7972d;
                if (a10) {
                    this.f7969a = 1;
                    obj = aVar2.f11379a.c(verifyNumberRequestModel, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    EmailRequestModel emailRequestModel = new EmailRequestModel(verifyNumberRequestModel.getEmail(), verifyNumberRequestModel.getCaptcha(), verifyNumberRequestModel.getDeviceType(), (String) null, 8, (sf.e) null);
                    this.f7969a = 2;
                    obj = aVar2.f11379a.q(emailRequestModel, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    b0Var = (b0) obj;
                    verificationViewModel.f6895k.k(verificationViewModel.f(b0Var));
                    return m.f8717a;
                }
            } else {
                vVar.k(new g.a(verificationViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else if (i8 == 2) {
            try {
                b.J(obj);
                b0Var = (b0) obj;
                verificationViewModel.f6895k.k(verificationViewModel.f(b0Var));
            } catch (Exception e10) {
                e10.printStackTrace();
                verificationViewModel.f6895k.k(new g.a(verificationViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
            return m.f8717a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0Var = (b0) obj;
        verificationViewModel.f6895k.k(verificationViewModel.f(b0Var));
        return m.f8717a;
    }
}

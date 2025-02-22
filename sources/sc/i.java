package sc;

import ag.g0;
import androidx.activity.f;
import androidx.lifecycle.v;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.models.request.auth.VerifyInviteCodeRequestModel;
import com.quickkonnect.silencio.models.response.auth.VerifyInviteCodeResponse;
import com.quickkonnect.silencio.ui.auth.code.CodeViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import rf.p;
import yg.b0;
import zd.g;

@e(c = "com.quickkonnect.silencio.ui.auth.code.CodeViewModel$skipCode$1", f = "CodeViewModel.kt", l = {65}, m = "invokeSuspend")
public final class i extends lf.i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CodeViewModel f14917b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(CodeViewModel codeViewModel, d<? super i> dVar) {
        super(2, dVar);
        this.f14917b = codeViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f14917b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f14916a;
        CodeViewModel codeViewModel = this.f14917b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(codeViewModel);
            v<g<VerifyInviteCodeResponse>> vVar = codeViewModel.f6712j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = codeViewModel.f6709g;
                VerifyInviteCodeRequestModel verifyInviteCodeRequestModel = new VerifyInviteCodeRequestModel("Welcome");
                this.f14916a = 1;
                obj = aVar2.f11379a.i(verifyInviteCodeRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                vVar.k(new g.a(codeViewModel.f17942e.getString(R.string.no_internet)));
                return m.f8717a;
            }
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                codeViewModel.f6712j.k(new g.a(codeViewModel.f17942e.getString(R.string.something_went_wrong)));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        codeViewModel.f6712j.k(codeViewModel.f((b0) obj));
        return m.f8717a;
    }
}

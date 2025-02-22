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
import lf.i;
import rf.p;
import yg.b0;
import zd.g;
import zf.n;

@e(c = "com.quickkonnect.silencio.ui.auth.code.CodeViewModel$submitCode$1", f = "CodeViewModel.kt", l = {44}, m = "invokeSuspend")
public final class j extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14918a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CodeViewModel f14919b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(CodeViewModel codeViewModel, d<? super j> dVar) {
        super(2, dVar);
        this.f14919b = codeViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new j(this.f14919b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f14918a;
        CodeViewModel codeViewModel = this.f14919b;
        if (i8 == 0) {
            b.J(obj);
            boolean g10 = zd.a.g(codeViewModel);
            v<g<VerifyInviteCodeResponse>> vVar = codeViewModel.f6712j;
            if (g10) {
                f.c(vVar);
                mc.a aVar2 = codeViewModel.f6709g;
                VerifyInviteCodeRequestModel verifyInviteCodeRequestModel = new VerifyInviteCodeRequestModel(n.Z0((String) codeViewModel.f6710h.getValue()).toString());
                this.f14918a = 1;
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

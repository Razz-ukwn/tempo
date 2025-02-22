package cd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.models.request.auth.RegisterWithGoogleRequestModel;
import com.quickkonnect.silencio.ui.auth.register.RegisterViewModel;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import rf.p;
import yg.b0;

@e(c = "com.quickkonnect.silencio.ui.auth.register.RegisterViewModel$verifyEmail$1", f = "RegisterViewModel.kt", l = {89}, m = "invokeSuspend")
public final class u extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f3998a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterViewModel f3999b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RegisterWithGoogleRequestModel f4000c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(RegisterViewModel registerViewModel, RegisterWithGoogleRequestModel registerWithGoogleRequestModel, d<? super u> dVar) {
        super(2, dVar);
        this.f3999b = registerViewModel;
        this.f4000c = registerWithGoogleRequestModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u(this.f3999b, this.f4000c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f3998a;
        RegisterViewModel registerViewModel = this.f3999b;
        if (i8 == 0) {
            b.J(obj);
            if (zd.a.g(registerViewModel)) {
                mc.a aVar2 = registerViewModel.f6862g;
                RegisterWithGoogleRequestModel registerWithGoogleRequestModel = this.f4000c;
                this.f3998a = 1;
                obj = aVar2.f11379a.m(registerWithGoogleRequestModel, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return m.f8717a;
        } else if (i8 == 1) {
            try {
                b.J(obj);
            } catch (Exception unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b0 b0Var = (b0) obj;
        if (b0Var.a()) {
            registerViewModel.f6865j.k(registerViewModel.f(b0Var));
        } else {
            registerViewModel.f6867l.setValue(Boolean.TRUE);
        }
        return m.f8717a;
    }
}

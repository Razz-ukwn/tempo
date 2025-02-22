package vc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordViewModel;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.x;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpassword.ForgotPasswordBottomSheet$setObservers$1", f = "ForgotPasswordBottomSheet.kt", l = {108}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16401a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordBottomSheet f16402b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForgotPasswordBottomSheet f16403a;

        public a(ForgotPasswordBottomSheet forgotPasswordBottomSheet) {
            this.f16403a = forgotPasswordBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ForgotPasswordBottomSheet forgotPasswordBottomSheet = this.f16403a;
            forgotPasswordBottomSheet.U0 = booleanValue;
            x xVar = forgotPasswordBottomSheet.Q0;
            j.c(xVar);
            xVar.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ForgotPasswordBottomSheet forgotPasswordBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f16402b = forgotPasswordBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f16402b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f16401a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ForgotPasswordBottomSheet.V0;
            ForgotPasswordBottomSheet forgotPasswordBottomSheet = this.f16402b;
            ForgotPasswordViewModel.a aVar2 = forgotPasswordBottomSheet.v0().f6761i;
            a aVar3 = new a(forgotPasswordBottomSheet);
            this.f16401a = 1;
            if (aVar2.a(aVar3, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}

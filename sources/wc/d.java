package wc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet;
import com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailViewModel;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.z;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.forgotpasswordemail.ForgotPasswordEmailBottomSheet$setObservers$1", f = "ForgotPasswordEmailBottomSheet.kt", l = {107}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16687a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ForgotPasswordEmailBottomSheet f16688b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForgotPasswordEmailBottomSheet f16689a;

        public a(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet) {
            this.f16689a = forgotPasswordEmailBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = this.f16689a;
            forgotPasswordEmailBottomSheet.U0 = booleanValue;
            z zVar = forgotPasswordEmailBottomSheet.Q0;
            j.c(zVar);
            zVar.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f16688b = forgotPasswordEmailBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f16688b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f16687a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ForgotPasswordEmailBottomSheet.V0;
            ForgotPasswordEmailBottomSheet forgotPasswordEmailBottomSheet = this.f16688b;
            ForgotPasswordEmailViewModel.a aVar2 = forgotPasswordEmailBottomSheet.v0().f6777i;
            a aVar3 = new a(forgotPasswordEmailBottomSheet);
            this.f16687a = 1;
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

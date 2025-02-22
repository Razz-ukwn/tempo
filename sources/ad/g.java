package ad;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet;
import ff.m;
import jf.d;
import lf.e;
import lf.i;
import nc.p0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.otpemail.RegisterEmailOtpVerificationBottomSheet$setObservers$1", f = "RegisterEmailOtpVerificationBottomSheet.kt", l = {147}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterEmailOtpVerificationBottomSheet f305b;

    public static final class a implements kotlinx.coroutines.flow.g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegisterEmailOtpVerificationBottomSheet f306a;

        public a(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet) {
            this.f306a = registerEmailOtpVerificationBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = this.f306a;
            registerEmailOtpVerificationBottomSheet.T0 = booleanValue;
            p0 p0Var = registerEmailOtpVerificationBottomSheet.Q0;
            j.c(p0Var);
            p0Var.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet, d<? super g> dVar) {
        super(2, dVar);
        this.f305b = registerEmailOtpVerificationBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f305b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f304a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = RegisterEmailOtpVerificationBottomSheet.W0;
            RegisterEmailOtpVerificationBottomSheet registerEmailOtpVerificationBottomSheet = this.f305b;
            RegisterEmailOtpVerficationViewModel.a aVar2 = registerEmailOtpVerificationBottomSheet.v0().f6821i;
            a aVar3 = new a(registerEmailOtpVerificationBottomSheet);
            this.f304a = 1;
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

package zc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerficationViewModel;
import com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.r0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.otp.RegisterOtpVerificationBottomSheet$setObservers$1", f = "RegisterOtpVerificationBottomSheet.kt", l = {97}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RegisterOtpVerificationBottomSheet f17929b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RegisterOtpVerificationBottomSheet f17930a;

        public a(RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet) {
            this.f17930a = registerOtpVerificationBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = this.f17930a;
            registerOtpVerificationBottomSheet.T0 = booleanValue;
            r0 r0Var = registerOtpVerificationBottomSheet.Q0;
            j.c(r0Var);
            r0Var.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f17929b = registerOtpVerificationBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f17929b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f17928a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = RegisterOtpVerificationBottomSheet.V0;
            RegisterOtpVerificationBottomSheet registerOtpVerificationBottomSheet = this.f17929b;
            RegisterOtpVerficationViewModel.a aVar2 = registerOtpVerificationBottomSheet.v0().f6803i;
            a aVar3 = new a(registerOtpVerificationBottomSheet);
            this.f17928a = 1;
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

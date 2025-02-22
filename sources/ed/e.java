package ed;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet;
import com.quickkonnect.silencio.ui.auth.verification.VerificationViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.i;
import nc.w0;
import rf.p;
import sf.j;

@lf.e(c = "com.quickkonnect.silencio.ui.auth.verification.VerificationBottomSheet$setObservers$1", f = "VerificationBottomSheet.kt", l = {147}, m = "invokeSuspend")
public final class e extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VerificationBottomSheet f7955b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VerificationBottomSheet f7956a;

        public a(VerificationBottomSheet verificationBottomSheet) {
            this.f7956a = verificationBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            VerificationBottomSheet verificationBottomSheet = this.f7956a;
            verificationBottomSheet.T0 = booleanValue;
            w0 w0Var = verificationBottomSheet.Q0;
            j.c(w0Var);
            w0Var.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(VerificationBottomSheet verificationBottomSheet, d<? super e> dVar) {
        super(2, dVar);
        this.f7955b = verificationBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f7955b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f7954a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = VerificationBottomSheet.W0;
            VerificationBottomSheet verificationBottomSheet = this.f7955b;
            VerificationViewModel.a aVar2 = verificationBottomSheet.w0().f6893i;
            a aVar3 = new a(verificationBottomSheet);
            this.f7954a = 1;
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

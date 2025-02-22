package dd;

import ag.g0;
import com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.t0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.resetpassword.ResetPasswordBottomSheet$setObservers$1", f = "ResetPasswordBottomSheet.kt", l = {85}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7510a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ResetPasswordBottomSheet f7511b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResetPasswordBottomSheet f7512a;

        public a(ResetPasswordBottomSheet resetPasswordBottomSheet) {
            this.f7512a = resetPasswordBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ResetPasswordBottomSheet resetPasswordBottomSheet = this.f7512a;
            resetPasswordBottomSheet.U0 = booleanValue;
            t0 t0Var = resetPasswordBottomSheet.Q0;
            j.c(t0Var);
            t0Var.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ResetPasswordBottomSheet resetPasswordBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f7511b = resetPasswordBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f7511b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f7510a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = ResetPasswordBottomSheet.V0;
            ResetPasswordBottomSheet resetPasswordBottomSheet = this.f7511b;
            kotlinx.coroutines.flow.g0 g0Var = resetPasswordBottomSheet.u0().f6879j;
            a aVar2 = new a(resetPasswordBottomSheet);
            this.f7510a = 1;
            if (g0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            cb.b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}

package xc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.e0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.login.LoginBottomSheet$setObservers$1", f = "LoginBottomSheet.kt", l = {100}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f17036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginBottomSheet f17037b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LoginBottomSheet f17038a;

        public a(LoginBottomSheet loginBottomSheet) {
            this.f17038a = loginBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            LoginBottomSheet loginBottomSheet = this.f17038a;
            loginBottomSheet.U0 = booleanValue;
            e0 e0Var = loginBottomSheet.Q0;
            j.c(e0Var);
            e0Var.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(LoginBottomSheet loginBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f17037b = loginBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f17037b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f17036a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = LoginBottomSheet.W0;
            LoginBottomSheet loginBottomSheet = this.f17037b;
            kotlinx.coroutines.flow.g0 g0Var = loginBottomSheet.u0().f6795k;
            a aVar2 = new a(loginBottomSheet);
            this.f17036a = 1;
            if (g0Var.a(aVar2, this) == aVar) {
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

package rd;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.menu.profile.ProfileFragment;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.e1;
import rf.p;
import zf.j;
import zf.n;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.ProfileFragment$setObservers$4", f = "ProfileFragment.kt", l = {386}, m = "invokeSuspend")
public final class m extends i implements p<g0, d<? super ff.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f14231b;

    public static final class a implements g<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ProfileFragment f14232a;

        public a(ProfileFragment profileFragment) {
            this.f14232a = profileFragment;
        }

        public final Object m(Object obj, d dVar) {
            String str = (String) obj;
            ProfileFragment profileFragment = this.f14232a;
            if (n.A0(str, profileFragment.F0)) {
                String v02 = j.v0(str, profileFragment.F0, "");
                e1 e1Var = profileFragment.A0;
                sf.j.c(e1Var);
                int selectionStart = e1Var.X.getSelectionStart();
                e1 e1Var2 = profileFragment.A0;
                sf.j.c(e1Var2);
                e1Var2.X.setText(v02);
                if (selectionStart >= v02.length() - 1) {
                    e1 e1Var3 = profileFragment.A0;
                    sf.j.c(e1Var3);
                    e1Var3.X.setSelection(v02.length());
                }
            }
            return ff.m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(ProfileFragment profileFragment, d<? super m> dVar) {
        super(2, dVar);
        this.f14231b = profileFragment;
    }

    public final d<ff.m> create(Object obj, d<?> dVar) {
        return new m(this.f14231b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((m) create((g0) obj, (d) obj2)).invokeSuspend(ff.m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f14230a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ProfileFragment.I0;
            ProfileFragment profileFragment = this.f14231b;
            y0 y0Var = profileFragment.o0().f7092j;
            a aVar2 = new a(profileFragment);
            this.f14230a = 1;
            if (y0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b.J(obj);
        }
        throw new r();
    }
}

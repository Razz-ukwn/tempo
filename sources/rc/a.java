package rc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.chosepassword.ChoosePasswordBottomSheet$setObservers$1", f = "ChoosePasswordBottomSheet.kt", l = {86}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChoosePasswordBottomSheet f14192b;

    /* renamed from: rc.a$a  reason: collision with other inner class name */
    public static final class C0265a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChoosePasswordBottomSheet f14193a;

        public C0265a(ChoosePasswordBottomSheet choosePasswordBottomSheet) {
            this.f14193a = choosePasswordBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ChoosePasswordBottomSheet choosePasswordBottomSheet = this.f14193a;
            choosePasswordBottomSheet.T0 = booleanValue;
            nc.g gVar = choosePasswordBottomSheet.Q0;
            j.c(gVar);
            gVar.T.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ChoosePasswordBottomSheet choosePasswordBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f14192b = choosePasswordBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f14192b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f14191a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ChoosePasswordBottomSheet.V0;
            ChoosePasswordBottomSheet choosePasswordBottomSheet = this.f14192b;
            kotlinx.coroutines.flow.g0 g0Var = choosePasswordBottomSheet.u0().f6700k;
            C0265a aVar2 = new C0265a(choosePasswordBottomSheet);
            this.f14191a = 1;
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

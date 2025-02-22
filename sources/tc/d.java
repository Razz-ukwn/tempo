package tc;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import ff.m;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.t;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet$setObservers$1", f = "CreateAccountBottomSheet.kt", l = {130}, m = "invokeSuspend")
public final class d extends i implements p<g0, jf.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15572a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15573b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CreateAccountBottomSheet f15574a;

        public a(CreateAccountBottomSheet createAccountBottomSheet) {
            this.f15574a = createAccountBottomSheet;
        }

        public final Object m(Object obj, jf.d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            CreateAccountBottomSheet createAccountBottomSheet = this.f15574a;
            createAccountBottomSheet.T0 = booleanValue;
            t tVar = createAccountBottomSheet.Q0;
            j.c(tVar);
            tVar.U.setEnabled(booleanValue);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(CreateAccountBottomSheet createAccountBottomSheet, jf.d<? super d> dVar) {
        super(2, dVar);
        this.f15573b = createAccountBottomSheet;
    }

    public final jf.d<m> create(Object obj, jf.d<?> dVar) {
        return new d(this.f15573b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((g0) obj, (jf.d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f15572a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = CreateAccountBottomSheet.W0;
            CreateAccountBottomSheet createAccountBottomSheet = this.f15573b;
            kotlinx.coroutines.flow.g0 g0Var = createAccountBottomSheet.v0().m;
            a aVar2 = new a(createAccountBottomSheet);
            this.f15572a = 1;
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

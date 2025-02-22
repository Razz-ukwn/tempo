package tc;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.auth.createaccount.CreateAccountBottomSheet$setObservers$2", f = "CreateAccountBottomSheet.kt", l = {136}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f15578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CreateAccountBottomSheet f15579b;

    public static final class a implements kotlinx.coroutines.flow.g<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CreateAccountBottomSheet f15580a;

        public a(CreateAccountBottomSheet createAccountBottomSheet) {
            this.f15580a = createAccountBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            String str = (String) obj;
            if (str.length() > 0) {
                CreateAccountBottomSheet createAccountBottomSheet = this.f15580a;
                String string = createAccountBottomSheet.e0().getString(R.string.alert_title);
                CreateAccountBottomSheet createAccountBottomSheet2 = this.f15580a;
                j.e(string, "getString(R.string.alert_title)");
                zd.d.d(createAccountBottomSheet2, string, "Username already in use!!!\n\nWould you try '" + str + '\'', "OK", "Cancel", true, new e(createAccountBottomSheet, str), f.f15577a);
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(CreateAccountBottomSheet createAccountBottomSheet, d<? super g> dVar) {
        super(2, dVar);
        this.f15579b = createAccountBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f15579b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f15578a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = CreateAccountBottomSheet.W0;
            CreateAccountBottomSheet createAccountBottomSheet = this.f15579b;
            y0 y0Var = createAccountBottomSheet.v0().f6733o;
            a aVar2 = new a(createAccountBottomSheet);
            this.f15578a = 1;
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

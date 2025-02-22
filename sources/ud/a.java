package ud;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioBottomSheet;
import com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.b;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.tabs.home.ask.AskSilencioBottomSheet$setObservers$1", f = "AskSilencioBottomSheet.kt", l = {51}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AskSilencioBottomSheet f16023b;

    /* renamed from: ud.a$a  reason: collision with other inner class name */
    public static final class C0294a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AskSilencioBottomSheet f16024a;

        public C0294a(AskSilencioBottomSheet askSilencioBottomSheet) {
            this.f16024a = askSilencioBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            b bVar = this.f16024a.L0;
            j.c(bVar);
            bVar.U.setCompoundDrawablesWithIntrinsicBounds(booleanValue ? R.drawable.ic_checkbox_selected : R.drawable.ic_checkbox_unselected, 0, 0, 0);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(AskSilencioBottomSheet askSilencioBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f16023b = askSilencioBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f16023b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f16022a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = AskSilencioBottomSheet.N0;
            AskSilencioBottomSheet askSilencioBottomSheet = this.f16023b;
            y0 y0Var = ((AskSilencioViewModel) askSilencioBottomSheet.M0.getValue()).f7125g;
            C0294a aVar2 = new C0294a(askSilencioBottomSheet);
            this.f16022a = 1;
            if (y0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            cb.b.J(obj);
        }
        throw new r();
    }
}

package nd;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.popup.PopupViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.l0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.popup.PopupBottomSheet$setObservers$1", f = "PopupBottomSheet.kt", l = {92}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PopupBottomSheet f11891b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupBottomSheet f11892a;

        public a(PopupBottomSheet popupBottomSheet) {
            this.f11892a = popupBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            l0 l0Var = this.f11892a.Q0;
            j.c(l0Var);
            l0Var.V.setCompoundDrawablesWithIntrinsicBounds(booleanValue ? R.drawable.ic_checkbox_selected : R.drawable.ic_checkbox_unselected, 0, 0, 0);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(PopupBottomSheet popupBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f11891b = popupBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f11891b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11890a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = PopupBottomSheet.T0;
            PopupBottomSheet popupBottomSheet = this.f11891b;
            y0 y0Var = ((PopupViewModel) popupBottomSheet.R0.getValue()).f7055g;
            a aVar2 = new a(popupBottomSheet);
            this.f11890a = 1;
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

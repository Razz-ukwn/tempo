package wd;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.tabs.map.popup.MapPopupBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.tabs.map.popup.MapPopupBottomSheet$setObservers$1", f = "MapPopupBottomSheet.kt", l = {41}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f16702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MapPopupBottomSheet f16703b;

    /* renamed from: wd.a$a  reason: collision with other inner class name */
    public static final class C0307a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MapPopupBottomSheet f16704a;

        public C0307a(MapPopupBottomSheet mapPopupBottomSheet) {
            this.f16704a = mapPopupBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            nc.g0 g0Var = this.f16704a.L0;
            j.c(g0Var);
            g0Var.U.setCompoundDrawablesWithIntrinsicBounds(booleanValue ? R.drawable.ic_checkbox_selected : R.drawable.ic_checkbox_unselected, 0, 0, 0);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(MapPopupBottomSheet mapPopupBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f16703b = mapPopupBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f16703b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f16702a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MapPopupBottomSheet.N0;
            MapPopupBottomSheet mapPopupBottomSheet = this.f16703b;
            y0 y0Var = ((b) mapPopupBottomSheet.M0.getValue()).f16705g;
            C0307a aVar2 = new C0307a(mapPopupBottomSheet);
            this.f16702a = 1;
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

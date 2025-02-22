package ld;

import ab.r;
import ag.g0;
import com.quickkonnect.silencio.R;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureBottomSheet;
import com.quickkonnect.silencio.ui.measure.howto.HowToMeasureViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.b0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.howto.HowToMeasureBottomSheet$setObservers$1", f = "HowToMeasureBottomSheet.kt", l = {76}, m = "invokeSuspend")
public final class b extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HowToMeasureBottomSheet f11059b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HowToMeasureBottomSheet f11060a;

        public a(HowToMeasureBottomSheet howToMeasureBottomSheet) {
            this.f11060a = howToMeasureBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            b0 b0Var = this.f11060a.Q0;
            j.c(b0Var);
            b0Var.V.setCompoundDrawablesWithIntrinsicBounds(booleanValue ? R.drawable.ic_checkbox_selected : R.drawable.ic_checkbox_unselected, 0, 0, 0);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(HowToMeasureBottomSheet howToMeasureBottomSheet, d<? super b> dVar) {
        super(2, dVar);
        this.f11059b = howToMeasureBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f11059b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((b) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11058a;
        if (i8 == 0) {
            cb.b.J(obj);
            int i10 = HowToMeasureBottomSheet.S0;
            HowToMeasureBottomSheet howToMeasureBottomSheet = this.f11059b;
            y0 y0Var = ((HowToMeasureViewModel) howToMeasureBottomSheet.R0.getValue()).f6987g;
            a aVar2 = new a(howToMeasureBottomSheet);
            this.f11058a = 1;
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

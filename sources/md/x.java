package md;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import java.util.Arrays;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import nc.i0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$4", f = "MeasuringBottomSheet.kt", l = {692}, m = "invokeSuspend")
public final class x extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11446a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11447b;

    public static final class a implements g<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f11448a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f11448a = measuringBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            float floatValue = ((Number) obj).floatValue();
            i0 i0Var = this.f11448a.Q0;
            j.c(i0Var);
            String format = String.format("%,.3f", Arrays.copyOf(new Object[]{new Float(floatValue)}, 1));
            j.e(format, "format(format, *args)");
            i0Var.f11711h.setText(format);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(MeasuringBottomSheet measuringBottomSheet, d<? super x> dVar) {
        super(2, dVar);
        this.f11447b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new x(this.f11447b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11446a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f11447b;
            MeasuringViewModel.f fVar = measuringBottomSheet.B0().f7021r;
            a aVar2 = new a(measuringBottomSheet);
            this.f11446a = 1;
            if (fVar.a(aVar2, this) == aVar) {
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

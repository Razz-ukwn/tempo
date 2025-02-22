package md;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.i0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$1", f = "MeasuringBottomSheet.kt", l = {672}, m = "invokeSuspend")
public final class g extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11398a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11399b;

    public static final class a implements kotlinx.coroutines.flow.g<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f11400a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f11400a = measuringBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            float floatValue = ((Number) obj).floatValue();
            boolean z10 = floatValue == 0.0f;
            MeasuringBottomSheet measuringBottomSheet = this.f11400a;
            if (z10) {
                i0 i0Var = measuringBottomSheet.Q0;
                j.c(i0Var);
                i0Var.f11713j.setText("--");
            } else {
                i0 i0Var2 = measuringBottomSheet.Q0;
                j.c(i0Var2);
                i0Var2.f11713j.setText(String.valueOf(q4.a.g(floatValue)));
            }
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(MeasuringBottomSheet measuringBottomSheet, d<? super g> dVar) {
        super(2, dVar);
        this.f11399b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f11399b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((g) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11398a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f11399b;
            y0 y0Var = measuringBottomSheet.B0().f7012h;
            a aVar2 = new a(measuringBottomSheet);
            this.f11398a = 1;
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

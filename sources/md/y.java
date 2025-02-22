package md;

import ag.g0;
import bh.a;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$5", f = "MeasuringBottomSheet.kt", l = {697}, m = "invokeSuspend")
public final class y extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11453b;

    public static final class a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f11454a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f11454a = measuringBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            a.C0053a aVar = bh.a.f3654a;
            aVar.b("cap " + booleanValue, new Object[0]);
            MeasuringBottomSheet measuringBottomSheet = this.f11454a;
            measuringBottomSheet.X0 = booleanValue;
            MeasuringBottomSheet.u0(measuringBottomSheet);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(MeasuringBottomSheet measuringBottomSheet, d<? super y> dVar) {
        super(2, dVar);
        this.f11453b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new y(this.f11453b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11452a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f11453b;
            MeasuringViewModel.e eVar = measuringBottomSheet.B0().f7019p;
            a aVar2 = new a(measuringBottomSheet);
            this.f11452a = 1;
            if (eVar.a(aVar2, this) == aVar) {
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

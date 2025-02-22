package md;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringViewModel;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$3", f = "MeasuringBottomSheet.kt", l = {687}, m = "invokeSuspend")
public final class w extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11444b;

    public static final class a implements g<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f11445a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f11445a = measuringBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            this.f11445a.R0 = ((Number) obj).floatValue();
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(MeasuringBottomSheet measuringBottomSheet, d<? super w> dVar) {
        super(2, dVar);
        this.f11444b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new w(this.f11444b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11443a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f11444b;
            MeasuringViewModel.f fVar = measuringBottomSheet.B0().f7021r;
            a aVar2 = new a(measuringBottomSheet);
            this.f11443a = 1;
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

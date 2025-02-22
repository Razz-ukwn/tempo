package md;

import ab.r;
import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import j0.t;
import jf.d;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.y0;
import lf.e;
import lf.i;
import nc.i0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$2", f = "MeasuringBottomSheet.kt", l = {681}, m = "invokeSuspend")
public final class v extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11436b;

    public static final class a implements g<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MeasuringBottomSheet f11437a;

        public a(MeasuringBottomSheet measuringBottomSheet) {
            this.f11437a = measuringBottomSheet;
        }

        public final Object m(Object obj, d dVar) {
            String str = (String) obj;
            bh.a.f3654a.b(t.a("time ", str), new Object[0]);
            i0 i0Var = this.f11437a.Q0;
            j.c(i0Var);
            i0Var.m.setText(str);
            return m.f8717a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(MeasuringBottomSheet measuringBottomSheet, d<? super v> dVar) {
        super(2, dVar);
        this.f11436b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new v(this.f11436b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        ((v) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
        return kf.a.f10464a;
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f11435a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = MeasuringBottomSheet.f6988h1;
            MeasuringBottomSheet measuringBottomSheet = this.f11436b;
            y0 y0Var = measuringBottomSheet.B0().f7018o;
            a aVar2 = new a(measuringBottomSheet);
            this.f11435a = 1;
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

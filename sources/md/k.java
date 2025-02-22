package md;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet;
import ff.m;
import jf.d;
import kf.a;
import lf.e;
import lf.i;
import nc.i0;
import rf.p;
import sf.j;

@e(c = "com.quickkonnect.silencio.ui.measure.measuring.MeasuringBottomSheet$setObservers$11$4", f = "MeasuringBottomSheet.kt", l = {791}, m = "invokeSuspend")
public final class k extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11408a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MeasuringBottomSheet f11409b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(MeasuringBottomSheet measuringBottomSheet, d<? super k> dVar) {
        super(2, dVar);
        this.f11409b = measuringBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f11409b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f10464a;
        int i8 = this.f11408a;
        if (i8 == 0) {
            b.J(obj);
            this.f11408a = 1;
            if (cb.d.x(4000, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i0 i0Var = this.f11409b.Q0;
        j.c(i0Var);
        i0Var.f11706c.setEnabled(true);
        return m.f8717a;
    }
}
